package EmailAnalyzerMultiClass;
import javax.swing.JOptionPane;

public class EmailInput {
    public static void main(String[] args) {
        EmailCheck emailCheck = new EmailCheck();

        String email = JOptionPane.showInputDialog("Enter your email: ");
        emailCheck.checkEmail(email);
    }
}
