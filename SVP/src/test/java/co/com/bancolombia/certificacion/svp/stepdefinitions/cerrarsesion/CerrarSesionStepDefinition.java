package co.com.bancolombia.certificacion.svp.stepdefinitions.cerrarsesion;

import co.com.bancolombia.certificacion.svp.interactions.comunes.Esperar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static co.com.bancolombia.certificacion.svp.interactions.comunes.CerrarSesionSVP.cerrarSesion;
import static co.com.bancolombia.certificacion.svp.models.DatosPrueba.obtener;
import static co.com.bancolombia.certificacion.svp.questions.cerrarsesion.ValidacionDeCierreDeSesion.seCierreLaSesion;
import static co.com.bancolombia.certificacion.svp.tasks.autenticacion.Autenticacion.autenticarseEnLaSVP;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantExcelData.MENSAJE_RESPUESTA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
public class CerrarSesionStepDefinition {

    @Cuando("^el cierra la sesion en la SVP$")
    public void elCierreLaSesionEnLaSVP() {
        theActorInTheSpotlight().attemptsTo(
                autenticarseEnLaSVP(),
                cerrarSesion(),
                Esperar.unTiempo()
        );
    }

    @Entonces("^el deberia ver la pantalla de inicio de sesion\\.$")
    public void elDeberiaVerLaPantallaDeInicioDeSesion() {
        theActorInTheSpotlight().should(seeThat(seCierreLaSesion(), equalTo(obtener(MENSAJE_RESPUESTA))));
    }
}