package Omar;

public class Handling {
    public static void main(String[] args) {

        Stringggg s = new Stringggg();
        Stringggg s2 = new Stringggg();
        try {
            s.addName("hh");
            s2.addName("sdfa");
            s2.addName("sdfa");
            s2.addName("sdfa");
            s2.addName("sdfa");

        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
