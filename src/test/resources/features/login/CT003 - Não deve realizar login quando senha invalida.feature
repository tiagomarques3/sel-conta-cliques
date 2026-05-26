Feature: CT003 - Não deve realizar login quando senha invalida

  @login
  Scenario: CT003 - Não deve realizar login quando senha invalida
    Given que usuario esteja na tela inicial de cadastro
    When clicar em ACESSE AQUI
    And inserir o email
    And inserir a senha invalida
    And clicar em ENTRAR
    Then deve exibir toast com mensagem de erro para senha