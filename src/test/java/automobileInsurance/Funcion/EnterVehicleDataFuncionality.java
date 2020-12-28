package automobileInsurance.Funcion;

import automobileInsurance.BaseTest.BaseTest;
import automobileInsurance.Pages.*;
import automobileInsurance.BaseTest.Utils;
import org.openqa.selenium.By;


public class EnterVehicleDataFuncionality extends BaseTest {

    private EnterVehicleDataPage enterVehicleDataPage;
    private EnterInsurantDataPage enterInsurantDataPage;
    private EnterProductDataPage enterProductDataPage;
    private SelectPriceOptionPage selectPriceOptionPage;
    private SendQuotePage sendQuotePage;
    private Utils utils;


   public EnterVehicleDataFuncionality(){
       this.enterVehicleDataPage = new EnterVehicleDataPage(driver);
       this.enterInsurantDataPage = new EnterInsurantDataPage(driver);
       this.enterProductDataPage = new EnterProductDataPage(driver);
       this.selectPriceOptionPage = new SelectPriceOptionPage(driver);
       this.sendQuotePage = new SendQuotePage(driver);
       this.utils = new Utils();
   }

   public void preencherEnterVehicleData() {

       this.utils.selectByValue(this.enterVehicleDataPage.getOpenListMake(), "BMW");
       this.utils.selectByValue(this.enterVehicleDataPage.getOpenListModelCar(), "Scooter");
       this.utils.preencheCampoTexto(this.enterVehicleDataPage.getTextBoxCylinderCapacity(), "200");
       this.utils.preencheCampoTexto(this.enterVehicleDataPage.getTextBoxEnginePerformance(), "500");
       this.utils.preencheCampoTexto(this.enterVehicleDataPage.getDateOfManuFacture(), "09/10/2020");
       this.utils.selectByValue(this.enterVehicleDataPage.getOpenListNumberOfSeats(), "4");
       this.enterVehicleDataPage.getSelectRightHandDriveYes().click();
       this.utils.selectByValue(this.enterVehicleDataPage.getOpenListNumberOfSeatsMotorcycle(), "2");
       this.utils.selectByValue(this.enterVehicleDataPage.getOpenListFuelType(), "Diesel");
       this.utils.preencheCampoTexto(this.enterVehicleDataPage.getTextBoxPayload(), "200");
       this.utils.preencheCampoTexto(this.enterVehicleDataPage.getTextBoxTotalWeight(), "500");
       this.utils.preencheCampoTexto(this.enterVehicleDataPage.getTextBoxListPrice(), "100000");
       this.utils.preencheCampoTexto(this.enterVehicleDataPage.getTextBoxLicensePlateNumber(), "000000000");
       this.utils.preencheCampoTexto(this.enterVehicleDataPage.getTextBoxAnnualMileage(), "100000");

   }

    public void clicarBtnNext(){ this.enterVehicleDataPage.getButtonNext().click(); }

    public String retornMensagem(){
        return driver.findElement(By.xpath("//li[@class='idealsteps-step-active']/child::a[@id=\"enterinsurantdata\" and @name=\"Enter Insurant Data\"]")).getText();



    }
}
