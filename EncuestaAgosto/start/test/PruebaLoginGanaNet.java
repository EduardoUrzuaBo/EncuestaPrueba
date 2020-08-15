import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;
public class PruebaLoginGanaNet  {
    @Test
    public void main() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Programador\\Downloads\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://10.141.1.10:8080/apps/GanaNetTest");
        FormPage formPage = new FormPage();
        formPage.loginGanaNet(driver,"http://10.141.1.10:8080/apps/GanaNetTest" , "521", "1234" );
        formPage.validarLogin(driver, "Pablo");
        driver.quit();
    }
        }