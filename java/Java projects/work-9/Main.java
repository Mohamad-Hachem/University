package Final_Exam;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        LinkedList books = new LinkedList();
        String choice = new String();


        while(!choice.equals("Q")) {

            choice = JOptionPane.showInputDialog("AB: to add a new book in the beginning\n" +
                    "AE: to add a new book in the end\n" +
                    "DC: to delete all books by Country and return number\n" +
                    "U: Update a certain book's quantity\n" +
                    "NP : to find how many books per publisher\n" +
                    "ShowAll: Show all books in one list\n" +
                    "Q: to quit");


            if(choice.equals("AB")) {
                books.addB();	
            }else if(choice.equals("AE")) {
                books.addE();
            }
            else if(choice.equals("U")){
                books.updateQuantity();
            }
            else if(choice.equals("DC")) {
                String country = JOptionPane.showInputDialog("enter the name of the country to Delete ");
                books.deleteByCountry(country);
            }else if(choice.equals("ShowAll")) {
                String string = books.showAll();
                JOptionPane.showMessageDialog(null, string);
            }
            else if(choice.equals("NP")) {
            	String publisher = JOptionPane.showInputDialog("enter the name of the publisher ");
            	JOptionPane.showMessageDialog(null, books.NumByPublisher(publisher)); 
            }
        }System.exit(0);
    }


}
