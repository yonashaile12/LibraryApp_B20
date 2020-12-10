package com.cybertek.library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature",
        glue = "com/cybertek/library/step_definitions",
        tags = "@wip",
        dryRun = false,
        publish = true
)
public class cukesRunner {
}
