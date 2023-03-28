package tests._04_Ayten.US_015;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_01 {
    /*
    - The user opens the browser and enters the page: https://qa.mealscenter.com/
    -Clicks the Sing in button
    -The user confirms that the Sign in button is clickable
    -The user closes the page


    - Kullanici tarayiciyi acar ve: https://qa.mealscenter.com/ sayfasina  giris yapar
   -Sing in butonuna tiklar
   -Kulanici Sign in butonun tiklanabilir oldugunu dogrular
   -Kullanici sayfayi kapatir
     */
    Homepage homepage=new Homepage();
    WebElement element;
    @Test
    public void TC_01(){
        Driver.getDriver().get(ConfigReader.getProperty("homePageUrl"));

        homepage.signInButtonElement.click();
        Assert.assertTrue(homepage.signInButtonElement.isEnabled());
        Driver.closeDriver();
    }
}
