import javax.swing.*;
public class tabella_moltiplicazione {
    public static void main(String[]args){
        int tabella=Integer.parseInt(JOptionPane.showInputDialog("inserisci il numero "));
        int termini=Integer.parseInt(JOptionPane.showInputDialog("inserisci il di termini "));
        int output;
        for ( int i=0;i<=termini;i++){
            output=tabella*i;
            JOptionPane.showMessageDialog(null,(tabella )+ " " + "X" + (i) + " " + "=" + (output));
        }
    }
}
