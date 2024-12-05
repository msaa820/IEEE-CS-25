import java.util.Scanner;

public class PetyaPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] x = new int[n];
        
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        
        long count = 0;
        int j = 0;
        
        for (int i = 0; i < n; i++) {
            while (j < n && x[j] - x[i] <= d) {
                j++;
            }
            long k = j - i - 1;
            if (k >= 2) {
                count += k * (k - 1) / 2;
            }
        }
        
        System.out.println(count);
        sc.close();
    }
}
