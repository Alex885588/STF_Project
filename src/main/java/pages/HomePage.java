package pages;

import locators.HomePageLocators;
import org.openqa.selenium.By;

import static helpers.WebDriverClass.getDriver;

public class HomePage extends BasePage {
    private final By searchIcon = By.xpath(HomePageLocators.searchIcon);
    private final By searchBox = By.xpath(HomePageLocators.searchBox);
    private final By inputText = By.xpath(HomePageLocators.inputText);
    private final By inputBarSearchIcon = By.xpath(HomePageLocators.inputBarSearchIcon);
    private final By invalidInput = By.xpath(HomePageLocators.invalidInput);
    private final By loansSearchText= By.xpath(HomePageLocators.loansSearchText);
    private final By loansSearchArticleButton= By.xpath(HomePageLocators.loansSearchArticleButton);
    private final By loansSearchArticleName= By.xpath(HomePageLocators.loansSearchArticleName);
    private final By loansSearchBlog= By.xpath(HomePageLocators.loansSearchBlog);
    private final By loansEmptySearchText= By.xpath(HomePageLocators.loansEmptySearchText);

    public void clickSearchIcon() {
        click(searchIcon);
    }

    public void clickSearchBox() {
        click(searchBox);
    }

    public void clickSearchBarEnterIcon() {
        click(inputBarSearchIcon);
    }

    public void clickLoansSearchArticleButton(){
        click(loansSearchArticleButton);
    }

    public void inputingText(String s) {
        type(inputText, s);
    }
    public boolean isLoansDisplayed(){
        return isElementDisplayed(loansSearchText);
    }
    public boolean isLoansBlogDisplayed(){
        return isElementDisplayed(loansSearchBlog);
    }
    public String nextPageTestUrl() {
        return baseURL + "search/?q=%D5%8E%D5%A1%D6%80%D5%AF%D5%A5%D6%80";
    }
    public String getLocatorText() {
        return getDriver().findElement(invalidInput).getText();
    }

    public String getLoansSearchArticleName(){
        return getDriver().findElement(loansSearchArticleName).getText();
    }
    public String getLoansEmptySearchArticleName(){
        return getDriver().findElement(loansEmptySearchText).getText();
    }
    @Override
    public String getUrl() {
        return baseURL;
    }
}
