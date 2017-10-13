package veritran.web;

import veritran.core.PageBase;
import veritran.locators.WebLocators;

public class LandingPage extends PageBase{

	public LandingPage(){
		idle(5);
	}
	
	public String getUserName(){
		return getElement(WebLocators.LandingPage.userName).getText();
	}
}
