package Blood;

/**
 * Created by jc349598 on 29/11/16.
 */
public class TestBloodData
{
    public static void main(String[] args)
    {
        BloodData bloodtest = new BloodData("B","-");
        System.out.println("Blood Type: " + bloodtest.getBloodType());
        System.out.println("RH Factor: " + bloodtest.getRhFactor());

    }
}