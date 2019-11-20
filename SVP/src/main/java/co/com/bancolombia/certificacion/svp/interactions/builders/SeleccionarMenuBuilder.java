package co.com.bancolombia.certificacion.svp.interactions.builders;

import co.com.bancolombia.certificacion.svp.interactions.comunes.SeleccionarMenu;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarMenuBuilder {
    private final Enum menuPrincipal;

    public SeleccionarMenuBuilder(Enum menuPrincipal) {
        this.menuPrincipal = menuPrincipal;
    }

    public Interaction ySeleccionarSubMenu(Enum subMenu) {
        return instrumented(SeleccionarMenu.class, menuPrincipal, subMenu);
    }
}
