package tests.day19_testNGreports_crossBrowserTest;

public class C05_QualitydemyCokluNegatifLoginTesti {
}
/*
  @DataProvider
    public static Object[][] gecersizKullaniciListesi() {

        String[][] gecersizKullaniciBilgileri = new String[10][2];
        Faker faker = new Faker();

        for (int i = 0; i <gecersizKullaniciBilgileri.length ; i++) {

            gecersizKullaniciBilgileri[i][0] = faker.internet().emailAddress();
            gecersizKullaniciBilgileri[i][1] = faker.internet().password();

        }

        return gecersizKullaniciBilgileri;
    }

    @Test(dataProvider = "gecersizKullaniciListesi")
    public void cokluNegatifTest(String username, String password){
        // qualitydemy anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        // ilk login linkine tiklayin
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();

        // verilen gecersiz kullanici adi ve sifreleri listesindeki
        // 5 isim ve sifre icin giris yapilamadigini test edin

        qualitydemyPage.emailKutusu.sendKeys(username);
        qualitydemyPage.passwordKutusu.sendKeys(password);
        qualitydemyPage.loginButonu.click();

        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());

        // sayfayi kapatin
        Driver.closeDriver();
    }
}
 */