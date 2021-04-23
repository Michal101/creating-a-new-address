$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CreateNewAddress.feature");
formatter.feature({
  "line": 1,
  "name": "Create new address after login",
  "description": "",
  "id": "create-new-address-after-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Create new address",
  "description": "",
  "id": "create-new-address-after-login;create-new-address",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is logged in to my store shop",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User goes to UserAddressesPage",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User create new address",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User delete last address",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User close window",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateNewAddress.userIsLooggedInToMyStoreShop()"
});
formatter.result({
  "duration": 4015652000,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewAddress.userGoesToAddressesPage()"
});
formatter.result({
  "duration": 634050100,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewAddress.userAddNewAddress()"
});
formatter.result({
  "duration": 1208111300,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewAddress.userDeleteAddress()"
});
formatter.result({
  "duration": 440958300,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewAddress.userCloseWindow()"
});
formatter.result({
  "duration": 46235200,
  "status": "passed"
});
});