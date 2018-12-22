package fr.makibear;

import java.util.Scanner;

import fr.makibear.algo.Encrypte;

public class Algorithme 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Encrypte test = new Encrypte();
		
		
		System.out.println("------------------------------------------------");
		System.out.println("-----           Math-crypto-V0.1           -----");
		System.out.println("------------------------------------------------");
		System.out.println("Please, enter a name to start the encryptation :");
		test.encrypte(sc.nextLine());
		System.out.println("------------------------------------------------");
		test.send();
		System.out.println("------------------------------------------------");
		System.out.println("You want to decrypte some message ? (Y/N)");
		switch(sc.nextLine())
		{
		      case "Y":
		    	  	 System.out.println("> Enter your message:");
		    	  	 test.decrypte(sc.nextLine());
		    	  	 System.out.println("------------------------------------------------");
		    	  	 test.send();
		    	  	 
		    	  	System.out.println("------------------------------------------------");
		    	  	System.out.println("-----               Thank you              -----");
		    	  	System.out.println("------------------------------------------------");
		         break;
		      case "N":
		         System.exit(0);
		         break;
		      default:
		         break;
		} 
	}
}
