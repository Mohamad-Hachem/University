package Assignment_2;

import javax.swing.JOptionPane;

public class BookMain {

	public static void main(String[] args) {

		ADT books = new ADT();
		String choice = new String();

		
		while(!choice.equals("Q")) {
			
			choice = JOptionPane.showInputDialog("A: to add a new book\n" + 
					"D: to delete an existing book\n" + 
					"S: To check if a certain book exists\n" + 
					"I: Increase a certain book Quantity Balance\n" + 
					"PU: Show all books by a certain publisher\n" + 
					"Q: to quit");
		
			
			if(choice.equals("A")) {
				books.add();
			}
			else if(choice.equals("D")) {
				books.delete();
			}
			else if(choice.equals("S")) {
				books.searchAndDisplay();
			}
			else if(choice.equals("I")){
				books.increaseQuantity();
			}
			else if(choice.equals("PU")) {
				books.publisherSearch();
			}
		}System.exit(0);
	}
	
	
	
	
	
	
	
	
}
