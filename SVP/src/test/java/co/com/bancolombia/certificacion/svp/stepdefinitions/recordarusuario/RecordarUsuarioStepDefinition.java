package co.com.bancolombia.certificacion.svp.stepdefinitions.recordarusuario;

import co.com.bancolombia.certificacion.svp.questions.recordarusuario.ConfirmacionEnvioCorreo;
import co.com.bancolombia.certificacion.svp.tasks.recordarusuario.Recordar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static co.com.bancolombia.certificacion.svp.questions.comunes.LoSentimos.mensajeLoSentimos;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RecordarUsuarioStepDefinition {

    @Cuando("^el recuerda su usuario en la SVP$")
    public void elRecuerdaSuUsuarioEnLaSVP() {
        theActorInTheSpotlight().attemptsTo(
                Recordar.usuario()
        );
    }

    @Cuando("^el bloquea su usuario por maximo de intentos recuperando la clave$")
    public void elBloqueaSuUsuarioPorMaximoDeIntentosRecuperandoLaClave() {
        theActorInTheSpotlight().attemptsTo(
                Recordar.usuario()
        );
    }

}
