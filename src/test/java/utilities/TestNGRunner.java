package utilities;

import com.mongodb.client.model.geojson.LineString;
import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

public class TestNGRunner {
    public static void main(String[] args) {
        TestNG objTNG = new TestNG();

        List<String> suites = new ArrayList<>();
        suites.add("xmlFiles/fromPackage.xml");

        objTNG.setTestSuites(suites);
        objTNG.run();
    }
}
