#language: es

Característica: SVP autenticacion
  Yo como usuario de Bancolombia
  Quiero iniciar sesion en el SVP
  Para realizar transacciones en la SVP

  @hola
  Esquema del escenario: Consulta saldos por producto todos los productos
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensaje   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensaje> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver el saldo de cada producto en la SVP
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensaje | escenario |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@1
      |1|Acierto||||854124014|OSVPPRU10|1234|1234||||4676||||Todos los productos|

  @tag2
  Esquema del escenario: Consulta saldos por producto - posee depositos y créditos
    Dado que Juan carga los datos de la prueba
  | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensaje   | escenario   |
  | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensaje> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver el saldo de cada producto en la SVP
    Ejemplos:
  | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas                   | tarjetasCredito        | creditos        | inversiones   | crediagil         | mensaje | escenario |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@2
      |2|Acierto||||854124014|OSVPPRU10|1234|1234||||||||Posee depositos y créditos|

  Esquema del escenario: Consulta saldos por producto - posee créditos y fondos de inversión
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensaje   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensaje> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver el saldo de cada producto en la SVP
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas                   | tarjetasCredito        | creditos        | inversiones   | crediagil         | mensaje | escenario |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@3
      |3|Acierto||||854124014|OSVPPRU10|1234|1234||||||||Posee créditos y fondos de inversión|

  Esquema del escenario: Consulta saldos por producto - posee deposito, tarjeta de crédito y crediágil
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensaje   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensaje> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver el saldo de cada producto en la SVP
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas                   | tarjetasCredito        | creditos        | inversiones   | crediagil         | mensaje | escenario |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@4
      |4|Alterno||||854124014|OSVPPRU10|1234|1234||||||||Posee deposito, tarjeta de crédito y crediágil|

  Esquema del escenario: Consulta saldos por producto - posee crédito, inversión virtual y tarjetas de créditos
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensaje   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensaje> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver el saldo de cada producto en la SVP
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas                   | tarjetasCredito        | creditos        | inversiones   | crediagil         | mensaje | escenario   |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@5
      |5|Alterno||||854124014|OSVPPRU10|1234|1234||||||||Posee crédito, inversión virtual y tarjetas de créditos|

  Esquema del escenario: Consulta saldos por producto - posee depositos, tarjetas créditos,inversiones y fondos de inversiones
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensaje   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensaje> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver el saldo de cada producto en la SVP
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas                   | tarjetasCredito        | creditos        | inversiones   | crediagil         | mensaje | escenario |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@6
      |6|Alterno||||854124014|OSVPPRU10|1234|1234||||||||Posee depositos, tarjetas créditos,inversiones y fondos de inversiones|

  Esquema del escenario: Consulta saldos por producto - todos los productos ocultos
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensaje   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensaje> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensaje                                                                                                              | escenario |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@7
      |7|Acierto||||854124014|OSVPPRU10|1234|1234|||||||Los productos están ocultos, puedes habilitarlos nuevamente en la opción "Productos/ Administrar productos propios".|Todos los productos ocultos|

  Esquema del escenario: Consulta saldos por producto - cuentas ocultas
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensaje   |escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensaje> |<escenario>  |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensaje                                                                                                              |escenario   |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@8
      |8|Acierto||||854124014|OSVPPRU10|1234|1234|||||||Los productos están ocultos, puedes habilitarlos nuevamente en la opción "Productos/ Administrar productos propios".|Cuentas ocultas|

  Esquema del escenario: Consulta saldos por producto - tarjetas credito ocultas
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensaje   |escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensaje> |<escenario>  |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensaje                                                                                                              |escenario   |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@9
      |9|Acierto||||854124014|OSVPPRU10|1234|1234|||33333333333,4444444444|5555555,6666666|777777,888888|99999999,00000000|Los productos están ocultos, puedes habilitarlos nuevamente en la opción "Productos/ Administrar productos propios".|Tarjetas credito ocultas|

  Esquema del escenario: Consulta saldos por producto - creditos ocultas
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensaje   |escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensaje> |<escenario>   |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensaje                                                                                                              |escenario   |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@10
      |10|Acierto||||854124014|OSVPPRU10|1234|1234||11-111111-11,22-222222-22||5555555,6666666|777777,888888|99999999,00000000|Los productos están ocultos, puedes habilitarlos nuevamente en la opción "Productos/ Administrar productos propios".|Creditos ocultas   |

  Esquema del escenario: Consulta saldos por producto - inversiones virtuales y fondos de inversion ocultos
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensaje   |escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensaje> |<escenario>   |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensaje                                                                                                              |escenario   |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@11
      |11|Acierto||||854124014|OSVPPRU10|1234|1234||11-111111-11,22-222222-22|33333333333,4444444444||777777,888888|99999999,00000000|Los productos están ocultos, puedes habilitarlos nuevamente en la opción "Productos/ Administrar productos propios".|Inversiones virtuales y fondos de inversion ocultos |

  Esquema del escenario: Consulta saldos por producto - inversión virtual oculta y fondo de invercion visible
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensaje   |escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensaje> |<escenario>   |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensaje                                                                                                              |escenario   |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@12
      |12|Acierto||||854124014|OSVPPRU10|1234|1234||11-111111-11,22-222222-22|33333333333,4444444444|5555555,6666666||99999999,00000000|Los productos están ocultos, puedes habilitarlos nuevamente en la opción "Productos/ Administrar productos propios".|Inversión virtual oculta y fondo de invercion visible|

  Esquema del escenario: Consulta saldos por producto - inversión virtual visible y fondo de invercion oculto
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensaje   |escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensaje> |<escenario>   |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensaje                                                                                                              |escenario   |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@13
      |13|Acierto||||854124014|OSVPPRU10|1234|1234||11-111111-11,22-222222-22|33333333333,4444444444|5555555,6666666|777777,888888||Los productos están ocultos, puedes habilitarlos nuevamente en la opción "Productos/ Administrar productos propios".|Inversión virtual visible y fondo de invercion oculto|

  Esquema del escenario: Consulta saldos por producto - crediagil ocultas
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensaje   |escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensaje> |<escenario>   |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensaje                                                                                                              |escenario   |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@14
      |14|Acierto||||854124014|OSVPPRU10|1234|1234||||4676|||Los productos están ocultos, puedes habilitarlos nuevamente en la opción "Productos/ Administrar productos propios".|Crediagil ocultas |

  Esquema del escenario: Consulta saldos por producto sin cuentas
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensaje   |escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensaje> |<escenario>   |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito        | creditos        | inversiones   | crediagil         | mensaje |escenario   |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@15
      |15|Acierto||||854124014|OSVPPRU10|1234|1234||||||||Sin cuentas|

  Esquema del escenario: Consulta saldos por producto sin tarjetas de credito
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensaje   |escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensaje> |<escenario>   |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas                   | tarjetasCredito | creditos        | inversiones   | crediagil         | mensaje |escenario   |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@16
      |16|Acierto||||854124014|OSVPPRU10|1234|1234||||||||Sin tarjetas de credito|

  Esquema del escenario: Consulta saldos por producto sin creditos
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensaje   |escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensaje> |<escenario>  |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas                   | tarjetasCredito        | creditos | inversiones   | crediagil         | mensaje |escenario   |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@17
      |17|Alterno||||854124014|OSVPPRU10|1234|1234||||||||Sin creditos|

  Esquema del escenario: Consulta saldos por producto - Sin inversion virtual y con fondos de inversion
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensaje   |escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensaje> |<escenario>   |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas                   | tarjetasCredito        | creditos        | inversiones | crediagil         | mensaje |escenario   |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@18
      |18|Alterno||||854124014|OSVPPRU10|1234|1234||||||||Sin inversion virtual y con fondos de inversion|

  Esquema del escenario: Consulta saldos por producto - Con inversion virtual y sin fondos de inversion
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensaje   |escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensaje> |<escenario>   |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas                   | tarjetasCredito        | creditos        | inversiones | crediagil         | mensaje |escenario   |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@19
      |19|Alterno||||854124014|OSVPPRU10|1234|1234||||||||Con inversion virtual y sin fondos de inversion|

  Esquema del escenario: Consulta saldos por producto - Sin inversion virtual y sin fondos de inversion
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensaje   |escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensaje> |<escenario>   |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas                   | tarjetasCredito        | creditos        | inversiones | crediagil         | mensaje |escenario   |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@20
      |20|Acierto||||854124014|OSVPPRU10|1234|1234||||||||Sin inversion virtual y sin fondos de inversion|

  Esquema del escenario: Consulta saldos por producto sin crediagil
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensaje   |escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensaje> |<escenario>   |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas                   | tarjetasCredito        | creditos        | inversiones   | crediagil | mensaje |escenario   |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@21
      |21|Acierto||||854124014|OSVPPRU10|1234|1234||||||||Sin crediagil|
