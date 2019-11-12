package co.com.bancolombia.certificacion.svp.tasks.fabrica;

import co.com.bancolombia.certificacion.svp.tasks.comunes.CargarDatosPrueba;
import co.com.bancolombia.certificacion.svp.tasks.comunes.PropiedadesEntorno;
import co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Cargar {
    private Cargar() {
        throw new IllegalStateException(ConstantTypeClass.FACTORY_CLASS);
    }

    public static CargarDatosPrueba cargoLosDatosDeLaTransaccionConLaSiguiente(List<Map<String, Object>> informacion) {
        return instrumented(CargarDatosPrueba.class, informacion);

    }

    public static CargarDatosPrueba conLaSiguiente(List<Map<String, Object>> informacion) {
        return instrumented(CargarDatosPrueba.class, informacion);

    }

    public static PropiedadesEntorno environmentProperties() {
        return instrumented(PropiedadesEntorno.class);

    }


}
