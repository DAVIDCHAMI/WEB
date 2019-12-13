package co.com.bancolombia.certificacion.svp.stepdefinitions.consultasdedetalle;





import co.com.bancolombia.certificacion.svp.questions.consultasdetallecuentas.CaracteristicasDeCuentasCreditos;
import co.com.bancolombia.certificacion.svp.questions.consultasdetallecuentas.CaracteristicasDeTarjetasCredito;
import co.com.bancolombia.certificacion.svp.tasks.consultardetalle.ConsultasCredito;
import co.com.bancolombia.certificacion.svp.tasks.consultardetalle.ConsultasTarjetasCredito;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;



import static co.com.bancolombia.certificacion.svp.questions.consultasdetallecuentas.CaracteristicasDeCuentasAhorro.lasCaracteristicasDeLasCuentasAhorro;

import static co.com.bancolombia.certificacion.svp.questions.consultasdetallecuentas.CaracteristicasDeCuentasCorriente.consultaDeDetalleCorriente;
import static co.com.bancolombia.certificacion.svp.questions.consultasdetallecuentas.CaracteristicasDeCuentasCreditos.lasCaracteristicasDeLosCreditos;
import static co.com.bancolombia.certificacion.svp.questions.consultasdetallecuentas.CaracteristicasDeTarjetasCredito.lasCaracteristicasDeLasTarjetasDeCredito;
import static co.com.bancolombia.certificacion.svp.tasks.consultardetalle.ConsultasCredito.consultaDetalleCredito;
import static co.com.bancolombia.certificacion.svp.tasks.consultardetalle.ConsultasCuentaAhorro.consultaDetalleCuentas;
import static co.com.bancolombia.certificacion.svp.tasks.consultardetalle.ConsultasTarjetasCredito.consultarDetalleTarjetaCredito;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class ConsultarDetalleStepDefinition {

    @Entonces("^el deberia de ver el detalle de la cuenta de ahorro$")
    public void elDeberiaDeVerElDetalleDeLaCuentaDeAhorro() {
        theActorInTheSpotlight().should(seeThat(lasCaracteristicasDeLasCuentasAhorro()));
    }

    @Entonces("^el deberia de ver el detalle de la cuenta corriente$")
    public void elDeberiaDeVerElDetalleDeLaCuentaCorriente() {
    }

    @Entonces("^el deberia de ver el detalle  de crediagil$")
    public void elDeberiaDeVerElDetalleDeCrediagil() {
    }

    @Entonces("^el deberia de ver el detalle del credito de consumo$")
    public void elDeberiaDeVerElDetalleDelCreditoDeConsumo() {
        theActorInTheSpotlight().should(seeThat(lasCaracteristicasDeLosCreditos()));
    }


    @Entonces("^el deberia de ver el detalle  de fondos de inversion$")
    public void elDeberiaDeVerElDetalleDeFondosDeInversion() {
    }

    @Entonces("^el deberia de ver el detalle  de inversiones$")
    public void elDeberiaDeVerElDetalleDeInversiones() {
    }

    @Entonces("^el deberia de ver el detalle de la tarjeta de credito$")
    public void elDeberiaDeVerElDetalleDeLaTarjetaDeCredito() {
        theActorInTheSpotlight().should(seeThat(lasCaracteristicasDeLasTarjetasDeCredito()));
    }
    @Entonces("^el deberia de ver el detalle de la tarjeta de credito E-card$")
    public void elDeberiaDeVerElDetalleDeLaTarjetaDeCreditoECard() {
    }

    @Cuando("^consulta el detalle de la cuenta de ahorro$")
    public void consultaElDetalleDeLaCuentaDeAhorro() {
        theActorInTheSpotlight().attemptsTo(consultaDetalleCuentas());
    }

    @Cuando("^consulta el detalle de la cuenta corriente$")
    public void consultaElDetalleDeLaCuentaCorriente() {
        theActorInTheSpotlight().should(seeThat(consultaDeDetalleCorriente()));
    }

    @Cuando("^consulta el detalle del credito de consumo$")
    public void consultaElDetalleDelCreditoDeConsumo() {
        theActorInTheSpotlight().attemptsTo(consultaDetalleCredito());
    }

    @Cuando("^consulta el detalle de la tarjeta de credito$")
    public void consultaElDetalleDeLaTarjetaDeCredito() {
        theActorInTheSpotlight().attemptsTo(consultarDetalleTarjetaCredito());

    }
}
