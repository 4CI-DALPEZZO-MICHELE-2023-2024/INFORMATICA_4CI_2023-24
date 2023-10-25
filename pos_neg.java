import javax.swing.*;
public class pos_neg {
    public static void main(String[]args){
        int n=Integer.parseInt(JOptionPane.showInputDialog("inserisci un numero "));
        if (n>0) {
            JOptionPane.showMessageDialog(null,"il numero da te inserito è positivo");
        } else if (n==0) {
            JOptionPane.showMessageDialog(null,"il numero da te inserito è 0");
        }else{
            JOptionPane.showMessageDialog(null,"il numero da te inserito è negativo");
        }
    }
}
