import javax.swing.*;
public class num_magg {
    public static void main(String[]args){
        int n=Integer.parseInt(JOptionPane.showInputDialog("inserisci il primo numero "));
        int n1=Integer.parseInt(JOptionPane.showInputDialog("inserisci il secondo numero "));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("inserisci il terzo numero "));
        if(n>n1 && n>n2){
            JOptionPane.showMessageDialog(null,(n)+ " " + " è il numero piu grande");
        } else if (n1>n && n1>n2) {
            JOptionPane.showMessageDialog(null,(n1)+ " " + " è il numero piu grande");

        }else {
            JOptionPane.showMessageDialog(null,(n2)+ " " + " è il numero piu grande");

        }
    }
}
