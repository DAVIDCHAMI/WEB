package co.com.bancolombia.certificacion.svp.runners.transferencias;

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
        features = "src/test/resources/features/transferencias/trn_0438_0538_transferencia_entre_cuentas_bancolombia.feature",
        snippets = SnippetType.CAMELCASE,
        glue = {"co.com.bancolombia.certificacion.svp.stepdefinitions.autenticacion",
                "co.com.bancolombia.certificacion.svp.stepdefinitions.communes",
                "co.com.bancolombia.certificacion.svp.stepdefinitions.transferencias"},
        plugin = {"json:target/cucumber_json/cucumber.json"}
)

@RunWith(RunnerPersonalizado.class)
public class TransferenciaEntreCuentasBancolombia {

    private TransferenciaEntreCuentasBancolombia() {
        throw new IllegalStateException(ConstantTypeClass.RUNNER_CLASS);
    }

    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/transferencias/");
    }
}

