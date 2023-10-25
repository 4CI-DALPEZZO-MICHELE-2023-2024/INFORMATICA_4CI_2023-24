import javax.swing.*;
public class g_sett {
    public static void main(String[]args){
        int n=Integer.parseInt(JOptionPane.showInputDialog("inserisci un numero "));
        while(n>7||n<1){
            n=Integer.parseInt(JOptionPane.showInputDialog("inserisci un numero compreso tra 1 e 7 "));
        }
        switch (n){
            case 1:
                JOptionPane.showMessageDialog(null, "lunedì");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "martedì");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "mercoled'");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "giovedì");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "venerdì");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "sabato");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "domenica");
        }
    }
}
