import pandas as pd

filename = 'googleplaystore.csv'
df = pd.read_csv(filename)


print("\n<<<<<DESCRIBE>>>>>\n")
print(df.describe())
print("\n<<<<<DATA TYPE>>>>>\n")
print(df.dtypes)
print("\n<<<<<INDEX>>>>>\n")
print(df.index)
print("\n<<<<<COLUMNS>>>>>\n")
print(df.columns)
print("\n<<<<<VALUES>>>>>\n")
print(df.values)

print("<<<<<ITERATING>>>>>")
print("Writing out all applications by App and Rating")
for index, row in df.iterrows():
    print(index,row["App"], row["Rating"])