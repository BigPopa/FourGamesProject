import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BlackJack
	{
		static boolean stopBlack = true;
		static ArrayList <Card> deck = new  ArrayList<Card>();
		public static void main(String[] args)
			{
				fillDeck();
				dealPlayer();
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
			Collections.shuffle(deck);
			int playerTotal=0;
			int computerTotal=0;
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
			while (stopBlack)
				{
				System.out.println("Your current total is "+playerTotal+" Type the number of what you want to do:");
				System.out.println("(1) Hit");
				System.out.println("(2) Pass");
				Scanner userInput = new Scanner(System.in);
				int choice = userInput.nextInt();
				if (choice==1)
					{
						playerTotal=playerTotal+deck.get(0).getValue();
						System.out.println(deck.get(0).getRank()+" of "+deck.get(0).getSuit());
						deck.remove(0);
						if (playerTotal>21)
							{
								System.out.println("Bust! You went over 21 your total was "+playerTotal);
								stopBlack=false;
							}
						else if (playerTotal==21)
							{
								System.out.println("Wow you got lucky!");
								stopBlack=false;
							}
					}
				else if (choice==2)
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
							System.out.println("You WIN!");
						}
					else if (playerTotal>21)
						{
							System.out.println("Since you had a Bust, you LOST");
						}
				}
			else if (playerTotal<computerTotal)
				{
					if (computerTotal<=21)
						{
							System.out.println("I had a higher score, you LOST");
						}
					else if (computerTotal>21)
						{
							System.out.println("I had a Bust, so you WIN!");
						}
				}
		}
	}
