import javax.swing.*;
public class cubo {
    public static void main(String[]args){
        int cubo;
        int n = Integer.parseInt(JOptionPane.showInputDialog("inserisci un numero "));
        for ( int i=0;i<n;i++) {
            cubo = n^3;
            JOptionPane.showMessageDialog(null, "il cubo è " + cubo);
        }

    }

}
