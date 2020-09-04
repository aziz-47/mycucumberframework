package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    //@Before TestNG deki @Beforemedthod  gbi calsiri
    //Her senaryodan once  calsir.
    //GLOBAL Hooks annotation
    @Before(order=1)
    public void setUp(){
        System.out.println("Hooks Class- Setup Method");
    }


    //TAGGED Hooks annotation
    //Her spesific scenariodan once calisir.
    @Before(value = "@iphone",order=2)
    public  void searchIphone(){
        System.out.println("Hooks Class - iphone  method");
    }


    //her scaneriodan sonra calsir.
    @After
    public void tearDown(Scenario scenario){
        System.out.println("Hooks Class-tearDown Method");

        //screen shaot alamak icin
        final byte[]screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);


        //Her fail olan scaneriodan sonra screenshot almliyiz
        //Scenario fail olursa image ekleyelim
        if(scenario.isFailed()){
            scenario.embed(screenshot,"image/png");
        }


       // Driver.closeDriver();

    }
}
