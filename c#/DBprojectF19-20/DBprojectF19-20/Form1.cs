using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace DBprojectF19_20
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }           

        private void LogInToolStripMenuItem_Click(object sender, EventArgs e)
        {
            LogIn f2 = new LogIn();
            f2.Show();
        }

        private void NewUserToolStripMenuItem_Click(object sender, EventArgs e)
        {
            NewUser f3 = new NewUser();
            f3.Show();
        }
    }
}
