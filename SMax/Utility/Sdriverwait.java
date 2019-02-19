package Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sdriverwait {
	public static void WaitfordocStateReady(WebDriver Driver)
	{
System.out.println("Entering Doc State Ready");
	    new WebDriverWait(Driver, 30).until((ExpectedCondition<Boolean>) wd ->
	            ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
	    System.out.println(" Doc State ready: Page is loaded ");
	}	
	
	
	
	
	}


