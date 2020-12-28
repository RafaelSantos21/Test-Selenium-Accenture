package automobileInsurance.Funcion;

import automobileInsurance.BaseTest.BaseTest;
import automobileInsurance.Pages.SelectPriceOptionPage;
import automobileInsurance.BaseTest.Utils;
import org.openqa.selenium.By;

public class SelectPriceOptionFuncionality extends BaseTest {
    private SelectPriceOptionPage selectPriceOptionPage;
    private Utils utils;

    public SelectPriceOptionFuncionality() {
        this.selectPriceOptionPage = new SelectPriceOptionPage(driver);
        this.utils = new Utils();
    }

    public void preencherSelectPriceOption() {
        this.selectPriceOptionPage.getRadioButtonUltimate().click();

    }

    public void clicarBtnNext() {
        this.selectPriceOptionPage.getBtnNextSendQuote().click();
    }

    public String retornMensagem() {
        return driver.findElement(By.xpath("//li[@class='idealsteps-step-active']/child::a[@id=\"sendquote\" and @name=\"Send Quote\"]")).getText();
    }
}
