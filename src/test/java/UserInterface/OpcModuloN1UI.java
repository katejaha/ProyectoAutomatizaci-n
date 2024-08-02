package UserInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Util.config.driver;

public class OpcModuloN1UI {
    public WebElement opc_modulo_n1 = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[3]/ul/li[10]/a/div/p"));

}
