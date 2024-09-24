package SoftEng_FacadePattern.Concrete;

import SoftEng_FacadePattern.Subsystem.*;

public class AirConditioning implements HomeService {

    @Override
    public String turnOn() {
        return "AC is on";
    }

    @Override
    public String turnOff() {
        return "AC is off";
    }
}
