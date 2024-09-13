import java.util.Scanner;

public class maintenance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variables
        double winterMaintenanceCost;
        double fallMaintenanceCost;
        double springMaintenanceCost;
        double summerMaintenanceCost;
        double totalMaintenanceCost;

        //input
        System.out.println("What is the maintenance cost for spring in dollars?");
        springMaintenanceCost = scan.nextDouble();
        System.out.println("What is the maintenance cost for summer in dollars?");
        summerMaintenanceCost = scan.nextDouble();
        System.out.println("What is the maintenance cost for fall in dollars?");
        fallMaintenanceCost = scan.nextDouble();
        System.out.println("What is the maintenance cost for winter in dollars?");
        winterMaintenanceCost = scan.nextDouble();

        //process
        totalMaintenanceCost = springMaintenanceCost + summerMaintenanceCost + fallMaintenanceCost + winterMaintenanceCost;

        //output
        System.out.println("Your yearly maintenance cost is $" + totalMaintenanceCost + ".");
    }
}