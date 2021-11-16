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
    public partial class AddPCustomer : Form
    {
        public AddPCustomer()
        {
            InitializeComponent();
        }

        private void AddPCustomer_Load(object sender, EventArgs e)
        {
     

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
            String ssn = textBox6.Text;
            Form1.personCustomersArray[Form1.personCustomerCounter] = new PersonCustomer(id, name, dob, a, gender, ssn);
            Form1.personCustomerCounter++;
            label7.Text = "personCustomer added";
            textBox1.Text = "";
            textBox2.Text = "";
            textBox3.Text = "";
            textBox4.Text = "";
            textBox6.Text = "";

        }
    }
}
