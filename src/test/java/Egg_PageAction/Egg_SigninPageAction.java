package Egg_PageAction;

import org.testng.Assert;

import Egg_PageLocator.Egg_SigninPageLocator;
import Egg_Utility.Egg_Base;

public class Egg_SigninPageAction extends Egg_Base {
	Egg_SigninPageLocator egg_SigninPageLocator = new Egg_SigninPageLocator();
	
	public void enterusernameandpasswordclicksignineg(String u,String p) throws Exception {
		
		egg_SigninPageLocator.eUser.sendKeys(u);
		Thread.sleep(2000);
		
		egg_SigninPageLocator.ePass.sendKeys(p);
		Thread.sleep(2000);
		egg_SigninPageLocator.clSignin.click();
		
	}	
		
	public void Verifyusercannotsigninsuccessfully() throws Exception {	
		Thread.sleep(4000);
	    boolean verify  = egg_SigninPageLocator.errorM.isDisplayed();
	    Assert.assertTrue(verify);
	
	}
	
	
}
