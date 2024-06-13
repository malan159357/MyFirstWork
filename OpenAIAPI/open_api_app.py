
import requests
from config.read_config import Config
from flask import request,jsonify
from flask import Flask
from flask_cors import CORS
app = Flask(__name__)
CORS(app,supports_credentials=True)

@app.route('/OpenAI_API',methods=["GET"])
def run_api():
    model_name = request.args.get('model_name')
    model_name= 'gpt-3.5-turbo' if model_name == "" or model_name == None else eval(model_name)

    mes = request.args.get('mes')
    print("-----------message model name--------",mes,model_name)

    if mes != "":
        result = http_request(model_name, mes)
    else:
        result = jsonify(message="Error,Nothing input.")
    return result
def http_request(model_name='gpt-3.5-turbo',mes="Hello!"):
    config = Config()
    config = config.read_config()
    api_key = config["ACCESS_KEY"]
    url = config["URL"]

    header = {
        "Content-Type": "application/json",
        "Authorization": "Bearer " + api_key
    }

    data = {
        "model": model_name,
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

    response = requests.post(url=url, headers=header, json=data,verify=False)
    if response.status_code == 200:
        result = response.json()
    else:
        result = response.status_code

    return result


if __name__=="__main__":
   app.run(host='localhost', port=5000, debug=True)

