package POMClasses;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SwagLabLoginPage
{
    @FindBy(xpath = "//input[@id='user-name']") private WebElement UN;
    @FindBy(xpath = "//input[@id='password']") private WebElement PWD;
    @FindBy(xpath = "//input[@id='login-button']") private WebElement LoginBtn;
    @FindBy(xpath = "//div[@class='error-message-container error']") private WebElement errorMsg;

    public SwagLabLoginPage(WebDriver driver)
    {

        PageFactory.initElements(driver,this);
    }


    public void inpSwagLabLoginPageUsername(String UNValue){

        UN.sendKeys(UNValue);
    }


    public void inpSwagLabLoginPagePassword(String PWDValue){

        PWD.sendKeys(PWDValue);
    }


    public void clickSwagLabLoginPageLoginBtn() {

        LoginBtn.click();
    }

    public String getSwagLabLoginPageErrorMSg() {
        String actErrorMSg = errorMsg.getText();
        return actErrorMSg;

    }


    }




