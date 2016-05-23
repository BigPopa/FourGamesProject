import java.util.ArrayList;
import java.util.Scanner;

public class Hangman
	{
		
		//static ArrayList <Card> deck = new  ArrayList<Card>();
		public static void main(String[] args)
			{
				testGame();
			}
		public static void testGame()
		{
				{
					System.out.println("Let's play Hangman, I got a word go ahead and guess a letter");
					String[] hangmanChoices = {"blue","dog","cat","orange","guitar","trump","fish","tongue","young","water","bass","flip","bolt","cow","walker"};
					int randomNumber = (int) (Math.random()*15);
				  

				    String secretWord= hangmanChoices[randomNumber];
				    ArrayList <String> guessedLetters = new <String> ArrayList();
				    String[] blankWord = new String [secretWord.length()];
				    int secretWordLength = secretWord.length();
				    int wrong = 0;
				    int totalLives = 8;
				    int lettersRemaining;
				    boolean guessInWord;
				    boolean correct=false;
				    for (int x=0;x<secretWordLength;x++)
				    	{
				    		//get help, This part is to replace each letter of the blankWord to a _
				    		blankWord[x]="_";
				    		System.out.print(blankWord[x]);
				    	}
				    System.out.println("");
				    System.out.println(secretWord);
				    String guess;
				    
				    //String prevGuessedLetters;		        
				    
				   // System.out.println(secretWordLength);
				    lettersRemaining = secretWordLength;
				    //for (int i = 0; i < secretWordLength; i++) 
				    //{
				       // System.out.print("_");
				    //}
				    System.out.println();		    
				    while (lettersRemaining > 0 && wrong < 8) 
				    	{
				    	correct=false;
				        System.out.println("Guess a letter:");
				        Scanner userInput = new Scanner(System.in);
				        guess = userInput.nextLine();
				        guess=guess.substring(0, 1);
				        for (int i=0; i<secretWordLength;i++)
				        	{
				        		if (secretWord.substring(i,i+1).equals(guess))
				        			{	
				        				if (blankWord[i].equals(guess))
				        					{
				        						System.out.println("You already guessed that letter");
				        						
				        					}
				        				else
				        					{
				        						correct=true;	
				        					}			        							        				
				        			}
				        			
				        	}
				        if (correct==false)
				        	{
				        		if (!secretWord.contains(guess))
				        		//for (int i=0;i<guessedLetters.size();i++)
				        			{
				        				if (!guessedLetters.contains(guess))
				        					{
				        						
				        						guessedLetters.add(guess);
				        						 wrong++;
										            System.out.print("Sorry, you have lost a life. You still have ");
										            System.out.print(totalLives - wrong);
										            System.out.println(" life/lives left. Keep trying.");
										            //prints the man
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
				        						System.out.println("Stop guessing that letter");
				        					}
				        			}
				        		else
				        			{
				        				System.out.println("Stop guessing that letter");
				        			}
				        		
				        	}
				        else if (correct==true)
				        	{	            
				        		lettersRemaining--;
				        		System.out.println("Correct!");
		        				int m=secretWord.indexOf(guess);	        				
		        				blankWord[m]=guess;
		        				
		        				System.out.println("");
		        				//remember if secret word was Mullen 5=word.indexOf("N") because in an array N is the 5th letter
		        				//Here I need to take the blankWord and replace the blank letter Correct with the letter   
				        	}
				        for (int j=0;j<secretWordLength;j++)
        					{
        						System.out.print(blankWord[j]);
        					}	
				        System.out.println();
				        System.out.print("Previously guessed letters: ");
				        System.out.println(guessedLetters);
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
