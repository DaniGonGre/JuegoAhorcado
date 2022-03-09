package juegoahorcado;

import javax.swing.JOptionPane;
import static juegoahorcado.Ahorcado.partida;

public class JuegoAhorcado {

   public static void main(String[] args) {

        int op;
       
        try{

        op = Integer.parseInt(JOptionPane.showInputDialog(" **** MENU ****" +
            "\n1 --> Empezar partida" + "\n2 --> Sair da partida"));
        switch (op){
            case 1 : partida();
            break;        
        } while (op != 2);
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El valor ingresado no es un número.");
        }
        
        
    }  
}

