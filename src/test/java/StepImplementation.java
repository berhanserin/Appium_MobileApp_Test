import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class StepImplementation extends BaseTesting {


    @Step("Hesabım butonuna tıkla")
    public void AccountInfoButton() throws InterruptedException {
        MobileElement el1 = (MobileElement) appiumDriver.findElementByAccessibilityId("Hesabım");
        el1.click();
        System.out.println("Elemente tıklandı  !!!!!!!");
    }

    @Step("<key> li iteme tıkla")
    public void LoginAccount(String key) throws InterruptedException {
        appiumDriver.findElement(By.id(key)).click();
    }

    @Step("<key> Saniye Bekle")
    public void  Bekle(int key) throws InterruptedException {
        Thread.sleep(key*1000);
    }

    @Step("<key> idli elemente <string> yazımı")
    public void idSetText(String key,String string){
        appiumDriver.findElement(By.id(key)).sendKeys(string);
    }
}
