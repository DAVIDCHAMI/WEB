#language: es

Característica: SVP saldos por producto
  Yo como usuario de Bancolombia
  Quiero iniciar sesion en el SVP
  Para visualizar los productos en la SVP

  Esquema del escenario: Consulta saldos por producto visualizar creditos
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   | escenario   | productos |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> | <escenario> | <productos> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver el saldo del producto
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensajeRespuesta | escenario           | productos |
       ##@externaldata@.\src\test\resources\datadriven\saldosporproducto\saldos_por_producto.xlsx@Creditos@1
      |1|Acierto|||||chipote95|1234|1234||||29281026324||||Visualizar creditos|CREDITOS|

  Esquema del escenario: Consulta saldos por producto - creditos ocultas
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   | escenario   | productos |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> | <escenario> | <productos> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo de Creditos ocultas
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas                   | tarjetasCredito | creditos        | inversiones   | crediagil         | mensajeRespuesta                                                                                                              | escenario        | productos |
       ##@externaldata@.\src\test\resources\datadriven\saldosporproducto\saldos_por_producto.xlsx@Creditos@2
      |2|Acierto||||1989637719|PRUEBAICDCS2 |1234|1234|||||||Los productos están ocultos, puedes habilitarlos nuevamente en la opción "Productos/ Administrar productos propios".|Creditos ocultas   |CREDITOS|

  Esquema del escenario: Consulta saldos por producto sin creditos
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   | escenario   | productos |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> | <escenario> | <productos> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver el saldo del producto
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensajeRespuesta | escenario    | productos |
       ##@externaldata@.\src\test\resources\datadriven\saldosporproducto\saldos_por_producto.xlsx@Creditos@3
      |3|Alterno|||||PRUEBAENROL5 |1234|1234||406-762410-20||||||Sin creditos|CREDITOS|