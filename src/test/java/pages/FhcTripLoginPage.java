package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FhcTripLoginPage {
    public FhcTripLoginPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "UserName")
    public WebElement usurname;
    @FindBy(id = "Password")
    public WebElement password;
    @FindBy(id = "btnSubmit")
    public WebElement logınButton;

    @FindBy(xpath = "//*[.='Create a new account']")
    public WebElement createButton;

    @FindBy(xpath = "//span[.='Try again please']")
    public WebElement error_mesaj;
}
