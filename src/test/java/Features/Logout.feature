Feature: logoutFeature
  Essa feature ira validar se o logout foi efetuado com sucesso

  Scenario: o Logout sera efetuado com sucesso e utilizador sera rediredionado para pagina principal
    Given utilizador esteja logado com sucesso na plataforma
    When ao clicar no botao terminar sessao
    Then utilizador ser redirecionado para paginal de login