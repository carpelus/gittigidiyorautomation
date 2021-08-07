package com.ozanunlu.tests;

import org.apache.logging.log4j.LogManager;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

import com.ozanunlu.drivermanger.DriverInstance;
import com.ozanunlu.steps.GittiGidiyorHomeSteps;
import com.ozanunlu.utils.TestMethodLogging;

public class GittiGidiyorHomeTest {

	GittiGidiyorHomeSteps gittiGidiyorHomeSteps = new GittiGidiyorHomeSteps(DriverInstance.getInstance());
	@Rule
	public TestMethodLogging logRule = new TestMethodLogging(LogManager.getLogger(getClass()));

	@Test
	public void homePage() {
		Assert.assertTrue("Home", gittiGidiyorHomeSteps.isHome());
	}

}
