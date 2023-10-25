import javax.swing.JOptionPane;
public class rombo{
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("inserisci un numero positivo "));
        char[] alfabeto = {'A','B', 'C', 'D','E','F', 'G', 'H','I','L', 'M', 'N','O','P', 'Q', 'R', 'S', 'T','U','V', 'W', 'X', 'Y', 'J', 'K', 'Z'};
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                output.append(alfabeto[j]);
            }
            for (int j = i - 1; j >= 0; j--) {
                output.append(alfabeto[j]);
            }
            output.append("\n");
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                output.append(alfabeto[j]);
            }
            for (int j = i - 1; j >= 0; j--) {
                output.append(alfabeto[j]);
            }
            output.append("\n");
        }

        JOptionPane.showMessageDialog(null, output.toString());
    }
}




