import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FourGames
	{
		static String boardArray [][]= new String [3][3];
		static int row;
		static int col;
		static boolean endGame = true;
		static boolean stopBlack = true;
		static boolean continueGame = true;
		static int money=100;
		static ArrayList <Card> deck = new  ArrayList<Card>();
		public static void main(String[] args)
		{
			while(continueGame)
				{
					//test
				Scanner userInput = new Scanner(System.in);
				System.out.println("What do you want to play type the number for the game you want to play:");
				System.out.println("(1) Tic-Tac-Toe");
				System.out.println("(2) Coin Flip Gambling");
				System.out.println("(3) Rolling Dice Gambling");
				System.out.println("(4) BlackJack Gambling");
				int choice = userInput.nextInt();
				if (choice==1)				
					{
						doTicTacToe();
						displayBoard();
						playGame();
					}
				else if (choice==2)
					{
						wasteMoney();
					}
				else if (choice==3)
					{
						rollingDice();
					}
				else if (choice==4)
					{
						fillDeck();
						dealPlayer();
					}
				}
		}
			
		public static void fillDeck()
			{
				deck.add(new Card("Diamonds","Ace", 1));
				deck.add(new Card("Diamonds","Two", 2));
				deck.add(new Card("Diamonds","Three", 3));
				deck.add(new Card("Diamonds","Four", 4));
				deck.add(new Card("Diamonds","Five", 5));
				deck.add(new Card("Diamonds","Six", 6));
				deck.add(new Card("Diamonds","Seven", 7));
				deck.add(new Card("Diamonds","Eight", 8));
				deck.add(new Card("Diamonds","Nine", 9));
				deck.add(new Card("Diamonds","Ten", 10));
				deck.add(new Card("Diamonds","Jack", 10));
				deck.add(new Card("Diamonds","Queen", 10));
				deck.add(new Card("Diamonds","King", 10));
				deck.add(new Card("Hearts","Ace", 1));
				deck.add(new Card("Hearts","Two", 2));
				deck.add(new Card("Hearts","Three", 3));
				deck.add(new Card("Hearts","Four", 4));
				deck.add(new Card("Hearts","Five", 5));
				deck.add(new Card("Hearts","Six", 6));
				deck.add(new Card("Hearts","Seven", 7));
				deck.add(new Card("Hearts","Eight", 8));
				deck.add(new Card("Hearts","Nine", 9));
				deck.add(new Card("Hearts","Ten", 10));
				deck.add(new Card("Hearts","Jack", 10));
				deck.add(new Card("Hearts","Queen", 10));
				deck.add(new Card("Hearts","King", 10));
				deck.add(new Card("Clubs","Ace", 1));
				deck.add(new Card("Clubs","Two", 2));
				deck.add(new Card("Clubs","Three", 3));
				deck.add(new Card("Clubs","Four", 4));
				deck.add(new Card("Clubs","Five", 5));
				deck.add(new Card("Clubs","Six", 6));
				deck.add(new Card("Clubs","Seven", 7));
				deck.add(new Card("Clubs","Eight", 8));
				deck.add(new Card("Clubs","Nine", 9));
				deck.add(new Card("Clubs","Ten", 10));
				deck.add(new Card("Clubs","Jack", 10));
				deck.add(new Card("Clubs","Queen", 10));
				deck.add(new Card("Clubs","King", 10));
				deck.add(new Card("Spades","Ace", 1));
				deck.add(new Card("Spades","Two", 2));
				deck.add(new Card("Spades","Three", 3));
				deck.add(new Card("Spades","Four", 4));
				deck.add(new Card("Spades","Five", 5));
				deck.add(new Card("Spades","Six", 6));
				deck.add(new Card("Spades","Seven", 7));
				deck.add(new Card("Spades","Eight", 8));
				deck.add(new Card("Spades","Nine", 9));
				deck.add(new Card("Spades","Ten", 10));
				deck.add(new Card("Spades","Jack", 10));
				deck.add(new Card("Spades","Queen", 10));
				deck.add(new Card("Spades","King", 10));			
			}
		public static void dealPlayer()
			{
				System.out.println("Let's play some BlackJack! Do you want to check to make sure we have a full deck?");
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				Scanner checkDeck = new Scanner(System.in);
				int choice=checkDeck.nextInt();
				if (choice==1)
					{
						System.out.println("Are you sure?");
						System.out.println("(1) Yes");
						System.out.println("(2) No");
						Scanner checkDeck1 = new Scanner(System.in);
						int choice1=checkDeck1.nextInt();
						if (choice1==1)
							{
								System.out.println("Okay your funeral");
								for (Card c:deck)
									{
										System.out.println(c.getRank()+" of "+c.getSuit());
									}
							}						
					}	
				else if (choice==2)
					{
						System.out.println("Yeah, I didn't want to either");
					}
				continueGame=true;
				while (continueGame)
				{
					Collections.shuffle(deck);
					int playerTotal=0;
					int computerTotal=0;
					System.out.println("I will shuffle and deal you two cards, but first tell me how much money you want to bet");
					System.out.println("You have "+money+" dollars");
					Scanner betAmount = new Scanner(System.in);
					int bet=betAmount.nextInt();
					if (bet > money)
						{
							System.out.println("You can't afford that!");
						}
						else if (bet<0)
						{
							System.out.println("Nice try buddy, thats not possible");
						}			
						else
							{
								System.out.println("Here are your cards:");
								computerTotal=deck.get(2).getValue()+deck.get(3).getValue();
								playerTotal=deck.get(0).getValue()+deck.get(1).getValue();
								System.out.println(deck.get(0).getRank()+" of "+deck.get(0).getSuit());
								System.out.println(deck.get(1).getRank()+" of "+deck.get(1).getSuit());
								deck.remove(0);
								deck.remove(0);
								deck.remove(0);
								deck.remove(0);
								if (computerTotal<14)
									{
										computerTotal=computerTotal+deck.get(0).getValue();
										deck.remove(0);
									}
								stopBlack=true;						
								while (stopBlack)
									{
									System.out.println("Your current total is "+playerTotal+" Type the number of what you want to do:");
									System.out.println("(1) Hit");
									System.out.println("(2) Pass");
									Scanner userInput = new Scanner(System.in);
									int choice1 = userInput.nextInt();
									if (choice1==1)
										{
											playerTotal=playerTotal+deck.get(0).getValue();
											System.out.println(deck.get(0).getRank()+" of "+deck.get(0).getSuit());
											deck.remove(0);
											if (playerTotal>21)
												{
													money=money-bet;
													System.out.println("Bust! You went over 21 your total was "+playerTotal+" you now have "+money+" dollars");
													stopBlack=false;													
													System.out.println("Do you want to continue BlackJack?");
													System.out.println("(1) Yes");
													System.out.println("(2) No");
													Scanner userInput1 = new Scanner(System.in);
													int playerContinue = userInput1.nextInt();
													if (playerContinue==2)
														{
															continueGame=false;
														}
													else if (playerContinue==1)
														{
															System.out.println("Awesome, lets play again!");
														}
												}
											else if (playerTotal==21)
												{
													money=money+bet;
													System.out.println("Wow you got lucky! You got a 21! You now have "+money+" dollars");
													stopBlack=false;											
													System.out.println("Do you want to continue BlackJack?");
													System.out.println("(1) Yes");
													System.out.println("(2) No");
													Scanner userInput2 = new Scanner(System.in);
													int playerContinue = userInput2.nextInt();
													if (playerContinue==2)
														{
															continueGame=false;
														}
													else if (playerContinue==1)
														{
															System.out.println("Awesome, lets play again!");
														}
												}
										}
									else if (choice1==2)
										{
											System.out.println("I guess you are staying with "+playerTotal+", lets see what I ended up with");
											stopBlack=false;
										}
									}
									System.out.println("I got a total of "+computerTotal+" and it looks like you got "+playerTotal);
									if (playerTotal>computerTotal)
										{
											if (playerTotal<=21)
												{
													money=money+bet;
													System.out.println("You WIN! You now have "+money+" dollars");						
													System.out.println("Do you want to continue BlackJack?");
													System.out.println("(1) Yes");
													System.out.println("(2) No");
													Scanner userInput = new Scanner(System.in);
													int playerContinue = userInput.nextInt();
													if (playerContinue==2)
														{
															continueGame=false;
														}
													else if (playerContinue==1)
														{
															System.out.println("Awesome, lets play again!");
														}
												}
											else if (playerTotal>21)
												{
													money=money-bet;
													System.out.println("Since you had a Bust, you LOST. You now have "+money+" dollars");						
													System.out.println("Do you want to continue BlackJack?");
													System.out.println("(1) Yes");
													System.out.println("(2) No");
													Scanner userInput = new Scanner(System.in);
													int playerContinue = userInput.nextInt();
													if (playerContinue==2)
														{
															continueGame=false;
														}
													else if (playerContinue==1)
														{
															System.out.println("Awesome, lets play again!");
														}
												}
										}
									else if (playerTotal<computerTotal)
										{
											if (computerTotal<=21)
												{
													money=money-bet;
													System.out.println("I had a higher score, you LOST. You now have "+money+" dollars");												
													System.out.println("Do you want to continue BlackJack?");
													System.out.println("(1) Yes");
													System.out.println("(2) No");
													Scanner userInput = new Scanner(System.in);
													int playerContinue = userInput.nextInt();
													if (playerContinue==2)
														{
															continueGame=false;
														}
													else if (playerContinue==1)
														{
															System.out.println("Awesome, lets play again!");
														}
													
												}
											else if (computerTotal>21)
												{
													money=money+bet;
													System.out.println("I had a Bust, so you WIN! You now have "+money+" dollars");															
													System.out.println("Do you want to continue BlackJack?");
													System.out.println("(1) Yes");
													System.out.println("(2) No");
													Scanner userInput = new Scanner(System.in);
													int playerContinue = userInput.nextInt();
													if (playerContinue==2)
														{
															continueGame=false;
														}
													else if (playerContinue==1)
														{
															System.out.println("Awesome, lets play again!");
														}
												}
										}
									else if (playerTotal==computerTotal)
										{
											System.out.println("Tie! Nothing happens you get you money back so you still have "+money+" dollars");
											System.out.println("Do you want to continue BlackJack?");
											System.out.println("(1) Yes");
											System.out.println("(2) No");
											Scanner userInput = new Scanner(System.in);
											int playerContinue = userInput.nextInt();
											if (playerContinue==2)
												{
													continueGame=false;
												}
											else if (playerContinue==1)
												{
													System.out.println("Awesome, lets play again!");
												}
										}
							}				
				}		
			}
		public static void playGame()
		{
			

					while (endGame)
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
			System.out.println("Looks like we are going to play some TicTacToe");
				
			for (int row=0;row<3;row++)
				{
				System.out.println(" ");
				for (int col=0;col<3;col++)
					{
						boardArray[row][col]=" ";
					}
				}
			}
		
		public static void displayBoard()
			{
			System.out.println("  |-1-|-2-|-3-|");
			System.out.println("---------------");
			System.out.println("A | "+boardArray[0][0]+" | "+boardArray[0][1]+" | "+boardArray[0][2]+" |");
			System.out.println("---------------");
			System.out.println("B | "+boardArray[1][0]+" | "+boardArray[1][1]+" | "+boardArray[1][2]+" |");
			System.out.println("---------------");
			System.out.println("C | "+boardArray[2][0]+" | "+boardArray[2][1]+" | "+boardArray[2][2]+" |");
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
								row=0;
								break;
							}
					case "B":
					case "b":
							{
								row=1;
								break;
							}
					case "C":
					case "c":
							{
								row=2;
								break;
							}					
				}
				col = Integer.parseInt(choice.substring(1)) - 1;
				if (boardArray[row][col]!=" ")
					{
						System.out.println("That spot is taken buddy, nice try.  Guess again");
						inputChoice();
					}
				boardArray[row][col]="X";
						
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
								row=0;
								break;
							}
					case 1:
							{
								row=1;
								break;
							}
					case 2:
							{
								row=2;
								break;
							}
				}
				switch (randomNumber2)
				{
					case 0:
							{
								col=0;
								break;
							}
					case 1:
							{
								col=1;
								break;
							}
					case 2:
							{
								col=2;
								break;
							}
				}				
				if (boardArray[row][col]!=" ")
					{
						playComputer();
					}
				else if ((boardArray[0][0].equals(boardArray[0][1])&&boardArray[0][0].equals(boardArray[0][2])&&!boardArray[0][0].equals(" "))||
					(boardArray[1][0].equals(boardArray[1][1])&&boardArray[1][0].equals(boardArray[1][2])&&!boardArray[1][0].equals(" "))||
					(boardArray[2][0].equals(boardArray[2][1])&&boardArray[2][0].equals(boardArray[2][2])&&!boardArray[2][0].equals(" "))||
					(boardArray[0][0].equals(boardArray[1][1])&&boardArray[0][0].equals(boardArray[2][2])&&!boardArray[0][0].equals(" "))||
					(boardArray[0][2].equals(boardArray[1][1])&&boardArray[0][2].equals(boardArray[2][0])&&!boardArray[0][2].equals(" "))||
					(boardArray[0][0].equals(boardArray[1][0])&&boardArray[0][0].equals(boardArray[2][0])&&!boardArray[0][0].equals(" "))||
					(boardArray[0][1].equals(boardArray[1][1])&&boardArray[0][1].equals(boardArray[2][1])&&!boardArray[0][1].equals(" "))||
					(boardArray[0][2].equals(boardArray[1][2])&&boardArray[0][2].equals(boardArray[2][2])&&!boardArray[0][2].equals(" ")))
					{
						System.out.println("Tie Game, well played");
						endGame = false;
						System.exit(0);
					}
				boardArray[row][col]="O";
			}
		public static void endGame()
		{
			if ((boardArray[0][0].equals(boardArray[0][1])&&boardArray[0][0].equals(boardArray[0][2])&&!boardArray[0][0].equals(" ")&&!boardArray[0][0].equals("O"))||
				(boardArray[1][0].equals(boardArray[1][1])&&boardArray[1][0].equals(boardArray[1][2])&&!boardArray[1][0].equals(" ")&&!boardArray[1][0].equals("O"))||
				(boardArray[2][0].equals(boardArray[2][1])&&boardArray[2][0].equals(boardArray[2][2])&&!boardArray[2][0].equals(" ")&&!boardArray[2][0].equals("O"))||
				(boardArray[0][0].equals(boardArray[1][1])&&boardArray[0][0].equals(boardArray[2][2])&&!boardArray[0][0].equals(" ")&&!boardArray[0][0].equals("O"))||
				(boardArray[0][2].equals(boardArray[1][1])&&boardArray[0][2].equals(boardArray[2][0])&&!boardArray[0][2].equals(" ")&&!boardArray[0][2].equals("O"))||
				(boardArray[0][0].equals(boardArray[1][0])&&boardArray[0][0].equals(boardArray[2][0])&&!boardArray[0][0].equals(" ")&&!boardArray[0][0].equals("O"))||
				(boardArray[0][1].equals(boardArray[1][1])&&boardArray[0][1].equals(boardArray[2][1])&&!boardArray[0][1].equals(" ")&&!boardArray[0][1].equals("O"))||
				(boardArray[0][2].equals(boardArray[1][2])&&boardArray[0][2].equals(boardArray[2][2])&&!boardArray[0][2].equals(" ")&&!boardArray[0][2].equals("O")))
				{
					System.out.println("Game Over, well played you win!");
					endGame = false;
					System.exit(0);
				}
			else if ((boardArray[0][0].equals(boardArray[0][1])&&boardArray[0][0].equals(boardArray[0][2])&&!boardArray[0][0].equals(" ")&&!boardArray[0][0].equals("X"))||
					(boardArray[1][0].equals(boardArray[1][1])&&boardArray[1][0].equals(boardArray[1][2])&&!boardArray[1][0].equals(" ")&&!boardArray[1][0].equals("X"))||
					(boardArray[2][0].equals(boardArray[2][1])&&boardArray[2][0].equals(boardArray[2][2])&&!boardArray[2][0].equals(" ")&&!boardArray[2][0].equals("X"))||
					(boardArray[0][0].equals(boardArray[1][1])&&boardArray[0][0].equals(boardArray[2][2])&&!boardArray[0][0].equals(" ")&&!boardArray[0][0].equals("X"))||
					(boardArray[0][2].equals(boardArray[1][1])&&boardArray[0][2].equals(boardArray[2][0])&&!boardArray[0][2].equals(" ")&&!boardArray[0][2].equals("X"))||
					(boardArray[0][0].equals(boardArray[1][0])&&boardArray[0][0].equals(boardArray[2][0])&&!boardArray[0][0].equals(" ")&&!boardArray[0][0].equals("X"))||
					(boardArray[0][1].equals(boardArray[1][1])&&boardArray[0][1].equals(boardArray[2][1])&&!boardArray[0][1].equals(" ")&&!boardArray[0][1].equals("X"))||
					(boardArray[0][2].equals(boardArray[1][2])&&boardArray[0][2].equals(boardArray[2][2])&&!boardArray[0][2].equals(" ")&&!boardArray[0][2].equals("X")))
				{
					System.out.println("I WIN, you lose!");
					endGame = false;
					System.exit(0);
				}
			else if ((boardArray[0][0].equals(boardArray[0][1])&&boardArray[0][0].equals(boardArray[0][2])&&!boardArray[0][0].equals(" "))||
					(boardArray[1][0].equals(boardArray[1][1])&&boardArray[1][0].equals(boardArray[1][2])&&!boardArray[1][0].equals(" "))||
					(boardArray[2][0].equals(boardArray[2][1])&&boardArray[2][0].equals(boardArray[2][2])&&!boardArray[2][0].equals(" "))||
					(boardArray[0][0].equals(boardArray[1][1])&&boardArray[0][0].equals(boardArray[2][2])&&!boardArray[0][0].equals(" "))||
					(boardArray[0][2].equals(boardArray[1][1])&&boardArray[0][2].equals(boardArray[2][0])&&!boardArray[0][2].equals(" "))||
					(boardArray[0][0].equals(boardArray[1][0])&&boardArray[0][0].equals(boardArray[2][0])&&!boardArray[0][0].equals(" "))||
					(boardArray[0][1].equals(boardArray[1][1])&&boardArray[0][1].equals(boardArray[2][1])&&!boardArray[0][1].equals(" "))||
					(boardArray[0][2].equals(boardArray[1][2])&&boardArray[0][2].equals(boardArray[2][2])&&!boardArray[0][2].equals(" ")))
				{
					System.out.println("Tie Game, well played");
					endGame = false;
					System.exit(0);
				}
		}

		public static void wasteMoney()
			{
			Scanner userInput = new Scanner(System.in);
			while (money>0)
				{
					System.out.println("I will flip a coin, there is a 50% chance of you winnning, if it's heads you win and if it's tails you lose");
					System.out.println("You have "+money+" dollars, how much do you want to bet?");
					int bet = userInput.nextInt();
					if (bet > money)
					{
						System.out.println("You can't afford that!");
					}
					else if (bet<0)
					{
						System.out.println("Nice try, but that's not possible");
					}
					else
					{				
						{
							int randomNumber = (int) (Math.random()*2)+1;
							if (randomNumber == 1)
							{
								money = money + (bet);
								System.out.println("It was heads, you win! You now have "+money+" dollars!");				
							}
							else
							{
								money = money - (bet);
								System.out.println("It was tails, you lost, and now have "+money+" dollars.");
							}
						}
					}
				}
			System.out.println("I hope that wasn't your lifes savings");
			}
		public static void rollingDice()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Lets play some craps, I will role 2 dice,");
			System.out.println("if the total of the 2 dice is 2 or 12,");
			System.out.println("you lose, if the total is a 7 or 11, you win,");
			System.out.println("but if you get anything else that becomes your point.");
			System.out.println("We will roll again, and if you match your point again, ");
			System.out.println("you win, but if you roll a 7 you lose");
			while (money>0)
			{
				while (continueGame)
					{
						System.out.println("Lets play a round of craps you have "+money+"$, how much do you want to bet?");
						int bet = userInput.nextInt();
						if (bet > money)
						{
							System.out.println("You can't afford that!");
						}
						else if (bet<0)
						{
							System.out.println("Nice try buddy, thats not possible");
						}			
						else
						{
							int randomNumber1 = (int) (Math.random()*6)+1;
							int randomNumber2 = (int) (Math.random()*6)+1;
							int dicetotal = randomNumber1 + randomNumber2;
							System.out.println("Looks like I rolled a "+randomNumber1+" and a "+randomNumber2+" which gives me a total of "+dicetotal);
							if (dicetotal == 7)
							{
								money = money + bet;
								System.out.println("You WIN! I rolled a "+dicetotal+" You now have "+money+" dollars!");				
							}
							else if (dicetotal == 12)
							{
								money = money - bet;
								System.out.println("You LOST, I rolled a "+dicetotal+" and you now you have "+money+" dollars.");
							}
							else if (dicetotal == 11)
							{
								money = money + bet;
								System.out.println("You WIN! I rolled a "+dicetotal+" You now have "+money+" dollars!");
							}
							else if (dicetotal == 2)
							{
								money = money - bet;
								System.out.println("You LOST, I rolled a "+dicetotal+" and you now have "+money+" dollars.");
							}
							else
							{
								int point = dicetotal;
								boolean stillRolling = true;
								while (stillRolling)
								{
									Scanner userInput2 = new Scanner(System.in);
									System.out.println("Your point is "+point+", so if I roll a total of "+point+" then you win, but if I role a 7 you lose, are you ready for me to roll the dice?");
									System.out.println("Type 1 if you are ready and a 2 if you are not");
									int answer = userInput2.nextInt();
									if (answer == 1)
									{
										int randomNumber3 = (int) (Math.random()*6)+1;
										int randomNumber4 = (int) (Math.random()*6)+1;
										int dicetotal2 = randomNumber3+randomNumber4;
										System.out.println("Looks like I rolled a "+randomNumber3+" and a "+randomNumber4+" which gives me a total of "+dicetotal2);
										{
											if (dicetotal2 == point)
											{
												money = money + bet;
												System.out.println("You WIN! I rolled a "+dicetotal2+" You now you have "+money+" dollars!");
												stillRolling = false;
											}
											else if (dicetotal2 == 7)
											{
												money = money - bet;
												System.out.println("You LOST, I rolled a "+dicetotal2+" and now you have "+money+" dollars.");
												stillRolling = false;
											}
											else 
												{
													System.out.println("Ummm lets retry that");
												}
										}
										
									}
									else
										{
											System.out.println("Get ready!");
										}
								}						
							}
						}
					}
			}
			System.out.println("I hope that wasn't your lifes savings");
		}
	}