package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\Admin\\IdeaProjects\\Cucumber_BDD_Framework\\src\\test\\java\\Features\\Ex3productorderEndtoEndTesting.feature",
        glue = {"Steps","Hooks"}
        //publish = true
        //plugin = {"pretty","html:Report/Swaglabendtoendreport.html"}

)
public class E2ESwaglabRunner extends AbstractTestNGCucumberTests {
}
