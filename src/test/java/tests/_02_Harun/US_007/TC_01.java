package tests._02_Harun.US_007;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.Homepage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01 {
    @Test
    public void ContactUsTest(){
        Homepage mealsCenterpage=new Homepage();

        //- "https://qa.mealscenter.com/" sitesine gidilebilmeli
        Driver.getDriver().get("https://qa.mealscenter.com/");

        //Cookies i kabul et
        Actions actions=new Actions(Driver.getDriver());
        mealsCenterpage.AcceptKabulButonu.click();


        //Sayfada belirli bir ikona ulasmak icin kullanilan yöntem.

        //Mausun tekerini döndürmek icin scrollInto..
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",mealsCenterpage.ContactUs);

        ReusableMethods.sleep(3);




        //- Ana Sayfanin en altindaki Contact Us kismina gel ve tikla
        //mealsCenterpage.ContactUs.click();
        //belirlenen koda tiklamak icin
        jse.executeScript("arguments[0].click();",mealsCenterpage.ContactUs);

        //- Contact Us sayfasinin Görüldügünü dogrula
        String ContactUsUrl=Driver.getDriver().getCurrentUrl();
        System.out.println(ContactUsUrl);

        mealsCenterpage.ContactUSGorundu.isDisplayed();   // ??

        //- sayfayi kapat
        Driver.getDriver().close();


    }
}
