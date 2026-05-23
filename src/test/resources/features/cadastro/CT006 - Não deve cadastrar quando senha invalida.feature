Feature: CT006 - Não deve cadastrar quando senha invalida


  @bug
  Scenario: CT006 - Não deve cadastrar quando senha invalida
    Given que usuario esteja na tela de cadastro
    When inserir nome
    And inserir email
    And inserir senha invalida
    And clicar em cadastrar
    Then deve exibir toast de senha invalida