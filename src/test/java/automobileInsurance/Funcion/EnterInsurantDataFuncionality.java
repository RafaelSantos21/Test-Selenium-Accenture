package automobileInsurance.Funcion;

import automobileInsurance.BaseTest.BaseTest;
import automobileInsurance.Pages.EnterInsurantDataPage;
import automobileInsurance.BaseTest.Utils;
import org.openqa.selenium.By;

public class EnterInsurantDataFuncionality extends BaseTest {

    private EnterInsurantDataPage enterInsurantDataPage;
    private Utils utils;

    public EnterInsurantDataFuncionality(){
        this.enterInsurantDataPage = new EnterInsurantDataPage(driver);
        this.utils = new Utils();
    }

    public void preencherEnterInsurantData(){

        this.utils.preencheCampoTexto(this.enterInsurantDataPage.getFirstName(),"Rafael");
        this.utils.preencheCampoTexto(this.enterInsurantDataPage.getLastName(),"Leite");
        this.utils.preencheCampoTexto(this.enterInsurantDataPage.getDateOfBirth(),"10/09/1997");
        this.enterInsurantDataPage.getSelectGenderMale().click();
        this.utils.preencheCampoTexto(this.enterInsurantDataPage.getStreetAddress(),"Rua José de Brito, 240, Casa B");
        this.utils.selectByValue(this.enterInsurantDataPage.getSelectCountry(),"Brazil");
        this.utils.preencheCampoTexto(this.enterInsurantDataPage.getZipCode(),"11453205");
        this.utils.preencheCampoTexto(this.enterInsurantDataPage.getCity(),"Guarujá");
        this.utils.selectByValue(this.enterInsurantDataPage.getSelectOccupation(),"Employee");
        this.enterInsurantDataPage.getSelectHobbies().click();

    }

    public void clicarBtnNextEnterProductData(){
        this.enterInsurantDataPage.getBtnNextEnterProductData().click();
    }

    public String validarTituloEnterProductData(){
        return driver.findElement(By.xpath("//li[@class='idealsteps-step-active']/child::a[@id=\"enterproductdata\" and @name=\"Enter Product Data\"]")).getText();
       
        
    }
    
}
