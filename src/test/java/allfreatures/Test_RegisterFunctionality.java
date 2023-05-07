package allfreatures;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;   // we have to write this library manaually. 

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		//dryRun=true
		
		  features = {"src/test/resources/all_feature_files"},
		  glue= {"allfreatures"},
		  
		  plugin = {"pretty",
				  "html:target/cucumber-htmlreport.html",
				  "json:target/cucumber-report.json",
		  }
		)
public class Test_RegisterFunctionality 
{
	
}