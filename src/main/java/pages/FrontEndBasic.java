package pages;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;



public class FrontEndBasic {
    private final String coachesSection="//*[@id=\"coachesSection\"]/div/div/ul";
    static WebDriver allCoachesList;


    @FindBy (xpath = "//*[@id=\"body\"]/div[1]/main/section[1]/div[3]/div/div/div[1]/div/h1/span[1]")
     private WebElement title;

    @FindBy(xpath = "//*[@id=\"body\"]/div[1]/main/section[1]/div[3]/div/div/div[2]/div/span")
     private WebElement rate;

    @FindBy(xpath = "//*[@id=\"body\"]/div[1]/main/section[2]/div/div/div[1]/div[2]")
     private WebElement description;

    @FindBy(xpath = "//*[@class=\"button -xl -light-blue coaches_action\"]")

    private   WebElement showcoacheslist;


    @FindBy(xpath = "//*[@class=\"coach-card_name\"]")
    private WebElement allcoacheslist;
    @FindBy(xpath = coachesSection )
    WebElement allCoachesSection;



    public FrontEndBasic(WebDriver driver){
        allCoachesList=driver;
        PageFactory.initElements(driver,this);

    }




    public String getCourseTitle() {
        return title.getText();
    }

    public String getCourseRate() {
        return rate.getText();
    }


    public String getCourseDescription(){
        return description.getText();
    }


    public List<String> getCoachesNames(){
        Util.scrollToElementVisibilityOf(allCoachesList, By.xpath(coachesSection));

        List<String>list= new ArrayList<>();
        allCoachesList.findElement( By.xpath("//*[@class=\"button -xl -light-blue coaches_action\"]")).click();
        for (WebElement element: allCoachesList.findElements(By.xpath("//*[@class=\"coach-card_name\"]"))){

            list.add(element.getText());


        }


        return list;
    }



}
