package demo.web.test.fr.chrome;

import demo.web.test.fr.*;

import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import demo.web.test.fr.component.AppTestManager;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.BeforeTest;

@CucumberOptions(
		features = "src/test/resources",
		 glue= {"demo.web.test.fr.chrome"},
		 plugin = {"json:target/cucumber-report/json/chrome/demo-webapp-functional-test-report.json","html:target/cucumber-report/html/demo-webapp-functional-test-reports/chrome"}
		,tags={}
		)
public class TestRunnerChrome extends AbstractTestNGCucumberTests{

	
}

//A AND B = "@SPRINT100","@SMOKE"
//A OR B = "@SPRINT100,@SMOKE"


/*To run scenarios with @SPRINT100 and @SMOKE:
mvn test -Dcucumber.options="--tags @SPRINT100 --tags @SMOKE"

To run scenarios with @SPRINT100 or @SMOKE:
mvn test -Dcucumber.options="--tags @SPRINT100,@SMOKE"*/

