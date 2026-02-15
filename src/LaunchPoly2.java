class AeroPlane2 {
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
class CargoPlane2 extends AeroPlane2 {
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
class FighterPlane2 extends AeroPlane2 {
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
public class LaunchPoly2 {
    public static void main(String[] args) {
        CargoPlane2 cp = new CargoPlane2();
        FighterPlane2 fp = new FighterPlane2();
        AeroPlane2 ref;
        ref = cp;
        ref.TakeOff();
        ref.landing();
        ref.fly();
        ref=fp;
        System.out.println("***************************");
        ref.landing();
        ref.fly();
        ref.TakeOff();
    }
}


