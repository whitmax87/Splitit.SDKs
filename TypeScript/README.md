## Splitit SDK for Typescript (browser)

Environment
* Webpack / browser

Dependencies
* "fetch": "~1.1.0"

It can be used in both TypeScript and JavaScript. In TypeScript, the definition should be automatically resolved via `package.json`. ([Reference](http://www.typescriptlang.org/docs/handbook/typings-for-npm-packages.html))

## Installation

Install via node package manager:

```
npm install splitit-sdk --save
```

## Getting Started

Note: this library is intended for browser use only, therefore call to login and initiate API must be done server-side to keep your credentials safe.
Once the PublicToken is obtained, it can be used to invoke further API methods.
Please follow the [installation](#installation) instruction and add the following TypeScript code:

```TypeScript
import * as splititApi from 'splitit-sdk';

export function testSplititApi() {
    console.log('Initiating...');

    splititApi.Configuration.setSandbox();

    // Obtain PublicToken via server-side call using one of the libraries available [here](https://github.com/Splitit/Splitit.SDKs).

    const publicToken = "TOKEN_OBTAINED_SERVER_SIDE";
    const installmentPlanNumber = "PLAN_NUMBER_OBTAINED_SERVER_SIDE";

    var planApi = new splititApi.InstallmentPlanApi(
        splititApi.Configuration.clientSide(publicToken));

    const createRequest: splititApi.CreateInstallmentPlanRequest = {
        creditCardDetails: <splititApi.CardData>{
            cardNumber: "411111111111111",
            cardCvv: "123",
            cardHolderFullName: "John Smith",
            cardExpMonth: "12",
            cardExpYear: "2022"
        },
        installmentPlanNumber: installmentPlanNumber
    };

    planApi.installmentPlanCreate({ request: createRequest })
        .then(data => console.log(data))
        .catch(err => console.error(err));
}
```

To use the library in Javascript, use the following slightly modified code:

```javascript
export function testSplititApi() {
    console.log('Initiating...');

    var splititApi = require('splitit-sdk');
    splititApi.Configuration.setSandbox();

    var publicToken = "TOKEN_OBTAINED_SERVER_SIDE";
    var installmentPlanNumber = "PLAN_NUMBER_OBTAINED_SERVER_SIDE";

    var planApi = new splititApi.InstallmentPlanApi(
            splititApi.Configuration.clientSide(publicToken));

    var createRequest = splititApi.CreateInstallmentPlanRequestFromJSONTyped({
        CreditCardDetails: {
            CardNumber: "411111111111111",
            CardCvv: "123",
            CardHolderFullName: "John Smith",
            CardExpMonth: "12",
            CardExpYear: "2022"
        },
        InstallmentPlanNumber: installmentPlanNumber
    });
    
    planApi.installmentPlanCreate({ request: createRequest }).then(function (data) {
        console.log({ data });
    }).catch(err => {
        console.error(err);
    });
}
```

For detailed information on request and response procedures, please visit [Splitit Web API documentation](https://documenter.getpostman.com/view/795699/RWaNQSJH?version=latest)

