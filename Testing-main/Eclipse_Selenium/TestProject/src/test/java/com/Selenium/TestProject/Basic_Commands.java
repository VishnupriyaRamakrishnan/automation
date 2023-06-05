package com.Selenium.TestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic_Commands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.facebook.com/");
		dr.findElement(By.id("email")).sendKeys("fahiemrox@gmail.com");
		dr.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(4000);
		dr.quit();
		
	}

}
