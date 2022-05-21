package pages;

import helpers.Waiter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static helpers.WebDriverClass.driver;
import static helpers.WebDriverClass.getDriver;

public abstract class BasePage {
    public Actions actions;
    public static String baseURL = "https://www.evoca.am/hy/";

    public BasePage() {
        actions = new Actions(getDriver());
    }

    public abstract String getUrl();

    public void openPage() {
        getDriver().get(getUrl());
    }

    public boolean isElementDisplayed(By locator) {
        try {
            Waiter.getInstance(5).waitForElementToBeVisible(locator);
            return true;
        } catch (Error ignored) {
            return false;
        }
    }

    public void click(By locator) {
        WebElement element = Waiter.getInstance(5).waitForElementToBeClickable(locator);
        element.click();
    }

    public void clickByIndex(By locator, int index) {
        List<WebElement> elements = Waiter.getInstance(5).waitForElementsToBeVisible(locator);
        elements.get(index).click();
    }

    public String getText(By locator) {
        WebElement element = Waiter.getInstance(5).waitForElementToBeVisible(locator);
        return element.getText();
    }

    public void type(By locator, String s) {
        WebElement element = Waiter.getInstance(5).waitForElementToBeVisible(locator);
        element.sendKeys(s);
    }

    public void scrollToElement(By locator) {
        WebElement element = Waiter.getInstance(5).waitForElementToBeVisible(locator);
        actions.moveToElement(element).perform();
    }

    public void scrollToElementByIndex(By locator, int index) {
        List<WebElement> element = Waiter.getInstance(5).waitForElementsToBeVisible(locator);
        actions.moveToElement(element.get(index)).perform();
    }

    public void openByUrl() {
        getDriver().get(getUrl());
    }

    public WebElement findElement(By location) {
        Waiter.getInstance(5).isElementDisplayed(location);
        return getDriver().findElement(location);
    }

    public String getCurrentPageUrl() {
        return getDriver().getCurrentUrl();
    }

    public boolean isElementClickable(By location) {
        try {
            Waiter.getInstance(10).waitForElementToBeClickable(location);
            return true;
        } catch (Error ignored) {
            return false;
        }
    }

    public List<WebElement> getAllElements(By by) {
        return driver.findElements(by);
    }

    public void switchToIframe(By by) {
        driver.switchTo().frame(Waiter.getInstance(5).waitForElementToBeClickable(by));
    }

    public void navigateBack() {
        getDriver().navigate().back();
    }


}