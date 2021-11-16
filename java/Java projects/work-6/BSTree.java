package Assignment_6;

import javax.swing.JOptionPane;

public class BSTree {
	BSTNode Root;
	public BSTree()
	{
		Root = null;
	}
	public boolean empty()
	{
		return Root == null;
	}
	public void RAdd()
	{
		BSTNode B = new BSTNode();
		Books R = new Books();
		R.GetInfo();
		B.item=R;
		B.R=null;
		B.L= null;
		Root=ADD(B,Root);
	}
	public BSTNode ADD (BSTNode N , BSTNode Root)
	{
		if(Root== null)
		{
			Root = N;
		}
		else if(N.item.ISBN>Root.item.ISBN)
		{
			Root.R= ADD(N,Root.R);
		}
		else
		{
			Root.L= ADD(N,Root.L);
		}
		return Root;
	}
	
	public String Show(BSTNode R)
	{
		if(R==null)
		{
			return "";
		}
		else
		{
			String r = R.item.Show();
			return Show(R.L)+ r + "," + Show (R.R);
		}
	}
	public void Search ( int x)
	{
		BSTNode temp = new BSTNode();
		temp = Root;
		boolean b = false;
		while(temp!=null)
		{
			if(temp.item.ISBN==x)
			{
				b=true;
				break;
			}
			else
			{
				if(x>temp.item.ISBN)
				{
					temp=temp.R;
				}
				else
				{
					temp = temp.L;
				}
			}
		}
		if(b==true)
		{
			String r = temp.item.Show();
			JOptionPane.showMessageDialog(null, "found");
			JOptionPane.showMessageDialog(null, r);
		}
		else if(b==false)
		{
			JOptionPane.showMessageDialog(null, "not found");
		}
		
		
		
	}
	

}
