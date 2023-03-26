package tests._04_Ayten.US_016;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_02 {
    /* The user opens the browser and enters: https://qa.mealscenter.com/
      -Clicks the Sing in button
      -Logs in the user account
      -Tests the account login
      -closes the page

       Kullanici tarayiciyi acar ve: https://qa.mealscenter.com/ sayfasina  giris yapar
      Sing in butonuna tiklar
      Kullanici hesabina giris yapar
      Hesaba giris yaptigini test eder
      sayfayi kapatir
          */

    Homepage homepage=new Homepage();
    @Test
    public  void TC_01(){
        Driver.getDriver().get(ConfigReader.getProperty("homePageUrl"));
        homepage.signInButtonElement.click();

        homepage.usernameCheckbox.sendKeys(ConfigReader.getProperty("userEmail")+ Keys.ENTER);
        homepage.passwordCheckbox.sendKeys(ConfigReader.getProperty("userPassword"));

        homepage.signInButton2.click();

        String expectedUrl="https://qa.mealscenter.com/account/login";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

        Driver.closeDriver();

    }




}
