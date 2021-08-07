package com.ozanunlu.drivermanger;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	public WebDriver getDriver(String browser) {
		WebDriver driver;
		System.setProperty("log4j.configurationFile", "log4j2.xml");
		if ("firefox".equals(browser.toLowerCase())) {
			driver = getFirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
			return driver;
		}
		driver = getChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		return driver;
	}

	WebDriver getChromeDriver() {
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver();
	}

	WebDriver getFirefoxDriver() {
		WebDriverManager.firefoxdriver().setup();
		return new FirefoxDriver();
	}
}
