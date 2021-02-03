package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "/media/sachin/New Volume1/SeleniumTest/SeleniumProgram/Selenium jar and driver/drivers/chromedriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		//this is relative path getproperty() return the path of the project and we are using that path
		
		//This is for the firefox
		
//		String location=System.getProperty("user.dir");
//		System.setProperty("webdriver.gecko.driver",location+"/Selenium jar and driver/drivers/firefoxdriver/geckodriver");
//		WebDriver driver=new  FirefoxDriver();
		
		driver.get("https://www.selenium.dev/");
	}

}
