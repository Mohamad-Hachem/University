package Exam2;

import java.awt.Component;

import javax.swing.JOptionPane;

import Assignment_4.intStack;
import Assignment_4.strStack;

public class PrefixToInfix 
{	
	    public static void main(String[] args) {
	        intStack stack = new intStack();
	        strStack stringStack = new strStack();
	        String expression = JOptionPane.showInputDialog("enter the prefix expression").replaceAll("\\s", "");

	        for(int i = expression.length() - 1; i >= 0; i--) {
	            if (!isOperation(expression.charAt(i))) {
	                stack.push(Integer.parseInt(Character.toString(expression.charAt(i))));
	                stringStack.push(Character.toString(expression.charAt(i)));
	            } else {
	                String f;
	                String s;
	                if (expression.charAt(i) == '-') {
	                    f = stringStack.pop();
	                    s = stringStack.pop();
	                    stringStack.push("(" + s + " " + expression.charAt(i) + " " + f + ")");
	                } else if (expression.charAt(i) == '+') {
	 
	                    f = stringStack.pop();
	                    s = stringStack.pop();
	                    stringStack.push("(" + s + " " + expression.charAt(i) + " " + f + ")");
	                } else if (expression.charAt(i) == '*') {
	                    f = stringStack.pop();
	                    s = stringStack.pop();
	                    stringStack.push("(" + s + " " + expression.charAt(i) + " " + f + ")");
	                } else if (expression.charAt(i) == '/') {
	                    f = stringStack.pop();
	                    s = stringStack.pop();
	                    stringStack.push("(" + s + " " + expression.charAt(i) + " " + f + ")");
	                }
	            }
	        }

	        JOptionPane.showMessageDialog((Component)null, stringStack.pop());
	    }

	    public static boolean isOperation(char operation) {
	        return operation == '+' || operation == '-' || operation == '*' || operation == '/';
	    }
	
	

}
