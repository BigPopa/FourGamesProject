import java.util.Scanner;

public class HangmanTest
	{
		int wrong=0;
		{
		public static void main(String[] args)
			{
				playGame();
			}
		public static void wrongCounter()
			{
				if (wrong==1)
					{					
						System.out.println(" _=_");
					}
				else if (wrong==2)
					{
						System.out.println(" _=_");
						System.out.println("  O");
					}
				else if (wrong==3)
					{					
						System.out.println(" _=_");
						System.out.println("  O");
						System.out.println("  |");					
					}
				else if (wrong==4)
					{
						System.out.println(" _=_");
						System.out.println("  O");
						System.out.println("  |");
						System.out.println("  ^");
					}
				else if (wrong==5)
					{
						System.out.println(" _=_");
						System.out.println("  O");
						System.out.println("  |");
						System.out.println("  ^");
						System.out.println(" / ");
					}
				else if (wrong==6)
					{
						System.out.println(" _=_");
						System.out.println("  O");
						System.out.println("  |");
						System.out.println("  ^");
						System.out.print(" / ");
						System.out.println("\\");
					}
				else if (wrong==7)
					{
						System.out.println(" _=_");
						System.out.println("  O");
						System.out.print(" /");
						System.out.println("|");
						System.out.println("  ^");
						System.out.print(" / ");
						System.out.println("\\");
						
					}
				else if (wrong==8)
					{
						System.out.println(" _=_");
						System.out.println("  O");
						System.out.print(" /");
						System.out.print("|");
						System.out.println("\\");
						System.out.println("  ^");
						System.out.print(" / ");
						System.out.println("\\");
						System.out.println("You Lose");					
					}
			}
		public static void playGame()
			{
				Scanner userInput = new Scanner(System.in);
			    StringBuffer buffer = new StringBuffer();

			    String secretWord;
			    int secretWordLength;
			    int wrong = 0;
			    int totalLives = 8;
			    int lettersRemaining;
			    boolean guessInWord;
			    char guess;
			    StringBuffer prevGuessedLetters;		    
			    System.out.println("Enter a word:");
			    secretWord = userInput.next();		    
			    secretWordLength = secretWord.length();
			    System.out.println(secretWordLength);
			    lettersRemaining = secretWordLength;
			    for (int i = 0; i < secretWordLength; i++) 
			    {
			        System.out.print("_");
			    }
			    System.out.println();		    
			    while (lettersRemaining > 0 && wrong < 8) 
			    {		        
			        System.out.println("Guess a letter:");
			        guess = userInput.findWithinHorizon(".", 0).charAt(0);
			        guessInWord = (secretWord.indexOf(guess)) != -1;

			        if (guessInWord == false)
			        {
			            wrong++;
			            System.out.print("Sorry, you have lost a life. You still have ");
			            System.out.print(totalLives -= wrong);
			            System.out.println(" life/lives left. Keep trying.");
			            if (wrong==1)
							{					
								System.out.println(" _=_");
							}
						else if (wrong==2)
							{
								System.out.println(" _=_");
								System.out.println("  O");
							}
						else if (wrong==3)
							{					
								System.out.println(" _=_");
								System.out.println("  O");
								System.out.println("  |");					
							}
						else if (wrong==4)
							{
								System.out.println(" _=_");
								System.out.println("  O");
								System.out.println("  |");
								System.out.println("  ^");
							}
						else if (wrong==5)
							{
								System.out.println(" _=_");
								System.out.println("  O");
								System.out.println("  |");
								System.out.println("  ^");
								System.out.println(" / ");
							}
						else if (wrong==6)
							{
								System.out.println(" _=_");
								System.out.println("  O");
								System.out.println("  |");
								System.out.println("  ^");
								System.out.print(" / ");
								System.out.println("\\");
							}
						else if (wrong==7)
							{
								System.out.println(" _=_");
								System.out.println("  O");
								System.out.print(" /");
								System.out.println("|");
								System.out.println("  ^");
								System.out.print(" / ");
								System.out.println("\\");
								
							}
						else if (wrong==8)
							{
								System.out.println(" _=_");
								System.out.println("  O");
								System.out.print(" /");
								System.out.print("|");
								System.out.println("\\");
								System.out.println("  ^");
								System.out.print(" / ");
								System.out.println("\\");
								System.out.println("You Lose");					
							}
			        }
			        else
			        {
			            System.out.println("That was a good guess, well done!");

			            for (int i = 0; i < secretWordLength; i++) 
			            {
			                if (secretWord.charAt(i) == guess) 
			                {
			                    System.out.print(guess);
			                    lettersRemaining--;
			                }
			                else 
			                {
			                    System.out.print("*");
			                }
			            }
			        }
			        System.out.println();
			        prevGuessedLetters = buffer.append(guess);
			        System.out.print("Previously guessed letters: ");
			        System.out.println(prevGuessedLetters);
			        System.out.print("Letters remaining: ");
			        System.out.println(lettersRemaining);
			    }
			    if (wrong == totalLives)
			    {
			        System.out.println("Sorry, you lose!");
			    } 
			    else 
			    {
			        System.out.print("Well done, you win! The word was ");
			        System.out.println(secretWord);
			    }
			}
		}
	}
