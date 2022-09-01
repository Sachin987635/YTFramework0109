package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	WebDriver driver;
	Properties pr;
	public Homepage(WebDriver driver,Properties pr) {
		this.driver=driver;
		this.pr=pr;
	}
	public void Explore() throws InterruptedException {
		//Click On Explore Button
		driver.findElement(By.xpath("//a[@title='Explore']")).click();
		Thread.sleep(3000);
		//Click On Trending
		driver.findElement(By.xpath("//*[@id='destination-label-wrapper']")).click();	
	}
}
