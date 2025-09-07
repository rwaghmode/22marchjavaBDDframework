package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
       features = "C:\\Users\\Admin\\IdeaProjects\\Cucumber_BDD_Framework\\src\\test\\java\\Features\\EX2Producthomepage.feature",
        //features = "C:\\Users\\Admin\\IdeaProjects\\Cucumber_BDD_Framework\\src\\test\\java\\Features\\EX2Producthomepage.feature",
        glue = {"Steps","Hooks"}
        //publish = true,
        //plugin = {"pretty","html:Reports/ProductReport"}


        )
public class EX1SwaglabLoginTest extends AbstractTestNGCucumberTests {
}
