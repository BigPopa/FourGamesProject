import java.awt.Color;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TwentyOneSticks extends JFrame
	{
		static int rules;
		static int remainingSticks=21;
		static int stickChoice1;
		static int stickChoice2;
		static ImageIcon ruleIcon=new ImageIcon("rules.png");
		static boolean player1Win;
		static JFrame frame = new JFrame();
		public static void main(String[] args)
			{
				
				playTwentyOneSticks();
				
				//fix the ability for player 2 to go after player 1 loses
				//made more edits trying to do JPanel stuff
			}
		public static void youLose()
			{
				if(remainingSticks<=0)
					{
						JOptionPane.showMessageDialog(frame, "You took the Last Stick You Lose!");
						System.exit(0);
					}
			}
		public static void playTwentyOneSticks()
		{
			
			Object[] firstoptions = {"Yes", "No"};
			rules = JOptionPane.showOptionDialog(frame, "Do you want to see the rules?",
					"Number",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					ruleIcon, firstoptions, firstoptions[1]);
			if (rules==0)
				{
					JOptionPane.showMessageDialog(frame, "Rules: There are 21 Sticks and you can grab 1 or 2 each turn, the person who grabs the last stick loses");
				}
			while (remainingSticks>0)
				{
					
					ImageIcon red=new ImageIcon("player1square.png");
					ImageIcon blue=new ImageIcon("player2square.png");
					//JOptionPane.showMessageDialog(frame, "There are "+remainingSticks+" sticks left");
					Object[] options = {"1", "2"};
					stickChoice1 = JOptionPane.showOptionDialog(frame, "Player 1, how many sticks do you want to take?",
							"Number",
							JOptionPane.YES_NO_CANCEL_OPTION,
							JOptionPane.QUESTION_MESSAGE,
							red, options, options[1]);
					if (stickChoice1==0)
						{
							remainingSticks=remainingSticks-1;
							youLose();
						
						}
					else
						{
							remainingSticks=remainingSticks-2;
							youLose();
							
						}
					//JOptionPane.showMessageDialog(frame, "There are "+remainingSticks+" sticks left");
					Object[] options1 = {"1", "2"};
					stickChoice2 = JOptionPane.showOptionDialog(frame, "Player 2, how many sticks do you want to take?",
							"Number",
							JOptionPane.YES_NO_CANCEL_OPTION,
							JOptionPane.QUESTION_MESSAGE,
							blue, options1, options1[1]);
					if (stickChoice2==0)
						{
							remainingSticks=remainingSticks-1;
							youLose();
				
						}
					else
						{
							remainingSticks=remainingSticks-2;
							youLose();
							
						}
					
				}
		}
	}
