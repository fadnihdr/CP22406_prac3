public class Billing {
    public static void main(String[] args){
        double coupon = 0;
        double price = 12;
        double quantity = 0;
        if (price>0){
            if (quantity>0) {
                if (coupon > 0) {
                    computeBill(price,quantity,coupon);
                }
                else {
                    computeBill(price, quantity);
                }
            }
            else {
                computeBill(price);
            }
        }

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
