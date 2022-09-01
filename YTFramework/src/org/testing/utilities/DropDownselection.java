package org.testing.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownselection{
	@Test
	public void login() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "../Seleniumproject/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://unitest.cloudpub.in/");
		driver.findElement(By.name("UserName")).sendKeys("admin");
		driver.findElement(By.name("Password")).sendKeys("passf@123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		Select company=new Select(driver.findElement(By.id("iCompanyID")));
		company.selectByIndex(1);
		Select branch=new Select(driver.findElement(By.id("BranchID")));
		branch.selectByIndex(1);
	}
}
