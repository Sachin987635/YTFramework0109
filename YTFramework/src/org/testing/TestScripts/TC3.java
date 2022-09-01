package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC3 extends Base{
	@Test
	public void loginandclickonsubscriptions() throws InterruptedException {
		Login login=new Login(driver,pr); 
		login.signin("testinguser9876355@gmail.com", "Sachin123@");		Thread.sleep(3000);//Click On Click on a Video
		//Click On Click on a Subscriptions
		driver.findElement(By.linkText("Subscriptions")).click();
		//driver.findElement(By.xpath("//*[@id='top-level-buttons-computed']/ytd-toggle-button-renderer[1]/a[1]")).click();
		System.out.println("Done");
	}
}
