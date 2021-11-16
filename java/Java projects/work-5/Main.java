package Assignment_5;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String option = " ";
		int autoN = 0;
		ListOfOrder ListOfOrder = new ListOfOrder();
		ListOfCustomers ListOfCustomers = new ListOfCustomers();
		TransactionQ TransactionQ = new TransactionQ();
		CustomerServiceQ CustomerServiceQ = new  CustomerServiceQ();
	
		while(!option.equalsIgnoreCase("Q")) {
			
			
			option = JOptionPane.showInputDialog("TQ: add a customer to the transactions Q by giving him/her a number\r\n" + 
					"CSQ: add a customer to the Customer Service Q by giving him/her a number\r\n" + 
					"SQ1: Show TQ \r\n" + 
					"SQ2: Show CSQ \r\n" + 
					"S1: to Serve a customer in the transactions Q \r\n" + 
					"S2: to Serve a customer in the Customer Service Q \r\n" + 
					"Q: to Quit \r\n" + 
					"");
			if(option.equalsIgnoreCase("tq"))
			{
				TransactionQ.Add(autoN);
				autoN++;
				
			}
			else if(option.equalsIgnoreCase("csq"))
			{
				CustomerServiceQ.Add(autoN);
				autoN++;
			}
			else if(option.equalsIgnoreCase("sq1"))
			{
				TransactionQ.STQ();
			}
			else if(option.equalsIgnoreCase("sq2"))
			{
				CustomerServiceQ.showCSQ();
			}
			else if(option.equalsIgnoreCase("s1"))
			{
				if(TransactionQ.TQ())
				{
					Menu1(ListOfCustomers, ListOfOrder);
				}else {
					JOptionPane.showMessageDialog(null, "empty Q");
				}
			}
			else if(option.equalsIgnoreCase("s2"))
			{
				if(CustomerServiceQ.CSQ()){
					Menu2(ListOfCustomers, ListOfOrder);
				}else {
					JOptionPane.showMessageDialog(null, "empty Q");
				}
			}
		}
	}
	public static void Menu1(ListOfCustomers ListOfCustomers, ListOfOrder ListOfOrder) {
		String choice = "";
		
		while(!choice.equalsIgnoreCase("q"))
		{
			choice = JOptionPane.showInputDialog("O: Open a new Customer Account for a new customer (add it to the list of customers)\r\n" + 
					"S: Search for an existing customer and View Account info\r\n" + 
					"D: Delete an existing customer and View Account info\r\n" + 
					"AO: Add a new Order to a customer (first get customer ID then create a new order and add it to the customer’s list of orders\r\n" + 
					"Q: to quit from this Menu (go back to the above Menu\r\n");
			if(choice.equalsIgnoreCase("o")) 
			{
				ListOfCustomers.Add();
			}
			else if(choice.equalsIgnoreCase("s"))
			{
				ListOfCustomers.Search();
			}
			else if(choice.equalsIgnoreCase("d"))
			{
				ListOfCustomers.Delete();
			}
			else if(choice.equalsIgnoreCase("ao"))
			{
				ListOfCustomers.AddOrder();
			}
		}
	}
	public static void Menu2(ListOfCustomers ListOfCustomers, ListOfOrder ListOfOrder) {
		String choice = "";
		while(!choice.equalsIgnoreCase("q")) {
			choice = JOptionPane.showInputDialog("SO: show the orders of a certain customer (ask for customer ID)\r\n" + 
					"DO: Delete an order from a customer account (ask for customer ID and order number)\r\n" + 
					"Q: to quit from this Menu (go back to the above Menu\r\n" );
			if(choice.equalsIgnoreCase("so")) {
				ListOfCustomers.ShowOrder();
			}if(choice.equalsIgnoreCase("do")) {
				
			}
		}
	}

}


