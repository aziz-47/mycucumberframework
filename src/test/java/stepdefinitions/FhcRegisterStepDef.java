package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.FhcRegisterPage;
import pages.FhcTripLoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;
public class FhcRegisterStepDef {
    FhcRegisterPage fhcRegisterPage = new FhcRegisterPage();
    FhcTripLoginPage fhcTripLoginPage = new FhcTripLoginPage();

    @Given("kullanici fhctrip sayfasindadir")
    public void kullanici_fhctrip_sayfasindadir() {
        Driver.getDriver().get(ConfigurationReader.getProperty("fhc_login_url"));
    }

    @Given("kullanici “create a new account” butonuna tiklar")
    public void kullanici_create_a_new_account_butonuna_tiklar() {
        fhcTripLoginPage.createButton.click();
    }

    @Given("kullanici username girer")
    public void kullanici_username_girer() {
        fhcRegisterPage.username.sendKeys("Sena");
    }

    @Given("kullanici password girer")
    public void kullanici_password_girer() {
        fhcRegisterPage.password.sendKeys("Man1ager2!");
    }

    @Given("kullanici email girer")
    public void kullanici_email_girer() {
        fhcRegisterPage.mail.sendKeys("abdc@gmail.com");
    }

    @Given("kullanici fullname girer")
    public void kullanici_fullname_girer() {
        fhcRegisterPage.fullname.sendKeys("Sena Yildiz");
    }

    @Given("kullanici phone girer")
    public void kullanici_phone_girer() {
        fhcRegisterPage.phone.sendKeys("05455678990");
    }

    @Given("kullanici SSN girer")
    public void kullanici_SSN_girer() {
        fhcRegisterPage.ssnumber.sendKeys("111222333");
    }

    @Given("kullanici Driven lisans girer")
    public void kullanici_Driven_lisans_girer() {
        fhcRegisterPage.drivingLicense.sendKeys("111");
    }

    @Given("kullanici country dropdowndan secer")
    public void kullanici_country_dropdowndan_secer() {
        Select select = new Select(fhcRegisterPage.Country);
        select.selectByValue("107");
    }

    @Given("kullanici state dropdowndan secer")
    public void kullanici_state_dropdowndan_secer() {
        Select select = new Select(fhcRegisterPage.state);
        select.selectByIndex(0);
    }

    @Given("kullanici adress girer")
    public void kullanici_adress_girer() {
        fhcRegisterPage.address.sendKeys("Vironas Atina");
    }

    @Given("kullanici working sector girer")
    public void kullanici_working_sector_girer() {
        fhcRegisterPage.sector.sendKeys("egitim");
    }

    @Given("kullanici birthday girer")
    public void kullanici_birthday_girer() {
        fhcRegisterPage.birthdate.sendKeys("7/31/1977");
    }

    @Then("kullanici save butonuna tiklar")
    public void kullanici_save_butonuna_tiklar() {
        fhcRegisterPage.saveButton.click();

        String mesaj= fhcRegisterPage.successfullyMessage.getText();
        Assert.assertTrue(mesaj.equals("this email address is already taken"));

        fhcRegisterPage.okButton.click();

    }
}