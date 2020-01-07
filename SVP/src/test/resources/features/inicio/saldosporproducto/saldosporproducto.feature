#language: es

Característica: SVP autenticacion
  Yo como usuario de Bancolombia
  Quiero iniciar sesion en el SVP
  Para realizar transacciones en la SVP

  @tag1
  Esquema del escenario: Consulta saldos por producto todos los productos
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   |escenario|
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> |<escenario>|
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver el saldo de cada producto en la SVP
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas                   | tarjetasCredito        | creditos        | inversiones   | crediagil         | mensajeRespuesta |escenario|
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@1
      | 1      | Acierto     |                   |             |                   | 854124014       | OSVPPRU10 | 1234  | 1234         |               | 11-111111-11,22-222222-22 | 33333333333,4444444444 | 5555555,6666666 | 777777,888888 | 99999999,00000000 |                  |escenario|
  @tag2
  Esquema del escenario: Consulta saldos por producto - posee depositos y créditos
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   |escenario|
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> |<escenario>|
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver el saldo de cada producto en la SVP
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas                   | tarjetasCredito        | creditos        | inversiones   | crediagil         | mensajeRespuesta |escenario|
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@2
      | 1      | Acierto     |                   |             |                   | 854124014       | OSVPPRU10 | 1234  | 1234         |               | 11-111111-11,22-222222-22 | 33333333333,4444444444 | 5555555,6666666 | 777777,888888 | 99999999,00000000 |                  |escenario|

  Esquema del escenario: Consulta saldos por producto - posee créditos y fondos de inversión
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   |escenario|
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> | <escenario>|
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver el saldo de cada producto en la SVP
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas                   | tarjetasCredito        | creditos        | inversiones   | crediagil         | mensajeRespuesta |escenario|
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@3
      | 1      | Acierto     |                   |             |                   | 854124014       | OSVPPRU10 | 1234  | 1234         |               | 11-111111-11,22-222222-22 | 33333333333,4444444444 | 5555555,6666666 | 777777,888888 | 99999999,00000000 |                  |escenario|

  Esquema del escenario: Consulta saldos por producto - posee deposito, tarjeta de crédito y crediágil
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   |escenario|
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> |<escenario>|
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver el saldo de cada producto en la SVP
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas                   | tarjetasCredito        | creditos        | inversiones   | crediagil         | mensajeRespuesta |escenario|
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@4
      | 1      | Acierto     |                   |             |                   | 854124014       | OSVPPRU10 | 1234  | 1234         |               | 11-111111-11,22-222222-22 | 33333333333,4444444444 | 5555555,6666666 | 777777,888888 | 99999999,00000000 |                  |escenario|

  Esquema del escenario: Consulta saldos por producto - posee crédito, inversión virtual y tarjetas de créditos
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   |escenario|
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> |<escenario>|
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver el saldo de cada producto en la SVP
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas                   | tarjetasCredito        | creditos        | inversiones   | crediagil         | mensajeRespuesta |escenario|
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@5
      | 1      | Acierto     |                   |             |                   | 854124014       | OSVPPRU10 | 1234  | 1234         |               | 11-111111-11,22-222222-22 | 33333333333,4444444444 | 5555555,6666666 | 777777,888888 | 99999999,00000000 |                  |<escenario>|

  Esquema del escenario: Consulta saldos por producto - posee depositos, tarjetas créditos,inversiones y fondos de inversiones
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   |escenario|
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> |<escenario>|
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver el saldo de cada producto en la SVP
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas                   | tarjetasCredito        | creditos        | inversiones   | crediagil         | mensajeRespuesta |escenario|
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@6
      | 1      | Acierto     |                   |             |                   | 854124014       | OSVPPRU10 | 1234  | 1234         |               | 11-111111-11,22-222222-22 | 33333333333,4444444444 | 5555555,6666666 | 777777,888888 | 99999999,00000000 |                  |escenario|

  Esquema del escenario: Consulta saldos por producto - todos los productos ocultos
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   |escenario|
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> |<escenario>|
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensajeRespuesta                                                                                                     |escenario|
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@7
      | 2      | Acierto     |                   |             |                   | 854124014       | OSVPPRU10 | 1234  | 1234         |               |         |                 |          |             |           | Los productos están ocultos, puedes habilitarlos nuevamente en la opción "Productos/ Administrar productos propios". |escenario|

  Esquema del escenario: Consulta saldos por producto - cuentas ocultas
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensajeRespuesta                                                                                                     |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@8
      | 3      | Acierto     |                   |             |                   | 854124014       | OSVPPRU10 | 1234  | 1234         |               |         |                 |          |             |           | Los productos están ocultos, puedes habilitarlos nuevamente en la opción "Productos/ Administrar productos propios". |

  Esquema del escenario: Consulta saldos por producto - tarjetas credito ocultas
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensajeRespuesta                                                                                                     |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@9
      | 4      | Alterno     |                   |             |                   | 854124014       | OSVPPRU10 | 1234  | 1234         |               |         |                 |          |             |           | Los productos están ocultos, puedes habilitarlos nuevamente en la opción "Productos/ Administrar productos propios". |

  Esquema del escenario: Consulta saldos por producto - creditos ocultas
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensajeRespuesta                                                                                                     |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@10
      | 5      | Alterno     |                   |             |                   | 854124014       | OSVPPRU10 | 1234  | 1234         |               |         |                 |          |             |           | Los productos están ocultos, puedes habilitarlos nuevamente en la opción "Productos/ Administrar productos propios". |

  Esquema del escenario: Consulta saldos por producto - inversiones virtuales y fondos de inversion ocultos
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensajeRespuesta                                                                                                     |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@11
      | 6      | Alterno     |                   |             |                   | 854124014       | OSVPPRU10 | 1234  | 1234         |               |         |                 |          |             |           | Los productos están ocultos, puedes habilitarlos nuevamente en la opción "Productos/ Administrar productos propios". |

  Esquema del escenario: Consulta saldos por producto - inversión virtual oculta y fondo de invercion visible
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensajeRespuesta                                                                                                     |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@12
      | 6      | Alterno     |                   |             |                   | 854124014       | OSVPPRU10 | 1234  | 1234         |               |         |                 |          |             |           | Los productos están ocultos, puedes habilitarlos nuevamente en la opción "Productos/ Administrar productos propios". |

  Esquema del escenario: Consulta saldos por producto - inversión virtual visible y fondo de invercion oculto
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensajeRespuesta                                                                                                     |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@13
      | 6      | Alterno     |                   |             |                   | 854124014       | OSVPPRU10 | 1234  | 1234         |               |         |                 |          |             |           | Los productos están ocultos, puedes habilitarlos nuevamente en la opción "Productos/ Administrar productos propios". |

  Esquema del escenario: Consulta saldos por producto - crediagil ocultas
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensajeRespuesta                                                                                                     |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@14
      | 7      | Acierto     |                   |             |                   | 854124014       | OSVPPRU10 | 1234  | 1234         |               |         |                 |          |             |           | Los productos están ocultos, puedes habilitarlos nuevamente en la opción "Productos/ Administrar productos propios". |

  Esquema del escenario: Consulta saldos por producto sin cuentas
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito        | creditos        | inversiones   | crediagil         | mensajeRespuesta |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@15
      | 9      | Acierto     |                   |             |                   | 854124014       | OSVPPRU10 | 1234  | 1234         |               |         | 33333333333,4444444444 | 5555555,6666666 | 777777,888888 | 99999999,00000000 |                  |

  Esquema del escenario: Consulta saldos por producto sin tarjetas de credito
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas                   | tarjetasCredito | creditos        | inversiones   | crediagil         | mensajeRespuesta |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@16
      | 10     | Acierto     |                   |             |                   | 854124014       | OSVPPRU10 | 1234  | 1234         |               | 11-111111-11,22-222222-22 |                 | 5555555,6666666 | 777777,888888 | 99999999,00000000 |                  |

  Esquema del escenario: Consulta saldos por producto sin creditos
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas                   | tarjetasCredito        | creditos | inversiones   | crediagil         | mensajeRespuesta |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@17
      | 11     | Acierto     |                   |             |                   | 854124014       | OSVPPRU10 | 1234  | 1234         |               | 11-111111-11,22-222222-22 | 33333333333,4444444444 |          | 777777,888888 | 99999999,00000000 |                  |

  Esquema del escenario: Consulta saldos por producto - Sin inversion virtual y con fondos de inversion
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas                   | tarjetasCredito        | creditos        | inversiones | crediagil         | mensajeRespuesta |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@18
      | 12     | Acierto     |                   |             |                   | 854124014       | OSVPPRU10 | 1234  | 1234         |               | 11-111111-11,22-222222-22 | 33333333333,4444444444 | 5555555,6666666 |             | 99999999,00000000 |                  |

  Esquema del escenario: Consulta saldos por producto - Con inversion virtual y sin fondos de inversion
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas                   | tarjetasCredito        | creditos        | inversiones | crediagil         | mensajeRespuesta |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@19
      | 12     | Acierto     |                   |             |                   | 854124014       | OSVPPRU10 | 1234  | 1234         |               | 11-111111-11,22-222222-22 | 33333333333,4444444444 | 5555555,6666666 |             | 99999999,00000000 |                  |

  Esquema del escenario: Consulta saldos por producto - Sin inversion virtual y sin fondos de inversion
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas                   | tarjetasCredito        | creditos        | inversiones | crediagil         | mensajeRespuesta |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@20
      | 12     | Acierto     |                   |             |                   | 854124014       | OSVPPRU10 | 1234  | 1234         |               | 11-111111-11,22-222222-22 | 33333333333,4444444444 | 5555555,6666666 |             | 99999999,00000000 |                  |

  Esquema del escenario: Consulta saldos por producto sin crediagil
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas                   | tarjetasCredito        | creditos        | inversiones   | crediagil | mensajeRespuesta |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@21
      | 13     | Acierto     |                   |             |                   | 854124014       | OSVPPRU10 | 1234  | 1234         |               | 11-111111-11,22-222222-22 | 33333333333,4444444444 | 5555555,6666666 | 777777,888888 |           |                  |
