using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace exam1
{
    public abstract class customer
    {
        public String ID, Name, DateOfBirth, Address, Gender;
        public order[] ListOfOrders = new order[10];
        public int CounterOrder = 0 ; 
        public customer(String id, String N,String Dob,String a, String g)
        {
            ID = id;
            Name = N;
            DateOfBirth = Dob;
            Address = a;
            Gender = g;
        }
        public Double ComputeTotalBalance()
        {
            Double sum = 0;
            for(int i = 0; i< CounterOrder;i++)
            {
                sum = sum + ListOfOrders[i].balance;
            }
            return sum;
        }
        public String showOrders()
        {
            String str = "";
            for(int i = 0; i < CounterOrder; i++)
            {
                str = str + ListOfOrders[i].Number + "\n";
            }
            return str;
        }
        public abstract String ReturnStringInfo();
    }
}
