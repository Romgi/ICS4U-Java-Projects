package EmailAnalyzerMultiClass;
import javax.swing.JOptionPane;

public class EmailCheck {
    public static void main(String[] args) {
        EmailOutput emailOutput = new EmailOutput();
    }
    public static void checkEmail(String email){
        if (!(email.isEmpty())){
            if (email.contains("@")){
                EmailOutput.outputEmail(email);
            }
            else{
                JOptionPane.showMessageDialog(null, "Error: Email must contain an '@' symbol.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Error: Email must not be empty.");
        }
    }
}
