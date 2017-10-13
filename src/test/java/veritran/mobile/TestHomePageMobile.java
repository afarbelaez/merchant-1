package veritran.mobile;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import veritran.core.TestBase;

public class TestHomePageMobile extends TestBase{

	private VeritranhomePage homePage;
	private VeritranCreditCardPage creditCardPage;
	
    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(){
        homePage = new VeritranhomePage();
    }
	
    @Test(description = "test to validate Mobile", groups = {"homepage"})
    public void testSignIn(){
    	
    	homePage.selectSpanishLanguage();
    	creditCardPage = homePage.continueButton();
    	creditCardPage.fillUpCreditCardInformation();
    	
    }
}
