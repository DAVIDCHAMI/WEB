package co.com.bancolombia.certificacion.svp.interactions.comunes;

import co.com.bancolombia.certificacion.svp.interactions.builders.SeleccionarMenuBuilder;
import co.com.bancolombia.certificacion.svp.utilities.enums.TituloMenu;
import co.com.bancolombia.certificacion.svp.utilities.enums.TituloSubMenu;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.bancolombia.certificacion.svp.userinterface.comunes.ElementosComunes.MENU_PRINCIPAL;
import static co.com.bancolombia.certificacion.svp.userinterface.comunes.ElementosComunes.SUB_MENU;


public class SeleccionarMenu implements Interaction {
    private final Enum menuPrincipal;
    private final Enum subMenu;

    public SeleccionarMenu(Enum menuPrincipal, Enum subMenu) {
        this.menuPrincipal = menuPrincipal;
        this.subMenu = subMenu;
    }

    public static SeleccionarMenuBuilder seleccionarMenu(Enum menuPrincipal) {
        return new SeleccionarMenuBuilder(menuPrincipal);
    }

    @Override
    @Step("{0} seleccionar menu")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU_PRINCIPAL.of(((TituloMenu) menuPrincipal).getName())),
                Click.on(SUB_MENU.of(((TituloSubMenu) subMenu).geId()))
        );

    }
}
