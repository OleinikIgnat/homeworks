package loginframetester;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
public class MyWindow extends JFrame {
    private JTextField txtField1;
    private JTextField txtField2;
    private JButton btnLogin;
    public MyWindow()
    {
        setSize(200, 300);
        setTitle("LoginFrameTester");
        
        txtField1 = new JTextField();
        txtField2 = new JTextField();
        btnLogin = new JButton("Sign in");
        this.setLayout(new FlowLayout());
        this.add(txtField2, FlowLayout.CENTER);
        this.add(txtField1, FlowLayout.CENTER);
        this.add(btnLogin, FlowLayout.CENTER);
    }
}