package com.ozanunlu.steps;

import org.openqa.selenium.WebDriver;

import com.ozanunlu.pages.GittiGidiyorLogin;
import com.ozanunlu.utils.PropertyReader;

public class GittiGidiyorLoginSteps {
	private final GittiGidiyorLogin gittiGidiyorLogin;

	public GittiGidiyorLoginSteps(WebDriver driver) {
		gittiGidiyorLogin = new GittiGidiyorLogin(driver);
	}

	public void login() {
		gittiGidiyorLogin.go().enterUserName(PropertyReader.get("userName")).enterPassword(PropertyReader.get("password")).login();
	}
	
}
