package co.com.bancolombia.certificacion.svp.tasks.comunes;

import co.com.bancolombia.backend.utilidades.enums.CanalesSistemas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static co.com.bancolombia.backend.utilidades.managers.DateManager.obtenerFechaSistema;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.FORMATO_HORA_HHMMSS;

public class ActualizarDatos implements Task {

    public static final String DATOS_PRUEBA = "datosPrueba";
    private static final Logger LOGGER = LogManager.getLogger(ActualizarDatos.class.getName());
    private List<Map<String, Object>> datos;

    public ActualizarDatos(List<Map<String, Object>> datos) {
        this.datos = datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (!datos.isEmpty()) {
            Map<String, Object> datosPrueba = actor.recall(DATOS_PRUEBA);
            Set<Map.Entry<String, Object>> setMapaAux = datos.get(0).entrySet();
            Map<String, Object> mapAuxiliar = setMapaAux.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            if (datosPrueba == null) {
                mapAuxiliar.put("horaTransaccion", obtenerFechaSistema(FORMATO_HORA_HHMMSS));
                mapAuxiliar.put("tipoLogCanal", CanalesSistemas.WWW.toString());
                mapAuxiliar.put("codigoCanal", CanalesSistemas.SVP.toString());
                mapAuxiliar.put("codigoSistema", CanalesSistemas.BLP.toString());
                actor.remember(DATOS_PRUEBA, mapAuxiliar);

            } else {
                datosPrueba.putAll(mapAuxiliar);
                actor.remember(DATOS_PRUEBA, datosPrueba);
            }
        } else {
            actor.remember(DATOS_PRUEBA, new HashMap<>());
            LOGGER.info("La lista se encuentra vacia");
        }

    }
}
