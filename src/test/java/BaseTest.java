import dtiver_init.DriverInit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    protected WebDriver driver = DriverInit.startDriver();

    @BeforeSuite
    public void init(){
        driver = DriverInit.startDriver();
    }
    @AfterSuite
    public void stop(){
        driver.quit();
    }
}