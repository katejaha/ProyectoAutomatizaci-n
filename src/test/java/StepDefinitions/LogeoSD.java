package StepDefinitions;


import Task.LogeoTask;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LogeoSD {
    @And("Seleccionamos Generate Token")
    public void Logeo () throws InterruptedException{
        LogeoTask test = new LogeoTask();
            test.logeotest();

    }
}
