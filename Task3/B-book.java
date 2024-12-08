import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int maxBooks = 0;
        int currentTime = 0;
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            currentTime += a[right];
            
            while (currentTime > t) {
                currentTime -= a[left];
                left++;
            }
            
            maxBooks = Math.max(maxBooks, right - left + 1);
        }
        
        System.out.println(maxBooks);
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int maxBooks = 0;
        int currentTime = 0;
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            currentTime += a[right];
            
            while (currentTime > t) {
                currentTime -= a[left];
                left++;
            }
            
            maxBooks = Math.max(maxBooks, right - left + 1);
        }
        
        System.out.println(maxBooks);
    }
}
