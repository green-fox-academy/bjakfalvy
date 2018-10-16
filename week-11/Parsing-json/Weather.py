import json
from pprint import pprint

with open('distros.json', 'r', encoding='utf-8') as f:
    distros_dict = json.load(f)

pprint(distros_dict)
#