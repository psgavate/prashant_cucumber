package Runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
features= {"src/test/resources/features/Login_outline.feature"},
glue= {"steps"},
tags= {"@test1","@test2"},   //{"@tag1,@tag2"}-OR //{"@tag1","@tag2"}-and (requied both tag for same time)
plugin= {"pretty","html:output/Report"}
//plugin= {"com.cucmber.listner.ExtentCucumberFromatter:output/report.html"}
		)

public class RunTest {

}
