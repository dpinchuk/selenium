import objectPages.HomePage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(priority = 0)
    public void invalidLoginTest_EmptyLoginEmptyPassword() {
        HomePage homePage = new HomePage(getDriver());
        homePage
                .goToHomePage()
                .goToLoginPage()
                .login("", "")
                .errorVerifyLoginPassword("Incorrect username or password.");
    }

    @Test(priority = 1)
    public void successLoginTest_ValidLoginValidPassword() {
        HomePage homePage = new HomePage(getDriver());
        homePage
                .goToHomePage()
                .goToLoginPage()
                .login("dpinchuk", "dmss111278")
                .successfullyVerifyLoginPassword("Repositories\nNew");
    }

    @Test(priority = 2)
    public void invalidLoginTest_PresentLoginEmptyPassword() {
        HomePage homePage = new HomePage(getDriver());
        homePage
                .goToHomePage()
                .goToLoginPage()
                .login("dpinchuk", "")
                .errorVerifyLoginPassword("Incorrect username or password.");
    }

    @Test(priority = 3)
    public void invalidLoginTest_EmptyLoginPresentPassword() {
        HomePage homePage = new HomePage(getDriver());
        homePage
                .goToHomePage()
                .goToLoginPage()
                .login("", "dmss111278")
                .errorVerifyLoginPassword("Incorrect username or password.");
    }

}