package StepDefinitions;

import Task.ConfigEnvironmentTask;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class ConfigEnvironment {

    @Before
    public void setup() {
        ConfigEnvironmentTask tst = new ConfigEnvironmentTask();
        tst.Browser();
    }
    @After
    public void tearDown(){
        ConfigEnvironmentTask test = new ConfigEnvironmentTask();
        test.tear();
    }
    @Given("Entramos a  la url del ambiente {},{}")
    public void Environment_intelica(String ambiente,String estable) {
        ConfigEnvironmentTask test = new ConfigEnvironmentTask();
        test.Enviroment(ambiente,estable);
    }
}
