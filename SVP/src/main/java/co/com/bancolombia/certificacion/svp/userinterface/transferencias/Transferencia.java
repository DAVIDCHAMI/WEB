package co.com.bancolombia.certificacion.svp.userinterface.transferencias;

import co.com.bancolombia.certificacion.svp.utilities.constant.ConstantTypeClass;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;

public class Transferencia {
    public static final Target OPCION_PRODUCTO_ORIGEN = Target
            .the("numero producto origen")
            .locatedBy("//*[@id = 'accountFromId']/*[contains(text(), '{0}')]");
    public static final Target OPCION_PRODUCTO_DESTINO = Target
            .the("numero producto destino")
            .locatedBy("//*[@id = 'accountToId']/*[contains(text(), '{0}')]");
    public static final Target VALOR_TRANSFERENCIA = Target
            .the("valor transferencia")
            .located(id("transferAmount"));
    public static final Target OPCION_TIPO_TRANSFERENCIA = Target
            .the("tipo de transferencia")
            .locatedBy("//*[@id = 'transferencyType']/*[contains(text(), '{0}')]");
    public static final Target BOTON_CONTINUAR = Target
            .the("boton continuar")
            .located(id("btnGoTransferToBCVerification"));
    public static final Target BOTON_TRANSFERIR = Target
            .the("boton transferir")
            .located(id("btnGoTransferToBCConfirmation"));

    private Transferencia() {
        throw new IllegalStateException(ConstantTypeClass.UI_CLASS);
    }
}
