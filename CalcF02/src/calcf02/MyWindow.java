/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcf02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyWindow extends JFrame implements ActionListener{
    JLabel lblMessage;
        JTextField txtInput;
        JButton btnAction;
        public MyWindow()
        {
            this.setSize(400, 200);
            this.setTitle("Calc function");
            this.lblMessage = new JLabel("Number");
            this.add(this.lblMessage);
            this.txtInput = new JTextField();
            this.add(txtInput);
            btnAction = new JButton();
            this.btnAction.setText("Calculate");
            this.add(this.btnAction);
            this.setLayout(new FlowLayout(FlowLayout.CENTER));
            this.btnAction.addActionListener(this);
        
        }
    
        @Override
        public void actionPerformed(ActionEvent e) {
        
            String a = this.txtInput.getText();
            int A = Integer.parseInt(a);
            if (A / 2 == 1)
            {
                lblMessage.setText("true");
            }
            else
            {
                lblMessage.setText("false");
            }
        
        }
}
