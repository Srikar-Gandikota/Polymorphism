class AeroPlane{
    public void TakeOff(){
        System.out.println("AeroPlane must take off in order to fly");
    }
    public void landing(){
        System.out.println("AeroPlane must land");
    }
}
class CargoPlane extends AeroPlane{
    public void TakeOff(){
        System.out.println("CargoPlane requires longer runway to takeoff");
    }
    public void fly(){
        System.out.println("CargoPlane must fly");
    }
}
class FighterPlane extends AeroPlane{
    public void TakeOff(){
        System.out.println("FighterPlane requires shorter runway to takeoff");
    }
    public void fly(){
        System.out.println("FighterPlane must fly");
    }
}
public class LaunchPolymorphism {
    public static void main(String[] args) {
        AeroPlane cp=new CargoPlane();
        cp.TakeOff();
        cp.landing();
        ((CargoPlane)cp).fly();
        AeroPlane fp=new FighterPlane();
        fp.TakeOff();
        fp.landing();
        ((FighterPlane)fp).fly();
    }
}
