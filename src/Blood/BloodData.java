package Blood;

public class BloodData {
    String bloodType;
    String rhFactor;
    public BloodData()
    {
        bloodType = "O";
        rhFactor = "+";
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }

    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }

    public BloodData(String type, String factor)
    {
        bloodType = type;
        rhFactor = factor;
    }

}
