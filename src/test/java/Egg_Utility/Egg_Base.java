package Egg_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Egg_Base {

	public static WebDriver driver;
	public static Properties EgPro;
	
	public Egg_Base() {
		try {
			FileInputStream egFle = new FileInputStream(System.getProperty("user.dir")+("//src//test//java//Egg_Config//Egg_Config.Properties"));
			EgPro = new Properties();
			EgPro.load(egFle);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Please,look the code");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void EgBrowser() {
	
	String EgAllBrowser	= EgPro.getProperty("EgBrowser1");
	if(EgAllBrowser.equalsIgnoreCase("Chrome")) {
		System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+("//Egg_ChromeDriver//chromedriver.exe"));
		ChromeOptions ff = new ChromeOptions();
		ff.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Egg_Utiliti.pageLoadTimeout));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Egg_Utiliti.implicitlyWait));
		driver.manage().window().maximize();
		
	}
	else if(EgAllBrowser.equalsIgnoreCase("Edge")) {	
		
		System.setProperty("Webdriver.edge.driver",System.getProperty("user.dir")+("//Egg_EdgeDriver//msedgedriver.exe"));
		EdgeOptions ff1 = new EdgeOptions();
		ff1.addArguments("--remote-allow-origins=*");
		driver = new EdgeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Egg_Utiliti.pageLoadTimeout));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Egg_Utiliti.implicitlyWait));
		driver.manage().window().maximize();
		
		
	}
	}
	public static void EgLaunchURL(String URL) {
		
		driver.get(EgPro.getProperty("EgURL"));
		
		
	}
	
}
