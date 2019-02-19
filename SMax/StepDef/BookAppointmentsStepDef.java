package StepDef;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.awt.print.Book;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.BookAppointments;
import Pages.LoginPage;
import Pages.WorkOdersHome;
import Utility.SDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BookAppointmentsStepDef {

	public static WebDriver Driver= WorkOrderCreationStepDef.Driver;
	public static String mainWindow=null;
	
	public static boolean  isElementPresent() {
		boolean isPresent = true;
			try {
					Driver.findElement(BookAppointments.Recomendedbutton).isDisplayed();
				}
			catch (NoSuchElementException e)
				{
					isPresent = false;
				}
					return isPresent;
			}
	
	
	public static boolean  isElementPresentConfirm() {
		boolean isPresent = true;
			try {
					Driver.findElement(BookAppointments.Confirmokbutton).isDisplayed();
				}
			catch (NoSuchElementException e)
				{
					isPresent = false;
				}
					return isPresent;
			}
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
		// Thread.sleep(4000);
		 SDriver.WaitfortheElementtobevisible(Driver,BookAppointments.ShowPoorSlots);
		 SDriver.WaitfordocStateReady(Driver);	
		WebDriverWait wb = new WebDriverWait(Driver, 30000);
		wb.until(ExpectedConditions.elementToBeClickable(BookAppointments.ShowPoorSlots));
		 
		 Driver.findElement(BookAppointments.ShowPoorSlots).click();
		 SDriver.WaitfordocStateReady(Driver);
		 WebDriverWait wb1 = new WebDriverWait(Driver, 30000);
			wb1.until(ExpectedConditions.elementToBeClickable(BookAppointments.RunButton));
		 Driver.findElement(BookAppointments.RunButton).click();
	}

	@Then("^the user books a slot$")
	public void the_user_books_a_slot() throws Throwable {
		SDriver.WaitfordocStateReady(Driver);	
		 for (int i=0;i<=5;i++)
		 {
			
		Thread.sleep(1000);

			boolean check=isElementPresent();
			 if(check==true)
					 {
				 
					 System.out.println("recomed slots threre");
				 Driver.findElement(BookAppointments.Recomendedbutton).click();
				 break;
					 }
			 else
			 {
				 //Driver.switchTo().defaultContent();
				 Driver.findElement(BookAppointments.RunButton).click();
				 System.out.println("Rec slot not present try :"+i);
				
			 }
		 }
		 
	Driver.findElement(BookAppointments.Recomendedbutton).click();
	Driver.findElement(BookAppointments.BookAppointmentbutton).click();
	
	
	SDriver.WaitfordocStateReady(Driver);
	
	Driver.findElement(BookAppointments.confirmappointment).click();
	for (int i=0;i<3;i++)
	 {
		 SDriver.WaitfordocStateReady(Driver);	
		boolean Confirmokbuttonpresence=isElementPresentConfirm();
		 if(Confirmokbuttonpresence==true)

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