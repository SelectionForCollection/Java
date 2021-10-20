import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Text extends JFrame{

    private JTextArea textArea = new JTextArea();
    private JPanel panel1 = new JPanel();
    private JMenuBar menuBar = new JMenuBar();
    private JMenu colorMenu = new JMenu("Цвет");
    private JMenu fontMenu = new JMenu("Шрифт");
    private JMenuItem itemBlue = new JMenuItem("Синий");
    private JMenuItem itemRed = new JMenuItem("Красный");
    private JMenuItem itemBlack = new JMenuItem("Черный");
    private JMenuItem itemTNR = new JMenuItem("Times new Roman");
    private JMenuItem itemMSSSS = new JMenuItem("MS Sans Serif");
    private JMenuItem itemCN = new JMenuItem("Courier New");

    Text(){
        this.setBounds(300, 300, 400, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();

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
                textArea.setFont(new Font("Times new Roman", Font.PLAIN, 24));
            }
        });

        itemMSSSS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 24));
            }
        });

        itemCN.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("Courier New", Font.PLAIN, 24));
            }
        });



    }

    public static void main(String[] args) {
        JFrame.isDefaultLookAndFeelDecorated();
        new Text().setVisible(true);
    }
}
