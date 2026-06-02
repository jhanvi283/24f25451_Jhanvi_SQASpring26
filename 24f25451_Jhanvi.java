import java.util.Scanner;

public class JobMarketAnalysis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
try {
    System.out.print("Enter sector (1=IT, 2=Finance, 3=Healthcare, 4=Education): ");
    int sector = sc.nextInt();

    System.out.print("Enter job postings this month: ");
    int current = sc.nextInt();

    System.out.print("Enter job postings last month: ");
    int previous = sc.nextInt();

    // PUT YOUR EXISTING SWITCH + LOGIC BELOW THIS

} catch (Exception e) {
    System.out.println("Invalid input! Please enter numbers only.");
    sc.close();
    return;
}
        // Input validation - prevent negative values
if (current < 0 || previous < 0) {
    System.out.println("Error: Job postings cannot be negative.");
    sc.close();
    return;
}

        String sectorName;
        double growthRate;

        // Switch statement - find sector name
        switch (sector) {
            case 1:
                sectorName = "IT";
                break;
            case 2:
                sectorName = "Finance";
                break;
            case 3:
                sectorName = "Healthcare";
                break;
            case 4:
                sectorName = "Education";
                break;
                case 5:
    sectorName = "Retail";
    break;
            default:
                sectorName = "Unknown";
                break;
        }

        // Calculate growth rate
        if (previous > 0) {
            growthRate = ((double)(current - previous) / previous) * 100;
        } else {
            growthRate = 0;
        }

        // If-else - classify demand level
        if (growthRate >= 20) {
            System.out.println("Sector: " + sectorName);
            System.out.println("Growth: " + growthRate + "%");
            System.out.println("Demand: HIGH DEMAND");
        } else if (growthRate >= 0) {
            System.out.println("Sector: " + sectorName);
            System.out.println("Growth: " + growthRate + "%");
            System.out.println("Demand: STABLE");
        } else if (growthRate >= -20) {
            System.out.println("Sector: " + sectorName);
            System.out.println("Growth: " + growthRate + "%");
            System.out.println("Demand: DECLINING");
        } else {
            System.out.println("Sector: " + sectorName);
            System.out.println("Growth: " + growthRate + "%");
            System.out.println("Demand: CRITICALLY LOW");
        }

        sc.close();
    }
}
