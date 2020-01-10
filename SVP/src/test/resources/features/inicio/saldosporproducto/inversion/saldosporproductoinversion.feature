#language: es

Característica: SVP autenticacion
  Yo como usuario de Bancolombia
  Quiero iniciar sesion en el SVP
  Para visualizar los productos en la SVP

  Esquema del escenario: Consulta saldos por producto - inversiones virtuales y fondos de inversion ocultos
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensaje   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensaje> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas                   | tarjetasCredito        | creditos | inversiones   | crediagil         | mensaje                                                                                                              | escenario                                           |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@11
      | 11     | Acierto     |                   |             |                   | 854124014       | OSVPPRU10 | 1234  | 1234         |               | 11-111111-11,22-222222-22 | 33333333333,4444444444 |          | 777777,888888 | 99999999,00000000 | Los productos están ocultos, puedes habilitarlos nuevamente en la opción "Productos/ Administrar productos propios". | Inversiones virtuales y fondos de inversion ocultos |

  Esquema del escenario: Consulta saldos por producto - inversión virtual oculta y fondo de invercion visible
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensaje   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensaje> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas                   | tarjetasCredito        | creditos        | inversiones | crediagil         | mensaje                                                                                                              | escenario                                             |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@12
      | 12     | Acierto     |                   |             |                   | 854124014       | OSVPPRU10 | 1234  | 1234         |               | 11-111111-11,22-222222-22 | 33333333333,4444444444 | 5555555,6666666 |             | 99999999,00000000 | Los productos están ocultos, puedes habilitarlos nuevamente en la opción "Productos/ Administrar productos propios". | Inversión virtual oculta y fondo de invercion visible |

  Esquema del escenario: Consulta saldos por producto - inversión virtual visible y fondo de invercion oculto
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensaje   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensaje> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas                   | tarjetasCredito        | creditos        | inversiones   | crediagil | mensaje                                                                                                              | escenario                                             |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@13
      | 13     | Acierto     |                   |             |                   | 854124014       | OSVPPRU10 | 1234  | 1234         |               | 11-111111-11,22-222222-22 | 33333333333,4444444444 | 5555555,6666666 | 777777,888888 |           | Los productos están ocultos, puedes habilitarlos nuevamente en la opción "Productos/ Administrar productos propios". | Inversión virtual visible y fondo de invercion oculto |

  Esquema del escenario: Consulta saldos por producto - Sin inversion virtual y con fondos de inversion
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensaje   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensaje> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensaje | escenario                                       |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@18
      | 18     | Alterno     |                   |             |                   | 854124014       | OSVPPRU10 | 1234  | 1234         |               |         |                 |          |             |           |         | Sin inversion virtual y con fondos de inversion |

  Esquema del escenario: Consulta saldos por producto - Con inversion virtual y sin fondos de inversion
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensaje   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensaje> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensaje | escenario                                       |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@19
      | 19     | Alterno     |                   |             |                   | 854124014       | OSVPPRU10 | 1234  | 1234         |               |         |                 |          |             |           |         | Con inversion virtual y sin fondos de inversion |

  Esquema del escenario: Consulta saldos por producto - Sin inversion virtual y sin fondos de inversion
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | cuentas   | tarjetasCredito   | creditos   | inversiones   | crediagil   | mensaje   | escenario   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <cuentas> | <tarjetasCredito> | <creditos> | <inversiones> | <crediagil> | <mensaje> | <escenario> |
    Cuando el realiza la autenticacion en la SVP
    Entonces el deberia de ver un mensaje informativo
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario   | clave | segundaClave | tipoDocumento | cuentas | tarjetasCredito | creditos | inversiones | crediagil | mensaje | escenario                                       |
       ##@externaldata@.\src\test\resources\datadriven\inicio\saldosporproducto\saldosporproducto.xlsx@Datos@20
      | 20     | Acierto     |                   |             |                   | 854124014       | OSVPPRU10 | 1234  | 1234         |               |         |                 |          |             |           |         | Sin inversion virtual y sin fondos de inversion |