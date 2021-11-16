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
    public partial class NewUser : Form
    {
        public NewUser()
        {
            InitializeComponent();
        }

        private void Button1_Click(object sender, EventArgs e)
        {
            try
            {
                string constring = @"Provider=Microsoft.Jet.OLEDB.4.0;Data Source=C:\Users\mhmd\Desktop\UserFall19_20.mdb";
                OleDbConnection conDataBase = new OleDbConnection(constring);
                OleDbCommand cmdDataBase = new OleDbCommand("Insert INTO users values('"+ this.textBox1.Text + "','"+this.textBox2.Text+"');",conDataBase);
                OleDbDataReader myReader;

                conDataBase.Open();
                myReader = cmdDataBase.ExecuteReader();
                MessageBox.Show("Record added");
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }
    }
}
