#language: es

Característica: SVP autenticacion
  Yo como usuario de Bancolombia
  Quiero iniciar sesion en el SVP
  Para realizar transacciones en la SVP

@test1
  Esquema del escenario: Consulta detalle tarjetas de credito.
    Dado que Juan carga los datos de la prueba
     | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   |
     | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |
    Cuando el realiza la autenticacion en la SVP
    Y consulta el detalle de la tarjeta de credito
    Entonces el deberia de ver el detalle de la tarjeta de credito
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento |
       ##@externaldata@./src/test/resources/datadriven/consultasdedetalle/consultadedetallecuentas.xlsx@Datos@1
      |1|Acierto|||||OSVPPRU04|1234|||


  Esquema del escenario: Consulta detalle tarjetas de credito E-card
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |
    Cuando el realiza la autenticacion en la SVP
    Y consulta el detalle de la tarjeta de credito E-card
    Entonces el deberia de ver el detalle de la tarjeta de credito E-card
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento |
       ##@externaldata@./src/test/resources/datadriven/consultasdedetalle/consultadedetallecuentas.xlsx@Datos@1
      |1|Acierto|||||OSVPPRU04|1234|||
