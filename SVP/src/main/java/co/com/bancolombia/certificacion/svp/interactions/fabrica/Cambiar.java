package co.com.bancolombia.certificacion.svp.interactions.fabrica;

import co.com.bancolombia.certificacion.svp.interactions.comunes.ContenidoDefecto;
import co.com.bancolombia.certificacion.svp.interactions.comunes.Frame;
import co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class Cambiar {
    private Cambiar() {
        throw new IllegalStateException(ConstantTypeClass.FACTORY_CLASS);
    }

    public static Frame cambiarFrame(Target frame) {
        return instrumented(Frame.class, frame);
    }

    public static ContenidoDefecto cambiarContenidoPorDefecto() {
        return instrumented(ContenidoDefecto.class);
    }
}
