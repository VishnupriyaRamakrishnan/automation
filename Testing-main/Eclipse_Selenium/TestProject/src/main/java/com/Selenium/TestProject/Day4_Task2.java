package com.Selenium.TestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4_Task2 {

	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();

		//START EDGE INSTANCE

		WebDriver driver=new ChromeDriver();

		//URL

		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");

		//MAXIMIZING THE WINDOW SIZE

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("fahiemmohammed@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("fahiem");
		driver.findElement(By.xpath("//*[@id=\"form-login\"]/button")).click();

	}

}
