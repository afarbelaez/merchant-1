package veritran.web;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import veritran.core.PageBase;
import veritran.locators.WebLocators;

public class LandingPage extends PageBase{

	public LandingPage(){
		idle(5);
	}
	
	public String getUserName(){
		return getElement(WebLocators.LandingPage.userName).getText();
	}
	
	public List<String> moneyTable(){
		List<String> list = new ArrayList<String>();
		for (WebElement e : getListOfElements(WebLocators.LandingPage.listOfMoney)){
			list.add(e.getText());
		}
		return list;
	}
}
