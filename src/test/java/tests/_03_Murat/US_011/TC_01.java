package tests._03_Murat.US_011;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01 {


    Homepage homepage=new Homepage();
    private ReusableMethods reausableMethods;

  @Test
    private void TC_01(){

      // 1* User goes to https://qa.mealscenter.com/ homepage

      Driver.getDriver().get(ConfigReader.getProperty("mealUrl"));

      // 2* User presses the sign in button and writes the mail and password.

      homepage.signInButton.click();
      Actions actions = new Actions(Driver.getDriver());
      actions.sendKeys(homepage.eMailButton)
              .sendKeys("m.korkmaz4606@gmail.com")
              .sendKeys(Keys.TAB)
              .sendKeys("Murat3656.").perform();

      // 3* User confirms Sign in button."

      homepage.signInButtonConfirm.click();

      // 4* press the cookies button

      homepage.cookiesButton.click();

      // 5* User closes the page.

      Driver.getDriver().close();
  }
}
