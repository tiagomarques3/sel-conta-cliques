Feature: CT006 - Validar botão de acesso ao cadastro pela tela de login


  @login
  Scenario: CT006 - Validar botão de acesso ao cadastro pela tela de login
    Given que usuario esteja na tela inicial de cadastro
    When clicar em ACESSE AQUI
    And estiver na tela de login
    And clicar em Nao Cadastrou
    Then deve redirecionar para a tela de cadastro