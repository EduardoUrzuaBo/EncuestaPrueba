import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

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
        driver.findElement(By.xpath("//div/button[contains(text(),'Finalizar')]")).click();


    }

}
