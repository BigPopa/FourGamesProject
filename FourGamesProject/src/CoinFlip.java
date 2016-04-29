import java.util.Scanner;
public class CoinFlip 
{

	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Choose a number of times you want me to flip a coin");
		int flips = userInput.nextInt();
		int heads = 0;
		int tails = 0;
		{
			for (int i = 0; i < flips; i = i + 1)
			{
				int randomNumber = (int) (Math.random()*2)+1;
				if (randomNumber == 1)	
				{
					heads = heads + 1;
				}
				if (randomNumber == 2)
				{
					tails = tails + 1;
				}
			}
		System.out.println("You got "+tails+" tails, and "+heads+" heads");
		}
	}

}
