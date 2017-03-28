Feature: Archivo de ejemplo


#  Scenario: Ingreso con credenciales validas
#    Given Navigate to phptravels
#    And Accesamos a mi cuenta
#    Then ingresamos el nombre de usuario
#    And ingresamos el password
#    Then presionamos submit
#    And validamos que ingresamos a la pagina

  Scenario: Creacion de usuario
    Given Navegate to gamedb2
    When I signup as "jose1" and "jose1@correo.com" and "1234"
     |jose1|jose1@correo.com|1234|

