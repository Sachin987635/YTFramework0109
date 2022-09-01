package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Videoplaypage {
	WebDriver driver;
	Properties pr;
	public Videoplaypage(WebDriver driver,Properties pr) {
		this.driver=driver;
		this.pr=pr;
	}
	//TC4
	public void Like() throws InterruptedException {
		Thread.sleep(3000);
		//Click On Click on a Video
		driver.findElement(By.id("video-title-link")).click();
		//Click On Like Button
		driver.findElement(By.xpath("//*[@id='top-level-buttons-computed']/ytd-toggle-button-renderer[1]/a[1]")).click();
	}
	//TC5
	public void Subscribe() throws InterruptedException {
		//Click On Click on a Video
		driver.findElement(By.id("video-title-link")).click();
		//Click On Subscribe
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='subscribe-button']/ytd-button-renderer/a")).click();
	}
	//TC6
	public void comment() throws InterruptedException {
		//Click On Click on a Video
		driver.findElement(By.id("video-title-link")).click();

		driver.findElement(By.xpath("//*[@id='primary']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//*[@id='primary']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//*[@id='primary']")).sendKeys(Keys.ARROW_DOWN);
		//*[@id='primary']
		//Comment
		Thread.sleep(5000);
		WebElement comment=driver.findElement(By.xpath("//*[@id='input-container']/div[2]"));
		comment.click();
		comment.sendKeys("Nice Video");
		System.out.println("Break");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Comment")).click();
	}
	//TC7
	public void Explore() {
		//Click On Explore Button
		driver.findElement(By.xpath("//a[@title='Watch later']")).click();

	}
}
