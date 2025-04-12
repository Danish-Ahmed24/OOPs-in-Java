package mid2Prep;

import java.util.ArrayList;

class Pastry {
    protected String name;
    protected String ingredients;
    protected int productionCost;
    protected int taxRates;
    public Pastry(String name,String ingredients,int productionCost,int taxRates)
    {
        this.name=name;
        this.productionCost=productionCost;
        this.ingredients=ingredients;
        this.taxRates=taxRates;
    }
    public int calcTotalCost(){
        return productionCost;
    }
}
class SweetPastry extends Pastry{
    public SweetPastry(String name,String ingredients,int productionCost,int taxRates)
    {
        super(name,ingredients,productionCost,taxRates);
    }
}
class SavoryPastry extends Pastry{
    public SavoryPastry(String name,String ingredients,int productionCost,int taxRates)
    {
        super(name,ingredients,productionCost,taxRates);
    }
}