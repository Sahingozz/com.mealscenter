package tests._04_Ayten.US_010;


import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class TC_01 {
    /*
   - Kullanici tarayiciyi acar ve https://qa.mealscenter.com/ sayfasina  giris yapar
    -Anasayfaya giris yaptigini test eder
    -Sing in butonuna tiklar
    -Hesabina giris yapar
    -Sayfayi kapatir



     - User opens browser and enters https://qa.mealscenter.com/
      -Tests login to the homepage
      -Click the Sing in button
      -Logs into your account
      -Closes the page
     */
       Homepage homepage=new Homepage();
     @Test
     public  void TC_01() throws IOException {
       //ReusableMethods.getScreenShotFullScreen(Driver.getDriver());
          Driver.getDriver().get(ConfigReader.getProperty("homePageUrl"));
          homepage.signInButtonElement.click();
         //WebDriverWait wait=new WebDriverWait( Driver.getDriver(),Duration.ofSeconds(40));
         //wait.until(ExpectedConditions.visibilityOf(homepage.usernameCheckbox));
          homepage.usernameCheckbox.sendKeys(ConfigReader.getProperty("userEmail")+ Keys.ENTER);
          homepage.passwordCheckbox.sendKeys(ConfigReader.getProperty("userPassword"));



         String expectedUrl="https://qa.mealscenter.com/account/login";
         String actualUrl=Driver.getDriver().getCurrentUrl();
         Assert.assertEquals(expectedUrl,actualUrl);
         homepage.signInButton2.click();

       Driver.closeDriver();

}
}
