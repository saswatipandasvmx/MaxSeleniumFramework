package Utility;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.DOMConfiguration;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentKlovReporter;
import com.google.common.base.Predicate;

import org.apache.log4j.xml.DOMConfigurator;
import org.apache.log4j.xml.Log4jEntityResolver;
public class SDriver {



		// instance of singleton class
		private static SDriver instanceOfSingletonBrowserClass=null;

	public static  Logger Log=Logger.getLogger(SDriver.class.getName());
		//public static ExtentReports extent = new ExtentReports();
		//public static ExtentKlovReporter klov = new ExtentKlovReporter("project", "build");
		//public static ExtentTest feature;
		//public static  ExtentTest scenario;
	  
	    private WebDriver driver;
	   public static Logger log;
	    // Constructor
	    private SDriver(){
	    	System.setProperty("webdriver.chrome.driver","./Binaries/chromedriver.exe");
	    	ChromeOptions options= new ChromeOptions();
	    	options.addArguments("--disable-infobars"); 
			driver= new ChromeDriver(options);
			 DOMConfigurator.configure("log4j.xml");
			 Log.info("New driver instantiated");
			driver.manage().window().maximize();
			//extent.attachReporter(klov);
			
			
			//extent.flush();
			
			
			//logger.Debug();
			}

	    // TO create instance of class
	    public static SDriver getInstanceOfSingletonBrowserClass(){
	        if(instanceOfSingletonBrowserClass==null){
	        	instanceOfSingletonBrowserClass = new SDriver();
	        }
	        return instanceOfSingletonBrowserClass;
	    }
	    
	    // To get driver
	    public WebDriver getDriver()
	    {
	    	return driver;
	    }
	 // To wait for the page to load
		public static void WaitfordocStateReady(WebDriver Driver) throws InterruptedException
		{
Thread.sleep(6000);
		    JavascriptExecutor js = (JavascriptExecutor)Driver;

		    //This loop will rotate for 100 times to check If page Is ready after every 1 second.
		    //You can replace your if you wants to Increase or decrease wait time.
		    for (int i=0; i<400; i++)
		    { 
		        try 
		        {
		            Thread.sleep(1000);
		            Log.info("Page has not loaded:"+i+" sec");
		        }catch (InterruptedException e) {} 
		        //To check page ready state.

		        if (js.executeScript("return document.readyState").toString().equals("complete"))
		        { 
		            break; 
		        }   
		      }
		    
		 }
		
		
		public static void WaitfortheElementtobevisible(WebDriver driver,By userName)
		{
			Log.info(userName+" waiting for the element to be visible");
			//logger.Info(userName, " Waiting for the Element with locator to be visible");
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(userName));
			System.out.println(userName+" is now available to take click or input");
			//logger.Info(userName, " Element with locator to be visible");
			Log.info(userName+" element is  visible");		
		}
		
	
	   public static void StartextentFeature(String Featurename, String Scenario) throws ClassNotFoundException
	   {
		  // ExtentTest feature = extent.createTest(Feature.class, Featurename);
		   //ExtentTest scenario = feature.createNode(new GherkinKeyword("Scenario"), Scenario);
	   }
	
}
