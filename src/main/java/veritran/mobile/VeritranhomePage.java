package veritran.mobile;

import org.apache.log4j.Logger;

import veritran.core.PageBase;
import veritran.locators.MobileLocators;

public class VeritranhomePage extends PageBase{

	static Logger log = Logger.getLogger(VeritranhomePage.class);
	
	public VeritranhomePage(){
		idle(120);
		getElement(MobileLocators.MobileHomePage.langageButton, 240);
	}
	
	public void selectSpanishLanguage(){
		getElement(MobileLocators.MobileHomePage.langageButton, 120).click();
	}
}
