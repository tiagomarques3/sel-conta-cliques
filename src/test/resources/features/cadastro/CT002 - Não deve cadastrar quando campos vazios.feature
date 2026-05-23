Feature: CT002 - Não deve cadastrar quando campos vazios

  @cadastro
  Scenario: CT002 - Não deve cadastrar quando campos vazios
    Given que usuario esteja na tela de cadastro
    When não inserir credenciais
    And clicar em cadastrar
    Then deve exibir toast de erro