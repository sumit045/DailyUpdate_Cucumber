package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\91958\\eclipse-workspace\\com.cucumber\\src\\main\\resources\\feature\\Amazon.feature",
				glue="stepDefinition")
	
public class Runner {

}
