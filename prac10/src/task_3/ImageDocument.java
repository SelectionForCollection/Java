import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageDocument extends JFrame implements IDocument {
    private JMenuBar menuBar = new JMenuBar();
    private JMenu file = new JMenu("File");
    private JMenuItem open = new JMenuItem("Open");
    private JMenuItem New = new JMenuItem("New");
    private JMenuItem save = new JMenuItem("Save");
    private JMenuItem exit = new JMenuItem("Exit");
    private JButton choice = new JButton("Выберите изображение");


    ImageDocument() {
        this.setTitle("ImageDocument");
        this.setBounds(100,100,600,600);
        Container container = this.getContentPane();

        menuBar.add(file);
        file.add(New);
        file.add(open);
        file.add(save);
        file.add(exit);
        menuBar.add(file);

        container.add(menuBar, BorderLayout.NORTH);
        container.add(choice);
        this.setVisible(true);
    }
    @Override
    public void draw() {
        System.out.println("Отрисован класс ImageDocument");
    }
}
