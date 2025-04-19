package lab10;

interface OrderPolicy {
    void acceptOrder();
    float calculatePreparationTime();

    static void commonGuidelines() {
        System.out.println("orders must be confirmed within 2 minutes of receiving" +
                "\npreparation time should not exceed 45 minutes.");
    }
}

interface DeliveryPolicy {
    void assignRider();
    float calculateDeliveryCharge();
}

class RestaurantPartner implements OrderPolicy, DeliveryPolicy {
    @Override
    public void acceptOrder() {
        System.out.println("Order accepted by restaurant partner.");
    }

    @Override
    public float calculatePreparationTime() {
        float time = 25.0f;
        System.out.println("Preparation time: " + time + " minutes.");
        return time;
    }

    @Override
    public void assignRider() {
        System.out.println("Rider assigned from restaurant partner pool.");
    }

    @Override
    public float calculateDeliveryCharge() {
        float charge = 100.0f;
        System.out.println("Delivery charge: Rs " + charge);
        return charge;
    }
}

class ExpressDeliveryPartner implements DeliveryPolicy {
    @Override
    public void assignRider() {
        System.out.println("Express rider assigned for faster delivery.");
    }

    @Override
    public float calculateDeliveryCharge() {
        float charge = 150.0f;
        System.out.println("Express delivery charge: Rs " + charge);
        return charge;
    }
}

public class Q10_lab10 {
    public static void main(String[] args) {
        OrderPolicy order = new RestaurantPartner();
        DeliveryPolicy delivery = new RestaurantPartner();

        OrderPolicy.commonGuidelines();
        order.acceptOrder();
        order.calculatePreparationTime();

        delivery.assignRider();
        delivery.calculateDeliveryCharge();

        DeliveryPolicy[] partners = {
                new RestaurantPartner(),
                new ExpressDeliveryPartner()
        };

        for (DeliveryPolicy dp : partners) {
            dp.assignRider();
            dp.calculateDeliveryCharge();
        }
    }
}
