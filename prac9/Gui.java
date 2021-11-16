import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Gui extends JFrame {
    JComboBox<String> comboBox = new JComboBox<String>();
    JTextField textField = new JTextField();
    JLabel labelStudent = new JLabel("Student");
    JLabel labelINN = new JLabel("INN");
    JLabel labelResult = new JLabel("Result");
    JLabel label = new JLabel();
    JButton button = new JButton("Chek data");

    Gui( ArrayList<Student> students){
        this.setBounds(0,0,1500,100);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3, 3));

        Student obj = new Student();

        for(Student x: students){
            comboBox.addItem(x.getFIO());
        }

        Container container = this.getContentPane();
        container.add(labelStudent);
        container.add(labelINN);
        container.add(labelResult);
        container.add(comboBox);
        container.add(textField);
        container.add(label);
        container.add(button, BorderLayout.CENTER);

        textField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (textField.getText().length() >= 10 )
                    e.consume();
            }
        });

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (Student student : students) {
                    if (student.getFIO() == comboBox.getSelectedItem()) {
                        try {
                            if (Integer.parseInt(textField.getText()) == student.getINN()) {
                                label.setText("correct data");
                                JOptionPane.showMessageDialog(null, "Заказ оформлен");
                            } else {
                                label.setText("incorrect data");
                            }
                        } catch (NumberFormatException y) {
                            label.setText(String.valueOf(y));
                        }
                    }
                }
            }
        });
    }

}
