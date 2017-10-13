package veritran.web;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import veritran.core.TestBase;

public class TestLandingPageWeb extends TestBase{

	
	private String REGEX_PATTERN =   "\\$[0-9]*,[0-9]*.[0-9]*";
	
    private HomePage homePage;
    private LandingPage landingPage;

	private Pattern pattern;
	private Matcher matcher;
    
    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(){
        homePage = new HomePage();
        landingPage = homePage.signInPage();
        pattern = Pattern.compile(REGEX_PATTERN);
    }

    @Test(description = "test to validate chrome", groups = {"homepage"})
    public void testSignIn(){
    	
    	for(String value : landingPage.moneyTable()){
    		matcher = pattern.matcher(value);
    		Assert.assertTrue(matcher.matches());
    	}    	
    }
}
