import csv.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class stampa {

    lettura[] letturaArray;


    reader = CSVReader("data.csv")
    reader.read()

    riga = reader.data[0]  


        
        public void readData(riga[] letturaArray) {

        try{
           
            File file = new File("calciatori.csv");
            Scanner scanner = new Scanner(file);
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(",");
                
            
                for (String value : values) {
                    System.out.print(value + " ");
                }
        
        }


           
        } 
        
        catch (FileNotFoundException e) {
            System.out.println("File non trovato: " + e.getMessage());
        }
        }

 
      
   
}