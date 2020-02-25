package co.com.bancolombia.certificacion.svp.stepdefinitions.saldosporproductos;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import cucumber.api.java.es.Entonces;
import static co.com.bancolombia.certificacion.svp.models.DatosPrueba.obtener;
import static co.com.bancolombia.certificacion.svp.questions.saldosporproducto.SaldosPorProductoInversionesOcultas.visualizaElProductoVisibleMasMensajeDeOculto;
import static co.com.bancolombia.certificacion.svp.questions.saldosporproducto.SaldosPorProductoOcultos.visualizaElMensajeDeProductosOcultos;
import static co.com.bancolombia.certificacion.svp.questions.saldosporproducto.SaldosPorProductoTodosOcultos.visualizaTodosLosProductosOcultos;
import static co.com.bancolombia.certificacion.svp.questions.saldosporproducto.SaldosPorProductoValidarPorProducto.visualizaSusSaldosPorProducto;
import static co.com.bancolombia.certificacion.svp.questions.saldosporproducto.SaldosPorProductoVisibles.visualizaSusSaldos;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantExcelData.MENSAJE_RESPUESTA;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantExcelData.PRODUCTOS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class SaldosPorProductoStepDefinition {

    @Entonces("^el deberia de ver el saldo de cada producto en la SVP$")
    public void elDeberiaDeVerElSaldoDeCadaProductoEnLaSVP() {
        theActorInTheSpotlight ().should (seeThat (visualizaSusSaldos ()));
    }

    @Entonces("^el deberia de ver un mensaje informativo para todos los productos$")
    public void elDeberiaDeVerUnMensajeInformativoParaTodosLosProductos() {
        theActorInTheSpotlight ().should (seeThat (visualizaTodosLosProductosOcultos ()));
    }

    @Entonces("^el deberia de ver un mensaje informativo$")
    public void elDeberiaDeVerUnMensajeInformativo() {
        theActorInTheSpotlight ().should (seeThat (visualizaElProductoVisibleMasMensajeDeOculto ()));
    }

    @Entonces("^el deberia de ver un mensaje informativo de (.*) ocultas$")
    public void elDeberiaDeVerUnMensajeInformativoDeCuentasOcultas(String producto) {
        theActorInTheSpotlight ().should (seeThat (visualizaElMensajeDeProductosOcultos (producto),
                equalTo (DatosPrueba.getMap ().get (MENSAJE_RESPUESTA).toString ())));
    }

    @Entonces("^el deberia de ver el saldo del producto$")
    public void elDeberiaDeVerElSaldoDelProducto() {
        theActorInTheSpotlight().should(seeThat(visualizaSusSaldosPorProducto(obtener(PRODUCTOS))));
    }
}