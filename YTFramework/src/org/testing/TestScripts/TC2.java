package org.testing.TestScripts;

import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC2 extends Base{
	@Test
	public void loginandclickonHistory() throws InterruptedException {
		Login login=new Login(driver,pr); 
		login.signin("testinguser9876355@gmail.com", "Sachin123@");		Thread.sleep(3000);
		//Click On History
		driver.findElement(By.cssSelector("a[title='History']")).click();
	}
}
