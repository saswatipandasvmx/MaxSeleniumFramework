package StepDef;


import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.IGherkinFormatterModel;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.aventstack.extentreports.reporter.ExtentKlovReporter;
import com.aventstack.extentreports.*;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.WorkOdersHome;
import Utility.SDriver;
import Utility.Sdriverwait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class WorkOrderCreationStepDef {
	public static ExtentTest feature=null;
	public static  ExtentTest scenario =null;
	public static ExtentReports extent = new ExtentReports();
	 public static ExtentKlovReporter klov = new ExtentKlovReporter("project", "build");
public  static WebDriver	Driver=SDriver.getInstanceOfSingletonBrowserClass().getDriver();

@Given("^The Feature is \"([^\"]*)\" and scenario is \"([^\"]*)\"$")
public void the_Feature_is_and_scenario_is(String Feature,String Scenario) throws Throwable {
ExtentTest feature=extent.createTest(Feature.class, Feature);
ExtentTest scenario = feature.createNode(Scenario.class, Scenario);
}


@SuppressWarnings("unchecked")
@Given("^the user  is on the  portal$")
public void the_user_is_on_the_portal() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
  Driver.navigate().to("https://test.salesforce.com/");
  SDriver.WaitfordocStateReady(Driver);
 
  
}

@Then("^the user loggs in with the credentials as username\"([^\"]*)\" and password\"([^\"]*)\"$")
public void the_user_loggs_in_with_the_credentials_as_username_and_password(String username, String password) throws Throwable {
	  System.out.println("This is Step 2");
	 SDriver.WaitfortheElementtobevisible(Driver, LoginPage.UserName);
	  Driver.findElement(LoginPage.UserName).sendKeys(username);
	  Driver.findElement(LoginPage.Password).sendKeys(password);
	  Driver.findElement(LoginPage.loginButton).click();
}

@Then("^validate the user has logged in the protal$")
public void validate_the_user_has_logged_in_the_protal() throws Throwable {
   
	

	  
}
@Then("^click on the WorkOrders Tab$")
public void click_on_the_WorkOrders_Tab() throws Throwable {
	  SDriver.WaitfordocStateReady(Driver);
	  SDriver.WaitfortheElementtobevisible(Driver, HomePage.WorkOrderButton);
	  Driver.findElement(HomePage.WorkOrderButton).click();
}

@Then("^Select the Regression View$")
public void select_the_Regression_View() throws Throwable {
    SDriver.WaitfordocStateReady(Driver);
	SDriver.WaitfortheElementtobevisible(Driver, WorkOdersHome.viewdropdown);
	 WebElement dropdown=Driver.findElement(WorkOdersHome.viewdropdown);
	Select b=new Select(dropdown);
	//b.deselectAll();
	b.selectByVisibleText("Regression view");
	SDriver.WaitfortheElementtobevisible(Driver, WorkOdersHome.viewsubmitbutton);
	Driver.findElement(WorkOdersHome.viewsubmitbutton).click();  
}

@Then("^Open the first workobject on the view$")
public void open_the_first_workobject_on_the_view() throws Throwable {
 SDriver.WaitfordocStateReady(Driver);
 SDriver.WaitfortheElementtobevisible(Driver, WorkOdersHome.First);
 Driver.findElement(WorkOdersHome.First).click();
ArrayList<WebElement> Web= new ArrayList<WebElement>();


 Web.addAll(Driver.findElements(By.xpath("//*[@class='x-grid3-col x-grid3-cell x-grid3-td-00N17000000zjTZ']")));
System.out.println(Web);
}

@Then("^clone the workobject$")
public void clone_the_workobject() throws Throwable {
	 SDriver.WaitfordocStateReady(Driver);
	 SDriver.WaitfortheElementtobevisible(Driver, WorkOdersHome.clonebutton);
	 Driver.findElement(WorkOdersHome.clonebutton).click();
	// SDriver.WaitfordocStateReady(Driver);
	 Driver.findElement(WorkOdersHome.ServiceTeam).clear();
	 //SDriver.WaitfordocStateReady(Driver);
	 Driver.findElement(WorkOdersHome.SchedulingChangeToken).clear();
	 //SDriver.WaitfordocStateReady(Driver);
	 Driver.findElement(WorkOdersHome.Technician).clear();
	// SDriver.WaitfordocStateReady(Driver);
	 Driver.findElement(WorkOdersHome.SkillSet).clear();
	// SDriver.WaitfordocStateReady(Driver);
	 Driver.findElement(WorkOdersHome.QualifiedTechnicians).clear();
	// SDriver.WaitfordocStateReady(Driver);
	 Driver.findElement(WorkOdersHome.Drivingtime).clear();
	// SDriver.WaitfordocStateReady(Driver);
	 Driver.findElement(WorkOdersHome.Optimaxstatus).clear();
	 //SDriver.WaitfordocStateReady(Driver);
	 Driver.findElement(WorkOdersHome.Optimaxerrortext).clear();
	 SDriver.WaitfordocStateReady(Driver);
	 //Driver.findElement(WorkOdersHome.Dispatchpriority).clear();
	 //SDriver.WaitfordocStateReady(Driver);
	 Driver.findElement(WorkOdersHome.Dispatchprocess).clear();
	// SDriver.WaitfordocStateReady(Driver);
	 Driver.findElement(WorkOdersHome.SchedulingDateTime).clear();
	 //SDriver.WaitfordocStateReady(Driver);
	 Driver.findElement(WorkOdersHome.AppointmentType).clear();
	// SDriver.WaitfordocStateReady(Driver);
	 Driver.findElement(WorkOdersHome.PromisedApptSlot).clear();
	 SDriver.WaitfordocStateReady(Driver);
	 Driver.findElement(WorkOdersHome.AppointmentType).sendKeys("RTO Appt Type");
	 SDriver.WaitfordocStateReady(Driver);
	 WebElement dropdown1=Driver.findElement(WorkOdersHome.QTLstatus);
	 Select dr1=new Select(dropdown1);
	 dr1.selectByVisibleText("--None--");
	 SDriver.WaitfordocStateReady(Driver);
	 WebElement dropdown2=Driver.findElement(WorkOdersHome.Schedulingstatus);
	 Select dr2=new Select(dropdown2);
	 dr2.selectByVisibleText("--None--");
	 SDriver.WaitfordocStateReady(Driver);
	 SDriver.WaitfortheElementtobevisible(Driver, WorkOdersHome.Savebutton);
	 Driver.findElement(WorkOdersHome.Savebutton).click();
	 SDriver.WaitfordocStateReady(Driver);
	 String Workorderid=Driver.findElement(WorkOdersHome.workorderid).getText();
	 System.out.println("The Workorder is : "+Workorderid);
	 Thread.sleep(5000);
	 Driver.navigate().refresh();
	 SDriver.WaitfordocStateReady(Driver);
	 String Status;
	 assertEquals( Status=Driver.findElement(WorkOdersHome.Optstatus).getText(), "OPT_COMPLETED");
	 
	 
	 
	 
	 
}


}
