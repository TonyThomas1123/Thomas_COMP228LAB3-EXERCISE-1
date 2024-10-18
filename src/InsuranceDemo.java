import java.util.Scanner;

public class InsuranceDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to hold Insurance objects//
        Insurance[] policies = new Insurance[2];

        // Loop to get input for two insurance policies//
        for (int i = 0; i < policies.length; i++) {
            System.out.println("Enter insurance type (Health or Life):");
            String type = scanner.nextLine();

            System.out.println("Enter the monthly cost:");
            double cost = scanner.nextDouble();
            scanner.nextLine();  // Consume newline//

            // Create appropriate object based on user input//
            if (type.equalsIgnoreCase("Health")) {
                policies[i] = new Health();
            } else if (type.equalsIgnoreCase("Life")) {
                policies[i] = new Life();
            } else {
                System.out.println("Invalid insurance type, defaulting to Health.");
                policies[i] = new Health();
            }

            // Set the cost of the insurance//
            policies[i].setInsuranceCost(cost);
        }

        // Polymorphic screen manager
        System.out.println("\nInsurance Policies Info:");
        for (Insurance policy : policies) {
            policy.displayInfo();
            System.out.println();  // For spacing
        }

        scanner.close();
    }
}
//Program Ends//