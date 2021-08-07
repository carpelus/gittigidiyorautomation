package com.ozanunlu.steps;

import org.openqa.selenium.WebDriver;

import com.ozanunlu.pages.GittiGidiyorSearch;

public class GittiGidiyorSearchSteps {

	private final GittiGidiyorSearch gittiGidiyorSearch;

	public GittiGidiyorSearchSteps(WebDriver driver) {
		gittiGidiyorSearch = new GittiGidiyorSearch(driver);
	}
	
	public void search() {
		gittiGidiyorSearch.go().search("bilgisayar").clicksearch().clickpage();
	}
	
	
}
