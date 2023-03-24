package tests._02_Harun.US_005;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01 {
    @Test
    public void loginTesti(){


        Homepage mealsCenterpage=new Homepage();

        //"https://qa.mealscenter.com/" internet Sitesine Git ve Sign in butonuna Tikla
        // Driver.getDriver().get("https://qa.mealscenter.com/");

        Driver.getDriver().get(ConfigReader.getProperty("homePageUrl"));
        mealsCenterpage.anaEkranSignInButonu.click();

        // Cookies i Kabul et..
        mealsCenterpage.AcceptKabulButonu.click();

        ReusableMethods.sleep(3000);


        //Login Yazisinin Altindaki  Kutucuklari tikla ve Istenilen Bilgileri Doldur
        Actions actions=new Actions(Driver.getDriver());
        actions.click(mealsCenterpage.EmailorTelefonButonu)
                .sendKeys("kenansessiz@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("harun19.")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();

        //Anasayfanin sag üstünde adini Dogrula ve sayfayi kapat
        Driver.closeDriver();
    }
}
