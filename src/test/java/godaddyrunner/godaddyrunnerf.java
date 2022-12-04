package godaddyrunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:/Users/SUVYADAV/Desktop/eclipsewrk/godaddy/godaddyfeatures/godaddy.feature",
		         
		glue= {"godaddystepdefinition"},
		plugin= {"pretty", "html:target/test-output"}
		,monochrome = true
		)
public class godaddyrunnerf {

}
