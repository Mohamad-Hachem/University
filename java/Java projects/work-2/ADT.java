package Assignment_2;

import javax.swing.JOptionPane;

public class ADT {

	Book books[] = new Book[100];
	int count = 0;
	
	public void add(){
		books[count] = new Book();
		books[count].GetInfoFromUser();
		count++;
	}
	
	public void delete() {
		int key = Integer.parseInt(JOptionPane.showInputDialog("Enter the ISBN of the book to delete"));
		int idx = SearchISBN(books, key, count);
		for(int i = 1; i < count - 1; i++) {
			books[idx] = books[idx + 1];
		}
		count--;
	}
	
	public void searchAndDisplay() {
		int key = Integer.parseInt(JOptionPane.showInputDialog("Enter the ISBN of the book to check if it exists"));
		int idx = SearchISBN(books, key, count);
		if(idx == -1) {
			JOptionPane.showMessageDialog(null, "not found :(");
		}else {
			JOptionPane.showMessageDialog(null, "found! :) \n" + books[idx].ShowInfoToUser());
		}
	}
	
	public void increaseQuantity() {
		int key = Integer.parseInt(JOptionPane.showInputDialog("Enter the ISBN of the book whose quantity you want to add"));
		int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity you want to add"));
		int idx = SearchISBN(books, key, count);
		books[idx].IncreaseQuantity(quantity);
	}
	
	public void publisherSearch() {
		String temp = new String();
		String key = JOptionPane.showInputDialog("Enter the name of the publisher");
		for(int i = 0; i < count; i++){
			if(books[i].publisher.equals(key)) temp += books[i].ShowInfoToUser() + "\n";
		}JOptionPane.showMessageDialog(null, temp);
	}
	
	public static int SearchISBN(Book bk[], int key, int size){
		for(int i = 0; i < size; i++){
			if(bk[i].ISBN == key) return i;
		}
		return -1;
	}
}
