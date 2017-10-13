package veritran.core;

import autorange.TestUtils;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase extends TestUtils {

    static Logger log = Logger.getLogger(TestBase.class.getName());

    public TestBase(){

        // Set Drivers path
        log.info("Setting Driver path...");

        env.setDriverPath();

        // test listener adapter
        setListenersAdapters();

    }

    @BeforeClass(alwaysRun = true)
    public void tearUp() throws Exception {
        startDriver();
        getDriver().manage().deleteAllCookies();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        endDriver();
    }
}
