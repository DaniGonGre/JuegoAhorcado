package juegoahorcado;

import javax.swing.JOptionPane;
import static juegoahorcado.Ahorcado.partida;

public class JuegoAhorcado {

    public static void main(String[] args) {
        
        int op;
        
        op = Integer.parseInt(JOptionPane.showInputDialog(" **** MENU ****" +
            "\n1 --> Empezar partida" + "\n2 --> Sair da partida"));
        
        switch (op){
            case 1 : partida();
            break;        
        } while (op != 2);
            
        
    }
    

    
}

