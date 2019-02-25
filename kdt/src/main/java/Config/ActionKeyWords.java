package Config;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionKeyWords {
	
	public static WebDriver driver;
	
	public static void open_browser() {
		
		driver = new ChromeDriver();
		
	}

	public static void navigate() {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
	}

	public static void enter_uname() {
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("demo123");
		
	}

	public static void enter_pwd() {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demo123");
	}

	public static void click() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	public static void getpage_tittle() {
		
		String str = driver.getTitle();
		System.out.println(str);
	}


	public static void quit() {
		
		driver.quit();
	}
	
	
}
