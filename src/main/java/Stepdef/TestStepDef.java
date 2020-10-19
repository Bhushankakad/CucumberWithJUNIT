package Stepdef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/com/zensar/CucumberBasics/feature",glue= {"src/main/java/Stepdefs"})
public class TestStepDef {

}
