package Q5;

public class Product_Q5 {
    protected void showDetails()
    {
        System.out.println("Showing general details!");
    }
}
class Electronics extends Product_Q5 {
    protected void showDetails()
    {
        System.out.println("Shwoing electronics details");
    }
    void applyWarranty(){
        System.out.println("Applying warranty");
    }
}
class Clothing extends Product_Q5 {
    protected void showDetails()
    {
        System.out.println("Shwoing Cloths details");
    }
    void applyDiscount(){
        System.out.println("Applying discount");
    }
}
class Main{
    public static void main(String[] args) {
        System.out.println("UP Cast");
        Product_Q5 electronic = new Electronics();
        Product_Q5 cloth = new Clothing();
        cloth.showDetails();
        electronic.showDetails();
        System.out.println("Down Cast");
        Electronics clothDOWN = (Electronics) electronic;
        Clothing productDOWN = (Clothing) cloth;
        clothDOWN.applyWarranty();
        productDOWN.applyDiscount();


    }
}