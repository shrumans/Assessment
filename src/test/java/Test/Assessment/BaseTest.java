package Test.Assessment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pageObject.Homepage;

public abstract class BaseTest {

	WebDriver driver;
	Homepage homepage;

	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		homepage=new Homepage(driver);
	
	}
	
	
	@AfterTest(enabled=true)
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
}
