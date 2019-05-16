package objectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private By loginBy = By.id("login_field");
    private By passwordBy = By.id("password");
    private By loginButtonBy = By.xpath("//*[@id='login']/form/div[3]/input[4]");
    private By h2Repositories = By.xpath("/html/body/div[4]/div/aside[1]/div[2]/div/div/h2");
    private By findRepositoryBy = By.id("dashboard-repos-filter-left");
    private By errorMessageLoginPasswordBy = By.xpath("//*[@id=\"js-flash-container\"]/div/div");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /************** Page Methods **************/
    //login
    public LoginPage login(String login, String password) {
        writeText(this.loginBy, login);
        writeText(this.passwordBy, password);
        click(this.loginButtonBy);
        return this;
    }

    //Successfully verify username
    public LoginPage successfullyVerifyLoginPassword(String expectedText) {
        assertEquals(this.h2Repositories, expectedText);
        return this;
    }

    //Error verify username
    public LoginPage errorVerifyLoginPassword(String expectedText) {
        assertEquals(this.errorMessageLoginPasswordBy, expectedText);
        return this;
    }

}