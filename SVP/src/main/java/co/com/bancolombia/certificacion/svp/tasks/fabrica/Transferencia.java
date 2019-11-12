package co.com.bancolombia.certificacion.svp.tasks.fabrica;

import co.com.bancolombia.certificacion.svp.tasks.transferencias.TransferenciasEntreCuentasBancolombia;
import co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Transferencia {

    private Transferencia() {
        throw new IllegalStateException(ConstantTypeClass.FACTORY_CLASS);
    }

    public static Task realizarTransferenciaEntreCuentasBancolombia() {
        return instrumented(TransferenciasEntreCuentasBancolombia.class);
    }


}
