package com.atmecs.homepage.testbase;

import java.io.IOException;


import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.atmecs.homepage.constants.ConstantPaths;
import com.atmecs.homepage.reports.LogReports;
import com.atmecs.homepage.utils.ReadPropertiesFile;
import com.atmecs.homepage.utils.ValidateTestResult;

public class InvokeBrowser {
	public LogReports log = new LogReports();
	public static WebDriver driver;
	Properties config = new Properties();
	protected ReadPropertiesFile read = new ReadPropertiesFile();
	protected String Xpath;
	protected String Cssselector;

	protected ValidateTestResult validate = new ValidateTestResult();

//To invoke the chrome browser by  URL
	@Test(priority = 1)
	public void setup() throws IOException {

		System.setProperty("webdriver.chrome.driver", ConstantPaths.CHROME_FILE);

		
		driver = new ChromeDriver();
		log.info("Browser invoked...");
		driver.get(read.readPropertiesFile("url"));
		log.info("Application opened...");
		driver.manage().window().maximize();
	}
}