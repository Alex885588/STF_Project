import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SubmissionPage;
public class TestForSubmissionPage extends BaseTest {
    @Test
    public void validCaseOfFields() throws InterruptedException{
        SubmissionPage sb=new SubmissionPage();
        sb.openPage();
        sb.switchTo();
        sb.clickInput1();
        sb.inputInVhvvField("82274836");
        Thread.sleep(1000);
        Assert.assertEquals(sb.getName(),"ՀԱՍՄԻԿ ՄՈՒՐԱԴՅԱՆ");
        sb.inputInAmountField("400");
        sb.inputInNameField("Ալեքսանյան Ալեքսանդր");
        sb.inputInPositionField("մենեջեռ");
        sb.inputInEmailField("alex.alexanyan55@gmail.com");
        sb.inputInNumberField("37495777077");
        sb.clickBranch();
        sb.clickBranchChoose();
        Assert.assertTrue(sb.isSubmitButtonClickable());
    }
    @Test
    public void invalidCaseOfAllFields() throws InterruptedException {
        SubmissionPage sb=new SubmissionPage();
        sb.openPage();
        sb.switchTo();
        sb.clickInput1();
        sb.inputInVhvvField("82274837");
        Thread.sleep(1000);
        Assert.assertEquals(sb.getError(),"Մուտքագրեք ճիշտ ՀՎՀՀ");
        sb.waitForError();
        Assert.assertEquals(sb.getNameOfOwner(),"");
        sb.clickAmountField();
        Assert.assertEquals(sb.getErrorOfAmountField(),"Այս դաշտը պարտադիր է");
        sb.clickNameField();
        Assert.assertEquals(sb.getErrorOfNameField(),"Այս դաշտը պարտադիր է");
        sb.clickEmailField();
        sb.sendInvalidTextToEmailField("85858");
        Assert.assertEquals(sb.getErrorOfEmailField(),"Սխալ ֆորմատ");
        sb.clickPhoneField();
        Assert.assertEquals(sb.getErrorOfPhoneField(),"Այս դաշտը պարտադիր է");
        sb.inputInNumberField("sad");
        Assert.assertEquals(sb.getErrorOfPhoneField(),"Սխալ ֆորմատ");
        Assert.assertFalse(sb.isSubmitButtonClickable());
    }

}
