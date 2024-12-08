import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] skills = new int[n];
        
        // Read skills
        for (int i = 0; i < n; i++) {
            skills[i] = sc.nextInt();
        }
        
        // Sort the skills array
        Arrays.sort(skills);
        
        int left = 0, maxTeamSize = 0;
        
        // Sliding window approach
        for (int right = 0; right < n; right++) {
            while (skills[right] - skills[left] > 5) {
                left++;
            }
            maxTeamSize = Math.max(maxTeamSize, right - left + 1);
        }
        
        System.out.println(maxTeamSize);
    }
}
