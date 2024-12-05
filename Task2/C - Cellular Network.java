import java.util.Scanner;

public class CellularNetwork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] cities = new int[n];
        int[] towers = new int[m];
        
        for (int i = 0; i < n; i++) {
            cities[i] = sc.nextInt();
        }
        
        for (int i = 0; i < m; i++) {
            towers[i] = sc.nextInt();
        }
        
        int minR = 0;
        int j = 0;
        
        for (int i = 0; i < n; i++) {
            while (j < m - 1 && Math.abs(towers[j + 1] - cities[i]) <= Math.abs(towers[j] - cities[i])) {
                j++;
            }
            minR = Math.max(minR, Math.abs(towers[j] - cities[i]));
        }
        
        System.out.println(minR);
        sc.close();
    }
}
