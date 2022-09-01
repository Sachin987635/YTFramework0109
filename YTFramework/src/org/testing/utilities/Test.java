package org.testing.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Test {
	WebDriver driver;
	public void selectvalue(WebElement drop,int index) {
		Select branch=new Select(driver.findElement(By.id("BranchID")));
		branch.selectByIndex(1);
	}
}
