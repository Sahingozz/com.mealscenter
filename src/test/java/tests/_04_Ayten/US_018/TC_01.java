package tests._04_Ayten.US_018;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_01 {
    /*
     "- The user opens the browser and enters the page: https://qa.mealscenter.com/
     -Clicks the Sing in button
      -Test that the Sign in button is clickable
      -Closes the page"

    - Kullanici tarayiciyi acar ve: https://qa.mealscenter.com/ sayfasina  giris yapar
    -Sing in butonuna tiklar
    -Sign in butonun tiklanabilir oldugu test edilmeli
    -Sayfayi kapatir
     */
 Homepage homepage=new Homepage();
    @Test
    public void TC_01(){
        Driver.getDriver().get(ConfigReader.getProperty("homePageUrl"));
        Assert.assertTrue(homepage.signInButtonElement.isEnabled());
        homepage.signInButtonElement.click();
        Driver.closeDriver();


    }
}
