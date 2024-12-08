import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        
        int aliceTime = 0, bobTime = 0;
        int aliceCount = 0, bobCount = 0;
        int left = 0, right = n - 1;
        
        while (left <= right) {
            if (aliceTime <= bobTime) {
                aliceTime += t[left];
                aliceCount++;
                left++;
            } else {
                bobTime += t[right];
                bobCount++;
                right--;
            }
        }
        
        System.out.println(aliceCount + " " + bobCount);
    }
}
