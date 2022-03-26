package com.cydeoLibrary.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/features",
        glue = "com/cydeoLibrary/stepdefinitions",
        dryRun = false,
        tags = "@library1"

)

public class CukesRunner {
}
