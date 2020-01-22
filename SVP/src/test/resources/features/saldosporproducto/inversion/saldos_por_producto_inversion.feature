#language: es

Característica: SVP saldos por producto
  Yo como usuario de Bancolombia
  Quiero iniciar sesion en el SVP
  Para visualizar los productos en la SVP

  Esquema del escenario: Consulta saldos por producto visualizar inversion virtual y fondo de inversion
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver el saldo de cada producto en la SVP
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensajeRespuesta | escenario           |
       ##@externaldata@.\src\test\resources\datadriven\saldosporproducto\saldosporproducto.xlsx@Inversion@1
      |1|Acierto||||||1234|1234||||||||Visualizar inversiones|

  Esquema del escenario: Consulta saldos por producto - inversiones virtuales y fondos de inversion ocultos
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo de Inversiones ocultas
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas                   | tarjetasCredito        | creditos | inversiones   | crediagil         | mensajeRespuesta                                                                                                              | escenario                                           |
       ##@externaldata@.\src\test\resources\datadriven\saldosporproducto\saldosporproducto.xlsx@Inversion@2
      |2|Alterno|||||FIDUQA01|1234|1234|||||||Los productos están ocultos, puedes habilitarlos nuevamente en la opción "Productos/ Administrar productos propios".|Inversiones virtuales y fondos de inversion ocultos |

  Esquema del escenario: Consulta saldos por producto - inversión virtual oculta y fondo de inversion visible
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas                   | tarjetasCredito        | creditos        | inversiones | crediagil         | mensajeRespuesta                                                                                                              | escenario                                             |
       ##@externaldata@.\src\test\resources\datadriven\saldosporproducto\saldosporproducto.xlsx@Inversion@3
      |3|Alterno||||||1234|1234|||||||Los productos están ocultos, puedes habilitarlos nuevamente en la opción "Productos/ Administrar productos propios".|Inversión virtual oculta y fondo de invercion visible|

  Esquema del escenario: Consulta saldos por producto - inversión virtual visible y fondo de inversion oculto
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas                   | tarjetasCredito        | creditos        | inversiones   | crediagil | mensajeRespuesta                                                                                                              | escenario                                             |
       ##@externaldata@.\src\test\resources\datadriven\saldosporproducto\saldosporproducto.xlsx@Inversion@4
      |4|Alterno||||||1234|1234|||||||Los productos están ocultos, puedes habilitarlos nuevamente en la opción "Productos/ Administrar productos propios".|Inversión virtual visible y fondo de invercion oculto|

  Esquema del escenario: Consulta saldos por producto - Sin inversion virtual y con fondos de inversion
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver el saldo de cada producto en la SVP
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensajeRespuesta | escenario                                       |
       ##@externaldata@.\src\test\resources\datadriven\saldosporproducto\saldosporproducto.xlsx@Inversion@5
      |5|Alterno|||||FIDUQA03|1234|1234|||||0650000001366|||Sin inversion virtual y con fondos de inversion|

  Esquema del escenario: Consulta saldos por producto - Con inversion virtual y sin fondos de inversion
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver el saldo de cada producto en la SVP
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensajeRespuesta | escenario                                       |
       ##@externaldata@.\src\test\resources\datadriven\saldosporproducto\saldosporproducto.xlsx@Inversion@6
      |6|Alterno||||36123456|USUCFEI01|5555|1234||001-003143-98, 001-003145-41, 001-003150-41, 406-714130-04, 406-734560-33, 406-734560-34, 406-734560-35, 406-734560-48, 406-734560-49, 406-734560-50, 406-734560-51, 406-734560-53, 406-734560-54, 406-734560-55, 406-734560-58, 406-134560-04, 406-181110-00|****1127, ****7618||12700025033|Posee mas no se sabe el codigo ||Con inversion virtual y sin fondos de inversion|

  Esquema del escenario: Consulta saldos por producto - Sin inversion virtual y sin fondos de inversion
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver el saldo de cada producto en la SVP
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensajeRespuesta | escenario                                       |
       ##@externaldata@.\src\test\resources\datadriven\saldosporproducto\saldosporproducto.xlsx@Inversion@7
      |7|Alterno|||||PRUEBAENROL5 |1234|1234||406-762410-20||||||Sin inversion virtual y sin fondos de inversion|
