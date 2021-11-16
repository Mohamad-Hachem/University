package Exam1;

import javax.swing.JOptionPane;

public class main {

	public static void main(String args[]) {

		BookLinkedList L = new BookLinkedList();
		
		String choice = new String();

		while (!choice.equals("Q")) {
			choice = JOptionPane
					.showInputDialog("AB: to add one new book in the beginning \r\n"
							+"SA: SHOW ALL"
							+ "AE: to add one new book in the end\r\n"
							+"DP: to delete all books by a publisher \r\n"
							+"SQ: Show all book that have quantity bigger that a certain "
							+ "A: to add one new book\r\n" + "D: to delete an existing book (using ISBN)\r\n"
							+"U:Update certain book Quantity Balance "
							+ "S: To check if a certain book exist (using ISBN)\r\n"
							+ "I: Increase a certain book Quantity Balance (using ISBN)\r\n"
							+ "PU: Show all books by a certain publisher (all info in a list) (ask for publisher)\r\n"
							+ "Q: to quit\r\n" + "");

			if (choice.equals("AE")) {

				L.Adde();
			}
			if (choice.equals("AB")) {

				L.Addb();
			}
			if(choice.equals("DP"))
			{
				String s = JOptionPane.showInputDialog("Enter the publisher you want to delete his books");
				L.DeleteByPublisher(s);
			}
			if (choice.equals("SQ")) 
			{
				String s = JOptionPane.showInputDialog("Enter the quantity you want books more than it");
				int number = Integer.parseInt(s) ;
				JOptionPane.showMessageDialog(null,L.ShowBooksQuantity(number));
			}
			if (choice.equals("S")) {

				String n = JOptionPane.showInputDialog("Enter ISBN to search");
				boolean f = L.Search(n);
				if (f == false) {

					JOptionPane.showMessageDialog(null, "not found");

				}
			}
			if (choice.equals("U")) {
				String s = JOptionPane.showInputDialog("Enter the id of book you want to change quantity for");
				L.Update(s);
			}
			if (choice.equals("SA")) {
				JOptionPane.showMessageDialog(null, L.showAll());
			}
			if (choice.equals("D")) {
				String n = JOptionPane.showInputDialog("Enter ISBN to Delete");
				boolean f = L.Delete(n);
				if (f == true) {
					JOptionPane.showMessageDialog(null, "Deleted");
				} else {
					JOptionPane.showMessageDialog(null, "Invalid ISBN");

				}
			}

			if (choice.equals("I")) {

				boolean f = L.AddQuantity();
				if (f == true) {
					JOptionPane.showMessageDialog(null, "Quantity increased");
				} else {
					JOptionPane.showMessageDialog(null, "Invalid ISBN");

				}
			}

			if (choice.equals("PU")) {
				String n = JOptionPane.showInputDialog("Enter publisher name ");
				JOptionPane.showMessageDialog(null, L.Searchpub(n));

			}

		}

		System.exit(0);

	}

}