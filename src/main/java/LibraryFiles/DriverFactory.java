package LibraryFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class DriverFactory {


    public static WebDriver driver;

    public static void initializeBrowser(String browserName) {



        if (browserName.equalsIgnoreCase("Chrome"))
        {
            Map<String, Object> prefs = new HashMap<>();
            prefs.put("credentials_enable_service", false);
            prefs.put("profile.password_manager_enabled", false);
            ChromeOptions options=new ChromeOptions();
            options.setExperimentalOption("prefs", prefs);
            driver=new ChromeDriver(options);
        }
        else  if (browserName.equalsIgnoreCase("Firefox"))
        {
            driver=new FirefoxDriver();
        }
        else if (browserName.equalsIgnoreCase("Edge"))
        {
            driver=new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}


