package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Program{

    public static void main(String[] args) {
        
        Map<String, Integer> map = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("doc.csv"))) {

            
            String line = br.readLine();
            while(line != null) {

                String[] fields = line.split(",");
                String name = fields[0];
                int count = Integer.parseInt(fields[1]);

                if (map.containsKey(name)) {
                    int votesSoFar = map.get(name);
					map.put(name, count + votesSoFar);
                } else {
                    map.put(name, count);
                }
                
                line = br.readLine();
            }

            for (String name : map.keySet()) {
                System.out.println("Candidato " + name + ": " + map.get(name));
            }

        }
        catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
    }

}