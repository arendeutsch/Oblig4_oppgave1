package oblig4;

import java.util.Scanner;

public class SnuTekst {
	static int teller = 0;
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Vennlig skriv en streng: ");
		String s = input.next();
		System.out.print("Baklengs streng: ");	
		baklengs(s);
		System.out.println("");
		System.out.print("Antall tegn er: " + teller);	
		
		input.close();
	}
	
	public static void baklengs(String tekst){
		teller++;
		if (tekst.length() <= 1)
			System.out.print(tekst);
		else{
			System.out.print(tekst.substring(tekst.length()-1));
			baklengs(tekst, tekst.length()-1);			
		}
	}
	public static void baklengs(String tekst, int siste){
		baklengs(tekst.substring(0, siste));	
	}
}