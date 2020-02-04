#language: es

Característica: SVP saldos por producto
  Yo como usuario de Bancolombia
  Quiero iniciar sesion en el SVP
  Para visualizar los productos en la SVP

  Esquema del escenario: Consulta saldos por producto visualizar cuentas
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver el saldo de cada producto en la SVP
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensajeRespuesta | escenario           |
       ##@externaldata@.\src\test\resources\datadriven\saldosporproducto\saldos_por_producto.xlsx@Cuentas@1
      |1|Acierto|||||PRUEBAENROL5 |1234|1234||406-762410-20||||||Visualizar cuentas|

  Esquema del escenario: Consulta saldos por producto - cuentas ocultas
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   |escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> |<escenario>  |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo de Cuentas ocultas
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensajeRespuesta                                                                                                              |escenario   |
       ##@externaldata@.\src\test\resources\datadriven\saldosporproducto\saldos_por_producto.xlsx@Cuentas@2
      |2|Acierto|||||USUCTDC2 |1234|1234|||||||Los productos están ocultos, puedes habilitarlos nuevamente en la opción "Productos/ Administrar productos propios".|Cuentas ocultas|

  Esquema del escenario: Consulta saldos por producto sin cuentas
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   |escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> |<escenario>   |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver el saldo de cada producto en la SVP
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito        | creditos        | inversiones   | crediagil         | mensajeRespuesta |escenario   |
       ##@externaldata@.\src\test\resources\datadriven\saldosporproducto\saldos_por_producto.xlsx@Cuentas@3
      |3|Acierto|||||USUCTDC11|1234|1234|||****4632, ****6885, ****9658|||||Sin cuentas|