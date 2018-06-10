package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@CucumberOptions(features="./src/test/java/features/CreateLead.Feature",glue= {"hooks","pages"}, monochrome=true)
@RunWith(Cucumber.class)



public class RunTestforCreateLead {

}
  