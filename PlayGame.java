import java.util.*;
class Guess
{
	public void playTheGame()
	{
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		int computerValue=r.nextInt(101);
		System.out.println("Computer has generated a Random Number");
		System.out.println("Enter the number of Chances you want to take to guess the number.\'less than 10\'");
		int chances=sc.nextInt();
		while(chances>10)
		{
			System.out.println("oops!!!!. Please Enter number less than 10");
			chances=sc.nextInt();
		}
		System.out.println("You have "+chances+" Chances to guess the number");
		int score=100;
		int i=0;
		for(i=0;i<chances;i++)
		{
			System.out.println("Enter the number you have guessed.Chance no"+(i+1));
			int userValue=sc.nextInt();
			if(userValue==computerValue)
			{
				System.out.println("Hurray!!!!!!! You won the Game");
				System.out.println("Your score is \'"+score+"\'");
				break;
			}
			else if(userValue>computerValue)
			{
				System.out.println("You guessed is greater Than Computer guessed number");
			}
			else
			{
				System.out.println("You guessed  is less than computer guessed number");
			}
			score-=10;
		} 
		if(i>=chances)
		{
			System.out.println("The computer guessed number is "+computerValue);
			System.out.println("oops!!!!!! You Lost the game");
			System.out.println("Your score is \'0\' ");
		}
	}
}
class GuessTheNumber
{
public static void main(String args[])
{
	System.out.println("Welcome To The Game Of Guessing Numbers!!!!!!!");
	Scanner sc=new Scanner(System.in);
	Guess g=new Guess();
	System.out.println("Shall We Start Playing : Yes/No");
	String s=sc.nextLine();
	while(s.equalsIgnoreCase("Yes")||s.equalsIgnoreCase("y"))
	{
		g.playTheGame();
		System.out.println("DO you want to continue The Game: Yes/No");
		s=sc.nextLine();
	}
}
}