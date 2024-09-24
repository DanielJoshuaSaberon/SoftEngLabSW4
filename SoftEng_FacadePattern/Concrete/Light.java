package SoftEng_FacadePattern.Concrete;

import SoftEng_FacadePattern.Subsystem.*;

public class Light implements HomeService {

    @Override
    public String turnOn() {
        return "Light is on";
    }

    @Override
    public String turnOff() {
        return "Light is off";
    }
}
