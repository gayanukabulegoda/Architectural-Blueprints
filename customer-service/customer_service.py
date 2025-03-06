from flask import Flask, jsonify
import py_eureka_client.eureka_client as eureka_client

'''
* ---------------------------------------------
* @author Gayanuka Bulegoda
* @portfolio https://grbulegoda.me/
* @github https://github.com/gayanukabulegoda
* ---------------------------------------------
* @project Architectural-Blueprints
* @repository https://github.com/gayanukabulegoda/Architectural-Blueprints
* @since 2025-02-27
* ---------------------------------------------
* @file app.js - main file of the customer-service
* ---------------------------------------------
'''

app = Flask(__name__)

CONTEXT_PATH = '/customer-service'
SERVER_PORT = 5000
EUREKA_SERVICE_URL = 'http://localhost:8761/eureka/'

eureka_client.init(
    eureka_server=EUREKA_SERVICE_URL,
    app_name="CUSTOMER-SERVICE",
    instance_port=SERVER_PORT
)

@app.route(f'{CONTEXT_PATH}/api/v1/customers', methods=['GET'])
def get_customers():
    customers = [
        {"id": 1, "name": "John Doe"},
        {"id": 2, "name": "Jane Doe"}
    ]
    return jsonify(customers)

app.run(port=SERVER_PORT)