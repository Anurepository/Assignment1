package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.hooksclass;
import junit.framework.Assert;

public class stepdefinationclass {
	
	ChromeDriver driver = hooksclass.driver;
	
	
	@Given("User navigates to elearning site")
	public void User_navigates_to_elearning_site() {
	   System.out.println("user is navigating to the elearning site");
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\08408C744\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   driver = new ChromeDriver();
	   ((WebDriver) driver).get("http://elearningm1.upskills.in/index.php");
	}
	
	@When("User clicks on Signup")
	public void User_clicks_on_Signup() {
		driver.findElement(By.xpath("//a[text()=' Sign up! ']")).click();
	   
	}

	@When("Enter the mandatory fields to create Signup")
	public void enter_the_mandatory_fields_to_create_Signup() {
	
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Anu");
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("V");
		driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("test123@test.com");
		driver.findElement(By.id("username")).sendKeys("test89");
		driver.findElement(By.id("pass1")).sendKeys("test@123");
		driver.findElement(By.id("pass2")).sendKeys("test@123");
		driver.findElement(By.xpath("//button[@name = 'submit']")).click();
				throw new cucumber.api.PendingException();
	}
	
	
	@Then("user gets Signed up")
	public void user_gets_signup() {
		System.out.println("Registration successful");
	    throw new cucumber.api.PendingException();
	    
	}
	
	

@Given("User navigates to elearning site1")
	
	public void User_navigates_to_elearning_site1() {
				System.out.println("user is navigating to the elearning site1");
			   System.setProperty("webdriver.chrome.driver", "C:\\Users\\08408C744\\Downloads\\chromedriver_win32\\chromedriver.exe");
			   driver = new ChromeDriver();
			   ((WebDriver) driver).get("http://elearningm1.upskills.in/index.php");	
	 
	}
		
	@When("user enters valid credentials")
	public void user_enters_valid_credentials() {
	   
		driver.findElement(By.xpath("//input[@name = 'login']")).sendKeys("test89");	
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("test@123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		System.out.println("user logged in successfully");

	}

	@Then("User send a message")
	public void User_send_a_message() throws InterruptedException {
		
		driver.findElement(By.xpath("//li[@class = 'new-message-social']/a")).click();
		driver.findElement(By.className("select2-search__field")).sendKeys("div");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Divya Suman']")).click();
		driver.findElement(By.xpath("//div[@class = 'col-sm-8']/input")).sendKeys("testmail");
		driver.findElement(By.xpath("//*[@name = 'compose' and @type = 'submit']")).click();
		String msg =driver.findElement(By.xpath("//div[@class = 'alert alert-success']")).getText();
		System.out.println("msg"+msg);
		Assert.assertEquals("The message has been sent to Divya Suman",msg);
			
	}
}

	

