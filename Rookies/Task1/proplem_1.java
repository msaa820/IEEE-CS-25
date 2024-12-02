import java.util.Scanner;

public class ParadeLineup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] heights = new int[n];

        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }

        int maxIndex = 0;
        int minIndex = 0;
        
        for (int i = 1; i < n; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
            if (heights[i] <= heights[minIndex]) {
                minIndex = i;
            }
        }

        if (maxIndex > minIndex) {
            minIndex++;
        }

        int swaps = maxIndex + (n - 1 - minIndex);
        System.out.println(swaps);
    }
}
