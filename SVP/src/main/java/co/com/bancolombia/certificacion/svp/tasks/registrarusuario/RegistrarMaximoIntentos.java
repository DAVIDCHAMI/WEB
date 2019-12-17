package co.com.bancolombia.certificacion.svp.tasks.registrarusuario;

import co.com.bancolombia.certificacion.svp.models.DatosPrueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.bancolombia.certificacion.svp.tasks.registrarusuario.LlenarFormularioRegistro.llenaFormularioRegistro;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.*;

public class RegistrarMaximoIntentos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {


        for (int i = 0; i > Integer.parseInt(DatosPrueba.getMap().get(INTENTOS).toString()); i++) {
            actor.attemptsTo(llenaFormularioRegistro());
        }
    }

    public static RegistrarMaximoIntentos ingresaVariosUsuariosExistentes(){
        return Tasks.instrumented(RegistrarMaximoIntentos.class);
    }
}
