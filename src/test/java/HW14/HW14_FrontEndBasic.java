package HW14;

import configuration.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.Coaches;
import pages.FrontEndBasic;

import java.util.List;



public class HW14_FrontEndBasic extends BaseClass {

    static FrontEndBasic frontEndBasic=null;
     static FrontEndBasic allcoacheslist;

    @BeforeClass
    public static void startPage(){
        driver.get("https://dnipro.ithillel.ua/courses/front-end-basic");
        frontEndBasic= PageFactory.initElements(driver, FrontEndBasic.class);
        allcoacheslist= new FrontEndBasic(driver);
    }

    @Test
    public void testTitle(){
        System.out.println(frontEndBasic.getCourseTitle());


    }
    @Test
    public void testCourseRate(){
        System.out.println(frontEndBasic.getCourseRate());
    }

    @Test
    public void testCourseDescription(){
        System.out.println(frontEndBasic.getCourseDescription());
    }

    @Test
    public void showCoaches()  {


        List<String> Names= allcoacheslist.getCoachesNames();
        for (int i=0; i<Names.size();i++){
            System.out.println(Names.get(i));
        }
    }

}
