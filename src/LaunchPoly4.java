class Animal{
    public void eat(){
        System.out.println("Animal eat");
    }
    public void running(){
        System.out.println("Animal running");
    }
}
class Tiger extends Animal{
    public void eat(){
        System.out.println("Tiger eat");
    }
    public void running(){
        System.out.println("Tiger running");
    }
}
class Monkey extends Animal{
    public void eat(){
        System.out.println("Monkey eat");
    }
    public void running(){
        System.out.println("Monkey running");
    }
}
class Forest{
    public void permit1(Animal animal){//Polymorphic cell
        animal.eat();// 1 to many
        animal.running();// 1 to many
    }
}
public class LaunchPoly4 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        Monkey m = new Monkey();
        Forest f = new Forest();
        f.permit1(t);
        f.permit1(m);
    }
}
