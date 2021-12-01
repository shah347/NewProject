package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",
glue={"StepDefinations"},
monochrome = true,
plugin = {"pretty", "html:target/HtmlReports/index.html",
		"json:target/JasonReports/report.json",
		"junit:target/JunitReports/report.xml"},
tags = "@SmokeTest")
public class TestRunner {

}
