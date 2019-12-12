package co.com.bancolombia.certificacion.svp.stepdefinitions.inicio.saldosporproductos;

import co.com.bancolombia.certificacion.svp.questions.inicio.saldosporproducto.SaldosPorProducto;
import cucumber.api.java.es.Entonces;

import static co.com.bancolombia.certificacion.svp.questions.inicio.saldosporproducto.SaldosPorProducto.visualizaSusSaldos;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class SaldosPorProductoStepDefinition {

    @Entonces("^el deberia de ver el saldo de cada producto en la SVP$")
    public void elDeberiaDeVerElSaldoDeCadaProductoEnLaSVP() {
        theActorInTheSpotlight().should(seeThat(visualizaSusSaldos())
        );
    }
}
