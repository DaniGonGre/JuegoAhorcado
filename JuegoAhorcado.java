package juegoahorcadoprueba;

import javax.swing.JOptionPane;
import static juegoahorcadoprueba.Ahorcado.partida;

public class JuegoAhorcadoPrueba {

    public static void main(String[] args) {

        int op;

        try {

            op = Integer.parseInt(JOptionPane.showInputDialog("      "
                    + "       **** MENU ****"
                    + "\n1 --> Empezar partida" + "\n2 --> Elegir dificultad" + "\n3 --> Salir"));
            switch (op) {
                case 1:
                    partida();
                    break;
                case 2:
                    elegirDificultad();                    
            }
            while (op != 3);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El valor ingresado no es un número.");
        }        
    }
    
        public static void elegirDificultad(){
            int op;

        try {

            op = Integer.parseInt(JOptionPane.showInputDialog(" **** DIFICULTAD ****"
                    + "\n1 --> Fácil. 7 intentos." + "\n2 --> Media. 5 intentos" + "\n3 --> Difícil. 3 intentos."));
            switch (op) {
                case 1:
                    partida();
                    break;
                case 2:
            }
            while (op != 2);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El valor ingresado no es un número.");
            }    
        }

}

