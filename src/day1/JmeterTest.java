package day1;

import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JmeterTest {
	public static WebDriver driver;
	int a=10;
	int b=120;
	int c=101;
	
	public JmeterTest() {
		
	}


	@Test
	public void test() {
		//System.setProperty("webdriver.chrome.driver", "E:\\LTI\\Training\\SelJars\\Drivers\\New folder\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Title of the page:"+driver.getTitle());
		driver.close();
		
	}

}
