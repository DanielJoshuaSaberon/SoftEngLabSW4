package SoftEng_FacadePattern;

import SoftEng_FacadePattern.Concrete.*;
import SoftEng_FacadePattern.Facade.*;
import SoftEng_FacadePattern.Subsystem.*;


public class HomeApp {
    public static void main(String[]args){

        HomeService tv = new TV();
        HomeService ac = new AirConditioning();
        HomeService light = new Light();

        HomeInterface facade = new HomeInterface((TV) tv, (Light) light, (AirConditioning) ac);

        System.out.println("Turning on all");
        System.out.println(facade.turnOnAll());

        System.out.println("\nTurning off all");
        System.out.println(facade.turnOffAll());
    }
}
