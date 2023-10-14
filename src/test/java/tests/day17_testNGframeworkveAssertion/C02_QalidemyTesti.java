package tests.day17_testNGframeworkveAssertion;

import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_QalidemyTesti {

    @Test
    public void pozitifLoginTesti(){

       //  1- https://www.qualitydemy.com/ anasayfasina gidin
        Driver.getDriver().get("qdUrl");

       //2- login linkine basin
      QualitydemyPage qualitydemyPage = new QualitydemyPage();
     // 3- Kullanici email’i olarak valid email girin
     //4- Kullanici sifresi olarak valid sifre girin
    //5- Login butonuna basarak login olun
    //6- Basarili olarak giris yapilabildigini test edin

    }
}
