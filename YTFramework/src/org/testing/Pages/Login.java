package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	WebDriver driver;
	Properties pr;
	public Login(WebDriver driver,Properties pr) {
		this.driver=driver;
		this.pr=pr;
	}
	public void signin(String User,String Password) throws InterruptedException {
		Thread.sleep(3000);
		//Click On Signin Button
		driver.findElement(By.xpath(pr.getProperty("SigninBtn"))).click();
		Thread.sleep(3000);
		//Enter Email Address
		driver.findElement(By.xpath(pr.getProperty("EnterEmail"))).sendKeys(User);
		Thread.sleep(3000);
		//Click On Next Button
		driver.findElement(By.xpath(pr.getProperty("NextBtn"))).click();
		Thread.sleep(3000);
		//Enter Password
		driver.findElement(By.cssSelector(pr.getProperty("Password"))).sendKeys(Password);
		//After Enter Password Click On Next Button
		driver.findElement(By.xpath(pr.getProperty("PwdNext"))).click();
		Thread.sleep(3000);
	}
}
