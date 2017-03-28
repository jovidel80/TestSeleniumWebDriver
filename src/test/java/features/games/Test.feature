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
    Then I login as "jose1@correo.com" and "1234"
    Then I create a game as "game1" and "playstation" and "action"
    Then I edit a game as " updated" and " updated" and " updated"
    Then I delete the game

