package com.github.m0levich.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = "json:target/cucumber-report.json",
        features = "src/test/resources/feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = "com.github.m0levich.cucumber.stepdefinitions",
        tags = "@all and @lesson25")
public class BankSpbRunnerTest extends AbstractTestNGCucumberTests {
}
