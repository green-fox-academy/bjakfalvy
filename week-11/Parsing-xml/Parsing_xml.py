from bs4 import BeautifulSoup

try:
    infile = open('index.xml', 'r')
    contents = infile.read()
    soup = BeautifulSoup(contents, 'xml')
    titles = soup.find_all('title')
    for title in titles:
        print(title.get_text())
except Exception as e:
    print(str(e))