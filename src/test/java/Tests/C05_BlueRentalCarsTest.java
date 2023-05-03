package Tests;

import Pages.BlueRentalCarsPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C05_BlueRentalCarsTest {

    //BlueRentalCar Sayfasına gidin
    //Yanlış bilgiler ile Giriş yapınız
    //Hata mesajı alınız ve yazdırınız


    @Test
    public void BlueRentalCarsTest() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalCars_url"));
        Thread.sleep(1500);

        BlueRentalCarsPage rentalCarsPage = new BlueRentalCarsPage();
        rentalCarsPage.login1.click();
        Thread.sleep(1000);
        rentalCarsPage.email.sendKeys(ConfigReader.getProperty("blueRentalCarsEmail"));
        Thread.sleep(1000);
        rentalCarsPage.password.sendKeys(ConfigReader.getProperty("blueRentalCarsPassword"));
        Thread.sleep(1000);
        rentalCarsPage.login2.click();
        Thread.sleep(1000);

        String AlertMessage = rentalCarsPage.alertMessage.getText();
        System.out.println(AlertMessage);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(rentalCarsPage.alertMessage.isDisplayed(), "Hata Mesajı Alınamıyor");
        Thread.sleep(1000);
        softAssert.assertAll();
    }
}
