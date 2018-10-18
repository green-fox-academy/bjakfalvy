import wikipedia as wiki
from click._compat import raw_input

topic = raw_input('Enter a topic: ')
wiki_shark = wiki.summary(topic)
print(wiki_shark)