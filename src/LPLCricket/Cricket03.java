package LPLCricket;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import LPLCricket.Teams;

public class Cricket03 {

	public static void main(String[] args) {
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
		

		OptionalInt min = table.stream().mapToInt(Teams::getPoints).min();
	    if (min.isPresent()) {
	      System.out.printf("The lowest point is: %d \n", min.getAsInt());
	    } else {
	      System.out.println("failed!");
	    }
	    	
		    
    	try {
		      FileWriter writer = new FileWriter("Cricket03.txt");
		      writer.write("The lowest point is:  " + min.getAsInt() + "\n");
		      writer.close();
		      System.out.println("\nCricket03.txt created and updated!");
		    } catch (IOException e) {
		      System.out.println("An exception occurred.");
		      e.printStackTrace();
		    }
	}
	
}
