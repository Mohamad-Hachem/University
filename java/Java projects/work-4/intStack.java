package Assignment_4;



import java.awt.Component;
import javax.swing.JOptionPane;

public class intStack {
    IntNode top = new IntNode();

    public intStack() {
        this.top = null;
    }

    public boolean empty() {
        return this.top == null;
    }

    public void push(int x) {
        IntNode NewN = new IntNode();
        NewN.item = x;
        NewN.next = this.top;
        this.top = NewN;
    }

    public int pop() {
        if (!this.empty()) {
            int x = this.top.item;
            this.top = this.top.next;
            return x;
        } else {
            return -9;
        }
    }

    public void ShowStack() {
        String all = new String();
        new IntNode();

        for(IntNode T = this.top; T != null; T = T.next) {
            all = all + "|" + T.item + "|\n" + "--\n";
        }

        JOptionPane.showMessageDialog((Component)null, all);
    }
}