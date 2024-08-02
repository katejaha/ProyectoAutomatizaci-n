package Task;

import UserInterface.OpcModuloN1UI;
import UserInterface.OpcModuloUI;

public class OpcModuloN1Task {
    public void Opc_ModuloN1(String moduloN1) throws InterruptedException {
        OpcModuloN1UI seleccionar_n1 = new OpcModuloN1UI();
        seleccionar_n1.opc_modulo_n1.click();
        Thread.sleep(2_000);
    }

}
