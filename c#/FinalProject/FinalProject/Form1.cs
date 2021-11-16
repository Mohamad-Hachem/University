using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace FinalProject
{
    public partial class Form1 : Form
    {
        addCourse ac = new addCourse();
        StudentRegister sr = new StudentRegister();
        registerCourse rc = new registerCourse();
        ShowCourseInfo sci = new ShowCourseInfo();
        studentShowInfo ssi = new studentShowInfo();
        public Form1()
        {
            InitializeComponent();
        }

        private void AddACourseToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (ac == null || ac.IsDisposed)
                ac = new addCourse();
            ac.Show();
        }

        private void AddAStudentToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (sr == null || sr.IsDisposed)
                sr = new StudentRegister();
            sr.Show();
        }

        private void RegisterSudentToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (rc == null || rc.IsDisposed)
                rc = new registerCourse();
            rc.Show();
        }

        private void ShowCourseInfoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (sci == null || sci.IsDisposed)
                sci = new ShowCourseInfo();
            sci.Show();
        }

        private void ShowStudentInfoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (ssi == null || ssi.IsDisposed)
                ssi = new studentShowInfo();
            ssi.Show();
        }
    }
}
