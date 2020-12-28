package automobileInsurance.Funcion;

import automobileInsurance.BaseTest.BaseTest;
import automobileInsurance.Pages.SendQuotePage;
import automobileInsurance.BaseTest.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SendQuoteFuncionality extends BaseTest {
    private SendQuotePage sendQuotePage;
    private Utils utils;

    public SendQuoteFuncionality(){
        this.sendQuotePage = new SendQuotePage(driver);
        this.utils = new Utils();
    }

    public void preencherSendQuote(){
        this.utils.preencheCampoTexto(this.sendQuotePage.getEmail(),"rafael@teste.com.br");
        this.utils.preencheCampoTexto(this.sendQuotePage.getUserName(),"Rafa199967");
        this.utils.preencheCampoTexto(this.sendQuotePage.getPassWord(),"Rafael1010");
        this.utils.preencheCampoTexto(this.sendQuotePage.getConfirmPassWord(),"Rafael1010");



    }

    public void clicarBtnSendEmail() {this.sendQuotePage.getBtnSendEmail().click();} 
    public String validarMensagemSendingEmailSuccess(){
        wait.until(ExpectedConditions.textToBePresentInElement(this.sendQuotePage.getMessageSendingEmailSuccess(),"Sending e-mail success!"));
        return driver.findElement(By.xpath("//div[@class='sa-icon sa-custom']/following-sibling::h2[contains(text(), 'Sending e-mail success!')]")).getText();
        
    }
   
}

