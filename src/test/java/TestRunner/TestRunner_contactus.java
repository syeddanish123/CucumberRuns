package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		       features= {"src/test/resources/Feature/ContactUs.feature"},
		       monochrome=true,
		       dryRun=false,
		       plugin={"pretty","html:CucumberReports_output/contactusReport.html",
		    		   "pretty","json:CucumberReports_output/contactusReport.json"},
		       glue= {"stepDefinitions","Hooks"}
		)
public class TestRunner_contactus extends AbstractTestNGCucumberTests {

	
	
}
