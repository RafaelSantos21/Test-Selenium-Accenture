package automobileInsurance.step;

import automobileInsurance.BaseTest.BaseTest;
import automobileInsurance.Funcion.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutomobileInsuranceStep extends BaseTest {

    private EnterVehicleDataFuncionality enterVehicleDataFuncionality;
    private EnterProductDataFuncionality enterProductDataFuncionality;
    private EnterInsurantDataFuncionality enterInsurantDataFuncionality;
    private SelectPriceOptionFuncionality selectPriceOptionFuncionality;
    private SendQuoteFuncionality sendQuoteFuncionality;

    public AutomobileInsuranceStep(){
        this.enterVehicleDataFuncionality = new EnterVehicleDataFuncionality();
        this.enterInsurantDataFuncionality = new EnterInsurantDataFuncionality();
        this.enterProductDataFuncionality = new EnterProductDataFuncionality();
        this.selectPriceOptionFuncionality = new SelectPriceOptionFuncionality();
        this.sendQuoteFuncionality = new SendQuoteFuncionality();
    }

    @Before
    public void setUp(){ driver.get(url); }

    //CT01
    @Given("preencho os dados do veiculo")
    public void preencho_os_dados_do_veiculo() { this.enterVehicleDataFuncionality.preencherEnterVehicleData(); }

    @When("clico no botao next enter insurant data")
    public void clicoNoBotaoNextEnterInsurantData() {
        this.enterVehicleDataFuncionality.clicarBtnNext();
    }

    @Then("valido a tela de dados do seguro")
    public void valido_a_tela_de_dados_do_seguro() {
        this.enterVehicleDataFuncionality.retornMensagem();
    }

    //CT002
    @Given("que estou na tela de dados do seguro")
    public void que_estou_na_tela_de_dados_do_seguro() {
        this.enterVehicleDataFuncionality.preencherEnterVehicleData();
        this.enterVehicleDataFuncionality.clicarBtnNext();
    }
    @When("preencho os dados do seguro")
    public void preencho_os_dados_do_seguro() { this.enterInsurantDataFuncionality.preencherEnterInsurantData(); }

    @And("clico no botao next enter product data")
    public void clicoNoBotaoNextEnterProductData() { this.enterInsurantDataFuncionality.clicarNext(); }

    @Then("valido a tela de dados do produto")
    public void valido_a_tela_de_dados_do_produto() { this.enterInsurantDataFuncionality.retornMensagem(); }

    //CT003 -
    @Given("que estou na tela de dados do produto")
    public void que_estou_na_tela_de_dados_do_produto() {
        this.enterVehicleDataFuncionality.preencherEnterVehicleData();
        this.enterVehicleDataFuncionality.clicarBtnNext();
        this.enterInsurantDataFuncionality.preencherEnterInsurantData();
        this.enterInsurantDataFuncionality.clicarNext();
    }
    @When("preencho os dados do produto")
    public void preencho_os_dados_do_produto() { this.enterProductDataFuncionality.preencherEnterProductData(); }

    @And("clico no botao next select price option")
    public void clicoNoBotaoNextSelectPriceOption() { this.enterProductDataFuncionality.clicarBtnNext(); }

    @Then("valido a tela de opcao de preco")
    public void valido_a_tela_de_opcao_de_preco() {
        this.enterProductDataFuncionality.retornMensagem();
    }

//CT004
    @Given("que estou na tela de selecionar opcao de preco")
    public void que_estou_na_tela_de_selecionar_opcao_de_preco() {
        this.enterVehicleDataFuncionality.preencherEnterVehicleData();
        this.enterVehicleDataFuncionality.clicarBtnNext();
        this.enterInsurantDataFuncionality.preencherEnterInsurantData();
        this.enterInsurantDataFuncionality.clicarNext();
        this.enterProductDataFuncionality.preencherEnterProductData();
        this.enterProductDataFuncionality.clicarBtnNext();
    }
    @When("seleciono a opcao de preco")
    public void seleciono_a_opcao_de_preco() { this.selectPriceOptionFuncionality.preencherSelectPriceOption(); }

    @And("clico no botão next send quote")
    public void clicoNoBotãoNextSendQuote() { this.selectPriceOptionFuncionality.clicarBtnNext(); }
    @Then("valido a tela de envio de cotacao")
    public void valido_a_tela_de_envio_de_cotacao() {
        this.selectPriceOptionFuncionality.retornMensagem();
    }

//CT005
    @Given("que estou na tela de envio de cotacao")
    public void que_estou_na_tela_de_envio_de_cotacao() {
        this.enterVehicleDataFuncionality.preencherEnterVehicleData();
        this.enterVehicleDataFuncionality.clicarBtnNext();
        this.enterInsurantDataFuncionality.preencherEnterInsurantData();
        this.enterInsurantDataFuncionality.clicarNext();
        this.enterProductDataFuncionality.preencherEnterProductData();
        this.enterProductDataFuncionality.clicarBtnNext();
        this.selectPriceOptionFuncionality.preencherSelectPriceOption();
        this.selectPriceOptionFuncionality.clicarBtnNext();
    }
    @When("preencho os dados para envio")
    public void preencho_os_dados_para_envio() { this.sendQuoteFuncionality.preencherSendQuote(); }

    @And("clico no botao send")
    public void clicoNoBotaoSend() { this.sendQuoteFuncionality.clicarBtnNext(); }

    @Then("valido a mensagem de confirmacao de envio")
    public void valido_a_mensagem_de_confirmacao_de_envio() {
        this.sendQuoteFuncionality.retornMessageSendingEmailSuccess();
    }

//CT 006
    @Given("preencho o formulario de dados do veiculo")
    public void preencho_o_formulario_de_dados_do_veiculo() {
        this.enterVehicleDataFuncionality.preencherEnterVehicleData();
        this.enterVehicleDataFuncionality.clicarBtnNext();
    }

    @And("preencho o formulario de dados do seguro")
    public void preencho_o_formulario_de_dados_do_seguro() {
        this.enterInsurantDataFuncionality.preencherEnterInsurantData();
        this.enterInsurantDataFuncionality.clicarNext();
    }

    @And("preencho o formulario de dados do produto")
    public void preencho_o_formulario_de_dados_do_produto() {
        this.enterProductDataFuncionality.preencherEnterProductData();
        this.enterProductDataFuncionality.clicarBtnNext();
    }

    @And("seleciono a opcao de preco desejada")
    public void seleciono_a_opcao_de_preco_desejada() {
        this.selectPriceOptionFuncionality.preencherSelectPriceOption();
        this.selectPriceOptionFuncionality.clicarBtnNext();
    }

    @When("preencho o formulario para envio de cotacao")
    public void preencho_o_formulario_para_envio_de_cotacao() {
        this.sendQuoteFuncionality.preencherSendQuote();
        this.sendQuoteFuncionality.clicarBtnNext();
    }
    @Then("valido mensagem de envio de cotacao")
    public void valido_mensagem_de_envio_de_cotacao() {
        this.sendQuoteFuncionality.retornMessageSendingEmailSuccess();
    }

    @After
    public static void tearDown(){

       // driver.quit();
    }



}


