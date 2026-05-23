Feature: CT001 - Cadastro realizado com sucesso


  @cadastro
  Scenario: CT001 - Cadastro realizado com sucesso
    Given que usuario esteja na tela de cadastro
    When inserir nome
    And inserir email
    And inserir senha
    And clicar em cadastrar
    Then deve exibir toast de cadastro realizado