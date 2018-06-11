import java.util.*;
public class OddsOrEvens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Let's play a game called \"Odds and Evens\"");
		System.out.print("What is your name? ");
		String name=sc.nextLine();
		System.out.print("Hi "+name+", which do you choose? (O)dds or (E)vens? ");
		String choice=sc.nextLine();
		if(choice.equals("O"))
			System.out.println(""+name+" has picked odds! The computer will be evens.");
		else
			System.out.println(""+name+" has picked evens! The computer will be odds.");
		System.out.println("-------------------------------------------------\n");
		
		System.out.print("How many \"fingers\" do you put out? ");
		int u_num=sc.nextInt();
		Random rand=new Random();
		int c_num=rand.nextInt(6);
		System.out.println("The computer plays "+c_num+" \"fingers\".");
		System.out.println("-------------------------------------------------\n");
		
		int sum=u_num+c_num;
		System.out.println(""+u_num+"+"+c_num+"="+sum);
		if(sum%2==0) {
			System.out.println(""+sum+" is ...even!");
			if(choice.equals("E"))
				System.out.println("That means "+name+" wins! :)");
			else
				System.out.println("That means computer wins! :)");
		}
		else {
			System.out.println(""+sum+"is ...odd!");
			if(choice.equals("O"))
				System.out.println("That means "+name+" wins! :)");
			else
				System.out.println("That means computer wins! :)");
		}
	}
	
}
