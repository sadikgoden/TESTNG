package tests.day16_testNG_framework;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.qualitydemyPage;
import utilities.Driver;
import utilities.ResuableMethods;

public class C05_QualitydemyNegatifLoginTesti {
    pages.qualitydemyPage qualitydemyPage;
    @Test
    public void gecersizPasswordTest(){

        Driver.getDriver().get("https://www.qualitydemy.com/ ");
       // Driver.getDriver().get("https://www.qualitydemy.com/");
        qualitydemyPage= new qualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.emailKutusu.sendKeys("anevzatcelik@gmail.com");
        qualitydemyPage.passwordKutusu.sendKeys("12345");
        qualitydemyPage.cooki.click();
            qualitydemyPage.loginButonu.click();
       ResuableMethods.bekle(1);
        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());
        Driver.closeDriver();
    }

            @Test
            public void gecersizEmailTesti(){
                Driver.getDriver().get("https://www.qualitydemy.com/ ");
              //  Driver.getDriver().get("https://www.qualitydemy.com/");

                qualitydemyPage= new qualitydemyPage();
                qualitydemyPage.ilkLoginLinki.click();
                qualitydemyPage.emailKutusu.sendKeys("alican@gmail.com");
                qualitydemyPage.passwordKutusu.sendKeys("Nevzat152032");
                qualitydemyPage.cooki.click();
                qualitydemyPage.loginButonu.click();
                ResuableMethods.bekle(2);
                Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());
                Driver.closeDriver();
            }
            @Test
            public void gecersizEmailPasswordTesti(){
                Driver.getDriver().get("https://www.qualitydemy.com/ ");
                qualitydemyPage= new qualitydemyPage();
                qualitydemyPage.ilkLoginLinki.click();
                qualitydemyPage.emailKutusu.sendKeys("alican@gmail.com");
                qualitydemyPage.passwordKutusu.sendKeys("12345");
                qualitydemyPage.cooki.click();
                qualitydemyPage.loginButonu.click();
               ResuableMethods.bekle(2);
                Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());

                Driver.closeDriver();
            }
        }