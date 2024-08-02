package Task;

import Util.config;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.Objects;

public class ConfigEnvironmentTask extends config {
    public void Browser(){
        System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/src/main/java/drivers/msedgedriver.exe");
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new EdgeDriver(edgeOptions);//edgeOptions
        driver.manage().window().maximize();
    }

    public void tear(){
        driver.quit();
    }

    public void Enviroment(String ambiente,String estable) {
        if (Objects.equals(ambiente, "QA") && Objects.equals(estable, "si")){
            driver.get(QA);
            System.out.println("Ambiente de Prueba: "+ ambiente + "y la estabilidad es: " + estable);
        } else if (Objects.equals(ambiente, "QA") && Objects.equals(estable, "no")) {
            driver.get(PRD);
            System.out.println("Ambiente de Prueba: " + ambiente + " y la estabilidad es: " + estable);
        }

        }
    }

