import java.util.Scanner;

public class MoleKeyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char shiftDirection = scanner.next().charAt(0);
        String typedMessage = scanner.next();
        
        String keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./";
        
        StringBuilder originalMessage = new StringBuilder();
        
        for (int i = 0; i < typedMessage.length(); i++) {
            char typedChar = typedMessage.charAt(i);
            int index = keyboard.indexOf(typedChar);
            
            if (shiftDirection == 'L') {
                originalMessage.append(keyboard.charAt(index + 1));
            } else if (shiftDirection == 'R') {
                originalMessage.append(keyboard.charAt(index - 1));
            }
        }
        
        System.out.println(originalMessage.toString());
    }
}
