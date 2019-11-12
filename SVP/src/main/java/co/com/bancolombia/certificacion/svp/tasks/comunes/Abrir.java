package co.com.bancolombia.certificacion.svp.tasks.comunes;

import co.com.bancolombia.certificacion.svp.userinterface.autenticacion.Autenticacion;
import co.com.bancolombia.certificacion.svp.utilities.properties.GeneralProperties;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

import static net.thucydides.core.pages.PageObject.withParameters;

public class Abrir implements Task {
    private static final Logger LOGGER = LogManager.getLogger(Abrir.class.getName());

    Autenticacion paginaAutenticacion = new Autenticacion();
    private String qa;

    public Abrir() {

    }

    public Abrir(String qa) {
        this.qa = qa;
    }

    public static Abrir abrirElSitioDeLaSVP() {
        return Tasks.instrumented(Abrir.class);
    }

    public static Abrir abrirElSitioDeLaSVP(String qa) {
        return Tasks.instrumented(Abrir.class, qa);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String strUrlQA;
        try {
            strUrlQA = GeneralProperties.getUrlFront();
            strUrlQA = ("QA1".equals(strUrlQA)) ? "QA" : strUrlQA;
            String url;

            if (qa != null) {
                strUrlQA = qa;
                if ("ATAJO".equalsIgnoreCase(strUrlQA)) {
                    String archivoAtajos = (GeneralProperties.getUrlAtajos());
                    File file = new File(archivoAtajos);
                    String rutaAbsoluta = file.getAbsoluteFile().toString();
                    String urlArchivoAtajos = rutaAbsoluta.replace("\\", "//");
                    paginaAutenticacion.openUrl("file://" + urlArchivoAtajos);
                } else {
                    url = GeneralProperties.getUrlFrontAPP().replace("$$", strUrlQA.toLowerCase());
                    url = (!"QA2".contains(".bc")) ? url.replace(".bc", "") : url;
                    paginaAutenticacion.open("open.QA", withParameters(url));
                }
            } else {
                url = GeneralProperties.getUrlFrontAPP().replace("$$", strUrlQA.toLowerCase());
                paginaAutenticacion.open("open.QA", withParameters(url));
            }
            Serenity.setSessionVariable("urlFrontAtajos").to(strUrlQA);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
    }
}
