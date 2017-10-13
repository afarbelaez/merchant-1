package veritran.mobile;

import org.apache.log4j.Logger;

import veritran.core.PageBase;
import veritran.locators.MobileLocators;

public class VeritranCreditCardPage extends PageBase{

	static Logger log = Logger.getLogger(VeritranCreditCardPage.class);
	
	public VeritranCreditCardPage(){
		getElement(MobileLocators.MobileCardPage.creditCardInput, 240);
	}
	
	public void fillUpCreditCardInformation(){
		getElement(MobileLocators.MobileCardPage.creditCardInput, 240).sendKeys("1234567890123123");
		getElement(MobileLocators.MobileCardPage.NIPNumber, 240).click();
		getElement(MobileLocators.MobileCardPage.NIPNumber, 240).sendKeys("1111");
		getElement(MobileLocators.MobileCardPage.CVV, 240).click();
		getElement(MobileLocators.MobileCardPage.CVV, 240).sendKeys("123");
		getElement(MobileLocators.MobileCardPage.continueButton, 240).click();
	}
}
