import java.util.Scanner;

public class GamblingGame 
{
	public static void main(String[] args)
	{
		wasteMoney();
	}
	public static void wasteMoney()
		{
		Scanner userInput = new Scanner(System.in);
		int money = 100;
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
}
