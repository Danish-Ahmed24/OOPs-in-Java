package PastPaper.Q3;

public class Main {
    public static void main(String[] args) {
    Store store = new Store();
    Item i1=new Item(101,"Apple",123.4f,3.0f);
    Item i2=new Item(102,"Pen",23.4f,2.0f);
    Item i3=new Item(103,"Mango",200.4f,10.0f);
        store.addItem(i1);
        store.addItem(i2);
        store.addItem(i3);
    store.displayItems(3);
    }
}
