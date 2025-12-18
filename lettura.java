import csv.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class lettura {

   
 
    private String cognome;
    private int eta;
    

    public Persona(String cognome, int eta) {
        this.cognome = cognome;
        this.eta = eta;
        
    }

    @Override
    public String toString() {
        return nome + " - " + eta + " - " + citta;
    }
}


       
        