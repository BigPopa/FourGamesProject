import java.util.ArrayList;
import java.util.Collections;

public class War
	{
		static ArrayList <Card> deck = new  ArrayList<Card>();
		public static void main(String[] args)
			{
				fillDeck2();
				playWar();
			}
		public static void fillDeck2()
			{
				deck.add(new Card("Diamonds","Ace", 14));
				deck.add(new Card("Diamonds","Two", 2));
				deck.add(new Card("Diamonds","Three", 3));
				deck.add(new Card("Diamonds","Four", 4));
				deck.add(new Card("Diamonds","Five", 5));
				deck.add(new Card("Diamonds","Six", 6));
				deck.add(new Card("Diamonds","Seven", 7));
				deck.add(new Card("Diamonds","Eight", 8));
				deck.add(new Card("Diamonds","Nine", 9));
				deck.add(new Card("Diamonds","Ten", 10));
				deck.add(new Card("Diamonds","Jack", 11));
				deck.add(new Card("Diamonds","Queen", 12));
				deck.add(new Card("Diamonds","King", 13));
				deck.add(new Card("Hearts","Ace", 14));
				deck.add(new Card("Hearts","Two", 2));
				deck.add(new Card("Hearts","Three", 3));
				deck.add(new Card("Hearts","Four", 4));
				deck.add(new Card("Hearts","Five", 5));
				deck.add(new Card("Hearts","Six", 6));
				deck.add(new Card("Hearts","Seven", 7));
				deck.add(new Card("Hearts","Eight", 8));
				deck.add(new Card("Hearts","Nine", 9));
				deck.add(new Card("Hearts","Ten", 10));
				deck.add(new Card("Hearts","Jack", 11));
				deck.add(new Card("Hearts","Queen", 12));
				deck.add(new Card("Hearts","King", 13));
				deck.add(new Card("Clubs","Ace", 14));
				deck.add(new Card("Clubs","Two", 2));
				deck.add(new Card("Clubs","Three", 3));
				deck.add(new Card("Clubs","Four", 4));
				deck.add(new Card("Clubs","Five", 5));
				deck.add(new Card("Clubs","Six", 6));
				deck.add(new Card("Clubs","Seven", 7));
				deck.add(new Card("Clubs","Eight", 8));
				deck.add(new Card("Clubs","Nine", 9));
				deck.add(new Card("Clubs","Ten", 10));
				deck.add(new Card("Clubs","Jack", 11));
				deck.add(new Card("Clubs","Queen", 12));
				deck.add(new Card("Clubs","King", 13));
				deck.add(new Card("Spades","Ace", 14));
				deck.add(new Card("Spades","Two", 2));
				deck.add(new Card("Spades","Three", 3));
				deck.add(new Card("Spades","Four", 4));
				deck.add(new Card("Spades","Five", 5));
				deck.add(new Card("Spades","Six", 6));
				deck.add(new Card("Spades","Seven", 7));
				deck.add(new Card("Spades","Eight", 8));
				deck.add(new Card("Spades","Nine", 9));
				deck.add(new Card("Spades","Ten", 10));
				deck.add(new Card("Spades","Jack", 11));
				deck.add(new Card("Spades","Queen", 12));
				deck.add(new Card("Spades","King", 13));			
			}
		public static void playWar()
		{
			System.out.println("Awesome, lets play some War!  I will shuffle the deck");
			Collections.shuffle(deck);
		}
	}
