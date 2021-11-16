package Exam2;
import java.awt.Component;

import javax.swing.JOptionPane;


public class Main 
{

	public static void main(String[] args) 
	    {
			String options = "" ;
			TransactionQ PQ = new TransactionQ() ;
			int PQCounter = 0  ;
			TransactionQ IQ = new TransactionQ() ;
			int IQCounter = 0 ;
			
			while(!options.equals("Q"))
			{
				options = JOptionPane.showInputDialog("PQ: Add a turn in the PQ\n" + 
														"IQ: add a turn in the IQ\n" + 
														"SP: Show PQ\n" + 
														"SI: Show SQ\r\n"
														+ "SPQ: serve a PQ turn\r\n"
														+ "SOQ: serve an IQ turn\r\n"
														+ "Q: to quit\r\n"
																		);
				if(options.equals("PQ"))
				{
					PQ.Add(PQCounter);
					PQCounter++;
				}
				if(options.equals("IQ"))
				{
					IQ.Add(IQCounter);
					IQCounter++;
				}
				if(options.equals("SP"))
				{
					PQ.STQ();
				}
				if(options.equalsIgnoreCase("SI"))
				{
					IQ.STQ();
				}
				if(options.equalsIgnoreCase("SPQ"))
				{
					PQ.TQ();
					String menu1 = "" ;
							while(!menu1.equals("Back"))
							{
								menu1 =  JOptionPane.showInputDialog("PAL: to check if a string is a palindrome\n" + 
																		"Back: Back to the first Menu" 	);
								if(menu1.equals("PAL"))
								{
									String str = JOptionPane.showInputDialog("Enter the String to check if it is a Palindrome");
									if(IsPalindrome(str))
										JOptionPane.showMessageDialog(null, "This String is a palindrome");
									else
										JOptionPane.showMessageDialog(null, "This String is not a palindrome");
										
								}
								if(menu1.equals("Back"))
									break ;
							}
				}
				if(options.equalsIgnoreCase("SOQ"))
				{
					IQ.TQ();
					String menu2 = "" ;
					while(!menu2.equals("Back"))
					{
						menu2 =  JOptionPane.showInputDialog("INF: to transform a prefix expression into an infix\n"+
																"Back: Back to the first Menu");
						if(menu2.equals("INF"))
						{
							String str = JOptionPane.showInputDialog("Enter your Prefix notation to get your infix notation");
							JOptionPane.showMessageDialog(null,str+" (prefix) --- > "+PrefixToInfix(str)+" (infix)");
						}
						if(menu2.equals("Back"))
						{
							break ;
						}
					}
				}
			}
		
	    }
	public static boolean IsPalindrome(String exp)
	{				    	
		        Stack stack = new Stack();

		        for (int i = 0; i < exp.length(); i++) 
		        {
		            stack.push(exp.charAt(i));
		        }

		        String reverseString = "";

		        while (!stack.empty())
		        {
		            reverseString = reverseString+stack.pop();
		        }

		        if (exp.equals(reverseString))
		        	return true ;
		        else
		        	return false;
		            	    		
	}
	public static String PrefixToInfix(String PreFixExp)
	{		  
		        strStack stringStack = new strStack();

		        for(int i = PreFixExp.length() - 1; i >= 0; i--) {
		            if (!isOperation(PreFixExp.charAt(i))) {
		                stringStack.push(Character.toString(PreFixExp.charAt(i)));
		            } else {
		                String f;
		                String s;
		                if (PreFixExp.charAt(i) == '-') {
		                	f = stringStack.pop();
		                    s = stringStack.pop();
		                    if(f == "x" || s == "x")
		                    	return "this is not the right syntax for prefix notation try again" ;
		                    stringStack.push("(" + s + " " + PreFixExp.charAt(i) + " " + f + ")");
		                } else if (PreFixExp.charAt(i) == '+') {
		                    f = stringStack.pop();
		                    s = stringStack.pop();
		                    if(f == "x" || s == "x")
		                    	return "this is not the right syntax for prefix notation try again" ;
		                    stringStack.push("(" + s + " " + PreFixExp.charAt(i) + " " + f + ")");
		                } else if (PreFixExp.charAt(i) == '*') {
		                    f = stringStack.pop();
		                    s = stringStack.pop();
		                    if(f == "x" || s == "x")
		                    	return "this is not the right syntax for prefix notation try again" ;
		                    stringStack.push("(" + s + " " + PreFixExp.charAt(i) + " " + f + ")");
		                } else if (PreFixExp.charAt(i) == '/') {
		                    f = stringStack.pop();
		                    s = stringStack.pop();
		                    if(f == "x" || s == "x")
		                    	return "this is not the right syntax for prefix notation try again" ;
		                    stringStack.push("(" + s + " " + PreFixExp.charAt(i) + " " + f + ")");
		                }
		            }
		        }
		        return stringStack.pop();   	
	}
	 public static boolean isOperation(char operation) {
	        return operation == '+' || operation == '-' || operation == '*' || operation == '/';
	    }

}
