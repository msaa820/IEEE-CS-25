import java.util.Scanner;

public class PoliceDepartment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int untreatedCrimes = 0;
        int availableOfficers = 0;

        for (int i = 0; i < n; i++) {
            int event = scanner.nextInt();

            if (event == -1) {
                if (availableOfficers > 0) {
                    availableOfficers--; // Crime is handled
                } else {
                    untreatedCrimes++; // No available officer
                }
            } else {
                availableOfficers += event; // Recruit officers
            }
        }

        System.out.println(untreatedCrimes);
    }
}
