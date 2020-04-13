import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import gherkin.formatter.model.Feature;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/feature/usingresourcefile.feature", dryRun = false, strict = true, plugin ={"pretty", "json:target/cucumber-reports/Cucumber.json",
        "junit:target/cucumber-reports/Cucumber.xml","html:target/cucumber-reports"})
    public class TestRun {
}
