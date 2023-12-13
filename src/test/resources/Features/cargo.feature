# Author
# Date
# Description

Feature: Gestión de Cargos

  Scenario: Listar Cargos
    Given el usuario está en la página de administración de cargos
    When el usuario lista los cargos
    Then se deberían mostrar todos los cargos

  Scenario: Buscar Cargo por Código
    Given el usuario está en la página de administración de cargos
    When el usuario busca un cargo por código
    Then debería encontrar el cargo correspondiente

  Scenario: Agregar Nuevo Cargo
    Given el usuario está en la página de administración de cargos
    When el usuario agrega un nuevo cargo
    Then el nuevo cargo debería estar en la lista de cargos

  Scenario: Eliminar Cargo
    Given el usuario está en la página de administración de cargos
    When el usuario elimina un cargo
    Then el cargo debería ser eliminado de la lista de cargos

  Scenario: Modificar Cargo
    Given el usuario está en la página de administración de cargos
    When el usuario modifica un cargo
    Then el cargo debería reflejar los cambios en la lista de cargos



