package objectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ConfigReaderUtil;

public class HomePage extends BasePage {

    /************** Auxiliary Objects **************/
    private ConfigReaderUtil configReader = new ConfigReaderUtil();
    private final String URL = this.configReader.getUrl();

    /************** Web Elements **************/
    private By signInButtonBy = By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/a[1]");
    private By signUpButtonBy = By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/a[2]");

    /************** Constructor **************/
    public HomePage(WebDriver driver) {
        super(driver);
    }

    /************** Page Methods **************/
    //Go to Home Page
    public HomePage goToHomePage() {
        getDriver().get(URL);
        return this;
    }

    //Go to Login Page
    public LoginPage goToLoginPage() {
        click(this.signInButtonBy);
        return new LoginPage(getDriver());
    }

    //Go to Registration Page
    public RegistrationPage goToRegistrationPage() {
        click(signUpButtonBy);
        return new RegistrationPage(getDriver());
    }

}