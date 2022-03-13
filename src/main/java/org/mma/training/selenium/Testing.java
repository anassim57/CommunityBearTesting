package org.mma.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\MMATraining\\workspace\\OpenOrangeDemo\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://community.smartbear.com/");
		
//		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[@id='log-in']")).click();		
		driver.findElement(By.xpath("//input[@id='profilecustom_email']")).sendKeys("anassim57_us@yahoo.com");
		//input[@id='lia-password']
//		driver.findElement(By.xp.sendKeys("anassim57_us@yahoo.com");
		driver.findElement(By.xpath("//input[@id='lia-password']")).sendKeys("Khanassim2004");
		//driver.findElement(By.xpath("//input[@id='lia-password']")).sendKeys("Khanassim2004");
		driver.findElement(By.xpath("//input[@id='submitContext']")).click();
		


	}	
}