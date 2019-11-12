package co.com.bancolombia.certificacion.svp.tasks.transferencias;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import co.com.bancolombia.certificacion.svp.userinterface.comunes.ElementosComunes;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.concurrent.TimeUnit;

import static co.com.bancolombia.certificacion.svp.interactions.clavedinamica.IngresarClaveDinamica.ingresarClaveDinamica;
import static co.com.bancolombia.certificacion.svp.interactions.comunes.SeleccionarMenu.seleccionarMenu;
import static co.com.bancolombia.certificacion.svp.interactions.espera.Esperar.esperar;
import static co.com.bancolombia.certificacion.svp.interactions.fabrica.Cambiar.cambiarFrame;
import static co.com.bancolombia.certificacion.svp.interactions.segundaclave.IngresarSegundaClave.ingresarSegundaClave;
import static co.com.bancolombia.certificacion.svp.tasks.comunes.CargarPagina.esperarAQueSeCargueLaPagina;
import static co.com.bancolombia.certificacion.svp.userinterface.comunes.ElementosComunes.FRAME_PRINCIPAL;
import static co.com.bancolombia.certificacion.svp.userinterface.transferencias.Transferencia.*;
import static co.com.bancolombia.certificacion.svp.utilities.enums.TituloMenu.TRANSFERENCIAS;
import static co.com.bancolombia.certificacion.svp.utilities.enums.TituloSubMenu.TRANS_A_CTAS_BANCO_TRANSFERIR;
import static co.com.bancolombia.certificacion.svp.utilities.managers.UtilityManager.depositAccountFormat;


public class TransferenciasEntreCuentasBancolombia implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        //Seleccionar menú
        actor.attemptsTo(esperar(4000));
        actor.attemptsTo(esperarAQueSeCargueLaPagina());
        String urlFrontQa = Serenity.sessionVariableCalled("urlFrontAtajos");

        if (!"ATAJO".equalsIgnoreCase(urlFrontQa)) {
            actor.attemptsTo(esperarAQueSeCargueLaPagina()
                    , cambiarFrame(FRAME_PRINCIPAL)
                    , seleccionarMenu(TRANSFERENCIAS).ySeleccionarSubMenu(TRANS_A_CTAS_BANCO_TRANSFERIR)
            );
        }

        //Ingresa clave dinámica o segunda clave
        if (ElementosComunes.CLAVE_DINAMICA.resolveFor(actor).withTimeoutOf(40, TimeUnit.SECONDS).isVisible()) {
            actor.attemptsTo(esperarAQueSeCargueLaPagina()
                    , ingresarClaveDinamica()
                    , esperar(5000));

        } else {
            actor.attemptsTo(ingresarSegundaClave());
        }

        actor.attemptsTo(
                esperarAQueSeCargueLaPagina()
                , Click.on(OPCION_PRODUCTO_ORIGEN.of(depositAccountFormat(DatosPrueba.getMap().get("productoOrigen").toString())))
                , Click.on(OPCION_PRODUCTO_DESTINO.of(depositAccountFormat(DatosPrueba.getMap().get("productoDestino").toString())))
                , Enter.theValue(DatosPrueba.getMap().get("valorTransferir").toString()).into(VALOR_TRANSFERENCIA)
                , Click.on(OPCION_TIPO_TRANSFERENCIA.of(DatosPrueba.getMap().get("tipoTransferencia").toString()))
                , Click.on(BOTON_CONTINUAR)
        );

        actor.attemptsTo(
                esperar(4000)
                , Click.on(BOTON_TRANSFERIR)
                , esperar(4000)
        );


    }
}
