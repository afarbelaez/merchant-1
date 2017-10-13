package veritran.web;

import veritran.core.PageBase;

import org.apache.log4j.Logger;

import veritran.locators.WebLocators;

public class HomePage extends PageBase {

    static Logger log = Logger.getLogger(HomePage.class);

    private String homePageUrl = "https://vtdesigner-vrtp.aws.veritran.net/VRTPIB/presentation/LAB2/index.htm";

    public HomePage(){
        getDriver().get(homePageUrl);
        idle(5);
    }

    public LandingPage signInPage(){
    	getElement(WebLocators.HomePage.signInButton).click();
    	getElement(WebLocators.HomePage.userInput).sendKeys("7240");
    	getElement(WebLocators.HomePage.passwordInput).sendKeys("111");
    	getElement(WebLocators.HomePage.signInButtonForm).click();
		return new LandingPage();
    }

}
