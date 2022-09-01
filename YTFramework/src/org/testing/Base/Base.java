package org.testing.Base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class Base {
	public WebDriver driver;
	public Properties pr;
	@BeforeMethod
	public void init() throws IOException, InterruptedException {
		//For Properties Code Start
		File f=new File("../YTFramework/Objects.properties");
		FileReader fr=new FileReader(f);
		pr=new Properties();
		pr.load(fr);
		//Code End
		
		//Sachindemo40@gmail.com,Sachin123@,testinguser9876355@gmail.com
		System.setProperty("webdriver.edge.driver", "../YTFramework/msedgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(10000);
		}
	@AfterMethod
	public void closebrowser() {
		//Closing the Browser
		driver.close();
	}
}
