package tests._04_Ayten.US_010;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_03 {
/*
- Kullanici tarayiciyi acar ve https://qa.mealscenter.com/ sayfasina  giris yapar
-Sing in butonuna tiklar
-Hesabina giris yapar
-Sayfaya giris yaptigini dogrular
-Sayfanin ortasina dogru inilip “Join us” linkine tiklar
-”Become Restaurant partner” yazisinin gorunur oldugu test eder
-Sayfayi kapatir


 - The user opens the browser and logs in to the https://qa.mealscenter.com/ page
 -Clicks the Sing in button
 -Logs in to their account
 -Verifies that they are logged into the page
 -Downloads to the middle of the page and clicks on the "Join us" link
 - Click the "Become Restaurant partner" text Tests that it is visible
 -Closes the page
 */
   public Homepage homepage=new Homepage();
   Actions actions=new Actions(Driver.getDriver());
   WebElement element;
 @Test
 public void TC_03(){
     Driver.getDriver().get(ConfigReader.getProperty("homePageUrl"));

     homepage.signInButtonElement.click();
     homepage.usernameCheckbox.sendKeys(ConfigReader.getProperty("userEmail")+ Keys.ENTER);
     homepage.passwordCheckbox.sendKeys(ConfigReader.getProperty("userPassword"));
     homepage.signInButton2.click();

     String expectedTitle="Meals Center";
     String actualTitle=Driver.getDriver().getTitle();
     Assert.assertTrue(actualTitle.contains(expectedTitle));


     actions.sendKeys(Keys.PAGE_DOWN);

     actions.moveToElement(homepage.joinUsLink).build().perform();
   //  homepage.cookiesElement.click();
   // homepage.joinUsLink.click();
    Assert.assertTrue(homepage.becomeRestauranPartnerText.isDisplayed());

 }





}
