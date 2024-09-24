package SoftEng_FacadePattern.Concrete;

import SoftEng_FacadePattern.Subsystem.*;

public class TV implements HomeService {

    @Override
    public String turnOn() {
        return "Tv is on";
    }

    @Override
    public String turnOff() {
        return "Tv is off";
    }
}
