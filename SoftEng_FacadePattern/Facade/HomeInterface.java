package SoftEng_FacadePattern.Facade;

import SoftEng_FacadePattern.Concrete.*;
import SoftEng_FacadePattern.Subsystem.HomeService;

public class HomeInterface {
    private TV tv;
    private Light light;
    private AirConditioning ac;


    public HomeInterface(TV tv, Light light, AirConditioning ac) {
        this.tv = tv;
        this.light = light;
        this.ac = ac;
    }


    public String turnOnAll(){

        return light.turnOn() +"\n"+ tv.turnOn()+"\n"+ ac.turnOn();
    }

    public String turnOffAll(){
        return light.turnOff()+"\n"+ tv.turnOff()+"\n" + ac.turnOff();
    }
}
