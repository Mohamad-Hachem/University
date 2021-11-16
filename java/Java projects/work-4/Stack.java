package Assignment_4;


import java.awt.Component;
import javax.swing.JOptionPane;

public class Stack {
    Node top = new Node();

    public Stack() {
        this.top = null;
    }

    public boolean empty() {
        return this.top == null;
    }

    public void push(char x) {
        Node NewN = new Node();
        NewN.item = x;
        NewN.next = this.top;
        this.top = NewN;
    }

    public char pop() 
    {
        if (!this.empty()) 
        {
            char x = this.top.item;
            this.top = this.top.next;
            return x;
        } 
        else 
        {
            return 'x';
        }
    }

    public void ShowStack() {
        String all = new String();
        new Node();

        for(Node T = this.top; T != null; T = T.next) {
            all = all + "|" + T.item + "|\n" + "--\n";
        }

        JOptionPane.showMessageDialog((Component)null, all);
    }
}

