import javax.swing.*;
public class triangolo {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("inserisci un numero "));
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}