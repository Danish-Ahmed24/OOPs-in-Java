package Omar;

public class asdf extends One implements Two {
    @Override
    public void printff() {
        super.printff();
        System.out.println("Two");
    }

    public static void main(String[] args) {
        asdf asdf = new asdf();
        asdf.printff();
    }
}
