package tests._01_Miyase.US_001;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

/**
 * This Test Case controlls the following:
 * -Open browser to access the website
 * -Enter the URL ""https://qa.mealscenter.com"" into browser's address bar
 * -Go to Url on your browser to confirm the entered URL and navigate to the website
 * -Verify that it is possible to access the website from different browsers
 * -Once the website's homepage is loaded, ensure that the page is fully loaded
 * -Confirm that you have navigated to the correct page
 * -Click on any available feature on the homepage (such as the ""meals Center"" element)
 * -Close the page
 */
public class TC_01 {
    @Test(priority = 1)
    public void testmealCenterAccessWebsite() {
        Driver.getDriver().get(ConfigReader.getProperty("homePageUrl"));
        String expectedTitle = "Meals Center";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(expectedTitle.contains(actualTitle));
    }
    @Test(priority = 2)
    public void testAccessWebsiteFromDifferentBrowsers() {
        WebDriver driver;

        //Open the website in Chrome
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(ops);
        driver.get(ConfigReader.getProperty("mealUrl"));
        String expectedTitle = "Meals Center";
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        driver.close();

        // // Open the website in Edge
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get(ConfigReader.getProperty("mealUrl"));
        String edgeTitle = driver.getTitle();
        Assert.assertTrue(edgeTitle.contains(expectedTitle));
        driver.close();

        // Open the website in Firefox
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get(ConfigReader.getProperty("mealUrl"));
        String fireFoxTitle = driver.getTitle();
        Assert.assertTrue(fireFoxTitle.contains(expectedTitle));
        driver.close();

    }
}