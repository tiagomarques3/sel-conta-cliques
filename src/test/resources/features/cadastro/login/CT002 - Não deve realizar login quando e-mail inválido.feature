Feature: CT002 - Não deve realizar login quando e-mail inválido

  @login
  Scenario: CT002 - Não deve realizar login quando e-mail inválido
    Given que usuario esteja na tela inicial de cadastro
    When clicar em ACESSE AQUI
    And inserir o email invalido
    And inserir a senha
    And clicar em ENTRAR
    Then deve exibir toast com mensagem de erro