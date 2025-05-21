package TestRunner;


import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//I used CucumberOption package of Cucumber Testng Integration because from pom.xml junit not able to run out TestRunner
//Hence Cucumber+TestNG run the TestRunner for cucumber execution.

@RunWith(Cucumber.class)
@CucumberOptions(
		         features={"src/test/resources/Feature/Login.feature"},
		         dryRun=true,
		         monochrome=true ,
		         glue={"stepDefinitions"} ,
		         plugin= {"pretty","html:CucumberReports_output/Reports.html"}		         
		         )
public class TestRunner extends AbstractTestNGCucumberTests  {


}
