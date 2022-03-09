package juegoahorcado;

import java.util.*;
import javax.swing.JOptionPane;

public class Ahorcado {

    public static void partida() {

        List<String> palabras = Arrays.asList("camion", "esternocleidomastoideo", "perro", "hawaii");

        int i = 0;

        Random rand = new Random();
        String palabraJuego = palabras.get(rand.nextInt(palabras.size()));

        System.out.println(palabraJuego);

        List<Character> jugadores = new ArrayList<>();

        System.out.println();

        int intentos = 0;

        while (true) {
            if (intentos >= 5) {
                JOptionPane.showMessageDialog(null, "No te quedan más intentos.");
                break;
            }

            if (!jugando(palabraJuego, jugadores)) {
                intentos++;
                JOptionPane.showMessageDialog(null, "Esta letra no está en la palabra. Te quedan " + (6-intentos) + " intentos");
            }

            if (verPalabras(palabraJuego, jugadores)) {
                JOptionPane.showMessageDialog(null, "Has acertado la palabra!");
            }
            
            
            String tmp = JOptionPane.showInputDialog("Introduce la palabra completa si la sabes: ");
            
            if (palabraJuego.equals(tmp)) {
                JOptionPane.showMessageDialog(null, "Ganaste");
                break;
            } else {
                intentos++;
                JOptionPane.showMessageDialog(null, "La palabra no es correcta. Te quedan " + (6-intentos) + " intentos.");
            }

        }
    }

    private static boolean jugando(String palabraJuego, List<Character> jugadores) {

        String letra = JOptionPane.showInputDialog("Introduce unha letra: ");
        jugadores.add(letra.charAt(0));

        return palabraJuego.contains(letra);
    }

    private static boolean verPalabras(String palabraJuego, List<Character> jugadores) {
        String concatena = "";
        int correctas = 0;

        for (int i = 0; i < palabraJuego.length(); i++) {
            if (jugadores.contains(palabraJuego.charAt(i))) {
                concatena = concatena + palabraJuego.charAt(i);
                correctas++;
            } else {
                concatena = concatena + " - ";
            }
        }
        JOptionPane.showConfirmDialog(null, concatena);
        return (palabraJuego.length() == correctas);
    }
}
