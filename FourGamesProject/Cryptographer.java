import java.util.Scanner;

public class Cryptographer
	{

		public static void main(String[] args)
			{
				Encryptor();
				Decryptor();

			}
		public static void CryptographerMain()
		{
			
		}
		public static void Encryptor()
		{
			Scanner userInput = new Scanner(System.in);
			Scanner in = new Scanner(System.in);
			System.out.println("Tell me somthing and I will turn it into a code.");
			String code, reverse = "";
			code = in.nextLine();			
			code=code.toLowerCase();
			code=code.replace(" ", "b *$#");
			code=code.replace("a", "q ^@w");
			code=code.replace("e", "t$@ pr");
			code=code.replace("i", "s f#m&");
			code=code.replace("o", "g*d hj:");
			code=code.replace("u", "k x:v lz");				  
			  int length = code.length();

			  for ( int i = length - 1 ; i >= 0 ; i-- )
				  {
					  reverse = reverse + code.charAt(i);
				  }
			System.out.println(reverse);

		}
		public static void Decryptor()
		{
			Scanner userInput = new Scanner(System.in);
			Scanner in = new Scanner(System.in);
			System.out.println("Tell me a code and I will translate it for you.");
			String code, reverse = "";
			code = in.nextLine();	
			int length = code.length();

			  for ( int i = length - 1 ; i >= 0 ; i-- )
				  {
					  reverse = reverse + code.charAt(i);
				  }
			  reverse=reverse.replace("k x:v lz", "u");
			  reverse=reverse.replace("g*d hj:", "o");		
			  reverse=reverse.replace("s f#m&", "i");
			  reverse=reverse.replace("t$@ pr", "e");
			  reverse=reverse.replace("q ^@w", "a");
			  reverse=reverse.replace("b *$#", " ");
			System.out.println("Oh! This means: "+reverse);
		}
		public static void Reverse()
		{
			String code, reverse = "";
			  Scanner in = new Scanner(System.in);
			  code = in.nextLine();

			  int length = code.length();

			  for ( int i = length - 1 ; i >= 0 ; i-- )
				  {
					  reverse = reverse + code.charAt(i);
				  }
			  System.out.println("Reverse of entered string is: "+reverse);
		}
	}
