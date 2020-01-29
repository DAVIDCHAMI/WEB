package co.com.bancolombia.certificacion.svp.stepdefinitions.consultapagos;

import cucumber.api.java.es.Entonces;

import static co.com.bancolombia.certificacion.svp.questions.consultasdepagos.ConsultaDePagos.pagosDisponibles;
import static co.com.bancolombia.certificacion.svp.questions.consultasdepagos.MensajeConsultaDePagosNoTieneElProducto.mensajeProductoNoDisponible;
import static co.com.bancolombia.certificacion.svp.questions.consultasdepagos.MensajeCreditosOcultos.mensajeCreditosOcultos;
import static co.com.bancolombia.certificacion.svp.questions.consultasdepagos.MensajeNoTieneCreditosYTarjetas.mensajeNoTieneTarjetasYCreditos;
import static co.com.bancolombia.certificacion.svp.questions.consultasdepagos.MensajeTarjetasDeCreditoOcultas.mensajeTarjetaCreditoOculto;
import static co.com.bancolombia.certificacion.svp.questions.consultasdepagos.MensajeTodosLosProductosOcultos.mensajeTodosLosProductosOcultos;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultaPagosStepDefinition {

    @Entonces("^el deberia de ver los productos que tienen pagos disponibles$")
    public void elDeberiaDeVerLosProductosQueTienenPagosDisponibles() {
        theActorInTheSpotlight().should(seeThat(pagosDisponibles()));
    }

    @Entonces("^el deberia de observar mensaje Usted no tiene (.*)$")
    public void elDeberiaDeObservarMensajeUstedNoTieneCredito(String producto) {
        theActorInTheSpotlight().should(seeThat(mensajeProductoNoDisponible(producto)));
    }

    @Entonces("^el deberia de observar mensaje Actualmente la informacion de sus productos no se encuentra disponible (.*)$")
    public void elDeberiaDeObservarMensajeActualmenteLaInformacionDeSusProductosNoSeEncuentraDisponibleTarjetasDeCreditos(String producto) {
        theActorInTheSpotlight().should(seeThat(mensajeProductoNoDisponible(producto)));
    }

    @Entonces("^el deberia de ver mensaje de (.*)$")
    public void elDeberiaDeVerMensajeDeTarjetasDeCreditoOcultos(String producto) {
        theActorInTheSpotlight().should(seeThat(mensajeTarjetaCreditoOculto(producto)));
    }

    @Entonces("^el deberia de observar mensaje de (.*)$")
    public void elDeberiaDeObservarMensajeDeCreditoOculto(String producto) {
        theActorInTheSpotlight().should(seeThat(mensajeCreditosOcultos(producto)));
    }

    @Entonces("^el deberia de ver todos los productos ocultos$")
    public void elDeberiaDeVerTodosLosProductosOcultos() {
        theActorInTheSpotlight().should(seeThat(mensajeTodosLosProductosOcultos()));
    }

    @Entonces("^el deberia de ver mensajes no tiene los productos$")
    public void elDeberiaDeVerMensajesNoTieneLosProductos() {
      theActorInTheSpotlight().should(seeThat(mensajeNoTieneTarjetasYCreditos()));
    }
}