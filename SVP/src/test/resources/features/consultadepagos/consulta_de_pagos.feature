#language: es

Característica: SVP autenticacion
  Yo como usuario de Bancolombia
  Quiero iniciar sesion en el SVP
  Pra realizar transacciones en la SVP

  Esquema del escenario: Consulta de pagos de tarjetas de credito exitoso
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuesta_2 | escenario |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <tarjetasCredito> | <creditos> | <mensajeRespuesta> | <mensajeRespuesta_2> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver los productos que tienen pagos disponibles
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario | clave | segundaClave | tipoDocumento | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuesta_2 | escenario |
     ##@externaldata@./src/test/resources/datadriven/consultadepagos/consultadepagos.xlsx@Datos@1
      |1|Acierto|||Hola||OSVPPRU11|1234||||||||

  Esquema del escenario: Consulta de pagos de credito exitoso
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuesta_2 | escenario |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |  <tarjetasCredito> | <creditos> | <mensajeRespuesta> | <mensajeRespuesta_2> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver los productos que tienen pagos disponibles
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario | clave | segundaClave | tipoDocumento | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuesta_2 | escenario |
      ##@externaldata@./src/test/resources/datadriven/consultadepagos/consultadepagos.xlsx@Datos@3
      |3|Acierto|||Usuario o clave inválida. Inténtalo nuevamente|52269682|OSVPPRU10|1234||||||||

  Esquema del escenario: Consulta de pagos de creditos (usuario sin credito)
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuesta_2 | escenario |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |  <tarjetasCredito> | <creditos> | <mensajeRespuesta> | <mensajeRespuesta_2> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de observar mensaje Usted no tiene Credito
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario | clave | segundaClave | tipoDocumento | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuesta_2 | escenario |
   ##@externaldata@./src/test/resources/datadriven/consultadepagos/consultadepagos.xlsx@Datos@2
      |2|Acierto|||Hola||chipote25|1234||||||||

  Esquema del escenario: Consulta de pagos de tarjetas de credito (usuario sin tarjetas de credito)
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuesta_2 | escenario |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |  <tarjetasCredito> | <creditos> | <mensajeRespuesta> | <mensajeRespuesta_2> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de observar mensaje Actualmente la informacion de sus productos no se encuentra disponible Tarjetas de creditos
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario | clave | segundaClave | tipoDocumento | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuesta_2 | escenario |
       ##@externaldata@./src/test/resources/datadriven/consultadepagos/consultadepagos.xlsx@Datos@4
      |4|Alterno|||Usuario o clave inválida. Inténtalo nuevamente||OSVPPRU06|4567||||||||

  Esquema del escenario: Consulta de pagos de tarjetas de credito (usuario con tarjetas de creditos ocultas)
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuesta_2 | escenario |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |  <tarjetasCredito> | <creditos> | <mensajeRespuesta> | <mensajeRespuesta_2> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver mensaje de Tarjetas de credito ocultos
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario | clave | segundaClave | tipoDocumento | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuesta_2 | escenario |
       ##@externaldata@./src/test/resources/datadriven/consultadepagos/consultadepagos.xlsx@Datos@5
      |5|Alterno|||La clave que usas en el cajero está bloqueada. Debes activarla en la Sucursal Física. Para mayor información comunícate con la Sucursal Telefónica.|a|a|1234||||||||

  Esquema del escenario: Consulta de pagos de credito (usuario con creditos ocultos)
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuesta_2 | escenario |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |  <tarjetasCredito> | <creditos> | <mensajeRespuesta> | <mensajeRespuesta_2> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de observar mensaje de Credito oculto
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario | clave | segundaClave | tipoDocumento | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuesta_2 | escenario |
       ##@externaldata@./src/test/resources/datadriven/consultadepagos/consultadepagos.xlsx@Datos@6
      |6|Alterno|||Usuario o clave inválida. Inténtalo nuevamente||OOMAP12|1234||||||||

  Esquema del escenario: Consulta de pagos de credito y tarjetas creditos (creditos y tarjetas creditos ocultos)
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuesta_2 | escenario |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |  <tarjetasCredito> | <creditos> | <mensajeRespuesta> | <mensajeRespuesta_2> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver todos los productos ocultos
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario | clave | segundaClave | tipoDocumento | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuesta_2 | escenario |
       ##@externaldata@./src/test/resources/datadriven/consultadepagos/consultadepagos.xlsx@Datos@7
      |7|Alterno|||Usuario o clave inválida. Inténtalo nuevamente|854124014||1234||||||||

  Esquema del escenario: Consulta de pagos de credito y tarjetas creditos (usuario sin tarjetas de credito y sin creditos)
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuesta_2 | escenario |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |  <tarjetasCredito> | <creditos> | <mensajeRespuesta> | <mensajeRespuesta_2> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver mensajes no tiene los productos
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario | clave | segundaClave | tipoDocumento | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuesta_2 | escenario |
       ##@externaldata@./src/test/resources/datadriven/consultadepagos/consultadepagos.xlsx@Datos@8
      |8|Alterno|||Usuario o clave inválida. Inténtalo nuevamente|854124014||1234||||||||

  Esquema del escenario: Consulta de pagos de credito y tarjetas creditos (usuario con tarjetas de credito y  creditos)
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuesta_2 | escenario |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |  <tarjetasCredito> | <creditos> | <mensajeRespuesta> | <mensajeRespuesta_2> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces   el deberia de ver los productos que tienen pagos disponibles
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario | clave | segundaClave | tipoDocumento | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuesta_2 | escenario |
       ##@externaldata@./src/test/resources/datadriven/consultadepagos/consultadepagos.xlsx@Datos@9
      |9|Alterno|||Usuario o clave inválida. Inténtalo nuevamente|854124014||1234||||||||
