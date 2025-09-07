package Steps;

import LibraryFiles.DriverFactory;
import POMClasses.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class SwagLabsProductsSteps {



    SwagLabHomePage home=new SwagLabHomePage(DriverFactory.driver);
    SwagLabsYourCartPage youCart=new SwagLabsYourCartPage(DriverFactory.driver);
    SwagLabsCheckoutYourInfoPage yourInfo=new SwagLabsCheckoutYourInfoPage(DriverFactory.driver);
    SwagLabsCheckoutOverviewPage overview=new SwagLabsCheckoutOverviewPage(DriverFactory.driver);
    SwagLabsCheckoutCompletePage checkoutComplete=new SwagLabsCheckoutCompletePage(DriverFactory.driver );


    @Then("user can see {int} products on home page")
    public void user_can_see_products_on_home_page(Integer expProductCount) {


        int actProductCount=home.getSwagLabHomePageProductCount();
        Assert.assertEquals(expProductCount,actProductCount,"Failed-Product count mismatch");
    }
    @Then("price of the SauceLabBackPack product should {double}")
    public void price_of_the_sauce_lab_back_pack_product_should(Double expProductPrice) {
        Double actProductPrice=home.getSwagLabHomePageBackPackProductPrice();
        Assert.assertEquals(expProductPrice,actProductPrice,"Failed-Act & Exp product price mismatch");
    }


    @Then("total price of the products should {double}")
    public void total_price_of_the_products_should(Double expTotalProductPrice) {
        double actTotalProductPrice=home.getSwagLabHomePageTotalProductPrice();
        Assert.assertEquals(expTotalProductPrice,actTotalProductPrice,"Failed-Act & Exp total product price mismatch");
    }


    @Given("user click on Add to cart option for product SwagLabsBackpack")
    public void user_click_on_add_to_cart_option_for_product_swag_labs_backpack() {
        home.clickSwagLabHomePageAddToCartBackpack();
    }


    @Given("user click on cart option")
    public void user_click_on_cart_option() {
        home.clickSwagLabHomePageCart();
    }


    @Given("user click on checkout button")
    public void user_click_on_checkout_button() {
        youCart.clickSwagLabsYourCartPageCheckout();
    }


    @Given("user enter firstname as {string}")
    public void user_enter_firstname_as(String fn) {
        yourInfo.inpSwagLabsCheckoutYourInfoPageFN(fn);
    }


    @Given("user enter lastname as {string}")
    public void user_enter_lastname_as(String ln) {
        yourInfo.inpSwagLabsCheckoutYourInfoPageLN(ln);
    }


    @Given("user enter pin code as {int}")
    public void user_enter_pin_code_as(Integer pincode) {

        String pincodeString= Integer.toString(pincode);
        yourInfo.inpSwagLabsCheckoutYourInfoPagePinCode(pincodeString);
    }


    @Given("user click on continue button")
    public void user_click_on_continue_button() {
        yourInfo.clickSwagLabsCheckoutYourInfoPageContinueBtn();
    }


    @Given("user click on finish button")
    public void user_click_on_finish_button() {
        overview.clickSwagLabsCheckoutOverviewPageFinish();
    }


    @Then("order place message {string} should be visible")
    public void order_place_message_should_be_visible(String expMSg) {
        String actMsg = checkoutComplete.getSwagLabsCheckoutCompletePageCheckoutCompleteMsg();
        Assert.assertEquals(expMSg,actMsg,"Failed-act & exp checkout complete message is diff");
    }



}



