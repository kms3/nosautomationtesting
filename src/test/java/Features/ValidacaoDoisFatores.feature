Feature: validacaoDoisFatoresFeature
  Essa feature ira validar o status atual da validacao de dois fatores de acordo com parametro inserido

  Background:
    Given utilizador esteja logado com sucesso na plataforma

  Scenario: o Utilizador ira validar o status da validacao de dois fatores
    Then validar se o status atual da validacao de dois fatores seja "Desativado"