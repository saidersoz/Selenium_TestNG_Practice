package Tests;

import Utilities.ConfigReader;
import Utilities.Driver;
import org.testng.annotations.Test;

public class C06_DependsOnMethods {

    //Amazon Sayfasına Git
    //1. Testte Amazon Sayfasına git
    //2.Testte iphone ara
    //3.Testte sonuç yazısını yazdır
    //4.Testte geri gel 2 ürüne tıklayıp başlığını yazdır

    //testleri birbirine bağla


    @Test
    public void test01Amazon() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Thread.sleep(1500);
    }

    @Test
    public void test02Amazon() {

    }

    @Test
    public void test03Amazon() {

    }

    @Test
    public void test04Amazon() {

    }
}
