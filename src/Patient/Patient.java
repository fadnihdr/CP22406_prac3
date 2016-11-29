package Patient;
import Blood.BloodData;

public class Patient {
    int patientId;
    int patientAge;
    String patientType;
    String patientFactor;
    public Patient()
    {
        int idNum = 0;
        int age = 0;
        BloodData patientBlood = new BloodData("O","-");
    }

    public Patient(int idNum, int age, String type, String factor)
    {
        patientId = idNum;
        patientAge = age;
        patientType = type;
        patientFactor = factor;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    public String getPatientFactor() {
        return patientFactor;
    }

    public void setPatientFactor(String patientFactor) {
        this.patientFactor = patientFactor;
    }
}
