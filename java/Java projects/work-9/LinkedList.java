package Final_Exam;

import javax.swing.JOptionPane;

public class LinkedList {
    Node First;
    Node Last;
    int count;

    public LinkedList() {
        First = new Node();
        First = null;
        Last = new Node();
        Last = null;
        count = 0;
    }

    public boolean isEmpty() {
        return First == null;
    }

    public void addB() {
        Node NewN = new Node();
        NewN.item = new Book();
        NewN.item.GetInfoFromUser();
        NewN.next = First;

        if (isEmpty()) {
            First = NewN;
            Last = First;
        } else {
            First = NewN;
        }

        count++;
    }

    public void addE() {
        Node NewN = new Node();
        NewN.item = new Book();
        NewN.item.GetInfoFromUser();
        NewN.next = null;

        if (isEmpty()) {
            First = NewN;
            Last = First;
        } else {
            Last.next = NewN;
            Last = Last.next;
        }
        count++;
    }

	public  String showBookWithPrice(double Price)
	{
		String all = new String();
		Node temp = new Node();
		while(temp != null)
		{
			if(temp.item.price == Price)
			{
				 all = all + temp.item.ShowInfoToUser() + "\n";
		            temp = temp.next;
			}
		}
		return all ;
	}
    public boolean updateQuantity() {
        int ISBN = Integer.parseInt(JOptionPane.showInputDialog("Enter the ISBN of the book"));
        int amount = Integer.parseInt(JOptionPane.showInputDialog("Enter Amount to update quantity"));
        Node Temp = new Node();
        Temp = First;
        while (Temp != null) {
            if (Temp.item.ISBN == ISBN) {
                Temp.item.quantity = amount;
                return true;
            }
            Temp = Temp.next;
        }
        return false;
    }

    public void countrySearch(String country) {
        String string = new String();
        Node Temp = new Node();
        Temp = First;

        while (Temp != null) {
            if (Temp.item.country.equals(country)) {
                string = string + Temp.item.ShowInfoToUser();
                Temp = Temp.next;
            } else {
                Temp = Temp.next;
            }
        }
        JOptionPane.showMessageDialog(null, string);
    }

    public String showAll() {
        String all = new String();
        Node Temp = new Node();
        Temp = First;

        while (Temp != null) {

            all = all + Temp.item.ShowInfoToUser() + "\n";
            Temp = Temp.next;
        }

        return all;
    }

    public boolean Delete(String country) {

        if (!isEmpty()) {
            if (First.item.country.equals(country)) {
                First = First.next;
                return true;
            } else {
                Node Temp1 = new Node();
                Node Temp2 = new Node();
                Temp1 = First;
                Temp2 = First.next;

                while (Temp2 != null) {
                    if (Temp2.item.country.equals(country)) {
                        count--;
                        Temp1.next = Temp2.next;
                        return true;
                    }
                }
                return false;
            }

        }

        return false;
    }

    public int deleteByCountry(String Country) {
        int deletedCount = 0;
        Node Temp = new Node();
        Temp = First;

        while (Temp != null) {
            if (Temp.item.country.equals(Country)) {
                Delete(Temp.item.country);
                deletedCount += 1;
                Temp = Temp.next;
            }else {
                Temp = Temp.next;
            }

        }
        return deletedCount;
    }
    public int NumByPublisher(String publisher) {
        int publisherCount = 0;
        Node Temp = new Node();
        Temp = First;

        while (Temp != null) {
            if (Temp.item.publisher.equals(publisher)) {
                publisherCount += 1;
                Temp = Temp.next;
            }else {
                Temp = Temp.next;
            }

        }
        return publisherCount;
    }

}
