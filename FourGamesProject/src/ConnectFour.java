import java.util.Scanner;

public class ConnectFour
	{
		static String connectBoard [][]= new String [7][6];
		static int r;
		static int c;
		static boolean endFour = true;
		public static void main(String[] args)
			{
				playGame();
			}
		public static void playGame()
			{
				

						while (endFour)
						{							
							greetUser();
							inputChoice();
							displayBoard();
							endGame();
							talkComputer();
							playComputer();
							displayBoard();
							endGame();
						}
			}
			public static void doTicTacToe()
				{
				System.out.println("Looks like we are going to play some Connect four");
					
				for (int row=0;row<3;row++)
					{
					System.out.println(" ");
					for (int col=0;col<3;col++)
						{
							connectBoard[row][col]=" ";
						}
					}
				}
			
			public static void displayBoard()
				{
				System.out.println(" |-1-|-2-|-3-|-4-|-5-|-6-|-7-|");
				System.out.println("---------------");
				System.out.println(" | "+connectBoard[0][0]+" | "+connectBoard[0][1]+" | "+connectBoard[0][2]+" |"+connectBoard[0][3]+" | "+connectBoard[0][4]+" | "+connectBoard[0][5]+" |"+connectBoard[0][6]+" | ");
				System.out.println("---------------");
				System.out.println(" | "+connectBoard[1][0]+" | "+connectBoard[1][1]+" | "+connectBoard[1][2]+" |"+connectBoard[1][3]+" | "+connectBoard[1][4]+" | "+connectBoard[1][5]+" |"+connectBoard[1][6]+" | ");
				System.out.println("---------------");
				System.out.println(" | "+connectBoard[2][0]+" | "+connectBoard[2][1]+" | "+connectBoard[2][2]+" |"+connectBoard[2][3]+" | "+connectBoard[2][4]+" | "+connectBoard[2][5]+" |"+connectBoard[2][6]+" | ");
				System.out.println("---------------");
				System.out.println(" | "+connectBoard[3][0]+" | "+connectBoard[3][1]+" | "+connectBoard[3][2]+" |"+connectBoard[3][3]+" | "+connectBoard[3][4]+" | "+connectBoard[3][5]+" |"+connectBoard[3][6]+" | ");
				System.out.println("---------------");
				System.out.println(" | "+connectBoard[4][0]+" | "+connectBoard[4][1]+" | "+connectBoard[4][2]+" |"+connectBoard[4][3]+" | "+connectBoard[4][4]+" | "+connectBoard[4][5]+" |"+connectBoard[4][6]+" | ");
				System.out.println("---------------");
				System.out.println(" | "+connectBoard[5][0]+" | "+connectBoard[5][1]+" | "+connectBoard[5][2]+" |"+connectBoard[5][3]+" | "+connectBoard[5][4]+" | "+connectBoard[5][5]+" |"+connectBoard[5][6]+" | ");
				System.out.println("---------------");
				}
			public static void greetUser()
				{
					System.out.println("Chose the spot where you want to play make sure you state the letter first and the number next");
				}
				
			public static void inputChoice()
				{
					Scanner userInput = new Scanner(System.in);
					String choice = userInput.nextLine();
					switch (choice.substring(0,1))
					{
						case "A":
						case "a":
								{
									r=0;
									break;
								}
						case "B":
						case "b":
								{
									r=1;
									break;
								}
						case "C":
						case "c":
								{
									r=2;
									break;
								}					
					}
					c = Integer.parseInt(choice.substring(1)) - 1;
					if (connectBoard[r][c]!=" ")
						{
							System.out.println("That spot is taken buddy, nice try.  Guess again");
							inputChoice();
						}
					connectBoard[r][c]="X";
							
				}
			public static void talkComputer()
				{
					System.out.println("My turn! I think I will go right here.");
				}
			public static void playComputer()
				{
					int randomNumber1 = (int) (Math.random()*3);
					int randomNumber2 = (int) (Math.random()*3);
					switch (randomNumber1)
					{
						case 0:
								{
									r=0;
									break;
								}
						case 1:
								{
									r=1;
									break;
								}
						case 2:
								{
									r=2;
									break;
								}
					}
					switch (randomNumber2)
					{
						case 0:
								{
									c=0;
									break;
								}
						case 1:
								{
									c=1;
									break;
								}
						case 2:
								{
									c=2;
									break;
								}
					}				
					if (connectBoard[r][c]!=" ")
						{
							playComputer();
						}
					else if ((connectBoard[0][0].equals(connectBoard[0][1])&&connectBoard[0][0].equals(connectBoard[0][2])&&!connectBoard[0][0].equals(" "))||
						(connectBoard[1][0].equals(connectBoard[1][1])&&connectBoard[1][0].equals(connectBoard[1][2])&&!connectBoard[1][0].equals(" "))||
						(connectBoard[2][0].equals(connectBoard[2][1])&&connectBoard[2][0].equals(connectBoard[2][2])&&!connectBoard[2][0].equals(" "))||
						(connectBoard[0][0].equals(connectBoard[1][1])&&connectBoard[0][0].equals(connectBoard[2][2])&&!connectBoard[0][0].equals(" "))||
						(connectBoard[0][2].equals(connectBoard[1][1])&&connectBoard[0][2].equals(connectBoard[2][0])&&!connectBoard[0][2].equals(" "))||
						(connectBoard[0][0].equals(connectBoard[1][0])&&connectBoard[0][0].equals(connectBoard[2][0])&&!connectBoard[0][0].equals(" "))||
						(connectBoard[0][1].equals(connectBoard[1][1])&&connectBoard[0][1].equals(connectBoard[2][1])&&!connectBoard[0][1].equals(" "))||
						(connectBoard[0][2].equals(connectBoard[1][2])&&connectBoard[0][2].equals(connectBoard[2][2])&&!connectBoard[0][2].equals(" ")))
						{
							System.out.println("Tie Game, well played");
							endFour = false;
							System.exit(0);
						}
					connectBoard[r][c]="O";
				}
			public static void endGame()
			{
				if ((connectBoard[0][0].equals(connectBoard[0][1])&&connectBoard[0][0].equals(connectBoard[0][2])&&!connectBoard[0][0].equals(" ")&&!connectBoard[0][0].equals("O"))||
					(connectBoard[1][0].equals(connectBoard[1][1])&&connectBoard[1][0].equals(connectBoard[1][2])&&!connectBoard[1][0].equals(" ")&&!connectBoard[1][0].equals("O"))||
					(connectBoard[2][0].equals(connectBoard[2][1])&&connectBoard[2][0].equals(connectBoard[2][2])&&!connectBoard[2][0].equals(" ")&&!connectBoard[2][0].equals("O"))||
					(connectBoard[0][0].equals(connectBoard[1][1])&&connectBoard[0][0].equals(connectBoard[2][2])&&!connectBoard[0][0].equals(" ")&&!connectBoard[0][0].equals("O"))||
					(connectBoard[0][2].equals(connectBoard[1][1])&&connectBoard[0][2].equals(connectBoard[2][0])&&!connectBoard[0][2].equals(" ")&&!connectBoard[0][2].equals("O"))||
					(connectBoard[0][0].equals(connectBoard[1][0])&&connectBoard[0][0].equals(connectBoard[2][0])&&!connectBoard[0][0].equals(" ")&&!connectBoard[0][0].equals("O"))||
					(connectBoard[0][1].equals(connectBoard[1][1])&&connectBoard[0][1].equals(connectBoard[2][1])&&!connectBoard[0][1].equals(" ")&&!connectBoard[0][1].equals("O"))||
					(connectBoard[0][2].equals(connectBoard[1][2])&&connectBoard[0][2].equals(connectBoard[2][2])&&!connectBoard[0][2].equals(" ")&&!connectBoard[0][2].equals("O")))
					{
						System.out.println("Game Over, well played you win!");
						endFour = false;
						System.exit(0);
					}
				else if ((connectBoard[0][0].equals(connectBoard[0][1])&&connectBoard[0][0].equals(connectBoard[0][2])&&!connectBoard[0][0].equals(" ")&&!connectBoard[0][0].equals("X"))||
						(connectBoard[1][0].equals(connectBoard[1][1])&&connectBoard[1][0].equals(connectBoard[1][2])&&!connectBoard[1][0].equals(" ")&&!connectBoard[1][0].equals("X"))||
						(connectBoard[2][0].equals(connectBoard[2][1])&&connectBoard[2][0].equals(connectBoard[2][2])&&!connectBoard[2][0].equals(" ")&&!connectBoard[2][0].equals("X"))||
						(connectBoard[0][0].equals(connectBoard[1][1])&&connectBoard[0][0].equals(connectBoard[2][2])&&!connectBoard[0][0].equals(" ")&&!connectBoard[0][0].equals("X"))||
						(connectBoard[0][2].equals(connectBoard[1][1])&&connectBoard[0][2].equals(connectBoard[2][0])&&!connectBoard[0][2].equals(" ")&&!connectBoard[0][2].equals("X"))||
						(connectBoard[0][0].equals(connectBoard[1][0])&&connectBoard[0][0].equals(connectBoard[2][0])&&!connectBoard[0][0].equals(" ")&&!connectBoard[0][0].equals("X"))||
						(connectBoard[0][1].equals(connectBoard[1][1])&&connectBoard[0][1].equals(connectBoard[2][1])&&!connectBoard[0][1].equals(" ")&&!connectBoard[0][1].equals("X"))||
						(connectBoard[0][2].equals(connectBoard[1][2])&&connectBoard[0][2].equals(connectBoard[2][2])&&!connectBoard[0][2].equals(" ")&&!connectBoard[0][2].equals("X")))
					{
						System.out.println("I WIN, you lose!");
						endFour = false;
						System.exit(0);
					}
				else if ((connectBoard[0][0].equals(connectBoard[0][1])&&connectBoard[0][0].equals(connectBoard[0][2])&&!connectBoard[0][0].equals(" "))||
						(connectBoard[1][0].equals(connectBoard[1][1])&&connectBoard[1][0].equals(connectBoard[1][2])&&!connectBoard[1][0].equals(" "))||
						(connectBoard[2][0].equals(connectBoard[2][1])&&connectBoard[2][0].equals(connectBoard[2][2])&&!connectBoard[2][0].equals(" "))||
						(connectBoard[0][0].equals(connectBoard[1][1])&&connectBoard[0][0].equals(connectBoard[2][2])&&!connectBoard[0][0].equals(" "))||
						(connectBoard[0][2].equals(connectBoard[1][1])&&connectBoard[0][2].equals(connectBoard[2][0])&&!connectBoard[0][2].equals(" "))||
						(connectBoard[0][0].equals(connectBoard[1][0])&&connectBoard[0][0].equals(connectBoard[2][0])&&!connectBoard[0][0].equals(" "))||
						(connectBoard[0][1].equals(connectBoard[1][1])&&connectBoard[0][1].equals(connectBoard[2][1])&&!connectBoard[0][1].equals(" "))||
						(connectBoard[0][2].equals(connectBoard[1][2])&&connectBoard[0][2].equals(connectBoard[2][2])&&!connectBoard[0][2].equals(" ")))
					{
						System.out.println("Tie Game, well played");
						endFour = false;
						System.exit(0);
					}
			}

	}
