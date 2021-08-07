package com.ozanunlu.pages;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.ozanunlu.utils.PropertyReader;

public class GittiGidiyorLogin {

	private final WebDriver driver;
	private final By txtUserName = By.id("L-UserNameField");
	private final By txtPassword = By.id("L-PasswordField");
	private final By loginbtn = By.id("gg-login-enter");

	public GittiGidiyorLogin(WebDriver driver) {
		this.driver = driver;
	}

	public GittiGidiyorLogin enterUserName(String userName) {
		driver.findElement(txtUserName).clear();
		driver.findElement(txtUserName).click();
		driver.findElement(txtUserName).sendKeys("");
		StringSelection stringSelection = new StringSelection(userName);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		driver.findElement(txtUserName).sendKeys(Keys.CONTROL, "V");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}

	public GittiGidiyorLogin enterPassword(String password) {
		driver.findElement(txtPassword).clear();
		driver.findElement(txtPassword).click();
		driver.findElement(txtPassword).sendKeys("");
		StringSelection stringSelection = new StringSelection(password);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		driver.findElement(txtPassword).sendKeys(Keys.CONTROL, "V");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}

	public void login() {
		driver.findElement(loginbtn).click();
	}

	public GittiGidiyorLogin go() {
		driver.get(PropertyReader.get("urlLogin"));

		return this;
	}
}
