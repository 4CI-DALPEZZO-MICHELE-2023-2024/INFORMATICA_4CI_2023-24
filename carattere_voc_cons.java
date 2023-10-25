import javax.swing.*;
public class carattere_voc_cons {
    public static void main(String[] args) {
        char[] vocali = {'a', 'e', 'i', 'o', 'u'};
        char[] consonanti = {'b', 'c', 'd', 'f', 'g', 'h', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'j', 'k', 'z'};
        char[] vocali_m = {'A', 'E', 'I', 'O', 'U'};
        char[] consonanti_m = {'B', 'C', 'D', 'F', 'G', 'H', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'J', 'K', 'Z'};
        String car = JOptionPane.showInputDialog("inserisci un carattere");
        while (car.length() > 1) {
            car = JOptionPane.showInputDialog("inserisci un solo carattere");
        }
        char cerca = car.charAt(0);
        boolean trovato = false;
        for (int i = 0; i < vocali.length; i++) {
            if (vocali[i] == cerca) {
                trovato = true;
                JOptionPane.showMessageDialog(null, "il carattere"  + " " + (car) + " " + "è una vocale");
            }
        }
        for (int i = 0; i < vocali_m.length; i++) {
            if (vocali_m[i] == cerca) {
                trovato = true;
                JOptionPane.showMessageDialog(null, "il carattere"  + " " + (car) + " " +  "è una vcoale maiuscola");

            }
        }
        for (int i = 0; i < consonanti.length; i++) {
            if (consonanti[i] == cerca) {
                trovato = true;
                JOptionPane.showMessageDialog(null, "il carattere"  + " " + (car) + " " +  "è una consonante");
            }
        }
        for (int i = 0; i < consonanti_m.length; i++) {
            if (consonanti_m[i] == cerca) {
                trovato = true;
                JOptionPane.showMessageDialog(null, "il carattere" + " " + (car) + " " +  "è una consonante maiuscola");
            }
        }
    }
}

