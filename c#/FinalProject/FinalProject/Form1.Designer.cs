namespace FinalProject
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.menuToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.addACourseToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.addAStudentToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.registerSudentToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.showCourseInfoToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.showStudentInfoToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.menuStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // menuStrip1
            // 
            this.menuStrip1.ImageScalingSize = new System.Drawing.Size(20, 20);
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.menuToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(800, 28);
            this.menuStrip1.TabIndex = 0;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // menuToolStripMenuItem
            // 
            this.menuToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.addACourseToolStripMenuItem,
            this.addAStudentToolStripMenuItem,
            this.registerSudentToolStripMenuItem,
            this.showCourseInfoToolStripMenuItem,
            this.showStudentInfoToolStripMenuItem});
            this.menuToolStripMenuItem.Name = "menuToolStripMenuItem";
            this.menuToolStripMenuItem.Size = new System.Drawing.Size(60, 24);
            this.menuToolStripMenuItem.Text = "menu";
            // 
            // addACourseToolStripMenuItem
            // 
            this.addACourseToolStripMenuItem.Name = "addACourseToolStripMenuItem";
            this.addACourseToolStripMenuItem.Size = new System.Drawing.Size(282, 26);
            this.addACourseToolStripMenuItem.Text = "Add a course";
            this.addACourseToolStripMenuItem.Click += new System.EventHandler(this.AddACourseToolStripMenuItem_Click);
            // 
            // addAStudentToolStripMenuItem
            // 
            this.addAStudentToolStripMenuItem.Name = "addAStudentToolStripMenuItem";
            this.addAStudentToolStripMenuItem.Size = new System.Drawing.Size(282, 26);
            this.addAStudentToolStripMenuItem.Text = "Add a Student";
            this.addAStudentToolStripMenuItem.Click += new System.EventHandler(this.AddAStudentToolStripMenuItem_Click);
            // 
            // registerSudentToolStripMenuItem
            // 
            this.registerSudentToolStripMenuItem.Name = "registerSudentToolStripMenuItem";
            this.registerSudentToolStripMenuItem.Size = new System.Drawing.Size(282, 26);
            this.registerSudentToolStripMenuItem.Text = "register a student in a course";
            this.registerSudentToolStripMenuItem.Click += new System.EventHandler(this.RegisterSudentToolStripMenuItem_Click);
            // 
            // showCourseInfoToolStripMenuItem
            // 
            this.showCourseInfoToolStripMenuItem.Name = "showCourseInfoToolStripMenuItem";
            this.showCourseInfoToolStripMenuItem.Size = new System.Drawing.Size(282, 26);
            this.showCourseInfoToolStripMenuItem.Text = "Show course info";
            this.showCourseInfoToolStripMenuItem.Click += new System.EventHandler(this.ShowCourseInfoToolStripMenuItem_Click);
            // 
            // showStudentInfoToolStripMenuItem
            // 
            this.showStudentInfoToolStripMenuItem.Name = "showStudentInfoToolStripMenuItem";
            this.showStudentInfoToolStripMenuItem.Size = new System.Drawing.Size(282, 26);
            this.showStudentInfoToolStripMenuItem.Text = "Show student info";
            this.showStudentInfoToolStripMenuItem.Click += new System.EventHandler(this.ShowStudentInfoToolStripMenuItem_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.menuStrip1);
            this.MainMenuStrip = this.menuStrip1;
            this.Name = "Form1";
            this.Text = "Form1";
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem menuToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem addACourseToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem addAStudentToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem registerSudentToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem showCourseInfoToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem showStudentInfoToolStripMenuItem;
    }
}

