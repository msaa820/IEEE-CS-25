import java.util.Scanner;

public class AlmostLuckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] luckyNumbers = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};
        
        boolean isAlmostLucky = false;
        
        for (int luckyNumber : luckyNumbers) {
            if (n % luckyNumber == 0) {
                isAlmostLucky = true;
                break;
            }
        }

        if (isAlmostLucky) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
