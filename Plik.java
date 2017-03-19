package pl.uksw.java;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Plik 
{
	public void czytanie() throws FileNotFoundException, ScriptException
	{
		File file = new File("C:/Users/Bartek/Desktop");
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine())
		{
			String result = sc.nextLine();
			ScriptEngineManager factory = new ScriptEngineManager();
			ScriptEngine engine = factory.getEngineByName("JavaScript");
			Object obj = engine.eval(result);
			System.out.println("Twoje wynik to: " + result +" = "+ obj);	
		}
	}
}