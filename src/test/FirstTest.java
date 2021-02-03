package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

	public static String webbrowser;
	public static WebDriver driver;

	public static void main(String[] args) {
		
		setBrowser("chrome");
		browserConfig();
		runTest();

	}
	
	
	//this method set the webbrowser

	public static void setBrowser(String browser) {
		webbrowser = browser;

	}

	
	//This method used for browser configuration
	
	public static void browserConfig() {
		if (webbrowser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"/media/sachin/New Volume1/SeleniumTest/SeleniumProgram/Selenium jar and driver/drivers/chromedriver/chromedriver");
			driver = new ChromeDriver();
		} else if (webbrowser.equals("firefox")) {
			
			// this is relative path getproperty() return the path of the project and we are
			// using that path

			String location = System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver",
					location + "/Selenium jar and driver/drivers/firefoxdriver/geckodriver");
			 driver = new FirefoxDriver();
		}
		
		else {
			System.out.println("Something went wrong!!");
		}

	}
	
	//This method fire the query

	public static void runTest() {
		driver.get("https://www.selenium.dev/");
	}

}
