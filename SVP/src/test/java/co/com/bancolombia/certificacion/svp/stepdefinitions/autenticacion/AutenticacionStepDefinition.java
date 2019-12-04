package co.com.bancolombia.certificacion.svp.stepdefinitions.autenticacion;

import co.com.bancolombia.certificacion.svp.questions.autenticacion.PantallaInicioSVP;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static co.com.bancolombia.certificacion.svp.questions.autenticacion.Clave.mensajeClaveBloqueada;
import static co.com.bancolombia.certificacion.svp.questions.autenticacion.Mensaje.mensajeClaveInvalida;
import static co.com.bancolombia.certificacion.svp.questions.autenticacion.UsuarioRegistrado.mensajeUsuarioRegistrado;
import static co.com.bancolombia.certificacion.svp.tasks.autenticacion.Autenticacion.autenticarseEnLaSVP;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutenticacionStepDefinition {

    @Cuando("^el realiza la autenticacion en la SVP$")
    public void elRealizaLaAutenticacionEnLaSVP() {
        theActorInTheSpotlight().attemptsTo(
                autenticarseEnLaSVP()
        );
    }

    @Cuando("^el realiza la autenticacion en la SVP con clave invalida$")
    public void elRealizaLaAutenticacionEnLaSVPConClaveInvalida() {
        theActorInTheSpotlight().attemptsTo(
                autenticarseEnLaSVP()
        );
    }

    @Entonces("^el deberia de ver un mensaje (.*)$")
    public void elDeberiaDeVerUnMensajeUsuarioOClaveInvalidaIntentaloNuevamente(String mensaje) {
        theActorInTheSpotlight().should(seeThat(mensajeUsuarioRegistrado()));
    }


    @Cuando("^el realiza la autenticacion en la SVP con clave bloqueada$")
    public void elRealizaLaAutenticacionEnLaSVPConClaveBloqueada() {
        theActorInTheSpotlight().attemptsTo(
                autenticarseEnLaSVP()
        );
    }

    @Cuando("^el realiza la autenticacion en la SVP con usuario inexistente$")
    public void elRealizaLaAutenticacionEnLaSVPConUsuarioInexistente() {
        theActorInTheSpotlight().attemptsTo(
                autenticarseEnLaSVP()
        );
    }

    @Entonces("^el deberia de ver la pantalla de inicio de la SVP$")
    public void elDeberiaDeVerLaPantallaDeInicioDeLaSVP() {
        theActorInTheSpotlight().should(seeThat(
                PantallaInicioSVP.esVisible())
        );
    }





    @Entonces("^el deberia de ver un mensaje de clave bloqueada$")
    public void elDeberiaDeVerUnMensajeDeClaveBloqueada() {
        theActorInTheSpotlight().should(seeThat(
                mensajeClaveBloqueada())
        );
    }

    @Entonces("^el deberia de ver un mensaje de (.*)$")
    public void elDeberiaDeVerUnMensajeDeUsuarioOClaveInvalidaPorFavorIntenteDeNuevo(String mensaje) {
        theActorInTheSpotlight().should(seeThat(
                mensajeClaveInvalida())
        );
    }
}