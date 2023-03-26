package tests._04_Ayten.US_015;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_02 {
    /*
    - Kullanici tarayiciyi acar ve https://qa.mealscenter.com/ sayfasina  giris yapar
     -Sing in butonuna tiklar
     -Kullanici hesabina giris yapar
     -Hesaba giris yaptigini test eder
     -sayfayi kapatir

      The user opens the browser and logs in to https://qa.mealscenter.com/
      -Clicks the Sing in button
     -Logins to the user account
      -Tests the account login
     -closes the page
     */
    Homepage homepage=new Homepage();
    @Test
    public void TC_02(){
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
