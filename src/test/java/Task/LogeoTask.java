package Task;


import Util.config;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class LogeoTask extends config {
    public void logeotest () throws InterruptedException {
      /*  LogeoUI seleccionar = new LogeoUI();
        seleccionar.generate_token_boton.click();
       Thread.sleep(10_000);*/
        Actions actions =new Actions (driver);
        actions.sendKeys(Keys.ENTER).build().perform();
            Thread.sleep(40_000);
    }
}
