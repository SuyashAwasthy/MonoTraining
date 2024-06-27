package com.techlabs.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NamesAssignment {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\stuti\\eclipse-workspace\\13-streams-app\\src\\com\\techlabs\\test\\names"));
        
		List<String> names = new ArrayList<String>();
        
        String line;
        
        try {
			while ((line = reader.readLine()) != null) {
			    names.add(line);
			}
		} 
        catch (IOException e) {
			e.printStackTrace();
		}

        reader.close();
        
        System.out.println("1. Names starting with 'S': ");
        System.out.print("[");
        names.stream().filter((x)->x.charAt(0)=='s' || x.charAt(0)=='S').forEach((x)->System.out.print(x+"  "));
        System.out.println("]\n");
        
        System.out.println("2. All names in uppercase: ");
        System.out.print("[");
        names.stream().forEach((x)->System.out.print(x.toUpperCase()+"  "));
        System.out.println("]\n");

        System.out.println("3. Sorted alphabetically: ");
        System.out.print("[");
        names.stream().sorted().forEach((x)->System.out.print(x+"  "));
        System.out.println("]\n");

        System.out.println("4. List after removing duplicate names: ");
        System.out.print("[");
        names.stream().distinct().forEach((x)->System.out.print(x+"  "));
        System.out.println("]\n");
        
        System.out.println("5. Duplicate list: ");
        List<String> duplicate = new ArrayList<String>(names);
        System.out.println(duplicate);
        
        System.out.println("\n6. Count of names that do not contain 's': ");
        System.out.print("[");
        names.stream().filter((x)->!x.contains("s")).forEach((x)->System.out.print(x+"  "));
        System.out.println("]\n");
        
        System.out.println("7. All names in single string: ");
        System.out.print("[");
        String nameString = names.stream().reduce((name1,name2) -> name1 + ", " + name2).orElse("");
        System.out.print(nameString);
        System.out.println("]\n");
        
        System.out.println("8. Names starting with 's' in uppercase, sorted in a list: ");
        List<String> newNames = new ArrayList<String>();
        System.out.print("[");
        names.stream().filter((x)->x.charAt(0)=='s' || x.charAt(0)=='S').sorted().forEach((x)->newNames.add(x.toUpperCase()));
        newNames.stream().forEach((x)->System.out.print(x+", "));
        System.out.print("]");

	}

}
