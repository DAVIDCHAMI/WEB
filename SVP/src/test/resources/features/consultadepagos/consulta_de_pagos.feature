#language: es

Característica: SVP autenticacion
  Yo como usuario de Bancolombia
  Quiero iniciar sesion en el SVP
  Pra realizar transacciones en la SVP

  @test1
  Esquema del escenario: Consulta de pagos de tarjetas de credito exitoso
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |
    Cuando el realiza la autenticacion en la SVP
    Y consulta los pagos de tarjetes de creditos
    Entonces el deberia de ver los productos que tienen pagos disponibles
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario | clave | segundaClave | tipoDocumento |
     ##@externaldata@./src/test/resources/datadriven/consultadepagos/consultadepagos.xlsx@Datos@1
      |1|Acierto|||||OSVPPRU15|1234|||

  Esquema del escenario: Consulta de pagos de creditos (usuario sin credito)
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |
    Cuando el realiza la autenticacion en la SVP
    Y consulta los pagos de creditos
    Entonces el deberia de observar mensaje Usted no tiene credito
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario | clave | segundaClave | tipoDocumento |
   ##@externaldata@./src/test/resources/datadriven/consultadepagos/consultadepagos.xlsx@Datos@1
      |1|Acierto|||||OSVPPRU15|1234|||

  Esquema del escenario: Consulta de pagos de credito exitoso
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |
    Cuando el realiza la autenticacion en la SVP
    Y consulta los pagos de creditos
    Entonces el deberia de ver los creditos que tienen pagos disponibles
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario | clave | segundaClave | tipoDocumento |
      ##@externaldata@./src/test/resources/datadriven/consultadepagos/consultadepagos.xlsx@Datos@1
      |1|Acierto|||||OSVPPRU15|1234|||

  Esquema del escenario: Consulta de pagos de tarjetas de credito (usuario sin tarjetas de credito)
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |
    Cuando el realiza la autenticacion en la SVP
    Y consulta los pagos de tarjetes de creditos
    Entonces el deberia de observar mensaje Actualmente la informacion de sus productos no se encuentra disponible
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario | clave | segundaClave | tipoDocumento |
       ##@externaldata@./src/test/resources/datadriven/consultadepagos/consultadepagos.xlsx@Datos@1
      |1|Acierto|||||OSVPPRU15|1234|||