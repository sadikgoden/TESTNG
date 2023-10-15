package tests.day16_testNG_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_ClassDriverKulllanma {
    @Test
    public void amazonTest(){
        //amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");
        // nutella arat
        WebElement aramaKutusu = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        // sayfayı kapat
        Driver.closeDriver();
    }

    @Test
    public void youtubeTesti(){
       // youtube gidiniz
       Driver.getDriver().get("https:\\www.youtube.com");
       Driver.closeDriver();
    }
}
