# Author
# Date
# Description

Feature: Reservar una habitación de hotel

  Scenario: Realizar una reserva exitosa
    Given el usuario está en la página de reservas
    When el usuario selecciona una habitación individual con fecha de entrada "2023-12-01" y fecha de salida "2023-12-05"
    And completa la información del huésped con nombre "Juan Pérez" y número de teléfono "123456789"
    And hace clic en el botón de reserva
    Then la reserva debería ser confirmada con un número de reserva único
    And el usuario debería recibir un correo electrónico de confirmación

