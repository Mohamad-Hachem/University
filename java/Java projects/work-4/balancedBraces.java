package Assignment_4;


import java.awt.Component;
import javax.swing.JOptionPane;

public class balancedBraces {
    public balancedBraces() {
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        String string = JOptionPane.showInputDialog("enter braces to see if balanced: ");

        for(int i = 0; i < string.length(); ++i) 
        {
            char character = string.charAt(i);
            if (character == '{') 
            {
                stack.push(character);
            } 
            else if(character == '}') 
            {
                char a = stack.pop();
                if (a == 'x')
                {
                    JOptionPane.showMessageDialog((Component)null, "Not Balanced");
                }
            }
        }

        if (stack.empty()) {
            JOptionPane.showMessageDialog((Component)null, "Balanced");
        } else {
            JOptionPane.showMessageDialog((Component)null, "Not Balanced");
        }

    }
}