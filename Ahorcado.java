    }
    
     public static void partidaDificil() {

        List<String> palabras = new ArrayList<>();
        Ficherolectura.crearPalabra(palabras);
        int i = 0;

        Random rand = new Random();
        String palabraJuego = palabras.get(rand.nextInt(palabras.size()));

      //  System.out.println(palabraJuego);

        List<Character> jugadores = new ArrayList<>();

        System.out.println();

        int intentos = 0;

        while (true) {
            if (intentos >= 1) {
                JOptionPane.showMessageDialog(null, "Has acabado todos tus intentos.");
                break;
            }
            
            if(!jugando(palabraJuego, jugadores)){
                intentos++;
                JOptionPane.showMessageDialog(null, "Esta letra no está en la palabra. Te quedan " + (1-intentos) + " intentos");

            }
            
            if(verPalabras(palabraJuego, jugadores)){
                JOptionPane.showMessageDialog(null, "Ganaste");
            }
            
            if (intentos >= 1){
            String tmp = JOptionPane.showInputDialog("Introduce la palabra completa si la sabes: ");
            
            
            if(palabraJuego.equals(tmp)){
                JOptionPane.showMessageDialog(null, "Ganaste");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "La palabra no es correcta.");
              }
            }
            
        }
    }
     
      public static void partidaMedia() {

        List<String> palabras = new ArrayList<>();
        Ficherolectura.crearPalabra(palabras);
        int i = 0;

        Random rand = new Random();
        String palabraJuego = palabras.get(rand.nextInt(palabras.size()));

    //    System.out.println(palabraJuego);

        List<Character> jugadores = new ArrayList<>();

        System.out.println();

        int intentos = 0;

        while (true) {
            if (intentos >= 3) {
                JOptionPane.showMessageDialog(null, "Has acabado todos tus intentos.");
                break;
            }
            
            if(!jugando(palabraJuego, jugadores)){
                intentos++;
                JOptionPane.showMessageDialog(null, "Esta letra no está en la palabra. Te quedan " + (3-intentos) + " intentos");

            }
            
            if(verPalabras(palabraJuego, jugadores)){
                JOptionPane.showMessageDialog(null, "Ganaste");
            }
            
            String tmp = JOptionPane.showInputDialog("Introduce la palabra completa si la sabes: ");
            
            if(palabraJuego.equals(tmp)){
                JOptionPane.showMessageDialog(null, "Ganaste");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "La palabra no es correcta.");
              }
            
            
        }
    }
}
