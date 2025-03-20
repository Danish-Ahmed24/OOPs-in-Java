package PastPaper.Q3;

public class Item {
    private static int counter =1;
    private int itemNo;
    private int id;
    private String name;
    private float price;
    private float discount;


    public Item(int itemNo,String name,float price,float discount)
    {
        this.id = this.calcCounter();
        this.price=price;
        this.name=name;
        this.itemNo=itemNo;
        this.calcPriceAfterDiscount(discount);
    }

    public void calcPriceAfterDiscount(float discount)
    {
        this.discount=discount;
        this.price-=(price*discount)/100;
    }
    public int calcCounter()
    {
        return counter++;
    }
    public void display()
    {

        System.out.println("-----------------------");
        System.out.println("ID: "+this.id);
        System.out.println("ItemNo: "+this.itemNo);
        System.out.println("Name: "+this.name);
        System.out.println("Price: "+this.price);
        System.out.println("Discount: "+this.discount);
        System.out.println("-----------------------");
    }
}
