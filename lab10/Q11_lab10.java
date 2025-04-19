package lab10;

abstract class ElectricityConsumer {
    protected String consumerId;
    protected int unitsConsumed;
    protected int peakHourUsage;
    protected float bill;

    public ElectricityConsumer(String consumerId, int unitsConsumed, int peakHourUsage) {
        this.consumerId = consumerId;
        this.unitsConsumed = unitsConsumed;
        this.peakHourUsage = peakHourUsage;
    }

    public abstract void calculateBill();
    public abstract void applyPeakHourPenalty();

    public void generateBill() {
        calculateBill();
        applyPeakHourPenalty();
        System.out.println("Consumer ID: " + consumerId);
        System.out.println("Final Bill: Rs " + bill);
    }

    public float getBillAmount() {
        return bill;
    }
}

class ResidentialConsumer extends ElectricityConsumer {
    public ResidentialConsumer(String consumerId, int unitsConsumed, int peakHourUsage) {
        super(consumerId, unitsConsumed, peakHourUsage);
    }

    public void calculateBill() {
        if (unitsConsumed <= 100) {
            bill = unitsConsumed * 5;
        } else {
            bill = 100 * 5 + (unitsConsumed - 100) * 8;
        }
        if (bill < 500) {
            bill = 500;
        }
    }

    public void applyPeakHourPenalty() {
        bill += peakHourUsage * 2;
    }
}

class CommercialConsumer extends ElectricityConsumer {
    public CommercialConsumer(String consumerId, int unitsConsumed, int peakHourUsage) {
        super(consumerId, unitsConsumed, peakHourUsage);
    }

    public void calculateBill() {
        bill = unitsConsumed * 10;
        if (bill < 1000) {
            bill = 1000;
        }
    }

    public void applyPeakHourPenalty() {
        bill += peakHourUsage * 5;
    }
}

class IndustrialConsumer extends ElectricityConsumer {
    public IndustrialConsumer(String consumerId, int unitsConsumed, int peakHourUsage) {
        super(consumerId, unitsConsumed, peakHourUsage);
    }

    public void calculateBill() {
        bill = unitsConsumed * 15;
        if (bill < 5000) {
            bill = 5000;
        }
    }

    public void applyPeakHourPenalty() {
        bill += peakHourUsage * 10;
    }
}

class BillAudit {
    public static float calculateAverageBill(ElectricityConsumer[] consumers) {
        float total = 0;
        for (ElectricityConsumer c : consumers) {
            total += c.getBillAmount();
        }
        return total / consumers.length;
    }
}

public class Q11_lab10 {
    public static void main(String[] args) {
        ElectricityConsumer[] consumers = {
                new ResidentialConsumer("1", 120, 8),
                new CommercialConsumer("2", 90, 12),
                new IndustrialConsumer("3", 280, 18)
        };

        for (ElectricityConsumer ec : consumers) {
            ec.generateBill();
        }

        float average = BillAudit.calculateAverageBill(consumers);
        System.out.println("Average Bill for Audit: Rs " + average);
    }
}
