package co.com.bancolombia.certificacion.svp.stepdefinitions.inicio.saldosporproductos;

import cucumber.api.java.es.Entonces;

import static co.com.bancolombia.certificacion.svp.questions.inicio.saldosporproducto.SaldosPorProductoOcultos.visualizaElMensajeDeProductosOcultos;
import static co.com.bancolombia.certificacion.svp.questions.inicio.saldosporproducto.SaldosPorProductoVisibles.visualizaSusSaldos;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SaldosPorProductoStepDefinition {

    @Entonces("^el deberia de ver el saldo de cada producto en la SVP$")
    public void elDeberiaDeVerElSaldoDeCadaProductoEnLaSVP() {
        theActorInTheSpotlight().should(seeThat(visualizaSusSaldos()));
    }

    @Entonces("^el deberia de ver un mensaje informativo$")
    public void elDeberiaDeVerUnMensajeInformativo() {
        theActorInTheSpotlight().should(seeThat(visualizaElMensajeDeProductosOcultos()));
    }
}
