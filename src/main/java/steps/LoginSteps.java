package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import action.LoginPageAction;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	WebDriver driver;
	LoginPageAction lpa= new LoginPageAction();
	 
	@Given("^when user open borwser and enter url$")
	public void when_user_open_borwser_and_enter_url() throws Throwable {
		/*System.out.println(" I am in Given -for browser invocation ");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();*/
	}

	@When("^user Enter valid username and Enter valid Password$")
	public void user_Enter_valid_username_and_Enter_valid_Password() throws Throwable {
		System.out.println(" I am in When for enter username and password");
		
		WebElement username = driver.findElement(By.xpath("//*[@id='loginForm']//input[@name='username']"));
		username.sendKeys("psgavate");
		
		WebElement password = driver.findElement(By.xpath("//*[@id='loginForm']//input[@name='password']"));
		password.sendKeys("123456");
		
		
		
	}

	@And("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		System.out.println(" i am in When- for click login button");
		WebElement loginbutton = driver.findElement(By.xpath("//*[@id='loginForm']//input[@type='submit']"));
		loginbutton.click();
	}

	@Then("^user can see home page$")
	public void user_can_see_home_page() throws Throwable {
		System.out.println(" I am in Then- for login button click ");
		
		WebElement homemenu = driver.findElement(By.xpath("//*[contains(@title,'Home')]"));
		//homemenu.isDisplayed()
		
	}
	
	
	
	//======================================feature file Login_outloin.feature==============================

@Given("^User enters Username \"([^\"]*)\" and User enters Password \"([^\"]*)\"$")
public void user_enters_Username_and_User_enters_Password(String arg1, String arg2) throws Throwable {
	
    lpa.user_enters_Username_and_User_enters_Password(arg1, arg2);
}

@Given("^User clicks on Login button$")
public void user_clicks_on_Login_button() throws Throwable {
  
}

@Then("^User is successfully logged in$")
public void user_is_successfully_logged_in() throws Throwable {
  
}


}
