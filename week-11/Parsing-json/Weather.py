import json
import requests
import pandas as pd
from flask import Flask, render_template

app: Flask = Flask(__name__,
                   template_folder='template')


api_key = '3da764d340fac8e5f57a5c8ec56d376e'

url = 'http://api.openweathermap.org/data/2.5/forecast?id=7284825&units=metric&APPID=' + api_key
json_obj = requests.get(url)
data = json.loads(json_obj.content)

keys = data.keys()
# ['cod', 'message', 'cnt', 'list', 'city']

weather_types = data['list']

print(weather_types[0]['main'])


def icon_source(iconid):
    return "http://openweathermap.org/img/w/" + iconid + ".png"


forecast_description = []

for item in weather_types:
    temp_dict = {}
    temp_dict['date'] = item['dt_txt']
    temp_dict['weather'] = item['weather'][0]['description']
    temp_dict['temp'] = item['main']['temp']
    temp_dict['temp_min'] = item['main']['temp_min']
    temp_dict['temp_max'] = item['main']['temp_max']
    temp_dict['icon'] = icon_source(item['weather'][0]['icon'])
    forecast_description.append(temp_dict)

columns = forecast_description[0].keys()  # ['date', 'weather', 'temp']

df = pd.DataFrame(forecast_description, columns=columns)

lowest_temp = df.loc[df['temp_min'].idxmin()]
highest_temp = df.loc[df['temp_max'].idxmax()]
avg_temp = df.loc[:, "temp"].mean()

pd.set_option('display.max_columns', 20)


# print('-------current weather-------'.upper())
# print(df.loc[df['temp'].idxmin()])

@app.route('/', methods=['GET'])
def home():
    return render_template('home.html', lowest_temp=lowest_temp, forecast_description=forecast_description,
                           highest_temp=highest_temp)


if __name__ == '__main__':
    app.run(debug=True)
