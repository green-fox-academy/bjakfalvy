import pandas as pd
from bs4 import BeautifulSoup

pd.set_option('display.width', 10000)
pd.set_option('display.max_rows', 400)
pd.set_option('display.max_columns', 500)
try:
    infile = open('index.xml', 'r')
    contents = infile.read()
    soup = BeautifulSoup(contents, 'xml')
    titles = soup.find_all('item')

    taglist = []
    for title in titles[0].children:
        if title.name:
            taglist.append(title.name)

    title_array = []

    for title in titles:
        title_dict = {}
        for child in title.children:
            for tag in taglist:
                if child.name == tag:
                    title_dict[tag] = child.text
        title_array.append(title_dict)

    df = pd.DataFrame(title_array, columns=title_dict)
    print(df.head(20))
except Exception as e:
    print(str(e))
