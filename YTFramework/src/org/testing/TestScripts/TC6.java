package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Videoplaypage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC6 extends Base{
	@Test
	public void mainprogram() throws InterruptedException {
		Login login=new Login(driver,pr); 
		login.signin("testinguser9876355@gmail.com", "Sachin123@");Thread.sleep(3000);
		Videoplaypage comment=new Videoplaypage(driver, pr);
		comment.comment();
	}
}
