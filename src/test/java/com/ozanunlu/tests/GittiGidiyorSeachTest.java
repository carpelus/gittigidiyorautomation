package com.ozanunlu.tests;

import org.apache.logging.log4j.LogManager;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.ozanunlu.drivermanger.DriverInstance;
import com.ozanunlu.steps.GittiGidiyorSearchSteps;
import com.ozanunlu.utils.TestMethodLogging;

@FixMethodOrder(MethodSorters.JVM)
public class GittiGidiyorSeachTest {

	GittiGidiyorSearchSteps gittiGidiyorSearchSteps = new GittiGidiyorSearchSteps(DriverInstance.getInstance());
	@Rule
	public TestMethodLogging logRule = new TestMethodLogging(LogManager.getLogger(getClass()));

	@Test
	public void seach() {
		gittiGidiyorSearchSteps.search();
	}

}
