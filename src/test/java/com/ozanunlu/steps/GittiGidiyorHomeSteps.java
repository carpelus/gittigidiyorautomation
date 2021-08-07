package com.ozanunlu.steps;

import org.openqa.selenium.WebDriver;

import com.ozanunlu.pages.GittiGidiyorHome;

public class GittiGidiyorHomeSteps {
	private final GittiGidiyorHome gidiyorHome;

	public GittiGidiyorHomeSteps(WebDriver driver) {
		gidiyorHome = new GittiGidiyorHome(driver);
	}

	public boolean isHome() {
		gidiyorHome.go();
		return gidiyorHome.isHome();
	}

}
