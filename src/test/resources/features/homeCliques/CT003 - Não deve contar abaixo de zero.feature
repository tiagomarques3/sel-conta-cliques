Feature: CT003 - Não deve contar abaixo de zero

  @home
  Scenario: CT003 - Não deve contar abaixo de zero
    Given que o usuario acesse o conta cliques
    When estiver em zero
    And clicar no sinal de menos
    Then deve exibir mensagem de minimo 0