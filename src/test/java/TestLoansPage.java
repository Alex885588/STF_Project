import locators.LoansPageLocators;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoansPage;

public class TestLoansPage extends BaseTest{
    @Test
    public void testForFirstLoan(){
        LoansPage loanPages = new LoansPage();
        loanPages.openPage();
        Assert.assertEquals(loanPages.getFirstLoanArticleName(),"Ոչ ռեզիդենտ ֆիզիկական անձանց համար բնակարանային հիփոթեքային վարկեր");
        loanPages.clickFirstImage();
        Assert.assertEquals(loanPages.getLoanPageArticleName(),"Ոչ ռեզիդենտ ֆիզիկական անձանց համար բնակարանային հիփոթեքային վարկեր");
        loanPages.navigateBack();
        loanPages.clickInfoButton();
        Assert.assertEquals(loanPages.getLoanPageArticleName(),"Ոչ ռեզիդենտ ֆիզիկական անձանց համար բնակարանային հիփոթեքային վարկեր");
        loanPages.navigateBack();
    }
    @Test
    public void testForSecondLoan(){
        LoansPage loanPages = new LoansPage();
        loanPages.openPage();
        Assert.assertEquals(loanPages.getSecondLoanArticleName(),"Visa Vision վճարային քարտերով տրամադրվող վարկային սահմանաչափ");
        loanPages.clickSecondPage();
        Assert.assertEquals(loanPages.getLoanPageArticleName(),"Visa Vision վճարային քարտերով տրամադրվող վարկային սահմանաչափ");
        loanPages.navigateBack();
        loanPages.clickSecondInfoButton();
        Assert.assertEquals(loanPages.getLoanPageArticleName(),"Visa Vision վճարային քարտերով տրամադրվող վարկային սահմանաչափ");
        loanPages.navigateBack();
    }
    @Test
    public void testForThirdLoan(){
        LoansPage loanPages = new LoansPage();
        loanPages.openPage();
        Assert.assertEquals(loanPages.getThirdLoanArticleName(),"Գույքի գրավով ապահովված անհատական վարկ (վարկունակության գնահատմամբ)");
        loanPages.clickThirdPage();
        Assert.assertEquals(loanPages.getLoanPageArticleName(),"Գույքի գրավով ապահովված անհատական վարկ (վարկունակության գնահատմամբ)");
        loanPages.navigateBack();
        loanPages.clickThirdInfoButton();
        Assert.assertEquals(loanPages.getLoanPageArticleName(),"Գույքի գրավով ապահովված անհատական վարկ (վարկունակության գնահատմամբ)");
        loanPages.navigateBack();
    }
    @Test
    public void testLoanPage(){
        LoansPage loanPages = new LoansPage();
        loanPages.openPage();
        Assert.assertEquals(loanPages.getLoansSectionsCount(),23);
    }
}
