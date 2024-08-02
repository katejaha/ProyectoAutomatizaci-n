package StepDefinitions;

import Task.OpcModuloN1Task;
import io.cucumber.java.en.And;

public class OpcModuloN1 {
    @And("Seleccionamos el modulo N1")
    public void Opc_ModuloN1(String modulon1 ) throws InterruptedException {
        OpcModuloN1Task selecciona_n1 = new OpcModuloN1Task();
        selecciona_n1.Opc_ModuloN1(modulon1);
    }
}