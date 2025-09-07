package Steps;

import LibraryFiles.DriverFactory;
import LibraryFiles.UtilityClass;
import POMClasses.SwagLabHomePage;
import POMClasses.SwagLabLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.IOException;

public class Ex1swaglabSteps {
    SwagLabLoginPage login=new SwagLabLoginPage(DriverFactory.driver);
    SwagLabHomePage home=new SwagLabHomePage(DriverFactory.driver);


    @Given("user is on Swag lab login")
    public void user_is_on_swag_lab_login() throws IOException {
        String url = UtilityClass.getPFData("URL");    //get url from property file
        DriverFactory.driver.get(url);
    }


    @When("user enter username on swaglab login page {string}")
    public void user_enter_username_on_swaglab_login_page(String unValue) {
        login.inpSwagLabLoginPageUsername(unValue);
    }


    @When("user enter password on swaglab login page {string}")
    public void user_enter_password_on_swaglab_login_page(String pwdValue) {
        login.inpSwagLabLoginPagePassword(pwdValue);
    }


    @When("user click on login btn on swaglab login page")
    public void user_click_on_login_btn_on_swaglab_login_page() {
        login.clickSwagLabLoginPageLoginBtn();
    }




    @When("wait for {int} seconds")
    public void wait_for_seconds(Integer timeInSec) throws InterruptedException {
        Thread.sleep(timeInSec*1000);
    }




    @Then("home page visible with logo text {string}")
    public void home_page_visible_with_logo_text(String expLogoText) {


        String actLogoText=home.getSwagLabHomePageLogoText();
        Assert.assertEquals(expLogoText,actLogoText,"Failed Act & Exp Logo text are diff");
    }

    @Then("user can see error messgae {string}")
    public void user_can_can_see_error_messgae(String expErrorMsg) {
        String actErrorMsg=login.getSwagLabLoginPageErrorMSg();
        Assert.assertEquals(expErrorMsg,actErrorMsg,"act & exp error message mismatch");
    }



}


