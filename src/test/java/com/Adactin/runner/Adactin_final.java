package com.Adactin.runner;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Adactin.Baseclass_Adactin;
import com.Adactin.Helper.File_Readermanager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\Adactin\\feature\\adactin.feature",
                          glue = "com.Adactin.stepdefinition",
                          plugin = {"pretty"})

public class Adactin_final {
	
	public static WebDriver driver ;
	
	@BeforeClass
	 public static void setUp() throws IOException {
		
     // System.setProperty("webdriver.chrome.driver",
		//			"C:\\Users\\Administrator\\eclipse-workspace\\Adactin\\driver\\chromedriver.exe");
		  //  driver = new ChromeDriver();
		
		String browser = File_Readermanager.getnInstance().getInstanceCR().getBrowser();
		
		driver = Baseclass_Adactin.getDriver(browser);
		
	 }
}