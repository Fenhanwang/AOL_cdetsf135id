package com.fenhan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.TestCase;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.SeleniumException;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;


public class TestWebappSelenium extends TestCase {
	Selenium selenium;
	
	public void testSequence() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://localhost:8080/tys2345/";		
		Selenium selenium = new WebDriverBackedSelenium(driver, baseUrl);
		selenium.open("http://localhost:8080/tys2345/");
		System.out.println(selenium.getTitle());
		assertEquals(selenium.getTitle(), "JSP Example");
		WebElement elem = driver.findElement(By.xpath("/html/body/form/center/table/tbody/tr[4]/td/a"));
		elem.click();
		assertEquals(selenium.getTitle(), "Registration");
		WebElement fname = driver.findElement(By.name("fname"));
		WebElement lname = driver.findElement(By.name("lname"));
		WebElement email = driver.findElement(By.name("email"));
		WebElement pass = driver.findElement(By.name("pass"));
		WebElement conpass = driver.findElement(By.name("conpass"));
		fname.sendKeys("Fenhan2");
		lname.sendKeys("Wang2");
		email.sendKeys("www3@gmail.com");
		pass.sendKeys("1234567890");
		conpass.sendKeys("1234567890");
		WebElement submit =driver.findElement(By.xpath("/html/body/form/center/table/tbody/tr[6]/td[1]/input"));
		submit.click();
//		assertEquals(selenium.getTitle(), "Registration");
		driver.close();
	  }

	public void stopSelenium() {
	    selenium.stop();
	    
	  }
	
//	TestUsingSelenium testme = new TestUsingSelenium();
//	this.testSequence();
	
}
