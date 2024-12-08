import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            Arrays.sort(a);
            long count = 0;
            
            for (int i = 0; i < n - 1; i++) {
                int left = l - a[i];
                int right = r - a[i];
                
                int low = lowerBound(a, i + 1, n - 1, left);
                int high = upperBound(a, i + 1, n - 1, right);
                
                count += (high - low);
            }
            
            System.out.println(count);
        }
    }
    
    public static int lowerBound(int[] a, int start, int end, int value) {
        int low = start, high = end;
        while (low < high) {
            int mid = (low + high) / 2;
            if (a[mid] >= value) high = mid;
            else low = mid + 1;
        }
        return low;
    }
    
    public static int upperBound(int[] a, int start, int end, int value) {
        int low = start, high = end + 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (a[mid] > value) high = mid;
            else low = mid + 1;
        }
        return low;
    }
}
