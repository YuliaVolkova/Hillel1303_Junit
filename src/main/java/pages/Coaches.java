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



}
