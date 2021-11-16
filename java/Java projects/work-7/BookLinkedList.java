package Exam1;

import javax.swing.JOptionPane;

public class BookLinkedList  {
	booknode First;
	booknode Last;
	int count;

	// constructor
	public BookLinkedList() {
		First = new booknode();
		First = null;
		Last = new booknode();
		Last = null;
		count = 0;
	}

	public boolean Empty() {
		if (First == null)
			return true;
		return false;
	}

//adds 1 book
	public void Addb()
	{
		book x = new book();
		x.GetInfoFromUser();
		booknode newN = new booknode();
		if(Empty())
		{
			newN.item = x ;
			newN.next = null;
			First = newN ;
			Last = First ;
		}
		else 
		{
			newN.item = x ;
			newN.next = First ;
			First = newN ;
		}
		count++ ;
	}
	public void Adde() {
		book x = new book();
		x.GetInfoFromUser();
		booknode NewN = new booknode();

		NewN.item = x;
		NewN.next = null;
		if (Empty()) {
			First = NewN;
			Last = First;
		} else {
			Last.next = NewN;
			Last = Last.next;
		}

		count++;
	}

	public boolean Search(String x) {
		booknode Temp = new booknode();
		Temp = First;

		while (Temp != null) {
			if (Temp.item.ISBN.equals(x)) {
				Temp.item.ShowInfoToUser();
				return true;
			}
			Temp = Temp.next;
		}

		return false;

	}

	public boolean Delete(String x) 
	{

		if (!Empty())
		{
			if (First.item.ISBN.equals(x))
			{
				First = First.next;
				return true;
		}
		else
		{
				booknode Temp1 = new booknode();
				booknode Temp2 = new booknode();
				Temp1 = First;
				Temp2 = First.next;

				while (Temp2 != null) {
					if (Temp2.item.ISBN.equals(x)) {
						count--;
						Temp1.next = Temp2.next;
						return true;
					}
					Temp1 = Temp1.next;
					Temp2 = Temp2.next;
				}
				return false;
			}

		}

		return false;
	}

	public boolean AddQuantity() {
		String x = JOptionPane.showInputDialog("Enter the ISBN of the book");
		String amount = JOptionPane.showInputDialog("Enter Amount to increase quantity");
		double a = Double.parseDouble(amount);
		booknode Temp = new booknode();
		Temp = First;
		while (Temp != null) {
			if (Temp.item.ISBN.equals(x)) {
				Temp.item.quantity += a;
				return true;
			}
			Temp = Temp.next;
		}
		return false;
	}

	public String ShowBooksQuantity(int n)
	{
		String str = "";
		booknode temp = new booknode() ;
		temp = First ;
		while(temp != null)
		{
			if(temp.item.quantity > n )
				str = str + temp.item.StringInfo() +"\n" ;		
			temp = temp.next ;
		}
		return str ;
		
	}
	public void Update(String s)
	{
		booknode temp = new booknode() ;
		temp = First ;
		boolean found = false ;
		while(temp!=null)
		{
			if(temp.item.ISBN.equals(s))
			{
				String str = JOptionPane.showInputDialog("Enter the quantity wanted to update") ;
				int number = Integer.parseInt(str) ;
				temp.item.quantity = number ;
				found = true ;
			}
		}
		if(found == false )
			JOptionPane.showMessageDialog(null,"not found");
		else
			JOptionPane.showMessageDialog(null,"updated");
	}
	public void DeleteByPublisher(String s)
	{
		int counter = 0 ;
		if(!Empty())
		{
			if(First.item.publisher.equals(s))
			{
				First = First.next ;
				JOptionPane.showMessageDialog(null,"Deleted");
			}
			else
			{
				booknode temp1 = new booknode();
				booknode temp2 = new booknode();
				temp1 = First ; 
				temp2 = First.next ;
				while(temp2 != null)
				{
					if(temp2.item.publisher.equals(s))
					{
						temp1.next = temp2.next ;
						counter ++ ;
					}
					temp1 = temp1.next ;
					temp2 = temp2 .next ;
				}
			}
			JOptionPane.showMessageDialog(null, "the number of books deleted" + counter);
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Nothing is here");
		}
	}
	 public String Searchpub(String x)
	  {
	     String all=new String();
	   booknode Temp= new booknode();
	   Temp=First;
	   
	   while( Temp!=null)
	   {
		   if (Temp.item.publisher.equals(x))
	     all=all+Temp.item.StringInfo();
	     Temp=Temp.next;
	   } 

	  return all;
	  } 
	 public String showAll()
	 {
		 booknode temp = new booknode() ;
		 temp = First ; 
		 String str = "";
		 while(temp != null)
		 {
			 str = str + temp.item.StringInfo() + "\n" ;
			 temp = temp.next ; 
		 }
		 return str ;
	 }

}