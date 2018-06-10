package hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class HooksforCreateLead extends SeMethods {
@Before()
public void beforeScenario(Scenario BF) {
	startResult();
	startTestModule(BF.getName(), BF.getId());	
	test = startTestCase(BF.getName());
	test.assignCategory(category);
	test.assignAuthor(authors);
	startApp("chrome");
}
@After()
	public void afterScenario(Scenario AF) {
	endResult();
	closeAllBrowsers();
	}
}

