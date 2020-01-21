## Splitit SDK for Typescript

Environment
* Webpack

Dependencies
* "fetch": "~1.1.0"

It can be used in both TypeScript and JavaScript. In TypeScript, the definition should be automatically resolved via `package.json`. ([Reference](http://www.typescriptlang.org/docs/handbook/typings-for-npm-packages.html))

## Installation

Install via node package manager:

```
npm install splitit-sdk --save
```

## Getting Started

Please follow the [installation](#installation) instruction and add the following TypeScript code:

```TypeScript
import * as splititApi from 'splitit-sdk';

export function testSplititApi() {
    console.log('Initiating...');

    splititApi.Configuration.setSandbox();

    var loginApi = new splititApi.LoginApi();

    const loginRequest: splititApi.LoginRequest = {
        userName: "_YOUR_USERNAME_",
        password: "_YOUR_PASSWORD_"
    }

    console.log(loginRequest);

    loginApi.loginPost({ request: loginRequest })
        .then(data => {
            console.log('Login response:');
            console.log(data);

            var planApi = new splititApi.InstallmentPlanApi(
                splititApi.Configuration.serverSide("_YOUR_API_KEY_", data.sessionId!));

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
            planApi.installmentPlanInitiate({ request: initRequest })
                .then(data => {
                    const createRequest: splititApi.CreateInstallmentPlanRequest = {
                        creditCardDetails: <splititApi.CardData>{
                            cardNumber: "411111111111111",
                            cardCvv: "123",
                            cardHolderFullName: "John Smith",
                            cardExpMonth: "12",
                            cardExpYear: "2022"
                        },
                        installmentPlanNumber: data.installmentPlan!.installmentPlanNumber
                    };

                    planApi.installmentPlanCreate({ request: createRequest })
                        .then(data => console.log(data))
                        .catch(err => console.error(err));
                })
                .catch(err => console.error(err));
        })
        .catch(err => {
            console.error(err);
        });
}
```

To use the library in Javascript, use the following slightly modified code:

```javascript
export function testSplititApi() {
    console.log('Initiating...');

    var splititApi = require('splitit-sdk');
    splititApi.Configuration.setSandbox();

    var loginApi = new splititApi.LoginApi();
    var loginRequest = splititApi.LoginRequestFromJSONTyped({
        UserName: "_YOUR_USERNAME_",
        Password: "_YOUR_PASSWORD_"
    });

    loginApi.loginPost({ request: loginRequest }).then(function (data) {
        console.log("Login request result:");
        console.log({ data });

        var planApi = new splititApi.InstallmentPlanApi(
            splititApi.Configuration.serverSide("_YOUR_API_KEY_", data.sessionId));
        var initRequest = splititApi.InitiateInstallmentPlanRequestFromJSONTyped({
            PlanData: {
                NumberOfInstallments: 3,
                Amount: { Value: 1000, CurrencyCode: "USD" }
            },
            BillingAddress: {
                AddressLine: "260 Madison Avenue.",
                AddressLine2: "Appartment 1",
                City: "New York",
                State: "NY",
                Country: "USA",
                Zip: "10016"
            },
            ConsumerData: {
                FullName: "John Smith",
                Email: "JohnS@splitit.com",
                PhoneNumber: "1-844-775-4848",
                CultureName: "en-us"
            }
        });

        console.log("/Initiate request result:");
        planApi.installmentPlanInitiate({ request: initRequest }).then(function (data) {
            console.log({ data });

            var createRequest = splititApi.CreateInstallmentPlanRequestFromJSONTyped({
                CreditCardDetails: {
                    CardNumber: "411111111111111",
                    CardCvv: "123",
                    CardHolderFullName: "John Smith",
                    CardExpMonth: "12",
                    CardExpYear: "2022"
                },
                InstallmentPlanNumber: data.installmentPlan.installmentPlanNumber
            });
            
            planApi.installmentPlanCreate({ request: createRequest }).then(function (data) {
                console.log({ data });
            }).catch(err => {
                console.error(err);
            });
        }).catch(err => {
            console.error(err);
        });
    })
    .catch(err => {
        console.error(err);
    });
}
```


For detailed information on request and response procedures, please visit [Splitit Web API documentation](https://documenter.getpostman.com/view/795699/RWaNQSJH?version=latest)

