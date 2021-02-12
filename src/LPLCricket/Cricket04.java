package LPLCricket;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Cricket04 {
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
		
		System.out.println("Teams that scored 12 points: ");
	    table.stream().filter(team -> team.getPoints() == 12)
	        .forEach(System.out::println);

	    System.out.println();
	    System.out.println("Teams that scored 09 points: ");
	    table.stream().filter(team -> team.getPoints() == 9)
	        .forEach(System.out::println);
	    
	    try {
		      FileWriter writer = new FileWriter("Cricket04.txt");
		      writer.write("Teams that scored 12 points: \n");
		      table.stream().filter(team -> team.getPoints() == 12)
		        .forEach(str -> {
		        	try {
						writer.write(str.toString() + "\n");
					} catch (IOException e) {
						e.printStackTrace();
					}
		        });
		      
		      writer.write("Teams that scored 09 points: \n");
		      table.stream().filter(team -> team.getPoints() == 9)
		        .forEach(str -> {
		        	try {
						writer.write(str.toString() + "\n");
					} catch (IOException e) {
						e.printStackTrace();
					}
		        });
		      writer.close();
		      System.out.println("\nCricket04.txt created and updated!");
		    } catch (IOException e) {
		      System.out.println("An exception occurred!");
		      e.printStackTrace();
		    }
		}
		
	}
