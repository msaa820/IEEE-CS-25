import java.util.Scanner;

public class ValeraBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i  n; i++) {
            a[i] = sc.nextInt();
        }
        
        int maxBooks = 0;
        int currentBooks = 0;
        int timeSpent = 0;
        int start = 0;
        
        for (int end = 0; end  n; end++) {
            timeSpent += a[end];
            currentBooks++;
            
            while (timeSpent  t) {
                timeSpent -= a[start];
                start++;
                currentBooks--;
            }
            
            maxBooks = Math.max(maxBooks, currentBooks);
        }
        
        System.out.println(maxBooks);
        sc.close();
    }
}
