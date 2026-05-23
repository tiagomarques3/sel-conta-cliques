Feature: CT005 - Não deve cadastrar quando nome inválido

  @bug
  Scenario: CT005 - Não deve cadastrar quando nome inválido
    Given que usuario esteja na tela de cadastro
    When inserir nome invalido
    And inserir email
    And inserir senha
    And clicar em cadastrar
    Then deve exibir toast de nome invalido