using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace pacman
{
    public partial class Form1 : Form
    {
        bool goUp;
        bool goDown;
        bool goLeft;
        bool goRight;
        int speedG = 2;
        int speed = 5;
        int ghost1 = 8 , ghost2 = 8,lives = 0 ;
       
        int score = 0;
        public Form1()
        {
            InitializeComponent();
            label2.Visible = false;
        }

        private void Timer1_Tick(object sender, EventArgs e)
        {
            
            speed = 5;
            if (yellowguy.Location.X < pacman.Location.X && !yellowguy.Bounds.IntersectsWith(pictureBox4.Bounds) && !yellowguy.Bounds.IntersectsWith(pictureBox1.Bounds) && !yellowguy.Bounds.IntersectsWith(pictureBox2.Bounds) && !yellowguy.Bounds.IntersectsWith(pictureBox3.Bounds))
            {
                yellowguy.Left += speedG;
            }
            if (yellowguy.Location.X > pacman.Location.X && !yellowguy.Bounds.IntersectsWith(pictureBox4.Bounds) && !yellowguy.Bounds.IntersectsWith(pictureBox1.Bounds) && !yellowguy.Bounds.IntersectsWith(pictureBox2.Bounds) && !yellowguy.Bounds.IntersectsWith(pictureBox3.Bounds))
            {
                yellowguy.Left -= speedG;
            }
            if (yellowguy.Location.Y > pacman.Location.Y)
            {
                yellowguy.Top -= speedG;
            }
            if (yellowguy.Location.Y < pacman.Location.Y)
            {
                yellowguy.Top += speedG;
            }
            if (pictureBox17.Location.X < pacman.Location.X && !pictureBox17.Bounds.IntersectsWith(pictureBox4.Bounds) && !pictureBox17.Bounds.IntersectsWith(pictureBox1.Bounds) && !pictureBox17.Bounds.IntersectsWith(pictureBox2.Bounds) && !pictureBox17.Bounds.IntersectsWith(pictureBox3.Bounds))
            {
                pictureBox17.Left += speedG-1;
            }
            if (pictureBox17.Location.X > pacman.Location.X && !pictureBox17.Bounds.IntersectsWith(pictureBox4.Bounds) && !pictureBox17.Bounds.IntersectsWith(pictureBox1.Bounds) && !pictureBox17.Bounds.IntersectsWith(pictureBox2.Bounds) && !pictureBox17.Bounds.IntersectsWith(pictureBox3.Bounds))
            {
                pictureBox17.Left -= speedG-1;
            }
            if (pictureBox17.Location.Y > pacman.Location.Y)
            {
                pictureBox17.Top -= speedG-1;
            }
            if (pictureBox17.Location.Y < pacman.Location.Y)
            {
                pictureBox17.Top += speedG-1;
            }
            label1.Text = "Score : " + score;
            label3.Text = "Deaths :" + lives;
            if(goLeft && !pacman.Bounds.IntersectsWith(pictureBox4.Bounds) && !pacman.Bounds.IntersectsWith(pictureBox1.Bounds) && !pacman.Bounds.IntersectsWith(pictureBox2.Bounds) && !pacman.Bounds.IntersectsWith(pictureBox3.Bounds))
            {
                pacman.Left -= speed;
            }
            if(goRight && !pacman.Bounds.IntersectsWith(pictureBox4.Bounds) && !pacman.Bounds.IntersectsWith(pictureBox1.Bounds) && !pacman.Bounds.IntersectsWith(pictureBox2.Bounds) && !pacman.Bounds.IntersectsWith(pictureBox3.Bounds))
            {
                pacman.Left += speed;
            }
            if(goUp)
            {
                pacman.Top -= speed;
            }
            if(goDown)
            {
                pacman.Top += speed;
            }
            redguy1.Left += ghost1;
            redguy2.Left += ghost2;
            if (redguy1.Bounds.IntersectsWith(pictureBox4.Bounds))
                ghost1 = -ghost1;
            if (redguy1.Bounds.IntersectsWith(pictureBox1.Bounds))
                ghost1 = -ghost1;
            if (redguy2.Bounds.IntersectsWith(pictureBox2.Bounds))
                ghost2 = -ghost2;
            if (redguy2.Bounds.IntersectsWith(pictureBox3.Bounds))
                ghost2 = -ghost2;
            foreach (Control x in this.Controls)
            {
                if(x is PictureBox && x.Tag=="ghost")
                {
                    if(((PictureBox)x).Bounds.IntersectsWith(pacman.Bounds))
                    {
                        lives = lives + 1;
                        if (lives < 3)
                        {
                            pacman.Left = 30;
                            pacman.Top = 30;
                            label3.Text = "Deaths :" + lives;
                        }
                        else
                        {
                            label3.Text = "Deaths :" + lives;
                            pacman.Left = 0;
                            pacman.Top = 25;
                            label2.Text = "GameOver";
                            label2.Visible = true;
                            timer1.Stop();
                            string message = " YOU LOST \n Do you want to restart the game?";
                            string title = "Close Window";
                            MessageBoxButtons buttons = MessageBoxButtons.YesNo;
                            DialogResult result = MessageBox.Show(message, title, buttons);
                            if (result == DialogResult.Yes)
                            {
                                Application.Restart();
                            }
                            else
                            {
                                this.Close();
                                // Do something  
                            }
                        }
                    }
                }
               if (x is PictureBox && x.Tag == "wall")
                {
                    if (((PictureBox)x).Bounds.IntersectsWith(pacman.Bounds))
                    {
                        speed = 2;
                    }
                }
                
                if(score == 12)
                {
                    pacman.Left = 0;
                    pacman.Top = 25;
                    label2.Text = "YOU WON";
                    label2.Visible = true;
                    timer1.Stop();

                }
                
                if(x is PictureBox && x.Tag == "coin")
                {
                    if(((PictureBox)x).Bounds.IntersectsWith(pacman.Bounds))
                    {
                        this.Controls.Remove(x);
                        score++;
                    }
                }
            }
            if (label2.Text.Equals("YOU WON"))
            {
                string message = "CONGRATS \n Do you want to restart the game?";
                string title = "Close Window";
                MessageBoxButtons buttons = MessageBoxButtons.YesNo;
                DialogResult result = MessageBox.Show(message, title, buttons);
                if (result == DialogResult.Yes)
                {
                    Application.Restart();
                }
                else
                {
                    this.Close();
                    // Do something  
                }
            }
        }

        private void keyisdown(object sender, KeyEventArgs e)
        {
            if(e.KeyCode == Keys.Left)
            {
                goLeft = true;
                pacman.Image = Properties.Resources.Right;
            }
            if(e.KeyCode == Keys.Right)
            {
                goRight = true;
                pacman.Image = Properties.Resources.Left;
            }
            if(e.KeyCode == Keys.Up)
            {
                goUp = true;
                pacman.Image = Properties.Resources.Up;
            }
            if(e.KeyCode == Keys.Down)
            {
                goDown = true;
                pacman.Image = Properties.Resources.down;
            }
        }

        private void PictureBox4_Click(object sender, EventArgs e)
        {

        }

        private void Redguy2_Click(object sender, EventArgs e)
        {

        }

        private void Button1_Click(object sender, EventArgs e)
        {
          // Application.Restart();
        }

        private void Button1_Click_1(object sender, EventArgs e)
        {
            Application.Restart();
        }

        private void keyisup(object sender, KeyEventArgs e)
        {
            if (e.KeyCode == Keys.Left)
            {
                goLeft = false;
            }
            if (e.KeyCode == Keys.Right)
            {
                goRight = false;
            }
            if (e.KeyCode == Keys.Up)
            {
                goUp = false;
            }
            if (e.KeyCode == Keys.Down)
            {
                goDown = false;
            }
        }
    }
}
