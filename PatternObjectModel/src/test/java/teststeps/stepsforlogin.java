package teststeps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepsforlogin {
	public static RemoteWebDriver driver;
	@Given("Invoke LeafTap Application log")
	public void invokeapp() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps");	
	}
	@And("Enter the UserName log")
	public void enterUserName() {
		driver.findElementById("username").sendKeys("DemoSalesManager");
	}
	@And("Enter the Password log")
	public void enterPassword() {
		driver.findElementById("password").sendKeys("crmsfa");
	}
	@And("Click on Login Button log")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@Then("Verify the Login is Success log")
	public void loginverify() {
		String title = driver.getTitle();
		System.out.println(title);
	}
}
