#language: es

Característica: SVP saldos por producto
  Yo como usuario de Bancolombia
  Quiero iniciar sesion en el SVP
  Para visualizar los productos en la SVP

  Esquema del escenario: Consulta saldos por producto visualizar creditos
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver el saldo de cada producto en la SVP
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensajeRespuesta | escenario           |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Creditos@1
      |1|Acierto||||854124014|OSVPPRU10|1234|1234||||4||||Visualizar creditos|

  Esquema del escenario: Consulta saldos por producto - creditos ocultas
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo de Credito ocultas
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas                   | tarjetasCredito | creditos        | inversiones   | crediagil         | mensajeRespuesta                                                                                                              | escenario        |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Creditos@2
      |2|Acierto||||854124014|OSVPPRU10|1234|1234||4|4|4|4|4|Los productos están ocultos, puedes habilitarlos nuevamente en la opción "Productos/ Administrar productos propios".|Creditos ocultas   |

  Esquema del escenario: Consulta saldos por producto sin creditos
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver el saldo de cada producto en la SVP
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensajeRespuesta | escenario    |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Creditos@3
      |3|Alterno||||854124014|OSVPPRU10|1234|1234||4|4|4|4|4||Sin creditos|
