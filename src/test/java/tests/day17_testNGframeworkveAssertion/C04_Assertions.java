package tests.day17_testNGframeworkveAssertion;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_Assertions {
    @Test
    public void test01(){
        // amazon anasayfaya gidelim
Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
// url'in amazon icerdigini test edelim
String expectedUrl ="amazon";
String actualUrl = Driver.getDriver().getCurrentUrl();
Assert.assertTrue(actualUrl.contains(expectedUrl));
// aranacak kelimeyi aratalim
AmazonPage amazonPage =new AmazonPage();
amazonPage.amazoncookie.click();
amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime")+ Keys.ENTER);

// sonuclarin aranacak kelimeyi icerdigini test edelim
        String expectedIcerik = ConfigReader.getProperty("amazonAranacakKelime");
        String actualIcerik = amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualIcerik.contains(expectedIcerik));
// ilk urune tiklayalim
        amazonPage.ilkUrunElementi.click();
// ilk urun isminde aranacak kelime bulundugunu test edelim
    String expectedUrunIcerik = ConfigReader.getProperty("amazonAranacakKelime");
    String actualIsim = amazonPage.ilkUrunIsimElementi.getText();
    Assert.assertTrue(actualIsim.contains(expectedUrunIcerik));
// sayfayi kapatalim
        Driver.closeDriver();

    }

}
