package tests.practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class C02 {
    static WebDriver driver;
    @BeforeClass
    public static void setup (){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterClass
    public void teardown (){
        driver.close();
    }
    /*
Birbirine bağımlı testler oluşturun
before ve after class ile setup ayaralarını yapın
Birbirine bağlı testlerle
önce wisequarter'a gidin
wisequarter adresine gidebilirse oradan amazon.com adresine gitsin
amazon.com adresine gidebilirse google adresine gitsin
driver kapatsın

*/
    @Test
    public void wise(){
        driver.get(ConfigReader.getProperty("wiseUrl"));
    }
    @Test(dependsOnMethods = "wise")
    public void amazon (){
 driver.get(ConfigReader.getProperty("amazonUrl"));
    }
    @Test(dependsOnMethods = "amazon")
    public void google (){
       driver.get(ConfigReader.getProperty("googleUrl"));
    }
}
