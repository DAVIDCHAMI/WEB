package co.com.bancolombia.certificacion.svp.runners.cerrarsesion;

import co.com.bancolombia.certificacion.svp.utilities.exceldata.BeforeSuite;
import co.com.bancolombia.certificacion.svp.utilities.exceldata.DataToFeature;
import co.com.bancolombia.certificacion.svp.utilities.runner.RunnerPersonalizado;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass.RUNNER_CLASS;

@CucumberOptions(
        features = "src/test/resources/features/cerrarsesion/cerrar_sesion.feature",
        glue = {
                "co.com.bancolombia.certificacion.svp.stepdefinitions.autenticacion",
                "co.com.bancolombia.certificacion.svp.stepdefinitions.comunes",
                "co.com.bancolombia.certificacion.svp.stepdefinitions.cerrarsesion"
        },
        snippets = SnippetType.CAMELCASE
)
@RunWith(RunnerPersonalizado.class)
public class CerrarSesion {

    private CerrarSesion() {
        throw new IllegalStateException(RUNNER_CLASS);
    }

    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/cerrarsesion/");
    }
}