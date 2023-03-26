package tests._04_Ayten.US_018;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_02 {
    /*
     The user opens the browser and enters the page: https://qa.mealscenter.com/
     -Clicks the Sing in button
    -Tests login to the account from the Sign in section
    -Closes the page


     - Kullanici tarayiciyi acar ve: https://qa.mealscenter.com/ sayfasina  giris yapar
    -Sing in butonuna tiklar
    -Sign in kismindan hesaba giris yapildigini test eder
    -Sayfayi kapatir
     */
    Homepage homepage = new Homepage();

    @Test
    public void TC_01() {
        Driver.getDriver().get(ConfigReader.getProperty("homePageUrl"));
        homepage.signInButtonElement.click();
        homepage.usernameCheckbox.sendKeys(ConfigReader.getProperty("userEmail")+ Keys.ENTER);
        homepage.passwordCheckbox.sendKeys(ConfigReader.getProperty("userPassword"));
        homepage.signInButton2.click();

        String expectedUrl="https://qa.mealscenter.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();


        Driver.closeDriver();

    }
}