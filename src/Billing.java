/**
 * Created by fadni on 29/11/2016.
 */
public class Billing {
    double totalDue;
    public void main(String[] args){

        computeBill(2.5,4.5,22);
        System.out.println(totalDue);
    }
    public double computeBill(double price, double quantity, double coupon){
        double totalDue;
        double totalPrice;
        double tax = 0.08;
        if (price>0){
            if (quantity>0){
                if (coupon>0){
                    totalPrice = ((price * quantity) - coupon);
                    totalDue = (totalPrice + (tax * totalPrice));
                    return totalDue;
                }
                else {
                    totalPrice = ((price * quantity));
                    totalDue = totalPrice + ((tax * totalPrice));
                    return totalDue;
                }
            }
        }
        else{
            totalPrice = price;
            totalDue = (totalPrice + (tax * totalPrice));
            return totalDue;
        }
        return -1;



    }
}
