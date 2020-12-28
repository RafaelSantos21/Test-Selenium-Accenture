package automobileInsurance.Funcion;

import automobileInsurance.BaseTest.BaseTest;
import automobileInsurance.Pages.EnterProductDataPage;
import automobileInsurance.BaseTest.Utils;
import org.openqa.selenium.By;

public class EnterProductDataFuncionality extends BaseTest {
    private EnterProductDataPage enterProductDataPage;
    private Utils utils;

    public EnterProductDataFuncionality(){
        this.enterProductDataPage = new EnterProductDataPage(driver);
        this.utils = new Utils();
    }

    public void preencherEnterProductData(){
        this.utils.preencheCampoTexto(this.enterProductDataPage.getStartDate(),"02/27/2021");
        this.utils.selectByValue(this.enterProductDataPage.getInsuranceSum(),"10000000");
        this.utils.selectByValue(this.enterProductDataPage.getMeritRating(),"Bonus 5");
        this.utils.selectByValue(this.enterProductDataPage.getDamageInsurance(),"Full Coverage");
        this.enterProductDataPage.getEuroProtection().click();
        this.utils.selectByValue(this.enterProductDataPage.getCortesyCar(),"Yes");

    }
    public void clicarBtnNextSelectPriceOption() {this.enterProductDataPage.getBtnNextSelectPriceOption().click();}
    
    public String validarTituloSelectPriceOption() {
    	 return driver.findElement(By.xpath("//li[@class='idealsteps-step-active']/child::a[@id=\"selectpriceoption\" and @name=\"Select Price Option\"]")).getText();
    }
    
}
