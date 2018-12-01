package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import action.BaseClass;

public class LoginPageLocator extends BaseClass {
	public LoginPageLocator(){
		PageFactory.initElements(getDriver(), this);
	}	
	
	

	@FindBy(xpath = "//header/a[text()='Login']")
	public WebElement loginBoutton;
}
