Feature: CT002 - Não deve contar acima de dez

  @home
  @home
  Scenario: CT002 - Não deve contar acima de dez
    Given que o usuario acesse o conta cliques
    When estiver em dez cliques
    And clicar no sinal de mais
    Then deve exibir mensagem de limite ate 10