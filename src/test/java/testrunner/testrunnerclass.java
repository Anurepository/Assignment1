package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = "src/test/java/features",
		glue = {"stepdefinition","hooks"},
		//tags={"@Regression","@Sanity"}  //and operator
		tags={"@sanity"},  //or operator
		monochrome = true,  //show the formatted output in console
		dryRun = false,
		plugin = {"pretty" ,"html:target/htmlreport"}
		//,"json:target/report.json","junit:target/cucumber/cucumber.xml"}
			
		)
public class testrunnerclass {

}
