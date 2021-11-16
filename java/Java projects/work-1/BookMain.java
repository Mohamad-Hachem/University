package Assignment_1;

import javax.swing.JOptionPane;

public class BookMain {

	public static void main(String[] args) {

		Book books[] = new Book[50];
		int count = 0;
		String choice = new String();

		
		while(!choice.equals("Q")) {
			
			choice = JOptionPane.showInputDialog("A: to add a new book\n" + 
					"D: to delete an existing book\n" + 
					"S: To check if a certain book exists\n" + 
					"I: Increase a certain book Quantity Balance\n" + 
					"PU: Show all books by a certain publisher\n" + 
					"Q: to quit");
		
			
			if(choice.equals("A")) {
				books[count] = new Book();
				books[count].GetInfoFromUser();
				count++;
			}
			
			
			else if(choice.equals("D")) {
				int key = Integer.parseInt(JOptionPane.showInputDialog("Enter the ISBN of the book to delete"));
				int idx = SearchISBN(books, key, count);
				for(int i = idx; i < count ; i++ )
				{
					books[idx] = books[idx+1];
				}
				JOptionPane.showMessageDialog(null,"Delete book with "+key+" as ISBN ");
				count--;
			}
			
			
			else if(choice.equals("S")) {
				int key = Integer.parseInt(JOptionPane.showInputDialog("Enter the ISBN of the book to check if it exists"));
				int idx = SearchISBN(books, key, count);
				if(idx == -1) {
					JOptionPane.showMessageDialog(null, "not found :(");
				}else {
					JOptionPane.showMessageDialog(null, "found! :)");
				}
			}
			
			
			else if(choice.equals("I")){
				int key = Integer.parseInt(JOptionPane.showInputDialog("Enter the ISBN of the book whose quantity you want to add"));
				int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity you want to add"));
				int idx = SearchISBN(books, key, count);
				books[idx].IncreaseQuantity(quantity);
			}
			
			
			else if(choice.equals("PU")) {
				String key = JOptionPane.showInputDialog("Enter the name of the publisher");
				for(int i = 0; i < count; i++)
				{
					if(books[i].publisher.equals(key)) 
						JOptionPane.showMessageDialog(null, books[i].ShowInfoToUser());
				}
			}
		}System.exit(0);
	}
	
	
	
	
	
	
	
	public static int SearchISBN(Book bk[], int key, int size){
		for(int i = 0; i < size; i++){
			if(bk[i].ISBN == key) return i;
		}
		return -1;
	}
}
