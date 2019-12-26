package co.com.bancolombia.certificacion.svp.stepdefinitions.consultapagos;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static co.com.bancolombia.certificacion.svp.questions.consultasdepagos.ConsultaDePagos.pagosDisponibles;
import static co.com.bancolombia.certificacion.svp.questions.consultasdepagos.ConsultaPagosCreditos.pagosDisponiblesDeCreditos;
import static co.com.bancolombia.certificacion.svp.questions.consultasdepagos.MensajeConsultaDePagosDeCreditos.*;
import static co.com.bancolombia.certificacion.svp.questions.consultasdepagos.MensajeConsultaDePagosTarjetaCreditos.mensajeProductoNoDisponible;
import static co.com.bancolombia.certificacion.svp.tasks.consultapagos.ConsultaPagosCreditos.consultarLosPagosDeCreditos;
import static co.com.bancolombia.certificacion.svp.tasks.consultapagos.ConsultaPagosTrajetasCreditos.consultarLosPagosDeTarjetasDeCreditos;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultaPagosStepDefinition  {

    @Cuando("^consulta los pagos de tarjetes de creditos$")
    public void consultaLosPagosDeTarjetesDeCreditos() {
        theActorInTheSpotlight().attemptsTo(consultarLosPagosDeTarjetasDeCreditos());
    }

    @Entonces("^el deberia de ver los productos que tienen pagos disponibles$")
    public void elDeberiaDeVerLosProductosQueTienenPagosDisponibles() {
        theActorInTheSpotlight().should(seeThat(pagosDisponibles()));
    }

    @Cuando("^consulta los pagos de creditos$")
    public void consultaLosPagosDeCreditos() {
        theActorInTheSpotlight().attemptsTo(consultarLosPagosDeCreditos());
    }

    @Entonces("^el deberia de ver los creditos que tienen pagos disponibles$")
    public void elDeberiaDeVerLosCreditosQueTienenPagosDisponibles() {
        theActorInTheSpotlight().should(seeThat(pagosDisponiblesDeCreditos()));
    }

    @Entonces("^el deberia de observar mensaje Usted no tiene credito$")
    public void elDeberiaDeObservarMensajeUstedNoTieneCredito() {
        theActorInTheSpotlight().should(seeThat(mensajeUstedNoTienePagosDeCreditos()));
    }

    @Entonces("^el deberia de observar mensaje Actualmente la informacion de sus productos no se encuentra disponible$")
    public void elDeberiaDeObservarMensajeActualmenteLaInformacionDeSusProductosNoSeEncuentraDisponible() {
        theActorInTheSpotlight().should(seeThat(mensajeProductoNoDisponible()));
    }
}
