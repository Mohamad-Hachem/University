package Assignment_5;

import javax.swing.JOptionPane;

public class ListOfOrder {
	ListOfOrderNode First;
	ListOfOrderNode Last;
	
	public ListOfOrder() {
		First = null;
		Last = null;
	}
	
	public boolean isEmpty() {
		return First == null;
		
	}
	
	public void Add() {
		ListOfOrderNode NewN = new ListOfOrderNode();
		NewN.element = new OrderClass();
		NewN.element.GetInfoFromUser();
		NewN.next = null;
		if(isEmpty()) {
			Last = NewN;
			First = Last;
		}
		else
		{
			Last.next = NewN;
			Last = NewN;
		}
	}
	
	public void Show() {
		String show = "";
		ListOfOrderNode NewN = First;
		while (NewN != null) {
			show += "\nOrder Number: " + NewN.element.OrderNumber + " Order Balance: " + NewN.element.OrderBalance;
			NewN = NewN.next; 
		}
		JOptionPane.showMessageDialog(null, show);
	}
	public void Delete() 
	{
		
	}

}
