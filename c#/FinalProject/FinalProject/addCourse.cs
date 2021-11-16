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

namespace FinalProject
{
    public partial class addCourse : Form
    {
        public addCourse()
        {
            InitializeComponent();
        }

        private void Button1_Click(object sender, EventArgs e)
        {
            if (!CourseValues())
            {
                try
                {
                    string constring = @"Provider=Microsoft.Jet.OLEDB.4.0;Data Source=C:\Users\mhmd\Desktop\semester fall 2019-2020\object oreinted Prog csc237\University.mdb";
                    OleDbConnection conDataBase = new OleDbConnection(constring);
                    OleDbCommand cmdDataBase = new OleDbCommand("Insert INTO Course values('" + this.textBox1.Text + "','" + this.textBox2.Text + "','" + this.textBox3.Text + "');", conDataBase);
                    OleDbDataReader myReader;

                    conDataBase.Open();
                    myReader = cmdDataBase.ExecuteReader();
                    MessageBox.Show("course added");
                }
                catch (Exception ex)
                {
                    MessageBox.Show(ex.Message);
                }
            }
            else
            {
                MessageBox.Show("This Course Number already Exist before change it");
            }
        }
        private Boolean CourseValues()
        {
            try
            {
                string constring = @"Provider=Microsoft.Jet.OLEDB.4.0;Data Source=C:\Users\mhmd\Desktop\semester fall 2019-2020\object oreinted Prog csc237\University.mdb";
                OleDbConnection conDataBase = new OleDbConnection(constring);
                OleDbCommand cmdDataBase = new OleDbCommand("Select * From Course where Number='" + this.textBox2.Text + "';", conDataBase);
                OleDbDataReader myReader;

                conDataBase.Open();
                myReader = cmdDataBase.ExecuteReader();
                int count = 0;
                while (myReader.Read())
                {
                    count = count + 1;
                }
                if (count >= 1)
                    return true;
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
                return false;
            }
            return false;
        }

        private void AddCourse_Load(object sender, EventArgs e)
        {

        }
    }
}
