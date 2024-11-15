package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"C:\\Users\\Lenovo\\Documents\\workspace-spring-tool-suite-4-4.25.0.RELEASE\\Facebook_demo\\Files\\login.feature"},
		glue= {"steps"}
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
