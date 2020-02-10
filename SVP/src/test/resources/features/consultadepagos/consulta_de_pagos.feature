#language: es

Característica: SVP autenticacion
  Yo como usuario de Bancolombia
  Quiero consultar los proximos pagos de mis productos
  Para conocer los pagos disponibles.

  Esquema del escenario: Consulta de pagos de tarjetas de credito exitoso
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuestaDos | escenario |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <tarjetasCredito> | <creditos> | <mensajeRespuesta> | <mensajeRespuestaDos> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver los productos que tienen pagos disponibles
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario | clave | segundaClave | tipoDocumento | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuestaDos | escenario |
     ##@externaldata@./src/test/resources/datadriven/consultadepagos/consultadepagos.xlsx@Datos@1
      |1|Acierto|||||OSVPPRU15|1234|||****5949,****1123,****2495||||Validar pagos  de una tarjeta de crédito|

  Esquema del escenario: Consulta de pagos de credito exitoso
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuestaDos | escenario |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |  <tarjetasCredito> | <creditos> | <mensajeRespuesta> | <mensajeRespuestaDos> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver los productos que tienen pagos disponibles
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario | clave | segundaClave | tipoDocumento | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuestaDos | escenario |
      ##@externaldata@./src/test/resources/datadriven/consultadepagos/consultadepagos.xlsx@Datos@2
      |2|Acierto|||||OSVPPRU15|1234||||29281025315|||Validar pagos de créditos.|

  Esquema del escenario: Consulta de pagos de creditos (usuario sin credito)
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuestaDos | escenario |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |  <tarjetasCredito> | <creditos> | <mensajeRespuesta> | <mensajeRespuestaDos> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de observar mensaje Usted no tiene Credito
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario | clave | segundaClave | tipoDocumento | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuestaDos | escenario |
   ##@externaldata@./src/test/resources/datadriven/consultadepagos/consultadepagos.xlsx@Datos@3
      |3|Acierto|||||OSVPPRU02|1234||||||LO QUIERO|Validar usuario sin crédito|

  Esquema del escenario: Consulta de pagos de tarjetas de credito (usuario sin tarjetas de credito)
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuestaDos | escenario |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |  <tarjetasCredito> | <creditos> | <mensajeRespuesta> | <mensajeRespuestaDos> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de observar mensaje Actualmente la informacion de sus productos no se encuentra disponible Tarjetas de creditos
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario | clave | segundaClave | tipoDocumento | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuestaDos | escenario |
       ##@externaldata@./src/test/resources/datadriven/consultadepagos/consultadepagos.xlsx@Datos@4
      |4|Alterno|||||OSVPPRU30|1234||||||LA QUIERO|Validar usuario sin tarjeta de crédito.|

  Esquema del escenario: Consulta de pagos de tarjetas de credito (usuario con tarjetas de creditos ocultas)
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuestaDos | escenario |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |  <tarjetasCredito> | <creditos> | <mensajeRespuesta> | <mensajeRespuestaDos> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver mensaje de Tarjetas de credito ocultos
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario | clave | segundaClave | tipoDocumento | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuestaDos | escenario |
       ##@externaldata@./src/test/resources/datadriven/consultadepagos/consultadepagos.xlsx@Datos@5
      |5|Alterno|||||pruebaavance01|1234|||||Los productos están ocultos, puedes habilitarlos nuevamente en la opción "Productos/ Administrar productos propios".||Consulta de pagos de tarjetas de credito (usuario con tarjetas de creditos ocultas)|

  Esquema del escenario: Consulta de pagos de credito (usuario con creditos ocultos)
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuestaDos | escenario |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |  <tarjetasCredito> | <creditos> | <mensajeRespuesta> | <mensajeRespuestaDos> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de observar mensaje de Credito oculto
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario | clave | segundaClave | tipoDocumento | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuestaDos | escenario |
       ##@externaldata@./src/test/resources/datadriven/consultadepagos/consultadepagos.xlsx@Datos@6
      |6|Alterno|||||PRUEBAICDSC1|1234|||||Los productos están ocultos, puedes habilitarlos nuevamente en la opción "Productos/ Administrar productos propios".||Consulta de pagos de credito (usuario con creditos ocultos)|

  Esquema del escenario: Consulta de pagos de credito y tarjetas creditos (creditos y tarjetas creditos ocultos)
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuestaDos | escenario |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |  <tarjetasCredito> | <creditos> | <mensajeRespuesta> | <mensajeRespuestaDos> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver todos los productos ocultos
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario | clave | segundaClave | tipoDocumento | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuestaDos | escenario |
       ##@externaldata@./src/test/resources/datadriven/consultadepagos/consultadepagos.xlsx@Datos@7
      |7|Alterno||||854124014|PRUEBAICDSC1|1234|||||Los productos están ocultos, puedes habilitarlos nuevamente en la opción "Productos/ Administrar productos propios".||Consulta de pagos de credito y tarjetas creditos (creditos y tarjetas creditos ocultos)|

  Esquema del escenario: Consulta de pagos de credito y tarjetas creditos (usuario sin tarjetas de credito y sin creditos)
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuestaDos | escenario |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |  <tarjetasCredito> | <creditos> | <mensajeRespuesta> | <mensajeRespuestaDos> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver mensajes no tiene los productos
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario | clave | segundaClave | tipoDocumento | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuestaDos | escenario |
       ##@externaldata@./src/test/resources/datadriven/consultadepagos/consultadepagos.xlsx@Datos@8
      |8|Alterno||||854124014|OSVPPRU30|1234|||||LA QUIERO|LO QUIERO|Validar usuario sin tarjetas y sin créditos|

  Esquema del escenario: Consulta de pagos de credito y tarjetas creditos (usuario con tarjetas de credito y  creditos)
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuestaDos | escenario |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> |  <tarjetasCredito> | <creditos> | <mensajeRespuesta> | <mensajeRespuestaDos> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces   el deberia de ver los productos que tienen pagos disponibles
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario | clave | segundaClave | tipoDocumento | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuestaDos | escenario |
       ##@externaldata@./src/test/resources/datadriven/consultadepagos/consultadepagos.xlsx@Datos@9
      |9|Alterno||||854124014|OSVPPRU15|1234|||****5949,****1123,****2495|29281025315|||Validar usuario con tarjetas y créditos|

  Esquema del escenario: Consulta de pagos de tarjetas de credito exitoso
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuestaDos | escenario |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <tarjetasCredito> | <creditos> | <mensajeRespuesta> | <mensajeRespuestaDos> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver los productos que tienen pagos disponibles sin fecha
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario | clave | segundaClave | tipoDocumento | tarjetasCredito | creditos | mensajeRespuesta | mensajeRespuestaDos | escenario |
     ##@externaldata@./src/test/resources/datadriven/consultadepagos/consultadepagos.xlsx@Datos@10
      |10||||||USUCFEI01|1234|||****7618||||Consulta de pagos de tarjetas de credito exitoso sin fecha|
