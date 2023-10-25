import javax.swing.*;
public class giorni_mesi {
    public static void main(String[]args){
        int gg=0;
        String mese="";
        int n_m=Integer.parseInt(JOptionPane.showInputDialog("inserisci il numero del mese "));
        int n_a=Integer.parseInt(JOptionPane.showInputDialog("inserisci l'anno "));
        switch (n_m) {
            case 1:
                mese = "gennaio";
                gg = 31;
                break;
            case 2:
                mese = "febbraio";
                gg = 28;
                break;
            case 3:
                mese = "marzo";
                gg = 31;
                break;
            case 4:
                mese = "aprile";
                gg = 30;
                break;
            case 5:
                mese = "maggio";
                gg = 31;
                break;
            case 6:
                mese = "giugno";
                gg = 30;
                break;
            case 7:
                mese = "luglio";
                gg = 31;
                break;
            case 8:
                mese = "agosto";
                gg = 31;
                break;
            case 9:
                mese = "settembre";
                gg = 30;
                break;
            case 10:
                mese = "ottobre";
                gg = 31;
            case 11:
                mese = "novembre";
                gg = 30;
                break;
            case 12:
                mese = "dicembre";
                gg = 31;
        }
    JOptionPane.showMessageDialog(null,(mese)+ " " + (n_a)+ " " + " ha " + (gg) + " giorni " );
    }
}
