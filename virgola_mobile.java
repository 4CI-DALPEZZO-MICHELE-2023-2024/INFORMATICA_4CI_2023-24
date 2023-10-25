import javax.swing.*;
public class virgola_mobile {
    public static void main(String[] args) {
        double n = Double.parseDouble(JOptionPane.showInputDialog("Inserisci un numero: "));


        String valore_uscita = "valore di input: " + n + "\n";

        if (n == 0) {
            valore_uscita = valore_uscita +"zero";
        } else if (n > 0) {
            valore_uscita  += "positivo";
            if (Math.abs(n) < 1) {
                valore_uscita  = valore_uscita + "piccolo";
            } else if (Math.abs(n) > 1000000) {
                valore_uscita  = valore_uscita +"grande";
            }
        } else {
            valore_uscita  = valore_uscita + "negativo";
            if (Math.abs(n) < 1) {
                valore_uscita  = valore_uscita + "Piccolo";
            } else if (Math.abs(n) > 1000000) {
                valore_uscita  = valore_uscita + "Grande";
            }
        }

        JOptionPane.showMessageDialog(null, valore_uscita );
    }
}
