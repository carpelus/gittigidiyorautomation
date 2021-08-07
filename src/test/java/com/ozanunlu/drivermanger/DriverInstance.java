package com.ozanunlu.drivermanger;

import java.util.Objects;

import org.openqa.selenium.WebDriver;

import com.ozanunlu.utils.PropertyReader;

public class DriverInstance {
	public static WebDriver driver = new DriverManager()
			.getDriver(Objects.requireNonNull(PropertyReader.get("browser")));

	public static WebDriver getInstance() {
		return driver;
	}

}
