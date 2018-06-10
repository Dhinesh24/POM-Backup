package teststeps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CLByCucumber {
	public static RemoteWebDriver driver;
	@Given("Invoke LeafTap ApplicationCL")
	public void invokeapp() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps");	
	}
	@And("Enter the UsernameCL as (.*)")
	public void enterUserName(String userName) {
		driver.findElementById("username").sendKeys(userName);
	}
	@And("Enter the PasswordCL as (.*)")
	public void enterPassword(String passWord) {
		driver.findElementById("password").sendKeys(passWord);
	}
	@And("Click on Login ButtonCL")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@And("Click on CRMSFA linkCL")
	public void clickonCRMSFA(){
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@And("Click on Leads link")
	public void clickonLeads(){
		driver.findElementByLinkText("Leads").click();
	}
	@And("Click on CreateLead linkCL")
	public void clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
	}
	@And("Enter the Company NameCL as (.*)")
	public void EnterCName(String companyName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(companyName);
	}
	@And("Enter the First NameCL as (.*)")
	public void EnterFName(String firstName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(firstName);
	}
	@And("Enter the Last NameCL as (.*)")
	public void EnterLName(String lastName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lastName);
	}
	@And("Click on Create Lead ButtonCL")
	public void clickCreateLeadButton() {
		driver.findElementByClassName("smallSubmit").click();
	}
	@Then("Verify the Page NameCL")
	public void loginverify() {
		String title = driver.getTitle();
		System.out.println(title);
	}
}
