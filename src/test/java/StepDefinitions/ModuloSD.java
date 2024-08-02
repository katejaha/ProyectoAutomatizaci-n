package StepDefinitions;

import Task.OpcModuloN1Task;
import Task.OpcModuloTask;
import io.cucumber.java.en.And;

public class ModuloSD {
    @And("Seleccionamos el modulo {}")
    public void Opc_Modulo1(String moduloprincipal) throws InterruptedException {
        OpcModuloTask selecciona = new OpcModuloTask();
        selecciona.Opc_Modulo1(moduloprincipal);
    }
    }
