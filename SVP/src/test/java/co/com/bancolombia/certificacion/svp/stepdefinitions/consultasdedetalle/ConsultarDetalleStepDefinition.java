package co.com.bancolombia.certificacion.svp.stepdefinitions.consultasdedetalle;

import co.com.bancolombia.certificacion.svp.tasks.consultardetalle.ConsultasFondosInversion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static co.com.bancolombia.certificacion.svp.questions.consultasdetalle.CaracteristicasDeCrediagil.lasCaracteristicasDeCrediagil;
import static co.com.bancolombia.certificacion.svp.questions.consultasdetalle.CaracteristicasDeCuentasAhorro.visualizaLosDetallesDeCuentasAhorro;
import static co.com.bancolombia.certificacion.svp.questions.consultasdetalle.CaracteristicasDeCuentasCorriente.lasCaracteristicasDeLasCuentasCorriente;
import static co.com.bancolombia.certificacion.svp.questions.consultasdetalle.CaracteristicasDeCuentasCreditos.lasCaracteristicasDeLosCreditos;
import static co.com.bancolombia.certificacion.svp.questions.consultasdetalle.CaracteristicasDeFondosInversion.lasCaracteristicasDeFondosInversion;
import static co.com.bancolombia.certificacion.svp.questions.consultasdetalle.CaracteristicasDeInversione.lasCaracteristicaDeInversiones;
import static co.com.bancolombia.certificacion.svp.questions.consultasdetalle.CaracteristicasDeTarjetasCredito.lasCaracteristicasDeLasTarjetasDeCredito;
import static co.com.bancolombia.certificacion.svp.tasks.consultardetalle.ConsultasCrediagil.consultarDetalleCrediagil;
import static co.com.bancolombia.certificacion.svp.tasks.consultardetalle.ConsultasCredito.consultaDetalleCredito;
import static co.com.bancolombia.certificacion.svp.tasks.consultardetalle.ConsultasCuentaAhorro.consultaDetalleCuentasDeAhorro;
import static co.com.bancolombia.certificacion.svp.tasks.consultardetalle.ConsultasCuentasCorriente.consultaDeDetalleCuentasCorriente;
import static co.com.bancolombia.certificacion.svp.tasks.consultardetalle.ConsultasInversiones.consultarDetalleInversiones;
import static co.com.bancolombia.certificacion.svp.tasks.consultardetalle.ConsultasTarjetasCredito.consultarDetalleTarjetaCredito;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultarDetalleStepDefinition {

    @Entonces("^el deberia de ver el detalle de la cuenta de ahorro$")
    public void elDeberiaDeVerElDetalleDeLaCuentaDeAhorro() {
        theActorInTheSpotlight().should(seeThat(visualizaLosDetallesDeCuentasAhorro()));
    }

    @Entonces("^el deberia de ver el detalle de la cuenta corriente$")
    public void elDeberiaDeVerElDetalleDeLaCuentaCorriente() {
        theActorInTheSpotlight().should(seeThat(lasCaracteristicasDeLasCuentasCorriente()));
    }

    @Entonces("^el deberia de ver el detalle  de crediagil$")
    public void elDeberiaDeVerElDetalleDeCrediagil() {
        theActorInTheSpotlight().should(seeThat(lasCaracteristicasDeCrediagil()));
    }

    @Entonces("^el deberia de ver el detalle del credito$")
    public void elDeberiaDeVerElDetalleDelCredito() {
        theActorInTheSpotlight().should(seeThat(lasCaracteristicasDeLosCreditos()));
    }

    @Entonces("^el deberia de ver el detalle  de fondos de inversion$")
    public void elDeberiaDeVerElDetalleDeFondosDeInversion() {
        theActorInTheSpotlight().should(seeThat(lasCaracteristicasDeFondosInversion()));
    }

    @Entonces("^el deberia de ver el detalle  de inversiones virtuales$")
    public void elDeberiaDeVerElDetalleDeInversionesVirtuales() {
        theActorInTheSpotlight().should(seeThat(lasCaracteristicaDeInversiones()));
    }

    @Entonces("^el deberia de ver el detalle de la tarjeta de credito$")
    public void elDeberiaDeVerElDetalleDeLaTarjetaDeCredito() {
        theActorInTheSpotlight().should(seeThat(lasCaracteristicasDeLasTarjetasDeCredito()));
    }

    @Cuando("^consulta el detalle de la cuenta de ahorro$")
    public void consultaElDetalleDeLaCuentaDeAhorro() {
        theActorInTheSpotlight().attemptsTo(consultaDetalleCuentasDeAhorro());
    }

    @Cuando("^consulta el detalle de la cuenta corriente$")
    public void consultaElDetalleDeLaCuentaCorriente() {
        theActorInTheSpotlight().attemptsTo(consultaDeDetalleCuentasCorriente());
    }

    @Cuando("^consulta el detalle del credito$")
    public void consultaElDetalleDelCredito() {
        theActorInTheSpotlight().attemptsTo(consultaDetalleCredito());
    }

    @Cuando("^consulta el detalle de la tarjeta de credito$")
    public void consultaElDetalleDeLaTarjetaDeCredito() {
        theActorInTheSpotlight().attemptsTo(consultarDetalleTarjetaCredito());
    }

    @Cuando("^consulta el detalle del fondo de inversion$")
    public void consultaElDetalleDelFondoDeInversion() {
        theActorInTheSpotlight().attemptsTo(ConsultasFondosInversion.consultarDetalleFondosInversion());
    }

    @Cuando("^consulta el detalle inversiones virtuales$")
    public void consultaElDetalleInversionesVirtuales() {
        theActorInTheSpotlight().attemptsTo(consultarDetalleInversiones());
    }

    @Cuando("^consulta el detalle de crediagil$")
    public void consultaElDetalleDeCrediagil() {
        theActorInTheSpotlight().attemptsTo(consultarDetalleCrediagil());
    }
}