package cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "json:target/CucumberRunner.json" }, features = {
		"src/main/java/cucumber/features" })
public class CucumberRunner {

}