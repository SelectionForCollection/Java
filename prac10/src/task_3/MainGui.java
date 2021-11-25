import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGui extends JFrame {
    JMenuBar menuBar = new JMenuBar();
    JMenu file = new JMenu("File");
    JMenuItem open = new JMenuItem("Open");
    JMenuItem New = new JMenuItem("New");
    JMenuItem save = new JMenuItem("Save");
    JMenuItem exit = new JMenuItem("Exit");

    private IDocument document;
    private static ICreateDocument createDocument;

    MainGui() {
        this.setTitle("MainGui");
        this.setBounds(0,0,600,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = this.getContentPane();

        menuBar.add(file);
        file.add(New);
        file.add(open);
        file.add(save);
        file.add(exit);
        menuBar.add(file);

        container.add(menuBar, BorderLayout.NORTH);

        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(open.isArmed()){
                    document = createDocument.createNew();
                }
            }
        });

        New.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(New.isArmed()){
                    document = createDocument.createNew();
                }
            }
        });
    }



    public static void main(String[] args) {
        createDocument = new CreateMusicDocument();
        JFrame.setDefaultLookAndFeelDecorated(true);
        new MainGui().setVisible(true);
    }
}
