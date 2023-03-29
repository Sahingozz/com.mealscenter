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
import utilities.TestBaseReport;

/**
 * This Test Case controlls the following:
 * -Open browser to access the website
 * -Enter the URL ""https://qa.mealscenter.com"" into browser's address bar
 * -Go to Url on your browser to confirm the entered URL
 * -Verify that it is possible to access the website from different browsers
 * -Close the page
 */
public class TC_02 extends TestBaseReport{

    @Test
    public void testAccessWebsiteFromDifferentBrowsers() {
        extentTest= extentReports.createTest("US_001-TC_02", "Go To Homepage from various Browsers");
        WebDriver driver;

        //Open the website in Chrome
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(ops);
        driver.get(ConfigReader.getProperty("homePageUrl"));
        String expectedTitle = "Meals Center";
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        driver.quit();

        // // Open the website in Edge
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get(ConfigReader.getProperty("homePageUrl"));
        String edgeTitle = driver.getTitle();
        Assert.assertTrue(edgeTitle.contains(expectedTitle));
        driver.quit();

        // Open the website in Firefox
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get(ConfigReader.getProperty("homePageUrl"));
        String fireFoxTitle = driver.getTitle();
        Assert.assertTrue(fireFoxTitle.contains(expectedTitle));
        driver.quit();
        extentTest.pass("Test pass");
    }
}