package co.com.bancolombia.certificacion.svp.stepdefinitions.consultasdedetalle;
import co.com.bancolombia.certificacion.svp.tasks.consultardetalle.ConsultasFondosInversion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static co.com.bancolombia.certificacion.svp.questions.consultasdetallecuentas.CaracteristicasDeCrediagil.lasCaracteristicasDeCrediagil;
import static co.com.bancolombia.certificacion.svp.questions.consultasdetallecuentas.CaracteristicasDeCuentasAhorro.lasCaracteristicasDeLasCuentasAhorro;
import static co.com.bancolombia.certificacion.svp.questions.consultasdetallecuentas.CaracteristicasDeCuentasCorriente.lasCaracteristicasDeLasCuentasCorriente;
import static co.com.bancolombia.certificacion.svp.questions.consultasdetallecuentas.CaracteristicasDeCuentasCreditos.lasCaracteristicasDeLosCreditos;
import static co.com.bancolombia.certificacion.svp.questions.consultasdetallecuentas.CaracteristicasDeFondosInversion.lasCaracteristicasDeFondosInversion;
import static co.com.bancolombia.certificacion.svp.questions.consultasdetallecuentas.CaracteristicasDeInversione.lasCaracteristicaDeInversiones;
import static co.com.bancolombia.certificacion.svp.questions.consultasdetallecuentas.CaracteristicasDeTarjetasCredito.lasCaracteristicasDeLasTarjetasDeCredito;
import static co.com.bancolombia.certificacion.svp.questions.consultasdetallecuentas.CaracteristicasDeTarjetasCreditosEcard.lasCaracteristicasDeTarjetasCreditosECard;
import static co.com.bancolombia.certificacion.svp.questions.consultasdetallecuentas.ConsultarCreditoOpcionPagarDisponible.laOpcionDePagarDisponible;
import static co.com.bancolombia.certificacion.svp.tasks.consultardetalle.ConsultasCrediagil.consultarDetalleCrediagil;
import static co.com.bancolombia.certificacion.svp.tasks.consultardetalle.ConsultasCredito.consultaDetalleCredito;
import static co.com.bancolombia.certificacion.svp.tasks.consultardetalle.ConsultasCuentaAhorro.consultaDetalleCuentas;
import static co.com.bancolombia.certificacion.svp.tasks.consultardetalle.ConsultasCuentasCorriente.consultaDeDetalleCorriente;
import static co.com.bancolombia.certificacion.svp.tasks.consultardetalle.ConsultasInversiones.consultarDetalleInversiones;
import static co.com.bancolombia.certificacion.svp.tasks.consultardetalle.ConsultasTarjetasCredito.consultarDetalleTarjetaCredito;
import static co.com.bancolombia.certificacion.svp.tasks.consultardetalle.ConsultasTarjetasCreditoECard.consultarDetalleTarjetaCreditoECard;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class ConsultarDetalleStepDefinition {

    @Entonces("^el deberia de ver el detalle de la cuenta de ahorro$")
    public void elDeberiaDeVerElDetalleDeLaCuentaDeAhorro() {
        theActorInTheSpotlight().should(seeThat(lasCaracteristicasDeLasCuentasAhorro()));
    }

    @Entonces("^el deberia de ver el detalle de la cuenta corriente$")
    public void elDeberiaDeVerElDetalleDeLaCuentaCorriente() {
        theActorInTheSpotlight().should(seeThat(lasCaracteristicasDeLasCuentasCorriente()));
    }

    @Entonces("^el deberia de ver el detalle  de crediagil$")
    public void elDeberiaDeVerElDetalleDeCrediagil() {
        theActorInTheSpotlight().should(seeThat(lasCaracteristicasDeCrediagil()));
    }

    @Entonces("^el deberia de ver el detalle del credito de consumo$")
    public void elDeberiaDeVerElDetalleDelCreditoDeConsumo() {
        theActorInTheSpotlight().should(seeThat(lasCaracteristicasDeLosCreditos()));
    }


    @Entonces("^el deberia de ver el detalle  de fondos de inversion$")
    public void elDeberiaDeVerElDetalleDeFondosDeInversion() {
        theActorInTheSpotlight().should(seeThat(lasCaracteristicasDeFondosInversion()));
    }

    @Entonces("^el deberia de ver el detalle  de inversiones$")
    public void elDeberiaDeVerElDetalleDeInversiones() {
        theActorInTheSpotlight().should(seeThat(lasCaracteristicaDeInversiones()));
    }

    @Entonces("^el deberia de ver el detalle de la tarjeta de credito$")
    public void elDeberiaDeVerElDetalleDeLaTarjetaDeCredito() {
        theActorInTheSpotlight().should(seeThat(lasCaracteristicasDeLasTarjetasDeCredito()));
    }
    @Entonces("^el deberia de ver el detalle de la tarjeta de credito E-card$")
    public void elDeberiaDeVerElDetalleDeLaTarjetaDeCreditoECard() {
        theActorInTheSpotlight().should(seeThat(lasCaracteristicasDeTarjetasCreditosECard()));
    }

    @Cuando("^consulta el detalle de la cuenta de ahorro$")
    public void consultaElDetalleDeLaCuentaDeAhorro() {
        theActorInTheSpotlight().attemptsTo(consultaDetalleCuentas());
    }

    @Cuando("^consulta el detalle de la cuenta corriente$")
    public void consultaElDetalleDeLaCuentaCorriente() {
        theActorInTheSpotlight().attemptsTo(consultaDeDetalleCorriente());
    }

    @Cuando("^consulta el detalle del credito de consumo$")
    public void consultaElDetalleDelCreditoDeConsumo() {
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

    @Cuando("^consulta el detalle inversiones$")
    public void consultaElDetalleInversiones() {
        theActorInTheSpotlight().attemptsTo(consultarDetalleInversiones());
    }

    @Cuando("^consulta el detalle de crediagil$")
    public void consultaElDetalleDeCrediagil() {
       theActorInTheSpotlight().attemptsTo(consultarDetalleCrediagil());
    }

    @Cuando("^consulta el detalle de la tarjeta de credito E-card$")
    public void consultaElDetalleDeLaTarjetaDeCreditoECard() {
        theActorInTheSpotlight().attemptsTo(consultarDetalleTarjetaCreditoECard());
    }

    @Entonces("^el deberia de ver la opcion de pagar disponible$")
    public void elDeberiaDeVerLaOpcionDePagarDisponible() {
        theActorInTheSpotlight().should(seeThat(laOpcionDePagarDisponible()));
    }


}
