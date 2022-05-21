import com.google.common.io.Files;
import helpers.WebDriverClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import java.io.File;
import java.io.IOException;


import static helpers.WebDriverClass.driver;
import static helpers.WebDriverClass.getDriver;

public abstract class BaseTest {
    @BeforeMethod
    public void startDriver() {
        getDriver();
    }
    @AfterMethod
    public void recordFailure(ITestResult result){
        if(ITestResult.FAILURE == result.getStatus())
        {
            TakesScreenshot camera = (TakesScreenshot)getDriver();
            File screenshot = ((TakesScreenshot) camera).getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("src/resources/screenshots" + result.getName() + ".png"));
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        WebDriverClass.quitDriver();
    }


}