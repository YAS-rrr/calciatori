import java.io.*;
import java.util.Scanner;

public class SalutaNome {
    public static void main(String[] args) {
        try{
           
            File file = new File("calciatori.csv");
            Scanner scanner = new Scanner(file);
            String nome = scanner.nextLine().trim();
           while(nome != null){
            if (scanner.hasNextLine())
            
             {
               
                String riga = scanner.nextLine().trim();
                
               
                System.out.println(riga);
            }
            
             else 
            
            {
                System.out.println("Il file è vuoto!");
            }
            
         
            
             
              scanner.close();
           

        }

           


        } 
        
        catch (FileNotFoundException e) {
            System.out.println("File non trovato: " + e.getMessage());
        }

       
            
         
    }
}