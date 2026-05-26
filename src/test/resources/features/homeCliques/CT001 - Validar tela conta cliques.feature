Feature: CT001 - Validar tela conta cliques

  @home
  Scenario: CT001 - Validar tela conta cliques
    Given que o usuario acesse a tela de cadastro
    When clicar em Acesse Aqui
    And exibir tela de login
    And inserir credenciais corretas
    And clicar no botao entrar
    Then deve direcionar para a tela de conta cliques