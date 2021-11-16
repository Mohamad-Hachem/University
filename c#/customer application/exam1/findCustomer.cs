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
    public partial class findCustomer : Form
    {
        public findCustomer()
        {
            InitializeComponent();
        }

        private void Label1_Click(object sender, EventArgs e)
        {

        }

        private void Button1_Click(object sender, EventArgs e)
        {
            String id = textBox1.Text;
            if(radioButton1.Checked)
            {
                if (searchPerson(id) != -1)
                {
                    richTextBox1.Text = Form1.personCustomersArray[searchPerson(id)].ReturnStringInfo();
                }
                else
                {
                    label2.Text = "person customer not found";
                }
            }
            else
            {
                if (searchcompany(id) != -1)
                {
                    richTextBox1.Text = Form1.companyCustumerArray[searchcompany(id)].ReturnStringInfo();
                }
                else
                {
                    label2.Text = "company customer not found";
                }
            }
        }

        private void TextBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void RichTextBox1_TextChanged(object sender, EventArgs e)
        {

        }
        public int searchPerson(String id)
        {
            for(int i = 0; i <Form1.personCustomerCounter; i++)
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
