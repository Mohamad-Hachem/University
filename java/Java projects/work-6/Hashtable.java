package Assignment_6;

import javax.swing.JOptionPane;

public class Hashtable {
	final int max = 10;
	BooksLinkedList table[] = new BooksLinkedList[max];
	int count = 0;
	
	public Hashtable()
	{
		for(int i =0 ; i<max;i++)
		{
			table[i]= new BooksLinkedList();
		}
	}
	public boolean full()
	{
		if(count >=max)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int HashF(int x)
	{
		int index = x % max;
		
		return index;
	}
	public void insert()
	{
		if(!full())
		{
		String sb = JOptionPane.showInputDialog("Enter ISBN"); 
		int ISBN = Integer.parseInt(sb);
		int i = HashF(ISBN);
		table[i].addE();
		count++;
		}
		
	}
	public void Search(int x)
	{
		
		int index = x%max;
		
		table[index].search(x);
			
	}
	public void ShowAll()
	{
		String y = new String();
		for(int i=0;i<max;i++)
		{
			if(table[i].First!=null)
			{
				
			String s= table[i].show();
			y=y+s;
			}
		}
		JOptionPane.showMessageDialog(null,y);
	}
	
			

}
