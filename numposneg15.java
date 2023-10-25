import javax.swing.*;
public class numposneg15 {
    public static void main(String[]args){
        int n_p=0;
        int n_n=0;
         n_p=Integer.parseInt(JOptionPane.showInputDialog("inserisci un numero positivo "));
         n_n=Integer.parseInt(JOptionPane.showInputDialog("inserisci un numero negativo "));
        while(n_p<0 || n_n>0){
            int n_pos=Integer.parseInt(JOptionPane.showInputDialog("inserisci un numero positivo "));
            int n_neg=Integer.parseInt(JOptionPane.showInputDialog("inserisci un numero negativo "));
        }
        if (n_p>0 && n_n<0){
            JOptionPane.showMessageDialog(null,"ok");
        }
    }
}
