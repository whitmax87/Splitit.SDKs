## Splitit SDK for Typescript (NodeJS - server side)

Environment
* NodeJS

Dependencies
* "bluebird": "^3.7.2",
* "express": "^4.16.4",
* "request": "^2.88.2",

## Installation

Install via node package manager:

```
npm install splitit-sdk-nodejs --save
```

## Getting Started

Please follow the [installation](#installation) instruction and add the following TypeScript code:

```TypeScript
import express, { response } from 'express';
import * as splititApi from 'splitit-sdk-nodejs';

const app = express();
const port = 13008;

app.get('/', async (req, res) => {
  try{
    splititApi.Configuration.setSandbox();

    var loginApi = new splititApi.LoginApi(splititApi.Configuration.default());
  
    const loginRequest: splititApi.LoginRequest = {
        userName: "YOUR_USERNAME",
        password: "YOUR_PASSWORD"
    }
  
    var responseData = await loginApi.loginPost(loginRequest);
    splititApi.Configuration.authenticate("YOUR_API_KEY", responseData.body.sessionId);
  
    console.log('Login response:');
    console.log(responseData);
  
    var result:any = {};
    result.loginResponse = responseData;
  
    var planApi = new splititApi.InstallmentPlanApi(splititApi.Configuration.default());
    //planApi.setCulture('de-DE');
  
    const initRequest: splititApi.InitiateInstallmentPlanRequest = {
        planData: <splititApi.PlanData>{
            amount: <splititApi.MoneyWithCurrencyCode>{ value: 1000, currencyCode: "USD" },
            numberOfInstallments: 3
        },
        billingAddress: <splititApi.AddressData>{
            addressLine: "260 Madison Avenue.",
            addressLine2: "Appartment 1",
            city: "New York",
            state: "NY",
            country: "USA",
            zip: "10016"
        },
        consumerData: <splititApi.ConsumerData>{
            fullName: "John Smith",
            email: "JohnS@splitit.com",
            phoneNumber: "1-844-775-4848",
            cultureName: "en-us"
        }
    };
  
    console.log("/Initiate request + response:");
    console.log(initRequest);
    var initResponse = await planApi.installmentPlanInitiate(initRequest);
    result.initResponse = initResponse;
        
    const createRequest: splititApi.CreateInstallmentPlanRequest = {
        creditCardDetails: <splititApi.CardData>{
            cardNumber: "411111111111111",
            cardCvv: "112",
            cardHolderFullName: "John Smith",
            cardExpMonth: "12",
            cardExpYear: "2022"
        },
        installmentPlanNumber: initResponse.body.installmentPlan!.installmentPlanNumber
    };
  
    var createResponse = await planApi.installmentPlanCreate(createRequest);
    result.createResponse = createResponse;
  
    res.header("Content-Type",'application/json');
    res.send(JSON.stringify(result, null, 4));
  } catch(e){
    res.header("Content-Type",'application/json');
    res.send(JSON.stringify({ error: e }, null, 4));
  }
});

app.listen(port, err => {
  if (err) {
    return console.error(err);
  }
  return console.log(`server is listening on ${port}`);
});
```

## Flex Fields

Commong usage for NodeJS SDK is in making necessary server-side requests as part of FlexFields product integration.
The code below is an example of how SDK wrappers can be used to simplify acquiring public token and verifying payment.
For more information, please visit [FlexFields documentation](https://hosted.production.splitit.com/#nodejs).

```TypeScript
app.get('/get-token', async (req, res) => {
  try{

    splititApi.Configuration.sandbox.addApiKey("YOUR_API_KEY");
    var env = splititApi.Configuration.sandbox;

    var result:any = {};

    var flexFields = await splititApi.FlexFields.authenticate(env, "YOUR_USERNAME", "YOUR_PASSWORD");
    result.token = await flexFields.getPublicToken(1000, "USD");
  
    res.header("Content-Type",'application/json');
    res.send(JSON.stringify(result, null, 4));
  } catch(e){
    res.header("Content-Type",'application/json');
    res.send(JSON.stringify({ error: e }, null, 4));
  }
});

app.post('/verify-payment', async (req, res) => {
  try{
    splititApi.Configuration.sandbox.addApiKey("YOUR_API_KEY");

    var env = splititApi.Configuration.sandbox;
    var flexFields = await splititApi.FlexFields.authenticate(env, "YOUR_USERNAME", "YOUR_PASSWORD");
    var ok = await flexFields.verifyPayment(req.body.installmentPlanNumber, 1000);

    if (!ok){
      // Do something if payment is not verified
    } else {
      // Return success code
    }

    res.header("Content-Type",'application/json');
    res.send(JSON.stringify(result, null, 4));
  } catch(e){
    res.header("Content-Type",'application/json');
    res.send(JSON.stringify({ error: e }, null, 4));
  }
})
```

For detailed information on request and response procedures, please visit [Splitit Web API documentation](https://documenter.getpostman.com/view/795699/RWaNQSJH?version=latest)

