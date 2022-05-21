import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestForSearchFunctionality extends BaseTest {

    @Test
    public void validCaseOfSearching() {
        HomePage hp = new HomePage();
        hp.clickSearchIcon();
        hp.clickSearchBox();
        hp.inputingText("Վարկեր");
        hp.clickSearchBarEnterIcon();
        Assert.assertEquals(hp.nextPageTestUrl(), "https://www.evoca.am/hy/search/?q=%D5%8E%D5%A1%D6%80%D5%AF%D5%A5%D6%80");
        Assert.assertTrue(hp.isLoansDisplayed());
        hp.clickLoansSearchArticleButton();
        Assert.assertEquals(hp.getLoansSearchArticleName(),"Ոչ ռեզիդենտ ֆիզիկական անձանց համար բնակարանային հիփոթեքային վարկեր");
    }
    @Test
    public void emptyValidCaseOfSearching() {
        HomePage hp = new HomePage();
        hp.clickSearchIcon();
        hp.clickSearchBox();
        hp.inputingText("");
        hp.clickSearchBarEnterIcon();
        Assert.assertTrue(hp.isLoansBlogDisplayed());
        Assert.assertEquals(hp.getLoansEmptySearchArticleName(),"Նվիրենք ամիսը մշակույթին");

    }
    @Test
    public void validCaseOfSearchingWithUpperCase() {
        HomePage hp = new HomePage();
        hp.clickSearchIcon();
        hp.clickSearchBox();
        hp.inputingText("ՎԱՐԿԵՐ");
        hp.clickSearchBarEnterIcon();
        Assert.assertEquals(hp.nextPageTestUrl(), "https://www.evoca.am/hy/search/?q=%D5%8E%D5%A1%D6%80%D5%AF%D5%A5%D6%80");
        Assert.assertTrue(hp.isLoansDisplayed());
        hp.clickLoansSearchArticleButton();
        Assert.assertEquals(hp.getLoansSearchArticleName(),"Ոչ ռեզիդենտ ֆիզիկական անձանց համար բնակարանային հիփոթեքային վարկեր");
    }
    @Test
    public void invalidCaseOfSearching() {
        HomePage hp = new HomePage();
        hp.clickSearchIcon();
        hp.clickSearchBox();
        hp.inputingText("սկդֆօլկօ");
        hp.clickSearchBarEnterIcon();
        Assert.assertEquals(hp.getLocatorText(), "Որոնման արդյունք չի հայտնաբերվել");
    }
    @Test
    public void invalidCaseOfSearchingWithOneMistake() {
        HomePage hp = new HomePage();
        hp.clickSearchIcon();
        hp.clickSearchBox();
        hp.inputingText("Վարկեռ");
        hp.clickSearchBarEnterIcon();
        Assert.assertEquals(hp.getLocatorText(), "Որոնման արդյունք չի հայտնաբերվել");
    }
    @Test
    public void invalidCaseOfSearchingWithNumbers() {
        HomePage hp = new HomePage();
        hp.clickSearchIcon();
        hp.clickSearchBox();
        hp.inputingText("55858");
        hp.clickSearchBarEnterIcon();
        Assert.assertEquals(hp.getLocatorText(), "Որոնման արդյունք չի հայտնաբերվել");
    }
}
