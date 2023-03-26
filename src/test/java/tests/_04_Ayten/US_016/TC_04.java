package tests._04_Ayten.US_016;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_04 {
    /*

       The user opens the browser and logs in to the page: https://qa.mealscenter.com/
       -Clicks the Sing in button
        -Logins to the user account
        -Tests that he has logged into the account
         -The user clicks the address text in the My account menu and logs in to the page
         -”Add Tests that the text "new adress" is visible
         -Clicks the Add new adresses button
         -Verifies the visibility of the Change Adresses text
          -Enters new address information, fills in the relevant places and clicks the Save button
           -Tests the visibility of the newly entered address information
           -Clicks the Edit button and changes the address information and clicks the save button
           -presses the delete button
           -”Are you sure you want to continue? Confirms that "" appears
           - clicks "Yes"
           - closes the page


        - Kullanici tarayiciyi acar ve: https://qa.mealscenter.com/ sayfasina  giris yapar
        -Sing in butonuna tiklar
      -Kullanici hesabina giris yapar
         -Hesaba giris yaptigini test eder
        -Kullanici My account menusunden Adres yazisini tiklar ve sayfaya giris yapar
      -”Add new adress” yazisinin gorunur oldugunu test eder
       -Add new adresses butonuna tiklar
      - Change adresses yazisinin gorunurlulugunu dogrular
       -Yeni adress bilgisi girer ,ilgili yerleri doldurur ve Save butonuna tiklar
      -Yeni girilen adress bilgilerinin gorunurlulugunu test eder
       -Edit tusuna tiklar ve adres bilgilerinde degisiklik yapar ve save butonuna tiklar
       -Delete  tusuna basar
       -”Are you sure you want to continue? “ yazisinin gorundugunu dogrular
      -”Yes” butonuna tiklar
     -sayfayi kapatir
          */
    Homepage homepage = new Homepage();

    @Test
    public void TC_01() {
        Driver.getDriver().get(ConfigReader.getProperty("homePageUrl"));
        homepage.signInButtonElement.click();

        homepage.usernameCheckbox.sendKeys(ConfigReader.getProperty("userEmail") + Keys.ENTER);
        homepage.passwordCheckbox.sendKeys(ConfigReader.getProperty("userPassword"));

        homepage.signInButton2.click();

       // String expectedUrl = "https://qa.mealscenter.com/";
       // String actualUrl = Driver.getDriver().getCurrentUrl();
       // Assert.assertEquals(expectedUrl, actualUrl);
        ReusableMethods.wait(3);
        homepage.dropdownMenuLink.click();
        Assert.assertTrue(homepage.adressesLink.isDisplayed());
        WebElement adressesLink = homepage.adressesLink;
        ReusableMethods.waitAndClick(adressesLink);
        Assert.assertTrue(homepage.addNewAdressButton.isDisplayed());
        homepage.addNewAdressButton.click();

        Assert.assertTrue(homepage.changeAdressText.isDisplayed());
          homepage.enterDeliveryAddressbutton.click();
       // Actions actions = new Actions(Driver.getDriver());//actions.click(homepage.changeAdressText);
        homepage.enterDeliveryAddressbutton.sendKeys("United States" + Keys.ENTER);
        ReusableMethods.wait(3);
        homepage.unitedStatesHolocaustMemorialMuseumtext.click();
        WebElement deliveryOptionsDropdown=homepage.deliveryOptionsDropdown;
        Select select=new Select(deliveryOptionsDropdown);
        select.selectByVisibleText("Hand it to me");
        homepage.saveButton.click();
        ReusableMethods.wait(3);
        Assert.assertTrue(homepage.adressInformation.isDisplayed());
      homepage.editbutton.click();
      select.selectByVisibleText("Leave it at my door");
      homepage.saveButton.click();
      homepage.deleteButton.click();
      ReusableMethods.wait(3);
      Assert.assertTrue(homepage.areYouSureYouWantToContinueText.isDisplayed());
      homepage.yesButton.click();
       Driver.closeDriver();
    }
}