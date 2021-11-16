package Assignment_5;

import javax.swing.JOptionPane;

public class Customer {
	String CustomerID;
	String Name;
	Double Balance;
	ListOfOrder ListOfOrders = new ListOfOrder();
	
	public void GetInfoFromUser() {
		CustomerID = JOptionPane.showInputDialog("Enter ID:");
		Name = JOptionPane.showInputDialog("Enter name:");
		String temp = JOptionPane.showInputDialog("Enter balance:");
		Balance = Double.parseDouble(temp);
		
	}
	
	public void ShowInfoToUser() {
		JOptionPane.showMessageDialog(null, "Customer ID: " + CustomerID + 
				"\nName: " + Name + "\nBalance: " + Balance);
	}
	public void AddOrder() {
		ListOfOrders.Add();
	}
	public void ShowAll() {
		ListOfOrders.Show();
	}
	public void DeleteOrder() {
		ListOfOrders.Delete();
	}

}
