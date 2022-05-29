package masai;

public class vowelandcons {

	
	
	void check(String s)
	{
		if(s=="a" || s=="e" || s=="i" || s=="o" || s=="u" ||s=="A" || s=="E" || s=="I" || s=="O" || s=="U")
		{
			System.out.println("It is a vowel");
		}
		else if(s=="b" || s=="c" || s=="d" || s=="f" || s=="g" || s=="h" || s=="j" || s=="k" || s=="l" || s=="m" || s=="n" || s=="p" || s=="q" || s=="r" || s=="s" || s=="t" || s=="v" || s=="w" || s=="x" || s=="y" || s=="z") 
		{
			System.out.println("It is a consonant");
		}
		else if(s=="B" || s=="C" || s=="D" || s=="F" || s=="G" || s=="H" || s=="J" || s=="K" || s=="L" || s=="M" || s=="N" || s=="P" || s=="Q" || s=="R" || s=="S" || s=="T" || s=="V" || s=="W" || s=="X" || s=="Y" || s=="Z") 
		{
			System.out.println("It is a consonant");
		}
		else
		{
			System.out.println("Error : Not an alphabet");
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		vowelandcons obj = new vowelandcons();
		obj.check("a");
		obj.check("b");
		obj.check("2");
	}

}
