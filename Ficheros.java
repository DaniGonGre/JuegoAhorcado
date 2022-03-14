package com.dani.lecturaPalabras;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Fichero {


    public static void crearPalabra(List<String> jugadores){
        File fichero = new File("palabras.txt");

        try{
            Scanner leer = new Scanner(fichero);
            while (leer.hasNext()){

                jugadores.add(leer.next());
            }
            leer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
