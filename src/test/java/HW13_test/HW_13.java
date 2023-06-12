package HW13_test;

import configuration.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.Coaches;
import pages.MainPage;
import pages.Programming;
import pages.Util;

import java.util.List;



public class HW_13 extends BaseClass {
    static MainPage mainPage;
    static Programming programmingList;
    static Coaches allCoachesList;

    @BeforeClass
    public static void startSite() {
        driver.get("https://ithillel.ua/");
        mainPage = new MainPage(driver);
        programmingList = new Programming(driver);
        allCoachesList= new Coaches(driver);
    }


    @Test
    public void selectProgramming() {
        System.out.println(mainPage.getListNames());

    }

    @Test
    public void selectFrontEndBasic() throws InterruptedException {
        System.out.println(programmingList.getListNames());
        Thread.sleep(1000);


    }

    @Test
    public void showCoaches(){


        List<String>Names= allCoachesList.getCoashesNames();
        for (int i=0; i<Names.size();i++){
            System.out.println(Names.get(i));
        }
    }


}









