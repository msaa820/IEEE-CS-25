import java.util.Scanner;

public class VasyaCodingNight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        long k = sc.nextLong();
        
        long left = 1;
        long right = n;
        long result = n;
        
        while (left <= right) {
            long v = (left + right) / 2;
            if (canWriteProgram(n, k, v)) {
                result = v;
                right = v - 1;
            } else {
                left = v + 1;
            }
        }
        
        System.out.println(result);
        sc.close();
    }
    
    private static boolean canWriteProgram(long n, long k, long v) {
        long totalLines = 0;
        long currentV = v;
        while (currentV > 0) {
            totalLines += currentV;
            if (totalLines >= n) {
                return true;
            }
            currentV /= k;
        }
        return totalLines >= n;
    }
}
