#language: es

Característica: SVP saldos por producto
  Yo como usuario de Bancolombia
  Quiero iniciar sesion en el SVP
  Para visualizar los productos en la SVP

  Esquema del escenario: Consulta saldos por producto visualizar cuentas
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensaje   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensaje> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver el saldo de cada producto en la SVP
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensaje | escenario           |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Cuentas@1
      |1|Acierto||||854124014|OSVPPRU10|1234|1234||2||||||Visualizar cuentas|

  Esquema del escenario: Consulta saldos por producto - cuentas ocultas
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensaje   |escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensaje> |<escenario>  |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensaje                                                                                                              |escenario   |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Cuentas@2
      |2|Acierto||||854124014|OSVPPRU10|1234|1234||2|2|2|2|2|Los productos están ocultos, puedes habilitarlos nuevamente en la opción "Productos/ Administrar productos propios".|Cuentas ocultas|

  Esquema del escenario: Consulta saldos por producto sin cuentas
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensaje   |escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensaje> |<escenario>   |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito        | creditos        | inversiones   | crediagil         | mensaje |escenario   |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Cuentas@3
      |3|Acierto||||854124014|OSVPPRU10|1234|1234||2|2|2|2|2||Sin cuentas|
