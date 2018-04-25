package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by wayenew on 4/23/17.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/wayenew/Desktop/Repo/CucumberBasics/src/test/java/Features",
                    glue = "Steps",
                  plugin = {"html:target/cucumber-html-report",
                            "json:target/cucumber-report.json",
                            "pretty:target/cucumber-pretty.txt",
                            "usage:target/cucumber-usage.json",
                            "junit:target/cucumber-results.xml"}
                    )
public class TestRunner {
}