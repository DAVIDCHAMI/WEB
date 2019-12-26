package co.com.bancolombia.certificacion.svp.tasks.registrarusuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.bancolombia.certificacion.svp.tasks.autenticacion.AutenticacionConDocumento.autenticarseConDocumentoEnLaSVP;
import static co.com.bancolombia.certificacion.svp.tasks.registrarusuario.LLenarFormularioUsuario.llenaElPrimerFormularioDeRegistro;
import static co.com.bancolombia.certificacion.svp.utilities.constant.ConstantManager.*;

public class RegistrarMaximoIntentos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo (autenticarseConDocumentoEnLaSVP());
        for (int i = 0; i < INTENTOS_REGISTRAR_USUARIO; i++) {
            actor.attemptsTo(llenaElPrimerFormularioDeRegistro());
        }
    }

    public static RegistrarMaximoIntentos ingresaVariosUsuariosExistentes(){
        return Tasks.instrumented(RegistrarMaximoIntentos.class);
    }
}
