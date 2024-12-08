import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(pairs(k, arr));
    }

    public static int pairs(int k, int[] arr) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        
        for (int num : arr) {
            if (set.contains(num - k)) {
                count++;
            }
            if (set.contains(num + k)) {
                count++;
            }
            set.add(num);
        }
        
        return count;
    }
}
