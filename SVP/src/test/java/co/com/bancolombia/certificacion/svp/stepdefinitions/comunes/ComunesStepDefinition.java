package co.com.bancolombia.certificacion.svp.stepdefinitions.comunes;

import co.com.bancolombia.certificacion.svp.interactions.comunes.AbrirNavegador;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.svp.questions.comunes.Mensaje.mensajeDeRespuesta;
import static co.com.bancolombia.certificacion.svp.tasks.fabrica.Cargar.cargoLosDatosDeLaTransaccionConLaSiguiente;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ComunesStepDefinition {

    @Before
    public void initialConfiguration() {
        setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) carga los datos de la prueba$")
    public void queCargoLosDatosDeLaPrueba(String actor, List<Map<String, Object>> informacion) {
        theActorCalled(actor).wasAbleTo(
                cargoLosDatosDeLaTransaccionConLaSiguiente(informacion),
                AbrirNavegador.paraSVP()
        );
    }

    @Entonces("^el deberia de ver el mensaje de respuesta$")
    public void elDeberiaDeVerElMensajeDeRespuesta() {
        theActorInTheSpotlight().should(seeThat(mensajeDeRespuesta()));
    }
}