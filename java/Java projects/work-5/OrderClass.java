package Assignment_5;

import javax.swing.JOptionPane;
public class OrderClass {
	String OrderNumber;
	Double OrderBalance;
	
	public void GetInfoFromUser() {
		OrderNumber = JOptionPane.showInputDialog("Enter order name:");
		String temp = JOptionPane.showInputDialog("Enter Balance:");
		OrderBalance = Double.parseDouble(temp);
	}
	
	public void ShowInfoToUser() {
		JOptionPane.showMessageDialog(null, "Order Number: " + OrderNumber + 
				"\nOrder Balance: " + OrderBalance);
	}

}
