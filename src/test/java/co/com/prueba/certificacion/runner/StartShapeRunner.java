package co.com.prueba.certificacion.runner;

import co.com.prueba.certificacion.utils.exceldata.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/startshape.feature",
        glue = "co.com.prueba.certificacion.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class StartShapeRunner {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/startshape.feature");
    }
}
