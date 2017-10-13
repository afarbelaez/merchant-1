package veritran.web;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import veritran.core.TestBase;

public class TestHomePageWeb extends TestBase {

    private HomePage homePage;
    private LandingPage landingPage;

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(){
        homePage = new HomePage();
    }

    @Test(description = "test to validate chrome", groups = {"homepage"})
    public void testSignIn(){
    	
    	landingPage = homePage.signInPage();
    	
    	Assert.assertEquals(landingPage.getUserName(), "Jose Lopera", 
    			"El usuario no es el Correcto");
    	
    	
    }

}
