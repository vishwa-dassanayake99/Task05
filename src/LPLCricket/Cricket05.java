package LPLCricket;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Cricket05 {
	public static void main(String args[]) {
		readAndWrite();
	}
	
	public static void readAndWrite() {
		List<Teams> table = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader("results.csv"))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		        String[] values = line.split(",");
		        table.add(new Teams(Integer.parseInt(values[0]),values[1],Integer.parseInt(values[2]),Integer.parseInt(values[3]),Integer.parseInt(values[4]),Integer.parseInt(values[5]),Double.parseDouble(values[6])));
		    }
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("\nSorted by Comparator in Teams class");
	    table.stream().sorted().forEach(System.out::println);

	    System.out.println();
	    System.out.println("Sorted by lambda");
	    table.stream()
	         .sorted((c1, c2) -> 
	            ((Double) c1.getNrr()).compareTo(c2.getNrr()))
	         .forEach(System.out::println);

	    try {
		      FileWriter writer = new FileWriter("Cricket05.txt");
		      writer.write("Sorted by Comparator in Team class\n");
		      table.stream().sorted()
		        .forEach(str -> {
		        	try {
						writer.write(str.toString() + "\n");
					} catch (IOException e) {
						e.printStackTrace();
					}
		        });
		      
		      writer.write("\nSorted by lambda\n");
		      table.stream().sorted((c1, c2) -> 
	            ((Double) c1.getNrr()).compareTo(c2.getNrr()))
		        .forEach(str -> {
		        	try {
						writer.write(str.toString() + "\n");
					} catch (IOException e) {
						e.printStackTrace();
					}
		        });
		      writer.close();
		      System.out.println("Cricket05.txt created and updated!");
		    } catch (IOException e) {
		      System.out.println("An exception occurred.");
		      e.printStackTrace();
		    }
	}

}
