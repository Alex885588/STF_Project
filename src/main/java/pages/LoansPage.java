package pages;


import locators.LoansPageLocators;
import org.openqa.selenium.By;

import static helpers.WebDriverClass.getDriver;

public class LoansPage extends BasePage{
    private final By firstImg=By.xpath(LoansPageLocators.FirstImage);
    private final By secondImg=By.xpath(LoansPageLocators.SecondImage);
    private final By thirdImg=By.xpath(LoansPageLocators.ThirdImage);
    private final By FirstLoanText=By.xpath(LoansPageLocators.FirstLoanText);
    private final By LoanPageText=By.xpath(LoansPageLocators.LoanPageText);
    private final By infoButton=By.xpath(LoansPageLocators.infoButton);
    private final By SecondInfoButton=By.xpath(LoansPageLocators.secondInfoButton);
    private final By ThirdInfoButton=By.xpath(LoansPageLocators.thirdInfoButton);
    private final By SecondLoanText=By.xpath(LoansPageLocators.SecondLoanText);
    private final By ThirdLoanText=By.xpath(LoansPageLocators.ThirdLoanText);
    private final By loanItem=By.cssSelector(LoansPageLocators.loanItem);

    @Override
    public String getUrl() {
        return baseURL+"loans/";
    }
    public String getFirstLoanArticleName(){
        return getDriver().findElement(FirstLoanText).getText();
    }
    public void clickFirstImage(){
        click(firstImg);
    }
    public String getLoanPageArticleName(){return getDriver().findElement(LoanPageText).getText();}
    public void clickInfoButton(){click(infoButton);}

    public String getSecondLoanArticleName(){return getDriver().findElement(SecondLoanText).getText();}
    public void clickSecondPage(){
        click(secondImg);
    }
    public void clickSecondInfoButton(){click(SecondInfoButton);}

    public String getThirdLoanArticleName(){return getDriver().findElement(ThirdLoanText).getText();}
    public void clickThirdPage(){click(thirdImg);}
    public void clickThirdInfoButton(){click(ThirdInfoButton);}
    public int getLoansSectionsCount(){
        return getAllElements(loanItem).size();
    }
}
