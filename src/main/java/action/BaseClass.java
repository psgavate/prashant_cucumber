package action;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static final String url = "https://www.google.com/";
	public static WebDriver driver = null;	
	
	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		BaseClass.driver = driver;
	}

	public void createLocalDriver() throws MalformedURLException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		setDriver(new ChromeDriver());
		getDriver().manage().window().maximize();
		getDriver().get(url);
	}

	public void closeDriver() {
		getDriver().quit();
	}

}
