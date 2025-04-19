package lab10;
abstract class Animals {
    abstract void cats();
    abstract void dogs();
}
class Cats extends Animals{
    @Override
    void cats() {
        System.out.println("Cat's Meow");
    }

    @Override
    void dogs() {
        System.out.println("it is cat cant bark");
    }
}

class Dogs extends Animals{
    @Override
    void cats() {
        System.out.println("Cant meow");
    }

    @Override
    void dogs() {
        System.out.println("Dogs Bark");
    }
}
public class Q4_lab10 {
    public static void main(String[] args) {
        Dogs d = new Dogs();
        Cats c = new Cats();
        d.dogs();
        c.cats();
    }
}
