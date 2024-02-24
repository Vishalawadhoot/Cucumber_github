package RunnerClass;
//Author= Vishal Awadhoot
//Date= 24-02-2024
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"./src/test/java/Features/Login.feature"},
				 glue= {"StepDefinitions"},
				 monochrome=false,
				 plugin= {"pretty", "html:Reports/HtmlReports/htmlreport.html",
						 			"json:Reports/JsonReports/jsonreport.json",
						 			"json:Reports/CucumberReports/cucumberreport.json"
				 },
				 tags=("@Smoke")
		)
public class LoginRunnerTest extends AbstractTestNGCucumberTests{

}
