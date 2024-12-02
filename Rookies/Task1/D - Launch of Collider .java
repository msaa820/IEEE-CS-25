import java.util.Scanner;

public class ColliderCollision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();  
        String directions = scanner.next();  
        int[] positions = new int[n];  

        for (int i = 0; i < n; i++) {
            positions[i] = scanner.nextInt();
        }

        int minTime = Integer.MAX_VALUE;
        boolean collisionFound = false;

        for (int i = 0; i < n - 1; i++) {
            if (directions.charAt(i) == 'R' && directions.charAt(i + 1) == 'L') {
                int time = (positions[i + 1] - positions[i]) / 2;
                minTime = Math.min(minTime, time);
                collisionFound = true;
            }
        }

        System.out.println(collisionFound ? minTime : -1);
    }
}
