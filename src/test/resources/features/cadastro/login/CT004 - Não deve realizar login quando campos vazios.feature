Feature: CT004 - Não deve realizar login quando campos vazios

  @login
  Scenario: CT004 - Não deve realizar login quando campos vazios
    Given que usuario esteja na tela inicial de cadastro
    When clicar em ACESSE AQUI
    And não inserir as credenciais
    And clicar em ENTRAR
    Then deve exibir toast com mensagem de erro para campo vazio