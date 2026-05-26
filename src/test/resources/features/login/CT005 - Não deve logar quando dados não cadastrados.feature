Feature: CT005 - Não deve logar quando dados não cadastrados.

  @login
  Scenario: CT005 - Não deve logar quando dados não cadastrados.
    Given que usuario esteja na tela inicial de cadastro
    When clicar em ACESSE AQUI
    And inserir as credenciais não cadastradas
    And clicar em ENTRAR
    Then deve exibir toast com mensagem de erro de dados inexistente