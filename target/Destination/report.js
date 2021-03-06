$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("WorkOrderCreation.feature");
formatter.feature({
  "line": 2,
  "name": "WorkOrder Creation",
  "description": "",
  "id": "workorder-creation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SmaxRegression"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "To book an appointment in the booking window",
  "description": "",
  "id": "workorder-creation;to-book-an-appointment-in-the-booking-window",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "the user  is on the  portal",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "the user loggs in with the credentials as username\"saswati.p@servicemax.com.optxpart1\" and password\"servicemax1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "validate the user has logged in the protal",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "click on the WorkOrders Tab",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Select the Regression View",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Open the first workobject on the view",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "clone the workobject",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "the user clicks on the Get_Appointment_ECO",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "the user books a slot",
  "keyword": "Then "
});
formatter.match({
  "location": "WorkOrderCreationStepDef.the_user_is_on_the_portal()"
});
formatter.result({
  "duration": 21464062470,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "saswati.p@servicemax.com.optxpart1",
      "offset": 51
    },
    {
      "val": "servicemax1",
      "offset": 100
    }
  ],
  "location": "WorkOrderCreationStepDef.the_user_loggs_in_with_the_credentials_as_username_and_password(String,String)"
});
formatter.result({
  "duration": 5459486553,
  "status": "passed"
});
formatter.match({
  "location": "WorkOrderCreationStepDef.validate_the_user_has_logged_in_the_protal()"
});
formatter.result({
  "duration": 19746,
  "status": "passed"
});
formatter.match({
  "location": "WorkOrderCreationStepDef.click_on_the_WorkOrders_Tab()"
});
formatter.result({
  "duration": 9625259746,
  "status": "passed"
});
formatter.match({
  "location": "WorkOrderCreationStepDef.select_the_Regression_View()"
});
formatter.result({
  "duration": 10272521761,
  "status": "passed"
});
formatter.match({
  "location": "WorkOrderCreationStepDef.open_the_first_workobject_on_the_view()"
});
formatter.result({
  "duration": 15650747637,
  "status": "passed"
});
formatter.match({
  "location": "WorkOrderCreationStepDef.clone_the_workobject()"
});
formatter.result({
  "duration": 75724657653,
  "status": "passed"
});
formatter.match({
  "location": "BookAppointmentsStepDef.the_user_clicks_on_the()"
});
formatter.result({
  "duration": 25069370419,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003cinput type\u003d\"button\" id\u003d\"hidePoorSlot-inputEl\" class\u003d\"svmx-form-field svmx-form-checkbox\" autocomplete\u003d\"off\" hidefocus\u003d\"true\" aria-invalid\u003d\"false\" data-errorqtip\u003d\"\" style\u003d\"user-select: text;\"\u003e is not clickable at point (791, 104). Other element would receive the click: \u003cdiv id\u003d\"_svmx_cmp_load_mask_1\" class\u003d\"svmx-loadmask svmx-wait-cursor\" style\u003d\"top: 0px; left: 0px; height: 677px; width: 1366px; display: block;\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d72.0.3626.109)\n  (Driver info: chromedriver\u003d73.0.3683.20 (8e2b610813e167eee3619ac4ce6e42e3ec622017),platform\u003dWindows NT 10.0.15063 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.6.0\u0027, revision: \u00276fbf3ec767\u0027, time: \u00272017-09-27T15:28:36.4Z\u0027\nSystem info: host: \u0027G9GPW5H2E\u0027, ip: \u0027192.168.0.141\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:62939}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003dignore, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d73.0.3683.20 (8e2b610813e167eee3619ac4ce6e42e3ec622017), userDataDir\u003dC:\\Users\\212720~1\\AppData\\Local\\Temp\\scoped_dir13084_29281}, takesHeapSnapshot\u003dtrue, unhandledPromptBehavior\u003dignore, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d72.0.3626.109, browserConnectionEnabled\u003dfalse, proxy\u003dProxy(), nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 50ef298e6cc2f88f15dfc7fe1b194e31\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:586)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat StepDef.BookAppointmentsStepDef.the_user_clicks_on_the(BookAppointmentsStepDef.java:83)\r\n\tat ✽.Then the user clicks on the Get_Appointment_ECO(WorkOrderCreation.feature:15)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "BookAppointmentsStepDef.the_user_books_a_slot()"
});
formatter.result({
  "status": "skipped"
});
});