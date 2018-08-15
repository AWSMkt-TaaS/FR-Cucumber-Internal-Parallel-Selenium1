package demo.web.test.fr.ie;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.BeforeTest;


@CucumberOptions(
		features = "src/test/resources",
		 glue= {"demo.web.test.fr.ie"},
		 plugin = {"json:target/cucumber-report/json/ie/demo-webapp-functional-test-report.json","html:target/cucumber-report/html/ie/demo-webapp-functional-test-reports"}
		,tags={}
		)
public class TestRunnerIE extends AbstractTestNGCucumberTests{

}

//A AND B = "@SPRINT100","@SMOKE"
//A OR B = "@SPRINT100,@SMOKE"

/*To run scenarios with @SPRINT100 and @SMOKE:
mvn test -Dcucumber.options="--tags @SPRINT100 --tags @SMOKE"

To run scenarios with @SPRINT100 or @SMOKE:
mvn test -Dcucumber.options="--tags @SPRINT100,@SMOKE"*/