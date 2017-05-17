package auto.steps.serenity;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import org.junit.Assert;
import auto.pages.HomePage;
import auto.pages.LoginPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class EndUserSteps extends ScenarioSteps {

	String pageName;
	String elementName;
	String sectionName;
	String currentPage;
	
	WebElementFacade targetElement;
	
	HomePage home = new HomePage();

	public EndUserSteps() {
		super() ;
		this.pageName = null;
		this.elementName = null;
		this.targetElement = null;
		this.currentPage = null;
		this.sectionName = null;
	}

	public WebElementFacade getElement(String gherkinPageName, String gherkinElement) 
	{
		this.pageName = gherkinPageName.toLowerCase();
		this.elementName = gherkinElement.toLowerCase();
	
			switch (pageName) 
			{
			  case "home": targetElement = getPages().get(HomePage.class).getElement(elementName);break;	         
			  case "login": targetElement =  getPages().get(LoginPage.class).getElement(elementName);break;
			}

		// return the desired page to the caller
		return targetElement;
	}
	@Step
	public void navigates_to_page(String gherkinPageName) throws Throwable {
		home.open();
	}


	public void clicks_on_elementX(String gherkinElement) throws Throwable {
		elementName = gherkinElement.toLowerCase();
		getElement(currentPage,elementName).waitUntilVisible().and().waitUntilClickable().click();
	}

	public void lands_on_pageX(String gherkinPageName) throws Throwable {
		currentPage = gherkinPageName.toLowerCase();
		getElement(currentPage,"Page Unique Element").waitUntilVisible().and().waitUntilClickable();
	}
	
	public void enters_inputX_into_the_elementY(String inputValue, String gherkinElement) throws Throwable {
		elementName = gherkinElement.toLowerCase();
		getElement(currentPage,elementName).waitUntilVisible().and().waitUntilEnabled().sendKeys(inputValue);
	}
}
