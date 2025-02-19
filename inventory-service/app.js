import express from 'express';
import {Eureka} from "eureka-js-client";
/**
 * ---------------------------------------------
 * @author Gayanuka Bulegoda
 * @portfolio https://grbulegoda.me/
 * @github https://github.com/gayanukabulegoda
 * ---------------------------------------------
 * @project Architectural-Blueprints
 * @repository https://github.com/gayanukabulegoda/Architectural-Blueprints
 * @since 2025-02-19
 * ---------------------------------------------
 * @file app.js - main file of the inventory-service
 * ---------------------------------------------
 */
const app = express();
const port = 3000;

const router = express.Router();

router.get('/inventory', (req, res) => {
    res.json({
        items: ['apple', 'banana', 'orange'],
        message: 'This is inventory service'
    });
});

app.use('/inventory-service/api/v1', router);

const eurekaClient = new Eureka({
    instance: {
        instanceId: "inventory-service",
        app: "INVENTORY-SERVICE",
        hostName: "localhost",
        ipAddr: "127.0.0.1",
        port: {
            $: port,
            "@enabled": true,
        },
        vipAddress: "inventory-service",
        dataCenterInfo: {
            "@class": "com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo",
            name: "MyOwn",
        },
    },
    eureka: {
        host: "localhost",
        port: 8761,
        // servicePath: "/eureka/app/",
        // or
        // servicePath: "/eureka/",
        // or
        // empty
    },
});

app.listen(port, () => {
    console.log(`Inventory service is running on port ${port}`);
    eurekaClient.start((error) => {
        if (error) {
            console.log(error);
        } else {
            console.log('Eureka client started');
        }
    });
});