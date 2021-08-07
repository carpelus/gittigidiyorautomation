package com.ozanunlu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ozanunlu.utils.PropertyReader;

public class GittiGidiyorSearch {

	private final WebDriver driver;
	private final By searchtxt = By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[1]/div[2]/input");
	private final By searchbtn = By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[2]/button");

	private final By page2 = By.xpath("//*[@id=\"best-match-right\"]/div[5]/ul/li[2]/a");

	public GittiGidiyorSearch(WebDriver driver) {
		this.driver = driver;
	}

	public GittiGidiyorSearch go() {
		driver.get(PropertyReader.get("urlHome"));
		return this;
	}

	public GittiGidiyorSearch search(String data) {
		driver.findElement(searchtxt).sendKeys("bilgisayar");
		return this;
	}

	public GittiGidiyorSearch clicksearch() {
		driver.findElement(searchbtn).click();
		return this;
	}

	public GittiGidiyorSearch clickpage() {
		driver.findElement(page2).click();
		return this;
	}

}
