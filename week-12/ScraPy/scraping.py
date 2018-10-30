from bs4 import BeautifulSoup
import requests
import csv

source = requests.get('https://index.hu/').text

soup = BeautifulSoup(source, 'lxml')

csv_file = open('index.csv', 'w')

csv_writer = csv.writer(csv_file)
csv_writer.writerow(['Headline', 'Summary', 'Link'])
csv_writer.writerow(['a', 'b', 'c'])

for article in soup.find_all('article'):
    try:
        headline = article.h1.a.text
    except Exception as e:
        headline = None
    print(headline)

    try:
        summary = article.find('p', class_="ajanlo").span.text
    except Exception as e:
        summary = None
    print(summary)

    try:
        art_src = article.find('h1', class_="cikkcim").a
    except Exception as e:
        art_src = None
    print(art_src)


    csv_writer.writerow([headline, summary, art_src])

csv_file.close()


heloooo