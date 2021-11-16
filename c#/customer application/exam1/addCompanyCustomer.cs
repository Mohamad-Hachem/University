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
    public partial class addCompanyCustomer : Form
    {
        public addCompanyCustomer()
        {
            InitializeComponent();
        }

        private void Button1_Click(object sender, EventArgs e)
        {
            String id = textBox1.Text;
            String name = textBox2.Text;
            String dob = textBox3.Text;
            String a = textBox4.Text;
            String gender;
            if (radioButton1.Checked)
                gender = radioButton1.Text;
            else
                gender = radioButton2.Text;
            String LN = textBox6.Text;
            String TN = textBox5.Text;
            Form1.companyCustumerArray[Form1.companyCustomerCounter] = new companyCustomer(id,name,dob,a,gender,LN,TN);
            Form1.companyCustomerCounter++;
            label7.Text = "COMPANYCustomer added";
            textBox1.Text = "";
            textBox2.Text = "";
            textBox3.Text = "";
            textBox5.Text = "";
            textBox4.Text = "";
            textBox6.Text = "";
        }
    }
}
