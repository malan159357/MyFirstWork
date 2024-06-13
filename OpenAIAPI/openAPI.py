
import requests
from config.read_config import Config
import sys


def http_request(model_name="gpt-3.5-turbo",mes="Hello!"):
    config = Config()
    config = config.read_config()
    api_key = config["ACCESS_KEY"]
    url = config["URL"]

    header = {
        "Content-Type": "application/json",
        "Authorization": "Bearer " + api_key
    }

    data = {
        "model": eval(model_name),
        "messages": [
            {
                "role": "system",
                "content": "You are a helpful assistant."
            },
            {
                "role": "user",
                "content": mes
            }
        ],
        "temperature": 0,
        "stream": False
    }
    response = requests.post(url=url, headers=header, json=data)
    if response.status_code == 200:
        result = response.json()
    else:
        result = response.status_code

    return result

if __name__=="__main__":
    args = []

    for i in range(1,len(sys.argv)):
        args.append(sys.argv[i])

    model_name = args[0]
    mes = args[1]

    http_request(model_name,mes)
