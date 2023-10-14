package tests.day17_testNGframeworkveAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C04_Assertions {
    @Test
    public void test01(){
        // amazon anasayfaya gidelim
Driver.getDriver().get("amazonUrl");
// url'in amazon icerdigini test edelim
String expectedUrl ="amazon";
String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));
// aranacak kelimeyi aratalim
        AmazonPage amazonPage =new AmazonPage();
        amazonPage.aramaKutusu.sendKeys();
// sonuclarin aranacak kelimeyi icerdigini test edelim

// ilk urune tiklayalim

// ilk urun isminde aranacak kelime bulundugunu test edelim

// sayfayi kapatalim

    }

}
