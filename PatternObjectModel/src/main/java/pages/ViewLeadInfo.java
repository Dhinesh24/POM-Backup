package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class ViewLeadInfo extends ProjectMethods{
	
	public ViewLeadInfo() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleTxt;
	@Then("Verify the Page Name")
	public ViewLeadInfo verifyFirstName(String data)
	{
	verifyExactText(eleTxt, data);
	return this;		
	}
	
	
	
	
	

}
