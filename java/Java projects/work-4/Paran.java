package Assignment_4;



import java.awt.Component;
import javax.swing.JOptionPane;

public class Paran {
    public Paran() {
    }

    public static void main(String[] args) {
        int count = 0;
        Stack stack = new Stack();
        String string = JOptionPane.showInputDialog("enter parenthesis to see if balanced: ");

        for(int i = 0; i < string.length(); ++i) {
            char character = string.charAt(i);
            if (character == '(') {
                stack.push(character);
            } else if (character == ')') {
                char a = stack.pop();
                ++count;
                if (a == 'x') {
                    JOptionPane.showMessageDialog((Component)null, "Not Balanced");
                }
            }
        }

        if (stack.empty()) {
            JOptionPane.showMessageDialog((Component)null, "Balanced with " + count + " couples.");
        } else {
            JOptionPane.showMessageDialog((Component)null, "Not Balanced");
        }

    }
}