import javax.swing.*;
public class n_term_disp {
    public static void main(String[]args){
        int n_term = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il numero di termini "));
        int somma = 0;
        String num_disp = "";

        for (int i = 1; n_term > 0; i += 2) {
            num_disp = num_disp + i + "\n"; //
            somma = somma + i;
            n_term--;
        }

        JOptionPane.showMessageDialog(null, "I numeri dispari sono:\n" + num_disp +
                "La somma dei numeri naturali dispari fino a " + (n_term) + " termini è: " + somma);
    }
}

