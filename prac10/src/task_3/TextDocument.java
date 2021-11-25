import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextDocument extends JFrame implements IDocument{
    private JMenuBar menuBar = new JMenuBar();
    private JMenu file = new JMenu("File");
    private JMenuItem open = new JMenuItem("Open");
    private JMenuItem New = new JMenuItem("New");
    private JMenuItem save = new JMenuItem("Save");
    private JMenuItem exit = new JMenuItem("Exit");
    private JTextArea textArea = new JTextArea();
    private JPanel panel1 = new JPanel();
    private JMenu colorMenu = new JMenu("Цвет");
    private JMenu fontMenu = new JMenu("Шрифт");
    private JMenuItem itemBlue = new JMenuItem("Синий");
    private JMenuItem itemRed = new JMenuItem("Красный");
    private JMenuItem itemBlack = new JMenuItem("Черный");
    private JMenuItem itemTNR = new JMenuItem("Times new Roman");
    private JMenuItem itemMSSSS = new JMenuItem("MS Sans Serif");
    private JMenuItem itemCN = new JMenuItem("Courier New");

    TextDocument() {
        this.setTitle("TextDocument");
        this.setBounds(10,10,600,600);
        Container container = this.getContentPane();

        menuBar.add(file);
        file.add(New);
        file.add(open);
        file.add(save);
        file.add(exit);
        menuBar.add(file);

        colorMenu.add(itemBlue);
        colorMenu.add(itemRed);
        colorMenu.add(itemBlack);
        menuBar.add(colorMenu);

        fontMenu.add(itemTNR);
        fontMenu.add(itemMSSSS);
        fontMenu.add(itemCN);
        menuBar.add(fontMenu);

        container.add(menuBar, BorderLayout.NORTH);
        container.add(textArea, BorderLayout.CENTER);

        itemBlue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLUE);
            }
        });

        itemRed.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.RED);
            }
        });

        itemBlack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLACK);
            }
        });

        itemTNR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("Times new Roman", Font.PLAIN, 14));
            }
        });

        itemMSSSS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 14));
            }
        });

        itemCN.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("Courier New", Font.PLAIN, 14));
            }
        });

        this.setVisible(true);
    }

    @Override
    public void draw() {
        System.out.println("Отрисован класс TextDocument");
    }
}
