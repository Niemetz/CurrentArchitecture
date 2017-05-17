package auto.pages;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject 
{
	@FindBy(id="signInSubmit")
	WebElementFacade signInButton;
	
	@FindBy(id="ap_email")
	WebElementFacade userIdField;
	
	@FindBy(id="ap_password")
	WebElementFacade passwordField;
	
	public final static Map<String, WebElementFacade> allElementsOnLoginPage = new HashMap<>();
	
	public WebElementFacade getElement(String gherkinElement)
	{
		allElementsOnLoginPage.put("Sign in".toLowerCase(), signInButton);
		allElementsOnLoginPage.put("Email".toLowerCase(), userIdField);
		allElementsOnLoginPage.put("Password".toLowerCase(), passwordField);
		allElementsOnLoginPage.put("Page Unique Element".toLowerCase(), signInButton);
		return $(allElementsOnLoginPage.get(gherkinElement.toLowerCase()));
	}
}