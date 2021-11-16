package Assignment_4;

import java.awt.Component;
import javax.swing.JOptionPane;

public class strStack {
    strNode top = new strNode();

    public strStack() {
        this.top = null;
    }

    public boolean empty() {
        return this.top == null;
    }

    public void push(String x) {
        strNode NewN = new strNode();
        NewN.item = x;
        NewN.next = this.top;
        this.top = NewN;
    }

    public String pop() {
        if (!this.empty()) {
            String x = this.top.item;
            this.top = this.top.next;
            return x;
        } else {
            return "x";
        }
    }

    public void ShowStack() {
        String all = new String();
        new strNode();

        for(strNode T = this.top; T != null; T = T.next) {
            all = all + "|" + T.item + "|\n" + "--\n";
        }

        JOptionPane.showMessageDialog((Component)null, all);
    }
}
