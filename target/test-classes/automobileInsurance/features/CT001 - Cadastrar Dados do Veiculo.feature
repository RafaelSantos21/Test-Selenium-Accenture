#language: en
#author: Rafael Leite
#Encoding: UTF-8

Feature:Seguro Automovel
    Scenario:CT001 - Cadastro Dados do Veiculo
        Given preencho os dados do veiculo
        When clico no botao next enter insurant data
        Then valido a tela de dados do seguro
