package FinalPractice3;

public class Saving extends Account implements Comparable<Saving>{
    private double rate;
    private int nbYear;

    public Saving(int accNum, double bal, double rate, int nbYear) {
        super(accNum, bal);
        if(rate<0)
        {
            this.rate = -1*rate;
        }
        if(nbYear<0)
        {
            this.nbYear =-1*nbYear;
        }
    }

    @Override
    public String toString() {
        return "Saving Account info: \n"+super.toString()+"Rate: "+this.rate+" Number of Years: "+this.nbYear;
    }

    @Override
    public double computeInterest() {
        return (this.balance*rate*nbYear);
    }
    @Override
    public int compareTo(Saving saving){
        return Double.compare(this.rate,saving.rate);
    }
}
