package Patient;

/**
 * Created by jc349598 on 29/11/16.
 */
public class TestPatient {
    public static void main(String [] args){
        Patient test = new Patient(2234,22,"B","+");
        System.out.println("Patient ID: " + test.getPatientId());
        System.out.println("Paatient age: " + test.getPatientAge());
        System.out.println("Patient Blood type: " + test.getPatientType());
        System.out.println("Patient Rh Factor: " + test.getPatientFactor());

    }

}
