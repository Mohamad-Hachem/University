package Assignment_1;

import javax.swing.JOptionPane;

public class Book {
	int ISBN;
	String title;
	String author;
	String publisher;
	String country;
	int quantity;
	double price;
	
	
	public String ShowInfoToUser() {
		return( "ISBN: " + ISBN +
                "\nTitle: " + title +
                "\nAuthor: "+ author +
                "\nPublisher: " + publisher +
                "\nCountry: " + country + 
                "\nQuantity: " + quantity + 
                "\nPrice: " + price + "\n");
	}
	
	public void GetInfoFromUser() {
		ISBN = Integer.parseInt(JOptionPane.showInputDialog("Enter ISBN"));       
		title = JOptionPane.showInputDialog("Enter title");
		author = JOptionPane.showInputDialog("Enter author name");
		publisher = JOptionPane.showInputDialog("Enter publisher name");
		country = JOptionPane.showInputDialog("Enter country");
		quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity"));
		price = Double.parseDouble(JOptionPane.showInputDialog("Enter price"));

	}
	
	public void IncreaseQuantity(int quantity) {
		this.quantity += quantity;
	}
}

