package schildt_proj.ControlStatements_3;

class Guess
{
	public static void main(String args[])
	throws java.io.IOException
	{
		int counter;
		char input, answer = 'Y';
		System.out.println("I'm thinking a letter between Family to Z");
		System.out.println("can you guess it ?");

		input = (char)System.in.read();
		if(input == answer)
			System.out.println("Right !");
		else
		{
			System.out.println("Sorry ! you are wrong.");
			if(input < answer)
				System.out.println("too low.");
			else
				System.out.println("too high.");
		}
	}	
}