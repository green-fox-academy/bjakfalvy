import pandas as pd

def header(message):
    print('\n'+'<'*50)
    print(message + '\n')

#Reset the display settings
pd.set_option('display.width', 10000)
pd.set_option('display.max_rows', 400)
pd.set_option('display.max_columns', 500)

#Read the file into a DATAFRAME
filename = 'googleplaystore.csv'
df = pd.read_csv(filename)

#Printing datatypes
header("Printing datatypes")
print(df.dtypes)

#MUNGING
header("Deleting rows, if there are no values at all")
print(df.dropna(how="all"))

header("Invalid values, because they're higher then the maximum 5")
print(df[df.Rating > 5])

header("Invalid values in Type")
print(df[(df['Type'] != 'Free') & (df['Type'] != 'Paid')])

#9148 is NaN
header('Correcting row 9148')
cor = df.fillna({
    'Type' : 'Free'
})
print (cor.loc[9148])

header('Correcting row 10472')
#pushing with one column
for x in range(12, 1, -1):
    df.iat[10472, x] = df.iat[10472, (x-1)]
#adding category
df.iat[10472, 1] = 'TOOLS'
header("corrected data in row 10472")
print(df.loc[10472])


#Difference between all app and duplicated app
header("All app vs. without Duplicated apps")
print(df.count()["App"])
print(df.drop_duplicates().count()["App"])

#Deleting duplications
header("Deleting duplicated data")
df.drop_duplicates(keep='first', inplace=True)
print("Number of apps after deleting: ", df.count()["App"])

#Checking the valid values in 'App'
header("Number of App-s which are not null")
print(df[df['App'].notnull()].count()['App'])

header("checking extreme values - Unique categories ordered by app number")
category_list = df.groupby('Category').count().sort_values(
    'App', ascending=False)['App']
print(category_list)

#EXERCISES

header('Lowest rated apps')
print(df.loc[df['Rating'].idxmin()])

header("Avarage of ratings")
print(df.loc[:, "Rating"].mean())

header("Median of ratings")
print(df.loc[:, "Rating"].median())

header("Mode of ratings")
print(df.loc[:, "Rating"].mode())

#GENRES
header("MOST POPULAR GENRES")
genre_list = df.groupby('Genres').count().sort_values(
    'App', ascending=False)['App']
print('Three most popular genres based on number of apps:', genre_list[0:3])

# Convert the Last Updated column to YYYYY-MM-DD format and insert it as an extra column next to Last Updated, with the name "Last Updated Readable" and save it as a new, separate CSV file.
transformed_date = pd.to_datetime(df['Last Updated'], errors='coerce')
df['Last Updated Readable'] = transformed_date
print(df[1:10])

# # Create a new, separate CSV that has all rows of data in reverse.

reversed_df = df.iloc[::-1]
reversed_df.to_csv('reversed_data.csv', encoding='utf-8', index=False)