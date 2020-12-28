#language: en
#author: Rafael Leite
#Encoding: UTF-8

Feature:Seguro Automovel
    Scenario:CT006 - Solicitar Seguro de Automovel
        Given preencho o formulario de dados do veiculo
        And preencho o formulario de dados do seguro
        And preencho o formulario de dados do produto
        And seleciono a opcao de preco desejada
        When preencho o formulario para envio de cotacao
        Then valido mensagem de envio de cotacao

