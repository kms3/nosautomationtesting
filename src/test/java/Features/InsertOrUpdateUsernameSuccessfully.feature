Feature: insertOrUpdateUsernameSuccessfullyFeature
  Essa feature ira inserir ou atualizar o username do utilizador com sucesso

  Background:
    Given utilizador esteja logado com sucesso na plataforma

  Scenario: o Utilizador podera inserir ou atualizar um username valido com sucesso
    Then ao clicar no campo username podera inserir o username "karinasilva93" valido com sucesso