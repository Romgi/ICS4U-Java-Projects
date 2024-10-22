package EmailAnalyzerMultiClass;
import javax.swing.JOptionPane;

public class EmailOutput {
    public static void main(String[] args) {
        
    }
    public static void outputEmail(String email){
        int atIndex = email.indexOf('@');
        String name = email.substring(0, atIndex);
        int endIndex = email.length();
        String domain = email.substring(atIndex,endIndex);
        JOptionPane.showMessageDialog(null, "The Name is: " + name);
        JOptionPane.showMessageDialog(null, "The domain is: " + domain);
    }
}
