package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCName;
	@And("Enter the Company NameCL (.*)")
	public CreateLeadPage enterCompanyName(String data) {
		type(eleCName, data);
		return this;
	}

	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFName;
	@And("Enter the First NameCL (.*)")
	public CreateLeadPage enterFirstName(String data) {
		type(eleFName, data);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLName;
	@And("Enter the Last NameCL (.*)")
	public CreateLeadPage enterLastName(String data) {
		type(eleLName, data);
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleSubmit;
	@And("Click on Create Lead Button")
	public ViewLeadInfo clickCreateLead()
	{
		click(eleSubmit);
		return new ViewLeadInfo();
	}
		
	

}
