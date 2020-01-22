#language: es

Característica: SVP saldos por producto
  Yo como usuario de Bancolombia
  Quiero iniciar sesion en el SVP
  Para visualizar los productos en la SVP

  Esquema del escenario: Consulta saldos por producto visualizar tarjetas credito
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver el saldo de cada producto en la SVP
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensajeRespuesta | escenario                   |
       ##@externaldata@.\src\test\resources\datadriven\saldosporproducto\saldosporproducto.xlsx@TarjetasCredito@1
      | 1      | Acierto     |                   |             |                   | 854124014       | OSVPPRU10 | 1234  | 1234         |               |         | 3               |          |             |           |                  | Visualizar tarjetas credito |

  Esquema del escenario: Consulta saldos por producto - tarjetas credito ocultas
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo de Tarjetas de credito ocultas
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensajeRespuesta                                                                                                     | escenario                |
       ##@externaldata@.\src\test\resources\datadriven\saldosporproducto\saldosporproducto.xlsx@TarjetasCredito@2
      | 2      | Acierto     |                   |             |                   | 854124014       | OSVPPRU10 | 1234  | 1234         |               | 3       | 3               | 3        | 3           | 3         | Los productos están ocultos, puedes habilitarlos nuevamente en la opción "Productos/ Administrar productos propios". | Tarjetas credito ocultas |

  Esquema del escenario: Consulta saldos por producto sin tarjetas de credito
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensajeRespuesta   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensajeRespuesta> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver el saldo de cada producto en la SVP
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensajeRespuesta | escenario               |
       ##@externaldata@.\src\test\resources\datadriven\saldosporproducto\saldosporproducto.xlsx@TarjetasCredito@3
      | 3      | Acierto     |                   |             |                   | 854124014       | OSVPPRU10 | 1234  | 1234         |               | 3       | 3               | 3        | 3           | 3         |                  | Sin tarjetas de credito |
