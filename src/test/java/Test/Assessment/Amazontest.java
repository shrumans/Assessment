package Test.Assessment;

import org.testng.annotations.Test;
import testUtils.Hardwait;

public class Amazontest extends BaseTest {

	@Test
	public void AddProductToCart() {
		
		homepage.searchProduct("Apple iphone 12");
		Hardwait.wait(3);
		homepage.addToCart();
		Hardwait.wait(5);
		homepage.clickOnCart();
		Hardwait.wait(5);
		homepage.clickOnProceedToBuy();
		Hardwait.wait(3);
		driver.navigate().back();
		Hardwait.wait(3);
		
		homepage.searchProduct("earpods");
		Hardwait.wait(3);
		homepage.addToCart();
		Hardwait.wait(5);
		homepage.clickOnCart();
		Hardwait.wait(5);
		homepage.validateCheckoutPage("Subtotal(2 items)");
		Hardwait.wait(5);
	}
	
	
	
}
