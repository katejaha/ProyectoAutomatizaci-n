package StepDefinitions;

import Task.ConfigIdiomaTask;
import io.cucumber.java.en.And;

public class ConfigIdiomaSD {
    @And("Seleccionamos el idioma {}")
    public void ConfigIdioma(String lenguaje) throws InterruptedException {
        ConfigIdiomaTask idioma = new ConfigIdiomaTask();
        idioma.Config_Idioma(lenguaje);
    }
}
