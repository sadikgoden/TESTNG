package tests.day16_testNG_framework;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;


public class C02_PageClassKullanimi {
    @Test
    public void nutellaTesti(){

        // amazona gidelim

        Driver.getDriver().get("https://www.amazon.com");
        // Nutella icin arama yapalim

        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        // arama sonuclarinin Nutella icerdigini test edelim
        String expectedIcerik = "Nutella";
        String actualSonucYazisi = amazonPage.sonucYaziElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));

        // driver'i kapatalim
        Driver.closeDriver();
    }


}
  //@FindBy(linkText = "Log in")
//public WebElement ilkLoginLinki;
//
//@FindBy(id = "login-email")
//public WebElement emailKutusu;
//
//@FindBy(id = "login-password")
//public WebElement passwordKutusu;
//
//@FindBy(xpath = "//button[text()='Login']")
//public WebElement loginButonu;