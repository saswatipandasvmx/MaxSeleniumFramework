package StepDef;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.awt.print.Book;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pages.BookAppointments;
import Pages.LoginPage;
import Pages.WorkOdersHome;
import Utility.SDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BookAppointmentsStepDef {

	public static WebDriver Driver= WorkOrderCreationStepDef.Driver;
	public static String mainWindow=null;
	
	
	@Then("^the user clicks on the Get_Appointment_ECO$")
	public void the_user_clicks_on_the() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
		Driver.switchTo().frame("066170000005IKY");
		Driver.findElement(BookAppointments.GetAppointments).click();
		 SDriver.WaitfordocStateReady(Driver);
		 
		 String mainWindow=Driver.getWindowHandle();
		 Set<String> set =Driver.getWindowHandles();
		 Iterator<String> itr= set.iterator();
		 while(itr.hasNext())
		 {
		 String childWindow=itr.next();
		 if(!mainWindow.equals(childWindow))
		 {
			 Driver.switchTo().window(childWindow);
			 Driver.manage().window().maximize();
			 System.out.println(Driver.switchTo().window(childWindow).getTitle());
			 
		 }
		 }
		 SDriver.WaitfordocStateReady(Driver);		 
		 SDriver.WaitfortheElementtobevisible(Driver,BookAppointments.ShowPoorSlots);
		 SDriver.WaitfordocStateReady(Driver);	
		 Driver.findElement(BookAppointments.ShowPoorSlots).click();
		 SDriver.WaitfordocStateReady(Driver);
		 Driver.findElement(BookAppointments.RunButton).click();
	}

	@Then("^the user books a slot$")
	public void the_user_books_a_slot() throws Throwable {
		SDriver.WaitfordocStateReady(Driver);	
		 for (int i=0;i<=3;i++)
		 {
			
			
			 if(Driver.findElement(BookAppointments.Recomendedbutton).isDisplayed())
					 {
				 
					 System.out.println("recomed slots threre");
				 Driver.findElement(BookAppointments.Recomendedbutton).click();
				 break;
					 }
			 else
			 {
				 Driver.findElement(BookAppointments.RunButton).click();
				 System.out.println("Rec slot not present"+i);
				 SDriver.WaitfordocStateReady(Driver);	
			 }
		 }
		 
	Driver.findElement(BookAppointments.Recomendedbutton).click();
	Driver.findElement(BookAppointments.BookAppointmentbutton).click();
	
	
	SDriver.WaitfordocStateReady(Driver);
	
	Driver.findElement(BookAppointments.confirmappointment).click();
	for (int i=0;i<3;i++)
	 {
		 SDriver.WaitfordocStateReady(Driver);	
		
		 if(Driver.findElement(BookAppointments.Confirmokbutton).isDisplayed())
				 {
			 SDriver.WaitfordocStateReady(Driver);
			Driver.findElement(BookAppointments.Confirmokbutton).click();
			SDriver.WaitfordocStateReady(Driver);
			break;
			 
				 }
		 else
		 {
			 SDriver.WaitfordocStateReady(Driver);
			 WebElement Appointmenttable= Driver.findElement(BookAppointments.Recomendedbutton);
			 Appointmenttable.click();
			 SDriver.WaitfordocStateReady(Driver);
			 Driver.findElement(BookAppointments.BookAppointmentbutton).click();
		 }
	 }

	Driver.switchTo().window(mainWindow);
	SDriver.WaitfordocStateReady(Driver);
	String Scheduleddate=Driver.findElement(WorkOdersHome.Scheduledatetimereadone).getText();
	
		assertNotNull(Scheduleddate);
	System.out.println("The Appointment is Scheduled on Date :" +Scheduleddate);
	}
	    
	}

