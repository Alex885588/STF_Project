package pages;

import helpers.Waiter;
import helpers.WebDriverClass;
import locators.LoansPageLocators;
import locators.SubmissionPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static helpers.WebDriverClass.getDriver;

public class SubmissionPage extends BasePage {
    private By iframe = By.xpath(SubmissionPageLocators.iframe);
    private By input1 = By.xpath(SubmissionPageLocators.input1);
    private By input2 = By.xpath(SubmissionPageLocators.input2);
    private By input3 = By.xpath(SubmissionPageLocators.input3);
    private By input4 = By.xpath(SubmissionPageLocators.input4);
    private By input5 = By.xpath(SubmissionPageLocators.input5);
    private By input6 = By.xpath(SubmissionPageLocators.phoneNumber);
    private By select = By.xpath(SubmissionPageLocators.select);
    private By selectAnswer = By.xpath(SubmissionPageLocators.selectAnswer);
    private By button = By.xpath(SubmissionPageLocators.button);
    private By checkName = By.xpath(SubmissionPageLocators.checkName);
    private By errorMessage = By.xpath(SubmissionPageLocators.errorMessage);
    private By inputOwnerName = By.xpath(SubmissionPageLocators.inputOwnerName);
    private By errorOfNameField = By.xpath(SubmissionPageLocators.errorOfNameField);
    private By errorNameOfEmailField = By.xpath(SubmissionPageLocators.errorNameOfEmailField);
    private By errorInPhoneNumberField = By.xpath(SubmissionPageLocators.errorInPhoneNumberField);
    private By errorInAmountField = By.xpath(SubmissionPageLocators.errorInAmountField);





    @Override
    public String getUrl() {
        return baseURL + "business-loans/small-and-medium-business-lending/sme-lending-application-form/";
    }

    public void switchTo() {
        switchToIframe(iframe);
    }

    public void clickInput1() {
        click(input1);
    }

    public void inputInVhvvField(String s) {
        type(input1, s);
    }


    public String getName() {
        return getDriver().findElement(checkName).getAttribute("value");
    }

    public void inputInAmountField(String s) {
        type(input2, s);
    }

    public void inputInNameField(String s) {
        type(input3, s);
    }

    public void inputInPositionField(String s) {
        type(input4, s);
    }

    public void inputInEmailField(String s) {
        type(input5, s);
    }

    public void inputInNumberField(String s) {
        type(input6, s);
    }

    public void clickBranch() {
        click(select);
    }

    public void clickBranchChoose() {
        click(selectAnswer);
    }

    public boolean isSubmitButtonClickable() {
        return isElementClickable(button);
    }
    public void clickAmountField(){
        click(input2);
    }
    public String getErrorOfAmountField(){return getDriver().findElement(errorInAmountField).getText();}
    public String getError() {
        return getDriver().findElement(errorMessage).getText();
    }
    public String getNameOfOwner() {
        return getDriver().findElement(inputOwnerName).getText();
    }
    public boolean waitForError(){
        return isElementDisplayed(errorMessage);
    }
    public void clickNameField(){
        click(input3);
    }
    public String getErrorOfNameField() {
        return getDriver().findElement(errorOfNameField).getText();
    }
    public void clickEmailField(){
        click(input5);
    }
    public void sendInvalidTextToEmailField(String s){
        type(input5,s);
    }
    public String getErrorOfEmailField() {
        return getDriver().findElement(errorNameOfEmailField).getText();
    }
    public void clickPhoneField(){
        click(input6);
    }
    public String getErrorOfPhoneField() {
        return getDriver().findElement(errorInPhoneNumberField).getText();
    }
}
