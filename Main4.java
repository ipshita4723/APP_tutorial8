import javax.swing.*;
import java.awt.*;

public class Main4 {
    public static void main(String[] args) {
        JFrame f = new JFrame("User Login");
        JTextField userTxt = new JTextField(10);
        JPasswordField passTxt = new JPasswordField(10);
        JCheckBox remCb = new JCheckBox("Remember Me");
        JCheckBox notifCb = new JCheckBox("Receive Notifications");
        JButton loginBtn = new JButton("Login");

        f.setLayout(new FlowLayout());
        f.add(new JLabel("User:")); f.add(userTxt);
        f.add(new JLabel("Pass:")); f.add(passTxt);
        f.add(remCb); f.add(notifCb);
        f.add(loginBtn);

        loginBtn.addActionListener(e -> {
            String msg = "User: " + userTxt.getText() +
                         "\nRemember Me: " + remCb.isSelected() +
                         "\nNotifications: " + notifCb.isSelected();
            JOptionPane.showMessageDialog(f, msg, "Login Status", JOptionPane.INFORMATION_MESSAGE);
        });

        f.setSize(220, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
