
package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestBaseReport {

    protected static ExtentReports extentReports; //extent report'a ilk atamayi yapar
    protected static ExtentTest extentTest; // test pass veya failed gibi bilgileri kaydeder. Ayrica ekran resmi icin de kullaniriz
    protected static ExtentHtmlReporter extentHtmlReporter; // Html raporu duzenler
    // Test işlemine başlamadan hemen önce (test methodundan önce değil, tüm test işleminden önce)
    @BeforeTest(alwaysRun = true) // alwaysRun : her zaman çalıştır.
    public void setUpTest() {
        extentReports = new ExtentReports(); // Raporlamayi baslatir
        //rapor oluştuktan sonra raporunuz nereye eklensin istiyorsanız buraya yazıyorsunuz.
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());


        String filePathasan = System.getProperty("user.dir") + "/report-US-hasan_34-35-36-37/Rapor"+"US_00_TC_001"+".html";
        //oluşturmak istediğimiz raporu (html formatında) başlatıyoruz, filePath ile dosya yolunu belirliyoruz.
        extentHtmlReporter = new ExtentHtmlReporter(filePathasan );

        String filePathSaid = System.getProperty("user.dir") + "/reports_said_US_030_033/Rapor"+packageName()+"_"+className()+".html";


        String filePathErsin = System.getProperty("user.dir") + "/reports_Ersin_US_026_027_028_29/Rapor"+packageName()+"_"+className()+".html";

        //String filePathErsin = System.getProperty("user.dir") + "/reports_Ersin_US_026_027_028_29/Rapor"+"US_26_TC_01"+".html";
        //String filePathasan = System.getProperty("user.dir") + "/reports_Ersin_US_026_027_028_29/Rapor"+"US_26_TC_01"+".html";





        String filePath = System.getProperty("user.dir") + "/report_US_011_012_013_014_Murat/Rapor"+"US_014_TC_10"+".html";






        //oluşturmak istediğimiz raporu (html formatında) başlatıyoruz, filePath ile dosya yolunu belirliyoruz.
        extentHtmlReporter = new ExtentHtmlReporter(filePathErsin);
        extentHtmlReporter = new ExtentHtmlReporter(filePathSaid);

        extentReports.attachReporter(extentHtmlReporter);
        // İstediğiniz bilgileri buraya ekeyebiliyorsunuz.
        extentReports.setSystemInfo("Enviroment","QA");
        extentReports.setSystemInfo("Browser", ConfigReader.getProperty("browser")); // chrome, firefox
        extentReports.setSystemInfo("Automation Engineer", "Hasan Adiguzel");
        extentHtmlReporter.config().setDocumentTitle("Ilk Test");
        extentHtmlReporter.config().setReportName("TestNG Reports");
    }
    // Her test methodundan sonra eğer testte hata varsa, ekran görüntüsü alıp rapora ekliyor
    @AfterMethod(alwaysRun = true)
    public void tearDownMethod(ITestResult result) throws IOException, IOException {
        if (result.getStatus() == ITestResult.FAILURE) { // eğer testin sonucu başarısızsa
            String screenshotLocation = ReusableMethods.getScreenshot(result.getName());
            extentTest.fail(result.getName());
            extentTest.addScreenCaptureFromPath(screenshotLocation);
            extentTest.fail(result.getThrowable());
        } else if (result.getStatus() == ITestResult.SKIP) { // eğer test çalıştırılmadan geçilmezse
            extentTest.skip("Test Case is skipped: " + result.getName()); // Ignore olanlar
        }


        // Driver.closeDriver();

    }
    // Raporlandırmayı sonlandırmak icin
    @AfterTest(alwaysRun = true)
    public void tearDownTest() {
        extentReports.flush();
    }

    public String className(){
        String className= getClass().getSimpleName();
        return className;
    }
    public String packageName(){
        String packageName= getClass().getPackage().getName();
        return packageName;
    }
}
