package Egg_TestRunner;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Egg_Utility.Egg_Base;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Egg_Features"},
plugin = {"json:target/cucumber.json"},
glue = "Egg_StepDefinition")//tags = {""})	
		
public class Egg_TestRunner extends AbstractTestNGCucumberTests{

	@BeforeTest
	public void egStartURL() {
	Egg_Base eg	= new Egg_Base();
	eg.EgBrowser();
		
		
		
	}
	@AfterTest
	public void egCloseURL() throws Exception {
	Egg_Base eg	= new Egg_Base();
	eg.driver.quit();	
		
	}
	
	
	
}
