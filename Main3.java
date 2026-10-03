import javax.swing.*;
import java.awt.*;

public class Main3 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Student Registration");
        JTextField nameTxt = new JTextField(10);
        JTextField regTxt = new JTextField(10);

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(male); bg.add(female);

        JComboBox<String> deptCombo = new JComboBox<>(new String[]{"CSE", "ECE", "EEE", "MECH"});
        JButton btn = new JButton("Submit");

        f.setLayout(new FlowLayout());
        f.add(new JLabel("Name:")); f.add(nameTxt);
        f.add(new JLabel("Reg No:")); f.add(regTxt);
        f.add(male); f.add(female);
        f.add(deptCombo);
        f.add(btn);

        btn.addActionListener(e -> {
            String gender = male.isSelected() ? "Male" : female.isSelected() ? "Female" : "Not Selected";
            String info = "Name: " + nameTxt.getText() +
                          "\nReg No: " + regTxt.getText() +
                          "\nGender: " + gender +
                          "\nDept: " + deptCombo.getSelectedItem();
            JOptionPane.showMessageDialog(f, info);
        });

        f.setSize(250, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
