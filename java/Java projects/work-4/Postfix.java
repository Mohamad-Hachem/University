package Assignment_4;



import java.awt.Component;
import javax.swing.JOptionPane;

public class Postfix {
    public Postfix() {
    }

    public static void main(String[] args) {
        intStack stack = new intStack();
        strStack stringStack = new strStack();
        String expression = JOptionPane.showInputDialog("enter the postfix expression").replaceAll("\\s", "");

        for(int i = 0; i < expression.length(); ++i) {
            if (!isOperation(expression.charAt(i))) {
                stack.push(Integer.parseInt(Character.toString(expression.charAt(i))));
                stringStack.push(Character.toString(expression.charAt(i)));
            } else {
                int first;
                int second;
                String f;
                String s;
                if (expression.charAt(i) == '-') {
                    first = stack.pop();
                    second = stack.pop();
                    stack.push(second - first);
                    f = stringStack.pop();
                    s = stringStack.pop();
                    stringStack.push("(" + s + " " + expression.charAt(i) + " " + f + ")");
                } else if (expression.charAt(i) == '+') {
                    first = stack.pop();
                    second = stack.pop();
                    stack.push(first + second);
                    f = stringStack.pop();
                    s = stringStack.pop();
                    stringStack.push("(" + s + " " + expression.charAt(i) + " " + f + ")");
                } else if (expression.charAt(i) == '*') {
                    first = stack.pop();
                    second = stack.pop();
                    stack.push(first * second);
                    f = stringStack.pop();
                    s = stringStack.pop();
                    stringStack.push("(" + s + " " + expression.charAt(i) + " " + f + ")");
                } else if (expression.charAt(i) == '/') {
                    first = stack.pop();
                    second = stack.pop();
                    stack.push(second / first);
                    f = stringStack.pop();
                    s = stringStack.pop();
                    stringStack.push("(" + s + " " + expression.charAt(i) + " " + f + ")");
                }
            }
        }

        JOptionPane.showMessageDialog((Component)null, stringStack.pop() + " = " + stack.pop());
    }

    public static boolean isOperation(char operation) {
        return operation == '+' || operation == '-' || operation == '*' || operation == '/';
    }
}
