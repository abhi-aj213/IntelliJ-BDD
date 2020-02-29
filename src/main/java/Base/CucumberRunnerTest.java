package Base;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import java.io.IOException;
import org.junit.AfterClass;
//import com.cucumber.listener.Reporter;
//import com.cucumber.listener.Reporter;


@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/resources/Features",
	glue= "StepsDefinitions",
	//tags = {"@Case1,@Case2"},
	tags = {"@Case1"},
	plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},	
	strict = true,
    monochrome = true
	)


public class CucumberRunnerTest {
	
	/*@AfterClass
	public static void runTest() throws IOException {
		SendEmail se=new SendEmail();
		se.triggerEmail();
		}*/
	
}


	
