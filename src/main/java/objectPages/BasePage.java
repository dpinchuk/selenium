package objectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {

    private WebDriver driver;
    private WebDriverWait wait;

    private static final int TIMEOUT = 15;
    private static final int POLLING = 100;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, TIMEOUT, POLLING);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
    }

    //click
    public void click(By elementBy) {
        waitVisibility(elementBy);
        this.driver.findElement(elementBy).click();
    }

    //write text
    public void writeText(By elementBy, String text) {
        waitVisibility(elementBy);
        this.driver.findElement(elementBy).sendKeys(text);
    }

    //read text
    public String readText(By elementBy) {
        waitVisibility(elementBy);
        return this.driver.findElement(elementBy).getText();
    }

    //assert
    public void assertEquals(By elementBy, String expectedText) {
        waitVisibility(elementBy);
        Assert.assertEquals(readText(elementBy), expectedText);
    }

    public void scrollByValues(String from, String to) {
        JavascriptExecutor js = (JavascriptExecutor) this.driver;
        js.executeScript("window.scrollBy(" + from + ", " + to + ")");
    }

    public void scrollDown(String from) {
        JavascriptExecutor js = (JavascriptExecutor) this.driver;
        js.executeScript("window.scrollBy(" + from + ", document.body.scrollHeight)");
    }

    public void scrollUp(String from) {
        JavascriptExecutor js = (JavascriptExecutor) this.driver;
        js.executeScript("window.scrollBy(" + from + ", -document.body.scrollHeight)");
    }

    public void scrollElement(By elementBy) {
        JavascriptExecutor js = (JavascriptExecutor) this.driver;
        js.executeScript("arguments[0].scrollIntoView(true);", elementBy);
    }

    //wait visibility
    public void waitVisibility(By elementBy) {
        this.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    protected void waitForElementToAppear(By elementBy) {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(elementBy));
    }

    public void waitForElementToDisappear(By elementBy) {
        this.wait.until(ExpectedConditions.invisibilityOfElementLocated(elementBy));
    }

    public void waitForTextToDisappear(By elementBy, String text) {
        this.wait.until(ExpectedConditions.not(ExpectedConditions.textToBe(elementBy, text)));
    }

    //get Web Driver
    public WebDriver getDriver() {
        return this.driver;
    }

}