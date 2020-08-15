import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class FormTest {

    @Test
    public void main() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rosa De Udaeta\\Downloads\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://es.surveymonkey.com/r/Aceleranps?date=Agosto1");
        FormPage formPage = new FormPage();

        formPage.submitForm(driver);


        //formPage.dynamicXpathTeamName("Otros", driver);
        driver.quit();
    }
}