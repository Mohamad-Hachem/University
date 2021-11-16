package Exam2;

import javax.swing.JOptionPane;
public class TransactionQ {
	QNode First;
	QNode Last;
	
	public TransactionQ() {
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
	
	public void STQ() {
		String show = "";
		QNode temp = First;
		while (temp!=null)
		{
			show += temp.element + "; ";
			temp = temp.next;
		}
		JOptionPane.showMessageDialog(null, show);
	}
	public boolean TQ() {
		if(isEmpty())
		{
			return false;
		}
		if(First != null) {
			First = First.next;
			if(First == null) {
				Last = null;
			}
			return true;
		}
		return false;
		
	}
}
