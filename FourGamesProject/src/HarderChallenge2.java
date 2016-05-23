import java.awt.*;
import java.util.Scanner;

import javax.swing.*;
public class HarderChallenge2 extends Canvas
	{
		static boolean look=true;
		private static final long	serialVersionUID	= 1L;
		public static void main(String[] args)
			{
				HarderChallenge2 canvas = new HarderChallenge2();
			        JFrame frame = new JFrame();
			        frame.setSize(600, 600);
			        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			        frame.getContentPane().add(canvas).setBackground(Color.white);
			        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
			        frame.setResizable(false);
			        frame.setVisible(true);
			}
		public void paint(Graphics graphics)
		{	
			for (int i=0;i<=600;i=i+75)
				{
					if (i%2==0)
						{
							graphics.setColor(Color.white);
							graphics.fillRect(0, i, 75, 75);
						}
					else
						{
							graphics.setColor(Color.black);
							graphics.fillRect(0, i, 75, 75);
						}
					
				}
			for (int i=0;i<=600;i=i+75)
				{
					if (i%2==0)
						{
							graphics.setColor(Color.white);
							graphics.fillRect(150, i, 75, 75);
						}
					else
						{
							graphics.setColor(Color.black);
							graphics.fillRect(150, i, 75, 75);
						}
					
				}
			for (int i=0;i<=600;i=i+75)
				{
					if (i%2==0)
						{
							graphics.setColor(Color.white);
							graphics.fillRect(300, i, 75, 75);
						}
					else
						{
							graphics.setColor(Color.black);
							graphics.fillRect(300, i, 75, 75);
						}
					
				}
			for (int i=0;i<=600;i=i+75)
				{
					if (i%2==0)
						{
							graphics.setColor(Color.white);
							graphics.fillRect(450, i, 75, 75);
						}
					else
						{
							graphics.setColor(Color.black);
							graphics.fillRect(450, i, 75, 75);
						}
					
				}
			//start again
			for (int i=0;i<=600;i=i+75)
				{
					if (i%2==0)
						{
							graphics.setColor(Color.black);
							graphics.fillRect(75, i, 75, 75);
						}
					else
						{
							graphics.setColor(Color.white);
							graphics.fillRect(75, i, 75, 75);
							
						}
					
				}
			for (int i=0;i<=600;i=i+75)
				{
					if (i%2==0)
						{
							graphics.setColor(Color.black);
							graphics.fillRect(225, i, 75, 75);
						}
					else
						{
							graphics.setColor(Color.white);
							graphics.fillRect(225, i, 75, 75);
						}
					
				}
			for (int i=0;i<=600;i=i+75)
				{
					if (i%2==0)
						{
							graphics.setColor(Color.black);
							graphics.fillRect(375, i, 75, 75);
						}
					else
						{
							graphics.setColor(Color.white);
							graphics.fillRect(375, i, 75, 75);
							
						}
					
				}
			for (int i=0;i<=600;i=i+75)
				{
					if (i%2==0)
						{
							graphics.setColor(Color.black);
							graphics.fillRect(525, i, 75, 75);
						}
					else
						{
							graphics.setColor(Color.white);
							graphics.fillRect(525, i, 75, 75);
							
						}
					
				}
			
		}
		public void delay()
			{
	        try
					{
					Thread.sleep(50);
					} catch (InterruptedException e)
					{
					e.printStackTrace();
					}
			}
	}