package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class MainPage {
    WebDriver driver;
    public MainPage(WebDriver driver){
        this.driver=driver;

    }
    By programming= By.xpath("//*[@id=\"body\"]/div[1]/main/section[2]/div/div/div[1]/div/ul/li[1]/a/div");

    public List<String> getListNames(){
        List<String>list= new ArrayList<>();
        driver.findElement(programming).click();

        return list;
    }
}

