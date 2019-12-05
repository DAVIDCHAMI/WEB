package co.com.bancolombia.certificacion.svp.stepdefinitions.registrarusuario;

import co.com.bancolombia.certificacion.svp.questions.comunes.Mensaje;
import co.com.bancolombia.certificacion.svp.questions.registrarusuario.MensajeRealizarRegistro;
import co.com.bancolombia.certificacion.svp.questions.registrarusuario.RegistroExitoso;
import co.com.bancolombia.certificacion.svp.questions.registrarusuario.RegistroIncorrecto;
import co.com.bancolombia.certificacion.svp.questions.registrarusuario.UsuarioRegistrar;
import co.com.bancolombia.certificacion.svp.tasks.registrarusuario.Registrar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistrarUsuarioStepDefinition {

    @Cuando("^el completa el registro en SVP$")
    public void elCompletaElRegistroEnSVP() {
        theActorInTheSpotlight().attemptsTo(
                Registrar.usuario()
        );
    }

    @Cuando("^el realiza un registro incompleto en SVP$")
    public void elRealizaUnRegistroIncompletoEnSVP() {
        theActorInTheSpotlight().attemptsTo(
                Registrar.usuario()
        );
    }

    @Cuando("^el realiza un registro con diferentes usuarios ya existentes$")
    public void elRealizaUnRegistroConDiferentesUsuariosYaExistentes() {
        theActorInTheSpotlight().attemptsTo(
                Registrar.usuario()
        );
    }

    @Cuando("^el realiza un registro con usuario que ya existe en la SVP$")
    public void elRealizaUnRegistroConUsuarioQueYaExisteEnLaSVP() {
        theActorInTheSpotlight().attemptsTo(
                Registrar.usuario()
        );
    }

    @Cuando("^el realiza un registro con usuario y documento igual en SVP$")
    public void elRealizaUnRegistroConUsuarioYDocumentoIgualEnSVP() {
        theActorInTheSpotlight().attemptsTo(
                Registrar.usuario()
        );
    }

    @Entonces("^el deberia de ver el mensaje informativo para realizar el registro nuevamente$")
    public void elDeberiaDeVerElMensajeInformativoParaRealizarElRegistroNuevamente() {
        theActorInTheSpotlight().should(seeThat(MensajeRealizarRegistro.deNuevo())
        );
    }

}
