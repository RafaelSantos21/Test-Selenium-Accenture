#language: en
#author: Rafael Leite
#Encoding: UTF-8

Feature:Seguro Automovel
    Scenario:CT003 - Cadastro dos dados do produto
        Given que estou na tela de dados do produto
        When preencho os dados do produto
        And clico no botao next select price option
        Then valido a tela de opcao de preco
