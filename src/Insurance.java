abstract class Insurance {
    protected String insuranceType;
    protected double monthlyCost;

    // Constructor//
    public Insurance(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    // Get methods//
    public String getInsuranceType() {
        return insuranceType;
    }

    public double getMonthlyCost() {
        return monthlyCost;
    }

    // Abstract methods to be implemented by subclasses//
    public abstract void setInsuranceCost(double cost);
    public abstract void displayInfo();
}
//Program Ends//