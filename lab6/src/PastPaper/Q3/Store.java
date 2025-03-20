package PastPaper.Q3;

import java.util.ArrayList;

public class Store {
    private ArrayList<Item> items;
    public Store()
    {
        this.items=new ArrayList<>();
    }
    public void addItem(Item item)
    {
        this.items.add(item);
    }
    public void removeItem(Item item)
    {
        this.items.remove(item);
    }
    public void displayItems(int numberOfItems)
    {
        for (int i=0;i<numberOfItems;i++)
        {
            this.items.get(i).display();
        }
    }
}
