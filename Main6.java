import javax.swing.*;

public class Main6 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Text Editor");
        JTextArea ta = new JTextArea();
        f.add(new JScrollPane(ta));

        JMenuBar mb = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem clearItem = new JMenuItem("Clear");
        JMenuItem exitItem = new JMenuItem("Exit");

        fileMenu.add(newItem);
        fileMenu.add(clearItem);
        fileMenu.add(exitItem);

        JMenu editMenu = new JMenu("Edit");
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        mb.add(fileMenu);
        mb.add(editMenu);
        f.setJMenuBar(mb);

        newItem.addActionListener(e -> ta.setText(""));
        clearItem.addActionListener(e -> ta.setText(""));
        exitItem.addActionListener(e -> System.exit(0));

        cutItem.addActionListener(e -> ta.cut());
        copyItem.addActionListener(e -> ta.copy());
        pasteItem.addActionListener(e -> ta.paste());

        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
