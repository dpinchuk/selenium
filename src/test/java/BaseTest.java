import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReaderUtil;

public class BaseTest {

    private WebDriver driver;
    private ConfigReaderUtil configReader = new ConfigReaderUtil();

    @BeforeMethod
    public void setup() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setJavascriptEnabled(true);
        System.setProperty("webdriver.chrome.driver", configReader.getChromeDriverPath());
        this.driver = new ChromeDriver();
        this.driver.manage().deleteAllCookies();
        this.driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        if (this.driver != null) {
            this.driver.manage().deleteAllCookies();
            this.driver.quit();
        }
    }

    public WebDriver getDriver() {
        return this.driver;
    }
}