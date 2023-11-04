package org.maven.selenium_testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("script Started");
   //initializing the web driver
    	System.setProperty("webdriver.chrome.driver ","C:\\Users\\vedprakash\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
    	
    	//setting properties
    	ChromeOptions chromeOptions= new ChromeOptions();
    	
		
    	//open url
    	System.out.println("Driver Opening the url in browser ");
    	WebDriver driver =new ChromeDriver(chromeOptions);
    	driver.get("http://localhost:8080/addressbook/");
    	//involve implicit waits to load the page
    	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    	System.out.println("Enter Details");
    	//enter details
    	driver.findElement(By.className("v-button")).click();
    	//firstname gwt-uid-5
    	driver.findElement(By.id("gwt-uid-5")).sendKeys("vedprakash");
    	//lastname gwt-uid-7
    	driver.findElement(By.id("gwt-uid-7")).sendKeys("Gajbhiye");
    	//contactno id='gwt-uid-9
    	driver.findElement(By.id("gwt-uid-9")).sendKeys("9999999999");
    	//email gwt-uid-11
    	driver.findElement(By.id("gwt-uid-11")).sendKeys("ved@xyz.com");
    	//date of birth gwt-uid-13
    	driver.findElement(By.id("gwt-uid-13")).sendKeys("04/09/23");
    	driver.findElement(By.className("v-button-primary")).click();
    	System.out.println("saving Details");
    	System.out.println("Test case Execution Completed");
       driver.quit();
    }
}
