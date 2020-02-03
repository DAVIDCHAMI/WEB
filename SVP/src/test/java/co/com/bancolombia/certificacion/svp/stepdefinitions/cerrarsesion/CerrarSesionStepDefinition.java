package co.com.bancolombia.certificacion.svp.stepdefinitions.cerrarsesion;

import cucumber.api.java.es.Entonces;

import static co.com.bancolombia.certificacion.svp.models.DatosPrueba.obtener;
import static co.com.bancolombia.certificacion.svp.questions.cerrarsesion.ValidacionDeCierreDeSesion.seCierreLaSesion;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantExcelData.MENSAJE_RESPUESTA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
public class CerrarSesionStepDefinition {

    @Entonces("^el deberia ver la sesion cerrada\\.$")
    public void elDeberiaVerLaSesionCerrada() {
        theActorInTheSpotlight().should(seeThat(seCierreLaSesion(), equalTo(obtener(MENSAJE_RESPUESTA))));
    }
}