package tests._02_Harun.US_008;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_01 {
    @Test
    public void TermsundConditionsTest(){
        Homepage mealsCenterpage=new Homepage();

        //"https://qa.mealscenter.com/ " sitesine git
        Driver.getDriver().get(ConfigReader.getProperty("mealsUrl"));
        //Asagi in ve Terms und Conditions butonuna Tikla
        JavascriptExecutor jse=(JavascriptExecutor) Driver.getDriver();

        jse.executeScript("arguments[0].scrollIntoView();",mealsCenterpage.TermsundConditions);

        jse.executeScript("arguments[0].click();",mealsCenterpage.TermsundConditions);

        //Terms und Conditions sayfasinin görüldügünü Dogrula
        mealsCenterpage.TermsundConditionsgoruldu.isDisplayed();

        //Sayfayi Kapat
        Driver.closeDriver();



    }
}
