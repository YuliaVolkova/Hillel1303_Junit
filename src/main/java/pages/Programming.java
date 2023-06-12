package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Programming {
    WebDriver driver;
    public Programming(WebDriver driver){

        this.driver=driver;
    }

    By programmingList=By.xpath("//*[@id=\"categories\"]/div[3]/div/ul/li[1]/div/div[1]/ul/li[1]/a");

    public  List<String> getListNames(){
        List<String>list=new ArrayList<>();
        driver.findElement(programmingList).click();

        return list;
    }
}
