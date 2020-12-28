package automobileInsurance.Funcion;

import automobileInsurance.BaseTest.BaseTest;
import automobileInsurance.Pages.SelectPriceOptionPage;
import org.openqa.selenium.By;

public class SelectPriceOptionFuncionality extends BaseTest {
    private SelectPriceOptionPage selectPriceOptionPage;
  

    public SelectPriceOptionFuncionality() {
        this.selectPriceOptionPage = new SelectPriceOptionPage(driver);
      
    }

    public void preencherSelectPriceOption() {
        this.selectPriceOptionPage.getRadioButtonUltimate().click();

    }

    public void clicarBtnNextSendQuote() {
        this.selectPriceOptionPage.getBtnNextSendQuote().click();
    }
    
    public String validarTituloSendQuote() {
    	return driver.findElement(By.xpath("//li[@class='idealsteps-step-active']/child::a[@id=\"sendquote\" and @name=\"Send Quote\"]")).getText();
    }
}
