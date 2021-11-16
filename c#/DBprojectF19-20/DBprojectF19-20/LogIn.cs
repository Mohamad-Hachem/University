using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.OleDb;

namespace DBprojectF19_20
{
    public partial class LogIn : Form
    {
        public LogIn()
        {
            InitializeComponent();
        }

        private void LogIn_Load(object sender, EventArgs e)
        {
         
        }

        private void Button1_Click(object sender, EventArgs e)
        {
            try
            {
                string constring = @"Provider=Microsoft.Jet.OLEDB.4.0;Data Source=C:\Users\mhmd\Desktop\UserFall19_20.mdb";
                OleDbConnection conDataBase = new OleDbConnection(constring);
                OleDbCommand cmdDataBase = new OleDbCommand("Select * From users where UserName='" + this.textBox1.Text + "' and password='" + this.textBox2.Text + "';", conDataBase);
                OleDbDataReader myReader;

                conDataBase.Open();
                myReader = cmdDataBase.ExecuteReader();
                int count = 0;
                while (myReader.Read())
                {
                    count = count + 1;
                }
                if (count == 1)
                {
                    MessageBox.Show("Login Successful");
                }
                else if (count > 1)
                {
                    MessageBox.Show("Duplicate Username or Password");
                }
                else
                {
                    MessageBox.Show("Username or Password do not match");
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }
    }
}
