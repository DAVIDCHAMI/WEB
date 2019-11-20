package co.com.bancolombia.certificacion.svp.questions.fabrica;

import co.com.bancolombia.certificacion.svp.questions.comunes.PreguntaExitosa;
import co.com.bancolombia.certificacion.svp.questions.comunes.PreguntaFallida;
import co.com.bancolombia.certificacion.svp.questions.comunes.VerificacionResultadoEsperado;
import co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.svp.userinterface.comunes.ElementosComunes.ETIQUETA_MENSAJE_EXITOSO;
import static co.com.bancolombia.certificacion.svp.userinterface.comunes.ElementosComunes.MENU_OPCION_INICIO;

public class ResultadoEsperado {
    private ResultadoEsperado() {
        throw new IllegalStateException(ConstantTypeClass.QUESTION_CLASS);
    }

    public static Question<Boolean> elInicioDeSessionFueExitoso() {
        return new PreguntaExitosa(MENU_OPCION_INICIO);
    }

    public static Question<Boolean> elInicioDeSessionFueFallido() {
        return new PreguntaFallida();
    }

    public static Question<Boolean> laTransferenciaFueExitosa() {
        return new PreguntaExitosa(ETIQUETA_MENSAJE_EXITOSO);
    }

    public static Question<Boolean> laTransferenciaFueFallida() {
        return new PreguntaFallida();
    }

    public static Question<Boolean> elInicioDeSessionFueExitoso2() {
        return new VerificacionResultadoEsperado(MENU_OPCION_INICIO);
    }
}