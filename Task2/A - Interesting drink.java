import java.util.*;

public class BeecolaShops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] prices = new int[n];
        
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        
        Arrays.sort(prices);
        
        int q = sc.nextInt();
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < q; i++) {
            int mi = sc.nextInt();
            result.append(binarySearch(prices, mi)).append("\n");
        }
        
        System.out.print(result);
        sc.close();
    }
    
    private static int binarySearch(int[] prices, int mi) {
        int left = 0, right = prices.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (prices[mid] <= mi) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
