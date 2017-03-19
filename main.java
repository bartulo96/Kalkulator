package pl.uksw.java;

import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.script.ScriptException;


public class main
{
	
	public static void main(String[] args) throws ScriptException, FileNotFoundException
	{
		while(true)
		{
			System.out.println("Wybierz opcje z menu: \n ");
			System.out.println("1. Obliczenia w linii poleceñ.");
			System.out.println("2. Obliczenia pobrane z pliku.");
			System.out.println("3. Wyjœcie z programu.");
		
			Scanner keyboard = new Scanner(System.in);
			int choose = keyboard.nextInt();		
		
			switch(choose)
			{
			case 1:
			{
				linia polecenie = new linia();
				polecenie.Obliczenia();
				break;
			}
			case 2:
			{	
				Plik plik = new Plik();
				plik.czytanie();
				break;
			}
			case 3:
			{
				System.out.println("Koniec programu.");
				System.exit(0);
				break;
			}
			
			default:
			{
				System.out.println("Wybierz jedn¹ z opcji !");
				break;
			}
			}
		}
	}
}