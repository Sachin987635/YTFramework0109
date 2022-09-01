package org.testing.TestScripts;

import org.testing.Base.Base;
import org.testing.Pages.Homepage;
import org.testing.Pages.Login;
import org.testng.annotations.Test;

public class Testclass extends Base{
	
	@Test
	public void testcase1() throws InterruptedException {
		Login login=new Login(driver,pr); 
		login.signin("testinguser9876355@gmail.com", "Sachin123@");
		Homepage homepageclicks=new Homepage(driver, pr);
		homepageclicks.Explore();
	}
}
