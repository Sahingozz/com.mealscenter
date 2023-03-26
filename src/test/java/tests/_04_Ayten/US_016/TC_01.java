package tests._04_Ayten.US_016;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_01 {
    /*
         - User opens browser and enters https://qa.mealscenter.com/
         -Tests login to the homepage
         -Click the Sing in button
         -Logins to user account
         -closes the page


    - Kullanici tarayiciyi acar ve https://qa.mealscenter.com/ sayfasina  giris yapar
    -Anasayfaya giris yaptigini test eder
    -Sing in butonuna tiklar
    -Kullanici hesabina giris yapar
    -sayfayi kapatir
           */

    Homepage homepage=new Homepage();
    @Test
    public  void TC_01(){
        Driver.getDriver().get(ConfigReader.getProperty("homePageUrl"));
        homepage.signInButtonElement.click();
        String expectedUrl="https://qa.mealscenter.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        homepage.usernameCheckbox.sendKeys(ConfigReader.getProperty("userEmail")+ Keys.ENTER);
        homepage.passwordCheckbox.sendKeys(ConfigReader.getProperty("userPassword"));

        homepage.signInButton2.click();

        Driver.closeDriver();

    }
}
