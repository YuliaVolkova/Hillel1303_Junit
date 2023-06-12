package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Coaches {
    WebDriver driver;
    public Coaches(WebDriver driver){
        this.driver=driver;

    }
    By showcoacheslist= By.xpath("//*[@class=\"button -xl -light-blue coaches_action\"]"),

    allCoachesList=By.xpath("//*[@class=\"coach-card_name\"]");


    public List<String> getCoashesNames(){
        Util.scrollToElementVisibilityOf(driver, new By.ByXPath("//*[@id=\"coachesSection\"]/div/div/ul"));
        List<String>list= new ArrayList<>();
        driver.findElement(showcoacheslist).click();
        for (WebElement element: driver.findElements(allCoachesList)){

            list.add(element.getText());


        }


        return list;
    }
































//    WebDriver driver;
//    public Coaches(WebDriver driver){
//
//        this.driver=driver;
//    }
//
//    By coachesList=By.xpath("//*[@id=\"coachesShowAllButton\"]/span[1]");
//
//
//    public void showAllCoaches(){
//        scrollToElementVisibilityOf(driver, coachesList);
//    }
//
//    public static void scrollToElementVisibilityOf(WebDriver coaches, By by) {
//        JavascriptExecutor js = (JavascriptExecutor) coaches;
//
//        boolean bool = false;
//
//
//        while (!bool) {
//            try {
//                coaches.findElement(by);
//                bool = true;
//            } catch (Exception ignore) {
//                js.executeScript("window.scrollBy(0,5000)");
//                try {
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//
//    }


}
