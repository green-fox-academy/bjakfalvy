import json
import requests
import pandas as pd

api_key = '3da764d340fac8e5f57a5c8ec56d376e'

url = 'http://api.openweathermap.org/data/2.5/forecast?id=7284825&units=metric&APPID=' + api_key
json_obj = requests.get(url)
data = json.loads(json_obj.content)

keys = data.keys()
# ['cod', 'message', 'cnt', 'list', 'city']

weather_types = data['list']

print(weather_types[0]['main'])

forecast_description = []

for item in weather_types:
    temp_dict = {}
    temp_dict['date'] = item['dt_txt']
    temp_dict['weather'] = item['weather'][0]['description']
    temp_dict['temp'] = item['main']['temp']

    forecast_description.append(temp_dict)

columns = forecast_description[0].keys()  # ['date', 'weather', 'temp']

df = pd.DataFrame(forecast_description, columns=columns)

pd.set_option('display.max_columns', 20)

print('-------current weather-------'.upper())
print(df.loc[df['temp'].idxmin()])
