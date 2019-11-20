#language: es
@E2E_SVP

Característica: SVP transferencias entre cuentas bancolombia
  Yo, como usuario de Bancolombia, quiero hacer una transferencia entre cuentas de bancolombia para transferir dinero

  @TestCase1
  Esquema del escenario: TRN0369 Inicio de sesion exitoso en el sitio SVP
    Dado que Yo cargo los datos de la transaccion
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> |
    Cuando intento autenticarme utilizando mis credenciales
      | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   |
      | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |
    Y realizo una transferencia entre cuentas bancolombia con la siguiente informacion
      | productoOrigen   | tipoProductoOrigen   | productoDestino   | tipoProductoDestino   | valorTransferir   | tipoTransferencia   |
      | <productoOrigen> | <tipoProductoOrigen> | <productoDestino> | <tipoProductoDestino> | <valorTransferir> | <tipoTransferencia> |
    Entonces verifico el resultado esperado de la transferencia exitosa entre cuentas bancolombia
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | codigoErrorOracle | resultadoEsperado       | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | productoOrigen | tipoProductoOrigen | productoDestino | tipoProductoDestino | valorTransferir | tipoTransferencia      |
         ##@externaldata@./src/test/resources/datadriven/transferencias/trn_0438_0538_transferencia_entre_cuentas_bancolombia.xlsx@Datos
	|1|Acierto|0538|000|001|Transferencia realizada|1373022|usua22rio|1234|2443|1|40613022002|Corriente|40673022011|Ahorro|1300|Transferencia en línea|

  @TestCase1
  Esquema del escenario: TRN0538 Transferencia exitosa, entre una cuenta corriente a una cuenta de ahorro propia, con tope banco
    Dado que Yo cargo los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | codigoErrorOracle   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | productoOrigen   | tipoProductoOrigen   | productoDestino   | tipoProductoDestino   | valorTransferir   | tipoTransferencia   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <codigoErrorOracle> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <productoOrigen> | <tipoProductoOrigen> | <productoDestino> | <tipoProductoDestino> | <valorTransferir> | <tipoTransferencia> |
    Cuando  realizo una transferencia entre cuentas bancolombia
    Entonces verifico el resultado esperado de la transferencia exitosa entre cuentas bancolombia

    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | codigoErrorOracle | resultadoEsperado       | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | productoOrigen | tipoProductoOrigen | productoDestino | tipoProductoDestino | valorTransferir | tipoTransferencia      |
         ##@externaldata@./src/test/resources/datadriven/transferencias/trn_0438_0538_transferencia_entre_cuentas_bancolombia.xlsx@Datos
	|1|Acierto|0538|000|001|Transferencia realizada|1373022|usua22rio|1234|2443|1|40613022002|Corriente|40673022011|Ahorro|1300|Transferencia en línea|
