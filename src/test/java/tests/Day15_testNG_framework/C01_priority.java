package tests.Day15_testNG_framework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C01_priority {
    int a =20;
    int b = 10;
    @Test(priority = 1)
    public void carpmaTesti(){
        // a * b nin yüzden büyük olduğunu test edin
        Assert.assertTrue(a*b>100);
    }
    @Test(priority = 3)
    public void toplamaTesti (){
        // sayıların toplamının pozitif oldugunu test edin
        Assert.assertTrue((a+b)>0);
    }


    @Test(priority = -6)
    public void cikarmaTesti(){
        //a ile b farkının mutlak degerinin -100 den buyuk oldugunu gösterin
        Assert.assertTrue((a-b)>-100 && (a-b)<100);
    }
/*
    TestNG hicbir mudahale olmazsa
    testleri isim sirasina gore calistirir
    testlerin calisma siralamasini istedigimiz sekilde duzenleyebiliriz

    testlere verecegimiz priority degerlerinden
    kucukten buyuge dogru calistirir

    priority atamazsak TestNG default olarak priority= 0 alir

    ayni priority degerine sahip, birden fazla test method'u varsa
    bunlar kendi icerisinde isim sirasina gore calisir
 */
}
