package Assignment_6;
import javax.swing.JOptionPane;

public class Books {
	int ISBN;
	String Title;
	String Author;
	String Publisher;
	double Price;
	int Quantity;
	
	public void GetInfo()
	{
		String isbn =JOptionPane.showInputDialog("Get ISBN");
		ISBN = Integer.parseInt(isbn);
		Title = JOptionPane.showInputDialog("Enter title");
		Author = JOptionPane.showInputDialog("Enter the author's name");
		Publisher = JOptionPane.showInputDialog("Enter the publisher's name");
		String b =JOptionPane.showInputDialog("Enter the book's price");
		Price = Double.parseDouble(b);
		String q = JOptionPane.showInputDialog("Enter quantity");
		Quantity = Integer.parseInt(q);
	}
	public void ShowInfo ()
	{
		JOptionPane.showMessageDialog(null,"ISBN: "+ISBN+
                "\nTitle: "+Title+
                "\nauthor: "+Author+
                "\npublisher: "+Publisher+
                "\nquantity: "+ Quantity+
                "\n price: "+ Price);
	}
	public String Show()
	{
		 return ISBN+", "+Title+", "+Author+", "+Publisher+","+Quantity+","+Price+"\n";
	}


}
