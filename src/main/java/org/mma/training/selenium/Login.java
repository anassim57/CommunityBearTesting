package org.mma.training.selenium;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Login {

	WebDriver driver;
	
	@Test
	public void f() {

		// WebDriverManager will automatically determine the Chrome browser 
		// version and get the appropriate Chrome Driver
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://community.smartbear.com/");

		// Thread.sleep(6000);
		driver.findElement(By.xpath("//a[@id='log-in']")).click();		
		driver.findElement(By.xpath("//input[@id='profilecustom_email']")).sendKeys("anassim57_us@yahoo.com");

		driver.findElement(By.xpath("//input[@id='lia-password']")).sendKeys("Khanassim2004");
		driver.findElement(By.xpath("//input[@id='submitContext']")).click();

	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am in beforeMethod in Login Class...");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am in aftermethod in Login class ...");
	//	driver.close();
	}
	
}
