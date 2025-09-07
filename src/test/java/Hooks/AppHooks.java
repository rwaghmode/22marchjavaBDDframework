package Hooks;

import LibraryFiles.DriverFactory;
import LibraryFiles.UtilityClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;

public class AppHooks {

    @Before
        public void openBrowser() throws IOException {
            String browser= UtilityClass.getPFData("browserName");
            DriverFactory.initializeBrowser(browser);
        }

        @After
        public void closeBrowser()
        {
           DriverFactory.driver.quit();
        }

}
