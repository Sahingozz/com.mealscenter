package tests.US_011_022_033;



import org.testng.annotations.Test;
import utilities.Driver;


public class Amazon {

    @Test(groups = "smoke")
    public void amazon(){
     //   pages.DenemeAmazonPage DenemeAmazonPage= new pages.DenemeAmazonPage();
        Driver.getDriver().get("https://www.amazon.com/");

        Driver.closeDriver();
    }
}
