package Egg_StepDefinition;



import Egg_PageAction.Egg_SigninPageAction;
import Egg_Utility.Egg_Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Egg_Signin extends Egg_Base{
	
	
	Egg_SigninPageAction egg_SigninPageAction = new Egg_SigninPageAction();
	
	
	@Given("^open <\"([^\"]*)\"> eg$")
	public void open_eg(String URL) throws Throwable {
		
		EgLaunchURL(URL); 
	}
	@Then("^enter username and password click log in eg$")
	public void enter_username_and_password_click_log_in_eg() throws Throwable {
	   
egg_SigninPageAction.enterusernameandpasswordclicksignineg(EgPro.getProperty("EgUserName"), EgPro.getProperty("EgPassword"));
	}
	
	
	
	@Then("^Verify user can not signin successfully$")
	public void verify_user_can_not_signin_successfully() throws Throwable {
		egg_SigninPageAction.Verifyusercannotsigninsuccessfully();   
		
	}


	
	
	
}
