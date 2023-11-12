package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class qualitydemyPage {
    public qualitydemyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(linkText = "Log in")
    public WebElement ilkLoginLinki;
    @FindBy(id= "login-email")
    public WebElement emailKutusu;
    @FindBy(id = "login-password")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButonu;

      @FindBy(xpath="//a[normalize-space()='Accept']")
      public WebElement cooki ;

    @FindBy(linkText = "My courses")
    public WebElement basariliGirisElementi;


}