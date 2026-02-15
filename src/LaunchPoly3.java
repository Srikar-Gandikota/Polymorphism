class AeroPlane3 {
    public void TakeOff() {
        System.out.println("AeroPlane must take off in order to fly");
    }

    public void landing() {
        System.out.println("AeroPlane must land");
    }

    public void fly() {
        System.out.println("AeroPlane must fly");
    }
}
class CargoPlane3 extends AeroPlane3 {
    public void TakeOff() {
        System.out.println("CargoPlane requires longer runway to takeoff");
    }
    public void landing() {
        System.out.println("CargoPlane must land");
    }
    public void fly() {
        System.out.println("CargoPlane must fly");
    }
}
class FighterPlane3 extends AeroPlane3 {
    public void TakeOff() {
        System.out.println("FighterPlane requires shorter runway to takeoff");
    }
    public void fly() {
        System.out.println("FighterPlane must fly");
    }
    public void landing() {
        System.out.println("FighterPlane must land");
    }
}
class Airport{
    public void permit(AeroPlane3 aeroPlane){
        aeroPlane.TakeOff();
        aeroPlane.landing();
        aeroPlane.fly();
    }
}
public class LaunchPoly3 {
    public static void main(String[] args) {
        CargoPlane3 cp = new CargoPlane3();
        FighterPlane3 fp = new FighterPlane3();
        Airport a = new Airport();
        a.permit(fp);
        a.permit(cp);
    }
}
