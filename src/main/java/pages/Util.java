package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Util {
    public static void scrollToElementVisibilityOf(WebDriver driver, By by) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        boolean bool = false;



        while (!bool) {
            try {
                driver.findElement(by);
                bool = true;
            } catch (Exception ignore) {
                js.executeScript("window.scrollBy(0,700)");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

