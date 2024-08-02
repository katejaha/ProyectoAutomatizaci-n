@Demo-auto
Feature: Test Demo Automation

  Scenario Outline: Capacitacion de automatizacion
    Given Entramos a  la url del ambiente <ambiente>,<estable>
    And Ingresamos <usuario>,<contrasena>
    And Seleccionamos Generate Token
    And Seleccionamos el idioma <lenguaje>
    And Seleccionamos el menu principal
    And Seleccionamos el modulo <moduloprincipal>
    And Seleccionamos el modulo N1<moduloN1>
    And Seleccionamos el Menu Hamburguesa <menusecundario>


    Examples:
      | estable | ambiente |  | usuario                         | contrasena | lenguaje | moduloprincipal |
      | si      | QA       |  | katherine.anchante@intelica.com | depapym12  | ESP      | M&V facturas    |
