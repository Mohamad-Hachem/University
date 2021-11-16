package Assignment_6;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String option = new String();
		Hashtable H = new Hashtable();
		BSTree T = new BSTree();
		SBooks S= new SBooks();
		while(!option.equals("Q"))
		{
			option = JOptionPane.showInputDialog("Enter OP1 to test hash table \n Enter OP2 to test binary search tree \n Enter OP3 ro add and sort arrays \n Enter Q to quit");
			if(option.equals("OP1"))
			{
				String op = new String();
				while(!op.equals("B"))
				{
					op =JOptionPane.showInputDialog("Enter AB to add a book \n Enter RB to retrieve a book \n SB to show all books \n B to get back to main menu");
					if(op.equals("AB"))
					{
						H.insert();
					}
					else if(op.equals("RB"))
					{
						String x = JOptionPane.showInputDialog("Enter ISBN of the book you want to search for");
						int I = Integer.parseInt(x);
						H.Search(I);
						
					}
					else if(op.equals("SB"))
					{
						H.ShowAll();
					}
					
				}
				
			}
			if(option.equals("OP2"))
			{
				String op = new String();
				
				while(!op.equals("B"))
				{
					op =JOptionPane.showInputDialog("Enter AB to add a book \n Enter RB to retrieve a book \n SB to show all books with infix \n B to get back to main menu");
					if(op.equals("AB"))
					{
						T.RAdd();
					}
					else if(op.equals("RB"))
					{
						String x = JOptionPane.showInputDialog("Enter ISBN of the book you want to search for");
						int I = Integer.parseInt(x);
						T.Search( I);
						
					}
					else if(op.equals("SB"))
					{
						String y=T.Show(T.Root);
						JOptionPane.showMessageDialog(null, y);
					}
					
				}
			}
			if(option.equals("OP3"))
			{
				String op = new String();
				while(!op.equals("B"))
				{
					op=JOptionPane.showInputDialog("Enter AB to add a book \n Enter S to sort \n Enter SB to show all books \n Enter B to get back to main menu");
					if(op.equals("AB"))
					{
						S.Add();
					}
					else if(op.equals("S"))
					{
						S.sort();
 					}
					else if(op.equals("SB"))
					{
						S.ShowAll();
					}
				}
						
				
			}
		}

	}

}
