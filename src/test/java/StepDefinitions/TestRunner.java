package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src\\test\\java\\Features",
    glue = {"StepDefinitions"},
    tags = "@test",
   
    plugin ={"pretty", "html:target/htmlReports/report.html"}
)
public class TestRunner {

}
