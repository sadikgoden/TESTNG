package tests.day17_testNGframeworkveAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.qualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ResuableMethods;

public class C02_QalidemyTesti {

    @Test
    public void pozitifLoginTesti(){

       //  1- https://www.qualitydemy.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

       //2- login linkine basin
      qualitydemyPage qualitydemyPage = new qualitydemyPage();
      qualitydemyPage.cooki.click();
        ResuableMethods.bekle(2);
        qualitydemyPage.ilkLoginLinki.click();

        //3- Kullanici email'i olarak valid email girin
        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliEmail"));
        //4- Kullanici sifresi olarak valid sifre girin
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        //5- Login butonuna basarak login olun
        qualitydemyPage.loginButonu.click();
        //6- Basarili olarak giris yapilabildigini test edin

        Assert.assertTrue(qualitydemyPage.basariliGirisElementi.isDisplayed());
        ResuableMethods.tumSayfaFotografCek("QualitydemyPozitifLogin");
        Driver.closeDriver();

    }
}
