using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace exam1
{
    public partial class makeOrder : Form
    {
        public makeOrder()
        {
            InitializeComponent();
        }

        private void Button1_Click(object sender, EventArgs e)
        {
            int numb = int.Parse(textBox1.Text);
            Double bal = Double.Parse(textBox2.Text);
            String d = textBox3.Text;
            String id = textBox4.Text;
            if (radioButton1.Checked)
            {
                if (searchPerson(id) != -1)
                {
                    Form1.personCustomersArray[searchPerson(id)].ListOfOrders[Form1.personCustomersArray[searchPerson(id)].CounterOrder] = new order(numb,bal,d);
                    Form1.personCustomersArray[searchPerson(id)].CounterOrder++;
                    label5.Text = "Order was added to the personCustomer with id :" + id;
                }
                else
                {
                    label5.Text = "person customer not found";
                }
            }
            else
            {
                if (searchcompany(id) != -1)
                {
                    Form1.companyCustumerArray[searchcompany(id)].ListOfOrders[Form1.companyCustumerArray[searchcompany(id)].CounterOrder] = new order(numb, bal, d);
                    Form1.companyCustumerArray[searchcompany(id)].CounterOrder++;
                    label5.Text = "Order was added to the companyCustomer with id :" + id;
                }
                else
                {
                    label5.Text = "company customer not found";
                }
            }
            textBox1.Text = "";
            textBox2.Text = "";
            textBox3.Text = "";
            textBox4.Text = "";


        }
        public int searchPerson(String id)
        {
            for (int i = 0; i < Form1.personCustomerCounter; i++)
            {
                if (Form1.personCustomersArray[i].ID.Equals(id))
                    return i;
            }
            return -1;
        }
        public int searchcompany(String id)
        {
            for (int i = 0; i < Form1.companyCustomerCounter; i++)
            {
                if (Form1.companyCustumerArray[i].ID.Equals(id))
                    return i;
            }
            return -1;
        }
    }
}
