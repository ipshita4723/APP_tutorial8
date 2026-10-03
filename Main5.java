import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Main5 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Course Management");
        f.setLayout(new FlowLayout());

        JTextField nameTxt = new JTextField(8);
        String[] courses = {"Java", "Python", "C++", "DBMS"};
        JList<String> courseList = new JList<>(courses);

        DefaultTableModel model = new DefaultTableModel(new String[]{"Name", "Course", "Status"}, 0);
        JTable table = new JTable(model);

        JButton addBtn = new JButton("Add");
        JButton remBtn = new JButton("Remove");

        f.add(new JLabel("Name:"));
        f.add(nameTxt);
        f.add(new JScrollPane(courseList));
        f.add(addBtn);
        f.add(remBtn);
        f.add(new JScrollPane(table));

        addBtn.addActionListener(e -> {
            if (!nameTxt.getText().isEmpty() && courseList.getSelectedValue() != null) {
                model.addRow(new Object[]{nameTxt.getText(), courseList.getSelectedValue(), "Enrolled"});
            }
        });

        remBtn.addActionListener(e -> {
            int row = table.getSelectedRow();
            if (row != -1) model.removeRow(row);
        });

        f.setSize(500, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
