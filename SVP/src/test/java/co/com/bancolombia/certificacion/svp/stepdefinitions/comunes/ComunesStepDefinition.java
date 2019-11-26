package co.com.bancolombia.certificacion.svp.stepdefinitions.comunes;

import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.svp.tasks.fabrica.Cargar.cargoLosDatosDeLaTransaccionConLaSiguiente;
import static co.com.bancolombia.certificacion.svp.tasks.fabrica.Cargar.conLaSiguiente;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ComunesStepDefinition {

    @Before
    public void initialConfiguration() {
        setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) carga los datos de la transaccion$")
    public void queCargoLosDatosDeLaTransaccion(String actor, List<Map<String, Object>> informacion) {
        theActorCalled(actor).wasAbleTo(
                conLaSiguiente(informacion)
        );
    }

    @Dado("^que (.*) carga los datos de la prueba$")
    public void queCargoLosDatosDeLaPrueba(String actor, List<Map<String, Object>> informacion) {
        theActorCalled(actor).wasAbleTo(
                cargoLosDatosDeLaTransaccionConLaSiguiente(informacion)
        );
    }
}