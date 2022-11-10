package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooksclass {
	
	public static ChromeDriver driver;
	
	@Before
	
	public void init()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\08408C744\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver= new ChromeDriver();
		 System.out.println("Driver initialised");
	
	}

	@After
	 
	public void quit()
	 {
		driver.quit();
		System.out.println("Driver closed");
	 }
}