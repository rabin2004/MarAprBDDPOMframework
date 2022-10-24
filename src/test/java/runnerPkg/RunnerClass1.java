package runnerPkg;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(	features = "C:\\Users\\User\\eclipse-workspace\\MarAprBDDPOM\\src\\test\\java\\featurePkg",
					glue = "stepDefination",
					monochrome = true,
					plugin = {"pretty", "html:target/Cucumber_Report.html"},
					tags = "@Release1.0 or @Release2.0"
		)

// Assignment 1: previously TDDPOM framework | turn TDDPOM into BDDPOM framework
// Assignment 2: brand new BDDPOM framework -> different application

public class RunnerClass1 {

}
