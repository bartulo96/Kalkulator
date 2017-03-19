
package pl.uksw.java;

import java.util.Scanner;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class linia
{
	public void Obliczenia() throws ScriptException
	{
		while(true)
		{
			System.out.println("Podaj dane:");
			System.out.println("Aby wyjsc z programu wpisz 'koniec'.");
			Scanner sc = new Scanner(System.in);
			String result = sc.nextLine();
			if(result.equals("koniec"))
			{
				System.out.println("Koniec programu.");
				break;
			}
			else
			{
				ScriptEngineManager factory = new ScriptEngineManager();
				ScriptEngine engine = factory.getEngineByName("JavaScript");
				Object obj = engine.eval(result);
				System.out.println("Twoj wynik to: " + obj);
			}	
		}
	}
}