package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Videoplaypage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC4 extends Base{
	@Test
	public void loginandclickonsubscriptions() throws InterruptedException {
		Login login=new Login(driver,pr); 
		login.signin("testinguser9876355@gmail.com", "Sachin123@");	Thread.sleep(3000);
		Videoplaypage like=new Videoplaypage(driver, pr);
		like.Like();
	}
}
