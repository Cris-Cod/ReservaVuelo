Feature: Reserva

  Scenario: ReservaVuelo
    Given El usuario se encuentra en la pagina de inicio
    When el usario ingresa el lugar de origen en donde se encuentra y al lugar a donde desea ir
    And Seleciona las fehcas del viaje
    When ingresa en la busqueda de este vuelo
    When el usuario busca el vuelo de menos duracion
    Then E usuario compra el vuelo