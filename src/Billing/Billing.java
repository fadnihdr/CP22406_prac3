package Billing;

public class Billing {
    public static void main(String[] args) {
        double coupon = 3;
        double price = 10;
        double quantity = 2;
        computeBill(price, quantity, coupon);
        computeBill(price, quantity);
        computeBill(price);
    }


    public static double computeBill(double price, double quantity, double coupon){
        double totalDue;
        double totalPrice;
        double tax = 0.08;
        totalPrice = ((price * quantity) - coupon);
        totalDue = (totalPrice + (tax * totalPrice));
        System.out.println(totalDue);
        return totalDue;
    }

    public static double computeBill(double price, double quantity){
        double totalDue;
        double totalPrice;
        double tax = 0.08;
        totalPrice = ((price * quantity));
        totalDue = totalPrice + ((tax * totalPrice));
        System.out.println(totalDue);
        return totalDue;
    }

    public static double computeBill(double price){
        double totalDue;
        double totalPrice;
        double tax = 0.08;
        totalPrice = price;
        totalDue = (totalPrice + (tax * totalPrice));
        System.out.println(totalDue);
        return totalDue;
    }
}
