package tests.day17_testNGframeworkveAssertion;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ResuableMethods;

public class C01_confirigationPropertiesKullanimi  {

    @Test
    public void test01(){
        // amazon sayfasına gidin
     Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));


        // arama kutusuna gidip aranacak kelimeyi yazdırın ve aratın
        AmazonPage amazonPage =new AmazonPage();
        amazonPage.amazoncookie.click();
        ResuableMethods.bekle(1);
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime") + Keys.ENTER);

        // arama sonuclarinin aranan kelimeyi icerdigini test edin

        String expectedIcerik = ConfigReader.getProperty("amazonAranacakKelime ");
        String actualAramaSonucu = amazonPage.sonucYaziElementi.getText();

        Assert.assertTrue(actualAramaSonucu.contains(expectedIcerik));

        // sayfayi kapatin
        ResuableMethods.bekle(3);
        Driver.closeDriver();

    }
}
