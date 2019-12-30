#language: es

Característica: Generar clave en SVP
  Yo como cliente de Bancolombia
  Quiero generar la clave
  Para ingresar a la Sucursal Virtual Personas


  Esquema del escenario: Generar clave en SVP usando la clave actual
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | mensajeEsperado   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <mensajeEsperado> |
    Cuando el genera la clave para svp usando la misma que posee actualmente
    Entonces el deberia de ver un mensaje Usuario o clave invalida
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario  | clave | segundaClave | tipoDocumento        | mensajeEsperado                                                                                                        |
       ##@externaldata@./src/test/resources/datadriven/generarclave/generar_clave.xlsx@Datos@1
      |1|Alterno|||Usuario o clave inválida. Inténtalo nuevamente|1001945795|chipote95|1234|4321|Cédula de ciudadanía|Usuario o clave inválida. Inténtalo nuevamente|


  Esquema del escenario: Generar clave en SVP exitoso
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | mensajeEsperado   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <mensajeEsperado> |
    Cuando el genera la clave para svp
    Entonces el deberia de ver el mensaje ¡Clave pendiente de activacion!
    Y el mensaje de confirmacion con fecha de la transaccion
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario  | clave | segundaClave | tipoDocumento        | mensajeEsperado                                                                                                        |
       ##@externaldata@./src/test/resources/datadriven/generarclave/generar_clave.xlsx@Datos@2
      |2|Acierto||||1245123880|OSVPPRU96|1234|1234|Cédula de ciudadanía| Debes activar la clave en la Sucursal Física. Si eres colombiano en el exterior comunícate con la Sucursal Telefónica.|


  Esquema del escenario: Generar clave en SVP con clave bloqueada por intentos
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | mensajeEsperado   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <mensajeEsperado> |
    Cuando el genera la clave para svp con clave bloqueada por intentos
    Entonces el deberia de ver el mensaje ¡Clave pendiente de activacion!
    Y el mensaje de confirmacion con fecha de la transaccion
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario  | clave | segundaClave | tipoDocumento        | mensajeEsperado                                                                                                        |
       ##@externaldata@./src/test/resources/datadriven/generarclave/generar_clave.xlsx@Datos@3
      |3|Alterno||||25130110|USUCDTC1|4321|1234|Cédula de ciudadanía| Debes activar la clave en la Sucursal Física. Si eres colombiano en el exterior comunícate con la Sucursal Telefónica.|

  Esquema del escenario: Generar clave en SVP con clave bloqueada por seguridad
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | mensajeEsperado   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <mensajeEsperado> |
    Cuando el genera la clave para svp con clave bloqueada por seguridad
    Entonces el deberia de ver mensaje de su clave esta bloqueada
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario  | clave | segundaClave | tipoDocumento        | mensajeEsperado                                                                                                        |
       ##@externaldata@./src/test/resources/datadriven/generarclave/generar_clave.xlsx@Datos@4
      |4|Alterno|||La clave que usas en el cajero está bloqueada. Debes activarla en la Sucursal Física. Para mayor información comunícate con la Sucursal Telefónica.||||||La clave que usas en el cajero está bloqueada. Debes activarla en la Sucursal Física. Para mayor información comunícate con la Sucursal Telefónica.|


  Esquema del escenario: Generar clave en SVP con clave bloqueda voluntariamente
    Dado que Juan carga los datos de la prueba
      | idCaso   | orientacion   | codigoTransaccion   | codigoError   | resultadoEsperado   | numeroDocumento   | usuario   | clave   | segundaClave   | tipoDocumento   | mensajeEsperado   |
      | <idCaso> | <orientacion> | <codigoTransaccion> | <codigoError> | <resultadoEsperado> | <numeroDocumento> | <usuario> | <clave> | <segundaClave> | <tipoDocumento> | <mensajeEsperado> |
    Cuando el genera la clave para svp con clave bloqueada por el usuario
    Entonces el deberia de ver el mensaje ¡Clave pendiente de activacion!
    Y el mensaje de confirmacion con fecha de la transaccion
    Ejemplos:
      | idCaso | orientacion | codigoTransaccion | codigoError | resultadoEsperado | numeroDocumento | usuario  | clave | segundaClave | tipoDocumento        | mensajeEsperado                                                                                                        |
       ##@externaldata@./src/test/resources/datadriven/generarclave/generar_clave.xlsx@Datos@5
      |5|Alterno||||1002576587|chipote87|4321|4321|Cédula de ciudadanía||
