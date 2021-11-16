package Assignment_6;

import javax.swing.JOptionPane;

public class SBooks {
	final int max = 10;
	Books A[] = new Books[max];
	int count = 0;
	
	public SBooks()
	{
		for(int i = 0 ; i<max;i++)
		{
			A[i] = new Books();
			
		}
	}
	public void Add()
	{
		Books temp = new Books();
		temp.GetInfo();
		A[count]=temp;
		count++;
		
	}
	public static void Sort(Books A[], int size)
	{
		for (int j = size ; j>0;j--)
		{
			for(int i=0;i<size-1;i++)
			{
				if(A[i].ISBN>A[i+1].ISBN)
				{
					Books temp = A[i];
					A[i]= A[i+1];
					A[i+1]= temp;
				}
			}
		}
	}
	public void sort()
	{
		Sort(A, max);
	}
	public void ShowAll()
	{
		String y = new String();
		for(int i = 0; i<max;i++)
		{
			if(A[i].Quantity!=0)
			{
			String r = A[i].Show();
			y=y+r;
			}
		}
		JOptionPane.showMessageDialog(null, y);
	}

}
