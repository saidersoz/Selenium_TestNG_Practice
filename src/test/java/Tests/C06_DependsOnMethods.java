package Tests;

import Pages.AmazonPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class C06_DependsOnMethods {

    //Amazon Sayfasına Git
    //1. Testte Amazon Sayfasına git
    //2.Testte iphone 13 pro ara
    //3.Testte sonuç yazısını yazdır
    //2. ürüne tıklayıp başlığını yazdır

    //testleri birbirine bağla

    AmazonPage amazonPage = new AmazonPage();

    @Test
    public void test01Amazon() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Thread.sleep(1500);
    }

    @Test(dependsOnMethods = "test01Amazon")
    public void test02Amazon() throws InterruptedException {
        amazonPage.searchBox.sendKeys("iphone 13 pro" + Keys.ENTER);
        Thread.sleep(1500);
    }

    @Test(dependsOnMethods = "test02Amazon")
    public void test03Amazon() throws InterruptedException {
        System.out.println(amazonPage.result.getText());
        Thread.sleep(1500);
    }

    @Test(dependsOnMethods = "test03Amazon")
    public void test04Amazon() throws InterruptedException {
        amazonPage.urun2.click();
        System.out.println(Driver.getDriver().getTitle());
        Thread.sleep(1000);
    }
}
