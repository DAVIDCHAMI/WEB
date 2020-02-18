package co.com.bancolombia.certificacion.svp.tasks.consultardetalle;

import co.com.bancolombia.certificacion.svp.interactions.comunes.Esperar;
import co.com.bancolombia.certificacion.svp.utilities.validaciones.ObjetoInteractuarSaldosPorProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.svp.models.DatosPrueba.obtener;
import static co.com.bancolombia.certificacion.svp.userinterface.consultasdedetalle.DetalleInversiones.LBL_DETALLE_INVERSION;
import static co.com.bancolombia.certificacion.svp.userinterface.inicio.Inicio.LBL_PRODUCTOS;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantExcelData.NUMERO_PRODUCTO;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantExcelData.PRODUCTO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConsultasInversiones implements Task {

    public static ConsultasInversiones consultarDetalleInversiones() {
        return instrumented(ConsultasInversiones.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Esperar.unTiempo());
        if ("Inversiones".equals(obtener(PRODUCTO))) {
            actor.attemptsTo(Click.on(ObjetoInteractuarSaldosPorProducto.interactuaConEl(obtener(PRODUCTO))));
        }
        actor.attemptsTo(Click.on(LBL_PRODUCTOS.of(obtener(NUMERO_PRODUCTO))),
                WaitUntil.the(LBL_DETALLE_INVERSION, isVisible()),
                Esperar.unTiempo()
        );
    }
}