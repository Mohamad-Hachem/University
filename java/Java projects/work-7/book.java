package Exam1;

import javax.swing.*;
import javax.swing.JOptionPane;

public class book {
	String ISBN;
	String title;
	String author;
	String publisher;
	String country;
	int quantity;
	double price;

	

	public book() {
	}

	public void AddQuantity(int x) {
		quantity = quantity + x;

	}

	public void GetInfoFromUser() {
		ISBN = JOptionPane.showInputDialog("Enter ISBN");
		title = JOptionPane.showInputDialog("Enter ttile");
		author = JOptionPane.showInputDialog("Enter author");
		publisher = JOptionPane.showInputDialog("Enter publisher");
		country = JOptionPane.showInputDialog("Enter country");
		String p = JOptionPane.showInputDialog("Enter price");
		price = Double.parseDouble(p);
		String q = JOptionPane.showInputDialog("Enter Number of books");
		quantity = Integer.parseInt(q);
	}

	public void ShowInfoToUser() {
		JOptionPane.showMessageDialog(null,
				"ISBN: " + ISBN + "\ntitle: " + title + "\nauthor: " + author + "\npublisher: " + publisher
						+ "\ncountry: " + country + "\nquantity: " + quantity + "\nprice: " + price);
	}

	public String StringInfo() {
		return ISBN + "," + title + ", " + author + ", " + publisher + "," + country + ", " + quantity + "," + price
				+ "\n";
	}
}