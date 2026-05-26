Feature: CT001 - Deve realizar login com sucesso

  @login
  Scenario: CT001 - Deve realizar login com sucesso
    Given que usuario esteja na tela inicial de cadastro
    When clicar em ACESSE AQUI
    And inserir o email
    And inserir a senha
    And clicar em ENTRAR
    Then login realizado com sucesso