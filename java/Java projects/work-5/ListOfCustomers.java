package Assignment_5;

import javax.swing.JOptionPane;

public class ListOfCustomers {
	ListOfCustomersNode First;
	ListOfCustomersNode Last;
	
	public ListOfCustomers() {
		First = null;
		Last = null;
	}
	public boolean isEmpty() {
		return First == null;
		
	}
	
	public void Add() {
		ListOfCustomersNode NewN = new ListOfCustomersNode();
		NewN.customer = new Customer();
		NewN.customer.GetInfoFromUser();
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
	
	public void Search() {
		String ID = JOptionPane.showInputDialog("Enter ID you want to search for: ");
		boolean found = false;
		ListOfCustomersNode temp = new ListOfCustomersNode();
		temp = First;
		while(temp!=null) {
			if(temp.customer.CustomerID.equals(ID))
			{
				found = true;
				break;
			}
			else {
				temp = temp.next;
			}
		}
		if(found==false)
		{
			JOptionPane.showMessageDialog(null, "user not found");
		}
		else {
			temp.customer.ShowInfoToUser();
		}
	}
	public boolean deleted() {
		String ID = JOptionPane.showInputDialog("enter ID");
		if(isEmpty())
		{
			return false;
		}
		if(First.customer.CustomerID.equals(ID))
		{
			First = First.next;
			if(First == null)
			{
				Last=null;
			}
			return true;
		}
		ListOfCustomersNode temp = new ListOfCustomersNode();
		ListOfCustomersNode temp2 = new ListOfCustomersNode();
		temp2 = First;
		temp = First.next;
		
		while(temp != null) {
			if(temp.customer.CustomerID.equals(ID)){
				if(temp.next == null)
				{
					Last = temp2;
				}
				temp2.next = temp.next;
				return true;
			}else {
				temp2 = temp2.next;
				temp = temp.next;
			}
		}
		return false;
	}
	public void Delete() {
		if(!deleted()) {
			JOptionPane.showMessageDialog(null, "Could not delete");
		}else {
			JOptionPane.showMessageDialog(null, "Deleted");
		}
	}
	public void AddOrder() {
		String ID = JOptionPane.showInputDialog("Enter ID you want to search for: ");
		boolean found = false;
		ListOfCustomersNode temp = new ListOfCustomersNode();
		temp = First;
		while(temp!=null) {
			if(temp.customer.CustomerID.equals(ID))
			{
				found = true;
				break;
			}
			else {
				temp = temp.next;
			}
		}
		if(found==true)
		{
			temp.customer.AddOrder();
		}
		else {
			JOptionPane.showMessageDialog(null, "user not found");
			
		}
	}
	public void ShowOrder() {
		String ID = JOptionPane.showInputDialog("Enter ID you want to search for: ");
		boolean found = false;
		ListOfCustomersNode temp = new ListOfCustomersNode();
		temp = First;
		while(temp!=null) {
			if(temp.customer.CustomerID.equals(ID))
			{
				found = true;
				break;
			}
			else {
				temp = temp.next;
			}
		}
		if(found==true)
		{
			temp.customer.ShowAll();
		}
		else {
			JOptionPane.showMessageDialog(null, "user not found");
			
		}
	}
}
