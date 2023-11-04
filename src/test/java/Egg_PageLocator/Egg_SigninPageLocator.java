package Egg_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Egg_Utility.Egg_Base;

public class Egg_SigninPageLocator extends Egg_Base {

	
	public Egg_SigninPageLocator() {
		
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(id ="onlineId1")
	public WebElement eUser;
	
	@FindBy(id ="passcode1")
	public WebElement ePass;
	
	@FindBy(xpath ="//span[text()='Log In']")
	public WebElement clSignin;
	
	@FindBy(xpath ="//b[text()='Having problems logging in or resetting your Password?']")
	public WebElement errorM;
	
	
	
}
