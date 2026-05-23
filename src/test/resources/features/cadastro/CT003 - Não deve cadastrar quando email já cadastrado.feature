Feature: CT003 - Não deve cadastrar quando email já cadastrado

  @bug
  Scenario:CT003 - Não deve cadastrar quando email já cadastrado
    Given que usuario esteja na tela de cadastro
    When inserir nome
    And inserir email cadastrado
    And inserir senha
    And clicar em cadastrar
    Then deve exibir toast de email ja cadastrado