Feature: CT004 - Não deve cadastrar quando email de formato inválido

  @cadastro
  Scenario: CT004 - Não deve cadastrar quando email de formato inválido
    Given que usuario esteja na tela de cadastro
    When inserir nome
    And inserir email invalido
    And inserir senha
    And clicar em cadastrar
    Then deve exibir toast de email invalido