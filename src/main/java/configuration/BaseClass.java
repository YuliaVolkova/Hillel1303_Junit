package configuration;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;




public class BaseClass {

    public static WebDriver driver= DriverFactory.greateDriver(WEBDRIVERS.CHROMECLEAN);


    @AfterClass
    public static void end() throws InterruptedException {
        Thread.sleep(6000);
        driver.quit();
    }
}
