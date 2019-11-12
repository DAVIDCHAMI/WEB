package co.com.bancolombia.certificacion.svp.interactions.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.svp.tasks.comunes.CargarPagina.esperarAQueSeCargueLaPagina;
import static co.com.bancolombia.certificacion.svp.userinterface.comunes.ElementosComunes.BOTON_SIGUIENTE_PAGINA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Buscar implements Interaction {
    private Target elemento;

    public Buscar(Target elemento) {
        this.elemento = elemento;
    }

    public static Buscar enPagina(Target target) {
        return instrumented(Buscar.class, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        while (true) {
            if (!elemento.resolveFor(actor).isPresent()) {
                if (BOTON_SIGUIENTE_PAGINA.resolveFor(actor).isPresent()) {
                    actor.attemptsTo(
                            esperarAQueSeCargueLaPagina(),
                            Scroll.to(BOTON_SIGUIENTE_PAGINA),
                            Click.on(BOTON_SIGUIENTE_PAGINA)
                    );
                }
            } else {
                actor.attemptsTo(
                        Scroll.to(elemento),
                        Click.on(elemento)
                );
                break;
            }
        }
    }
}