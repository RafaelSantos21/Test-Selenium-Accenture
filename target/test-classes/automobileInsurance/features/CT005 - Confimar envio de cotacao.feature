#language: en
#author: Rafael Leite
#Encoding: UTF-8

Feature:Seguro Automovel
    Scenario:CT005 - Validar envio de cotacao
        Given que estou na tela de envio de cotacao
        When preencho os dados para envio
        And clico no botao send
        Then valido a mensagem de confirmacao de envio
