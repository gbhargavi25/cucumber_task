package runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Satyadurga\\eclipse-workspace\\bdd_demo\\src\\test\\resource\\feature\\practice_hooks.feature",		
		//path of feature file
		glue={"step_definition","hooks"},//package name where we have written step definition file
		monochrome=true//display the console output in a proper readable format
		//plugin= {"pretty","html:target/HTMLReports.html", 
						//  "json:target/JsonReport/report.json"}
		//tags="@invalidCredentialsTest"
		//pretty-it will generate readable output in the console
		//we can create html reports or json reports
		//plugin is used to generate different types of reporting
		//dryRun = true
		//it is the mapping between feature file and step definition file i.e 
		//every step in the feature file is implementing in the step definition file or not
		//strict=true//it will check if any step is not defined in step def file
		)
		//CucumberOptions contains meta data 
public class Runner {

}
