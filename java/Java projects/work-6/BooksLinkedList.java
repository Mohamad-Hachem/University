package Assignment_6;

import javax.swing.JOptionPane;

public class BooksLinkedList {

	BooksNode First= new BooksNode();
	BooksNode Last = new BooksNode();
	int count;
	
	public BooksLinkedList()
	{
		First = null;
		Last=null;
		count = 0;
	}
	public boolean empty()
	{
		return First == null;
	}
	public BooksNode addE()
	{
		BooksNode newN=new BooksNode();
		newN.item= new Books();
		newN.item.GetInfo();
		newN.next= null;
		if(empty())
		{
			First = newN;
			Last=First;
		}
		else
		{
			Last.next= newN;
			Last= Last.next;
		}
		count++;
		return newN;
	}
	public String show()
	{
		BooksNode newN = new BooksNode();
		newN=First;
		String s = new String();
		while(newN!= null)
		{
			s = s + newN.item.Show();
			newN = newN.next;
		}
		return s;
	}
	public void search(int x)
	{
		BooksNode temp = new BooksNode();
		temp = First;
		boolean b = false;
		while(temp!=null)
		{
			if(temp.item.ISBN==x)
			{		
				b=true;
				break;
			}
			temp=temp.next;
		}
		if(b==true)
		{
			JOptionPane.showMessageDialog(null, "FOUND");
			String z= temp.item.Show();
			JOptionPane.showMessageDialog(null, z);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "NOT FOUND");
		}
	}
}
