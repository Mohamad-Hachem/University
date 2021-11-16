namespace exam1
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
            this.addPersonCustomerToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.addCompanyCustomerToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.findACustomerAndShowInfoToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.makeAnOrderAndAssignItToCustomerToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
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
            this.addPersonCustomerToolStripMenuItem,
            this.addCompanyCustomerToolStripMenuItem,
            this.findACustomerAndShowInfoToolStripMenuItem,
            this.makeAnOrderAndAssignItToCustomerToolStripMenuItem});
            this.menuToolStripMenuItem.Name = "menuToolStripMenuItem";
            this.menuToolStripMenuItem.Size = new System.Drawing.Size(60, 24);
            this.menuToolStripMenuItem.Text = "menu";
            // 
            // addPersonCustomerToolStripMenuItem
            // 
            this.addPersonCustomerToolStripMenuItem.Name = "addPersonCustomerToolStripMenuItem";
            this.addPersonCustomerToolStripMenuItem.Size = new System.Drawing.Size(358, 26);
            this.addPersonCustomerToolStripMenuItem.Text = "Add person Customer";
            this.addPersonCustomerToolStripMenuItem.Click += new System.EventHandler(this.AddPersonCustomerToolStripMenuItem_Click);
            // 
            // addCompanyCustomerToolStripMenuItem
            // 
            this.addCompanyCustomerToolStripMenuItem.Name = "addCompanyCustomerToolStripMenuItem";
            this.addCompanyCustomerToolStripMenuItem.Size = new System.Drawing.Size(358, 26);
            this.addCompanyCustomerToolStripMenuItem.Text = "Add company Customer";
            this.addCompanyCustomerToolStripMenuItem.Click += new System.EventHandler(this.AddCompanyCustomerToolStripMenuItem_Click);
            // 
            // findACustomerAndShowInfoToolStripMenuItem
            // 
            this.findACustomerAndShowInfoToolStripMenuItem.Name = "findACustomerAndShowInfoToolStripMenuItem";
            this.findACustomerAndShowInfoToolStripMenuItem.Size = new System.Drawing.Size(358, 26);
            this.findACustomerAndShowInfoToolStripMenuItem.Text = "find a customer and show info";
            this.findACustomerAndShowInfoToolStripMenuItem.Click += new System.EventHandler(this.FindACustomerAndShowInfoToolStripMenuItem_Click);
            // 
            // makeAnOrderAndAssignItToCustomerToolStripMenuItem
            // 
            this.makeAnOrderAndAssignItToCustomerToolStripMenuItem.Name = "makeAnOrderAndAssignItToCustomerToolStripMenuItem";
            this.makeAnOrderAndAssignItToCustomerToolStripMenuItem.Size = new System.Drawing.Size(358, 26);
            this.makeAnOrderAndAssignItToCustomerToolStripMenuItem.Text = "Make an order and assign it to customer";
            this.makeAnOrderAndAssignItToCustomerToolStripMenuItem.Click += new System.EventHandler(this.MakeAnOrderAndAssignItToCustomerToolStripMenuItem_Click);
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
        private System.Windows.Forms.ToolStripMenuItem addPersonCustomerToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem addCompanyCustomerToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem findACustomerAndShowInfoToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem makeAnOrderAndAssignItToCustomerToolStripMenuItem;
    }
}

