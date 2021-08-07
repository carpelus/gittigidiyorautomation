package com.ozanunlu.pages;

import org.openqa.selenium.WebDriver;

import com.ozanunlu.utils.PropertyReader;

public class GittiGidiyorHome {
	
	private final WebDriver driver;

	public GittiGidiyorHome(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isHome() {
		return driver.getTitle().contains("GittiGidiyor");
	}
	
	public void go() {
		driver.get(PropertyReader.get("urlHome"));
	}
}
