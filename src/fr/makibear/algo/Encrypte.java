package fr.makibear.algo;

import java.util.ArrayList;
import java.util.HashMap;

public class Encrypte 
{
	public String name, encodedName;
	public char[] charName, charEncoded;
	public HashMap<Character, Integer> alphabetList;
	public ArrayList<Character> finalChar;

	/**
	 * Main function to encrypte
	 * some message.
	 * @see init() & start()
	 * @param String name
	 */
	public Encrypte() 
	{
		this.init();
	}
	
	/**
	 * Function init() create & initialize the
	 * map of alphabetList.
	 * @return initialization
	 */
	public void init()
	{
		this.alphabetList = new HashMap<>();
		int i = -1;
		
		for (char c = 'A'; c <= 'Z'; ++c)
		{
			++i;
			this.alphabetList.put(c, i);
		}
		System.out.println("Initialization ends up!");
	}
	
	/**
	 * Function get() is called to get the
	 * encoded name.
	 * @return String this.encodedName
	 */
	public String get()
	{
		this.encodedName = getStringRepresentation(this.finalChar);
		return this.encodedName;
	}
	
	/**
	 * Function send() send a message with
	 * the encoded name.
	 * @return message
	 */
	public void send()
	{
		System.out.println("Crypted message: " + this.get());
	}
	
	/**
	 * Function getStringRepresentation(@param) return some String
	 * withlist of characters.
	 * @param ArrayList<Character> list 
	 * @return
	 */
	String getStringRepresentation(ArrayList<Character> list)
	{    
	    StringBuilder builder = new StringBuilder(list.size());
	    for(Character ch: list)
	    {
	        builder.append(ch);
	    }
	    return builder.toString();
	}
	
	/**
	 * Function encrypte() encode the message.
	 * @param String name to encrypted
	 * @return algorithme
	 */
	public void encrypte(String name)
	{
		this.name = name;
		this.charName = this.name.toCharArray();
		this.finalChar = new ArrayList<Character>();
		
		for(int i = 0; i < this.charName.length; ++i)
		{
			int x, quot, result;
			char c = this.charName[i];
			x = this.alphabetList.get(c);
			quot = 5*x+2;
			result = quot % 26;
			
			for (Character key : this.alphabetList.keySet())
				if(this.alphabetList.get(key) == result)
					this.finalChar.add(key);
		}
	}
	
	/**
	 * Function decrypte() decode the message.
	 * @param String name to decrypted
	 * @return algorithme
	 */
	public void decrypte(String name)
	{
		this.name = name;
		this.charName = this.name.toCharArray();
		this.finalChar = new ArrayList<Character>();
		
		for(int i = 0; i < this.charName.length; ++i)
		{
			int x, quot, result;
			char c = this.charName[i];
			x = this.alphabetList.get(c);
			quot = 21*x+10;
			result = quot % 26;
			
			for (Character key : this.alphabetList.keySet()) 
				if(this.alphabetList.get(key) == result)
					this.finalChar.add(key);
		}
	}
}
