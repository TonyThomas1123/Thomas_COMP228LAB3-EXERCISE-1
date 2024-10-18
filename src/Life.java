class Life extends Insurance {

    // Constructor//
    public Life() {
        super("Life Insurance");
    }

    // Implement setInsuranceCost//
    @Override
    public void setInsuranceCost(double cost) {
        this.monthlyCost = cost;
    }

    // Implement displayInfo//
    @Override
    public void displayInfo() {
        System.out.println("Insurance Type: " + insuranceType);
        System.out.println("Monthly Cost: $" + monthlyCost);
    }
}
//Program Ends//
