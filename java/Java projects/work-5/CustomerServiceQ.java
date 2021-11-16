package Assignment_5;

import javax.swing.JOptionPane;

public class CustomerServiceQ {
	QNode First;
	QNode Last;
	
	public CustomerServiceQ() {
		First = null;
		Last = null;
	}
	public boolean isEmpty() {
		return First == null;
		
	}
	
	public void Add(int q) {
		QNode NewN = new QNode();
		NewN.element = q;
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
	
	public void showCSQ() {
		String show = "";
		QNode temp = First;
		while (temp!=null)
		{
			show += temp.element + "; ";
			temp = temp.next;
		}
		JOptionPane.showMessageDialog(null, show);
	}
	public boolean CSQ() {
		if(isEmpty())
		{
			return false;
		}
		if(First != null)
		{
			First = First.next;
			if(First == null) 
			{
				Last = null;
			}
			return true;
		}
		return false;
		
	}
}
