package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.nio.file.WatchEvent;

public class AutomationPracticeCreateAccountPage {
    public AutomationPracticeCreateAccountPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="id_gender1")
    public WebElement gender;

    @FindBy(id="customer_firstname")
    public WebElement firstname;

    @FindBy(id="customer_lastname")
    public WebElement lastname;

    @FindBy(id="passwd")
    public WebElement password;


    @FindBy(id="days")
    public WebElement day;

    @FindBy(id="months")
    public WebElement month;

    @FindBy(id="years")
    public WebElement year;

    @FindBy(id="company")
    public WebElement company;

    @FindBy(id="address1")
    public WebElement address1;


    @FindBy(id = "city")
    public WebElement city;


    @FindBy(id = "id_state")
    public WebElement state;

    @FindBy(id = "postcode")
    public WebElement zipcode;


    @FindBy(id = "id_country")
    public WebElement country;


    @FindBy(id = "phone_mobile")
    public WebElement phone;

    @FindBy(id = "alias")
    public WebElement alias;

    @FindBy(id = "submitAccount")
    public WebElement registerButton;

    @FindBy(xpath = "//h1")
    public WebElement myAccount;


}
