package Com.guru99.testCases;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	// this is the base class we will write all the common required things here like setup method and tear down method. 
// We can include common variable, page url, login id and passwords exit and close method here
	// these below will common in every test case 
	
	public String baseURL= "https://demo.guru99.com/v4/";
	public String username= "mngr476259";
	public String password= "pydYjEs";
	public static WebDriver driver;

	
	@BeforeClass
	//this id the setup method to set the driver you want to use in youe automation we can change the driver as per our requirements 
	
		 public static void setup()
		{
		System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+"//DemoGuru99V1//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@AfterClass
	
          public static void tearDown()
        
	{
		driver.quit();
	}
}
