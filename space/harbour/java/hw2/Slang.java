package space.harbour.java.hw2;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Slang {

	String s;
	Map<String, String> abb;
	Map<String, String> smi;

	Slang(String str) {
		s = str;
		abb = new HashMap<String, String>();
		smi = new HashMap<String, String>();

		abb.put("PLZ", "please");
		abb.put("FYI", "for your information");
		abb.put("GTFO", "please, leave me alone");
		abb.put("ASAP", "as soon as possible");

		smi.put(":)", "[smiling]");
		smi.put(":(", "[sad]");
		smi.put("¯\\_(ツ)_/¯", "[such is life]");
	}

	public void fixAbbreviations() {
		for (Map.Entry<String, String> entry: abb.entrySet()) {
			String key = entry.getKey();
    		String value = entry.getValue();
    		s = s.replace(key, value);
		}
	}
	
	public void fixSmiles() {
		for (Map.Entry<String, String> entry: smi.entrySet()) {
			String key = entry.getKey();
    		String value = entry.getValue();
    		s = s.replace(key, value);
		}
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String str = reader.nextLine();
		Slang sl = new Slang(str);
		sl.fixAbbreviations();
		sl.fixSmiles();
		System.out.println(sl.s);
	}
}
