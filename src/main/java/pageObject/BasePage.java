package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {

	WebDriver driver; 
	
	public BasePage(WebDriver driver1) {
		this.driver=driver1;
	}
	
	public void clickElement(By locator) {
		driver.findElement(locator).click();
	}
	
	public void typeText(By locator,String text) {
	driver.findElement(locator).sendKeys(text);
		
	}
	
	public String getText(By locator) {
	return	driver.findElement(locator).getText();
		
	}
	
	
}
