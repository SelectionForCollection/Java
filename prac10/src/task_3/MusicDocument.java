import javax.swing.*;
import java.awt.*;

public class MusicDocument extends JFrame implements IDocument {
    JMenuBar menuBar = new JMenuBar();
    JMenu file = new JMenu("File");
    JMenuItem open = new JMenuItem("Open");
    JMenuItem New = new JMenuItem("New");
    JMenuItem save = new JMenuItem("Save");
    JMenuItem exit = new JMenuItem("Exit");
    JRadioButton radioOn = new JRadioButton("Включить музыку");
    JRadioButton radioOff = new JRadioButton("Выключить муызку");


    MusicDocument() {
        this.setTitle("MusicDocument");
        this.setBounds(100,100,600,600);
        Container container = this.getContentPane();

        menuBar.add(file);
        file.add(New);
        file.add(open);
        file.add(save);
        file.add(exit);
        menuBar.add(file);

        radioOff.setSelected(true);
        ButtonGroup group = new ButtonGroup();
        group.add(radioOff);
        group.add(radioOn);


        container.add(menuBar, BorderLayout.NORTH);
        container.add(radioOff, BorderLayout.CENTER);
        container.add(radioOn, BorderLayout.EAST);

        this.setVisible(true);
    }
    @Override
    public void draw() {
        System.out.println("Отрисован класс MusicDocument");
    }
}
