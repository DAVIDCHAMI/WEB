#language: es

Característica: SVP autenticacion
  Yo como usuario de Bancolombia
  Quiero iniciar sesion en el SVP
  Para realizar transacciones en la SVP

  Esquema del escenario: Consulta detalle cuenta de ahorro
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver el detalle de la cuenta de ahorro.
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento |
       ##@externaldata@./src/test/resources/datadriven/consultasdetalles/consulta_de_detalle_cuentas.xlsx@Datos@1

  Esquema del escenario: Consulta detalle cuenta de corriente
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver el detalle de la cuenta corriente.
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento |
       ##@externaldata@./src/test/resources/datadriven/consultasdetalles/consulta_de_detalle_cuentas.xlsx@Datos@2