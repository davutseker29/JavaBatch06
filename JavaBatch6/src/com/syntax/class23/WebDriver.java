package com.syntax.class23;

public class WebDriver {

	
	public void open() {
		System.out.println("Opening browser");
	}
}

class FirefoxDriver extends WebDriver {
	@Override
	public void open() {
		System.out.println("Opening firefox browser");
	}
}

class ChromeDriver extends WebDriver {
	@Override
	public void open() {
		System.out.println("Opening chrome browser");
	}
}

class InternetExplorerDriver extends WebDriver {
	@Override
	public void open() {
		System.out.println("Opening ie browser");
	}
}