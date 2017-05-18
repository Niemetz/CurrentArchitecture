package auto.pages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.amazon.com") 

public class HomePage extends PageObject 
{
	@FindBy(id="a-autoid-0-announce")
	WebElementFacade signInSecurelyButton;
	
	@FindBy(id = ".//*[@id='nav-link-accountList']/span[2]")
	WebElementFacade accountListLink;
	
	public final static Map<String, WebElementFacade> allElementsOnHomePage = new HashMap<>();
		public WebElementFacade getElement(String gherkinElement)
		{
			allElementsOnHomePage.put("Sign in securely".toLowerCase(),signInSecurelyButton);
			allElementsOnHomePage.put("Account & Lists".toLowerCase(),accountListLink);
			allElementsOnHomePage.put("Page Unique Element".toLowerCase(), signInSecurelyButton);
			return allElementsOnHomePage.get(gherkinElement.toLowerCase());
		}
}