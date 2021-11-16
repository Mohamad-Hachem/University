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
    public partial class Form1 : Form
    {
        AddPCustomer apc = new AddPCustomer();
        public static PersonCustomer[] personCustomersArray = new PersonCustomer[10];
        public static int personCustomerCounter = 0 ;
        addCompanyCustomer acc = new addCompanyCustomer();
        public static companyCustomer[] companyCustumerArray = new companyCustomer[10];
        public static int companyCustomerCounter = 0;
        findCustomer fc = new findCustomer();
        makeOrder mo = new makeOrder();
        public Form1()
        {
            InitializeComponent();
        }

        private void AddPersonCustomerToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if(apc == null|| apc.IsDisposed)
                apc = new AddPCustomer();
            apc.Show();
        }

        private void AddCompanyCustomerToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (acc == null || acc.IsDisposed)
                acc = new addCompanyCustomer();
            acc.Show();
        }

        private void FindACustomerAndShowInfoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if ( fc == null || fc.IsDisposed)
                fc = new findCustomer();
            fc.Show();
        }

        private void MakeAnOrderAndAssignItToCustomerToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (mo == null || mo.IsDisposed)
               mo = new makeOrder();
            mo.Show();
        }
    }
}
