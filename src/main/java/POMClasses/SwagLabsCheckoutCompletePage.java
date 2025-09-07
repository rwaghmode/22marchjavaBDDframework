package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsCheckoutCompletePage {


    @FindBy(xpath = "//h2[@class='complete-header']") private WebElement checkoutCompleteMsg;


    public SwagLabsCheckoutCompletePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }


    public String getSwagLabsCheckoutCompletePageCheckoutCompleteMsg()
    {
        String actMsg = checkoutCompleteMsg.getText();
        return actMsg;
    }
}





