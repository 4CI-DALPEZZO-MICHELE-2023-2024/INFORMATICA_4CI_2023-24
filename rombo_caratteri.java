
/**
 * Aggiungi qui una descrizione della classe rombo_caratteri
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
import javax.swing.*;
public class rombo_caratteri
{
    public static void main(String[]args){
        char [] alfabeto="ABCDEFGHILMNOPQRSTUVZ".toCharArray();
        int n= Integer.parseInt(JOptionPane.showInputDialog("inserire un numero"));
        for(int i=0;i<=n;i++){
            for(int j=0;j<n;j++){
                char c = alfabeto[j];
                JOptionPane.showMessageDialog(null,+c);
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
