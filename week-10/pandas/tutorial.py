import pandas as pd

filename = 'googleplaystore.csv'
df = pd.read_csv(filename, na_values='NaN')
pd.set_option('display.width', 10000)
pd.set_option('display.max_rows', 1000)
pd.set_option('display.max_columns', 500)

print(df.columns)

print(df)