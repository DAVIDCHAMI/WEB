package co.com.bancolombia.certificacion.svp.runners.autenticacion;

import co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass;
import co.com.bancolombia.certificacion.svp.utilities.exceldata.BeforeSuite;
import co.com.bancolombia.certificacion.svp.utilities.exceldata.DataToFeature;
import co.com.bancolombia.certificacion.svp.utilities.runner.RunnerPersonalizado;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@CucumberOptions(
        features = "src/test/resources/features/autenticacion/trn_0369_autenticacion.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "co.com.bancolombia.certificacion.svp.stepdefinitions"
)

@RunWith(RunnerPersonalizado.class)
public class Autenticacion {

    private Autenticacion() {
        throw new IllegalStateException(ConstantTypeClass.RUNNER_CLASS);
    }

    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/autenticacion/");
    }
}

