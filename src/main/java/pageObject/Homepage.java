package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage extends BasePage{

	public Homepage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}

	
	By searchbar= By.id("twotabsearchtextbox");
	By searchIcon= By.id("nav-search-submit-button");
	By Addtocart=By.id("a-autoid-1");
	By cart=By.id("nav-cart");
	By proceed=By.name("proceedToRetailCheckout");	
	By subtotal=By.xpath("//div[@data-name='Subtotals']");
	
	public void searchProduct(String prod) {
		clickElement(searchbar);
		typeText(searchbar, prod);
		clickElement(searchIcon);
	}
	
	public void addToCart() {
		
		clickElement(Addtocart);
	}
	
	public void clickOnCart() {
		clickElement(cart);
	}
	
	public void clickOnProceedToBuy() {
		clickElement(proceed);
	}
	
	public boolean validateCheckoutPage(String Expectedtext) {
		return getText(subtotal).contains(Expectedtext);
	}
	
}
