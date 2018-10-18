import wikipedia as wiki

topic = input('Enter a topic: ')
wiki_shark = wiki.summary(topic)
print(wiki_shark)