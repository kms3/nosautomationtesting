Feature: loginFeature
  Essa feature ira validar a funcionalidade de login e logout com sucesso

  Scenario: Login com email e senha corretos
    Given acesso a pagina de login da aplicacao
    And eu insiro o email "karinamotaslv@gmail.com"
    And eu insiro o password "Nwkarinasilva23!"
    Then devo ser redirecionado para a pagina principal