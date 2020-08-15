import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormPage {

    public static void submitForm(WebDriver driver)
    {
        //Pregunta 1 Radio 10
        driver.findElement(By.xpath("((//span[@class= \"radio-button-display \"]))[11]")).click();
        //Pregunta 2
        driver.findElement(By.id("514168787")).sendKeys("Trabajo en equipo");

        driver.findElement(By.id("514174619")).click();


        driver.findElement(By.xpath("((//option[@value= \"3397418581\"]))")).click();

        driver.findElement(By.xpath("((//span[@class= \"radio-button-display \"]))[22]")).click();

        driver.findElement(By.id("514168790")).sendKeys("Para que forme parte de un equipo agile multidiciplinario ");

        driver.findElement(By.xpath("((//span[@class= \"radio-button-display \"]))[26]")).click();

        driver.findElement(By.xpath("((//span[@class= \"radio-button-display \"]))[30]")).click();
        driver.findElement(By.xpath("((//span[@class= \"radio-button-display \"]))[30]")).click();
        driver.findElement(By.xpath("((//span[@class= \"radio-button-display \"]))[34]")).click();
        driver.findElement(By.xpath("((//span[@class= \"radio-button-display \"]))[38]")).click();
        driver.findElement(By.xpath("((//span[@class= \"radio-button-display \"]))[42]")).click();
        driver.findElement(By.xpath("((//span[@class= \"radio-button-display \"]))[46]")).click();
        driver.findElement(By.xpath("((//span[@class= \"radio-button-display \"]))[50]")).click();
        driver.findElement(By.xpath("((//span[@class= \"radio-button-display \"]))[54]")).click();
        driver.findElement(By.xpath("((//span[@class= \"radio-button-display \"]))[58]")).click();

        driver.findElement(By.id("514168794")).sendKeys("No dar por entendido las cosas");

        driver.findElement(By.xpath("((//span[@class= \"radio-button-display \"]))[62]")).click();
        driver.findElement(By.xpath("((//span[@class= \"radio-button-display \"]))[63]")).click();
        driver.findElement(By.xpath("((//span[@class= \"radio-button-display \"]))[65]")).click();
        driver.findElement(By.xpath("((//span[@class= \"radio-button-display \"]))[74]")).click();



    }

    public  static void loginGanaNet(WebDriver driver, String url, String codigoPersona, String pass){
        driver.get(url);
        driver.findElement(By.xpath("((//input[@class= \"form-control ng-untouched ng-pristine ng-valid\"]))[1]")).sendKeys(codigoPersona);
        driver.findElement(By.xpath("((//button[@type= \"submit\"]))[1]")).click();

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("((//input[@type= \"password\"]))[1]")));
        driver.findElement(By.xpath("((//input[@type= \"password\"]))[1]")).sendKeys(pass);
        driver.findElement(By.xpath("((//button[@type= \"submit\"]))[1]")).click();
    }
    public static void validarLogin (WebDriver driver, String nombrePersona) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[contains(text(),'"+nombrePersona+"')]"))));

    }


    public static void dynamicXpathTeamName(String teamName, WebDriver driver){
        driver.findElement(By.xpath("//div/button[contains(text(),'"+teamName+"')]")).click();


    }
}
