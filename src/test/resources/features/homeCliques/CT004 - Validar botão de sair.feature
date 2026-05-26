Feature: CT004 - Validar botão de sair

  @home
  Scenario: CT004 - Validar botão de sair
    Given que o usuario acesse o conta cliques
    When clicar em sair
    Then deve exibir mensagem de logout
    And retornar para a tela de login