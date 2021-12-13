import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Task2 extends JFrame {
    JLabel dayLabel = new JLabel("День:");
    JLabel monthLabel = new JLabel("Месяц:");
    JLabel yearLabel = new JLabel("Год:");

    JButton button = new JButton("Сравнить!");
    JTextField text = new JTextField();

    JComboBox<Integer> day = new JComboBox<>();
    JComboBox<Integer> month = new JComboBox<>();
    JComboBox<Integer> year = new JComboBox<>();

    Date currentDate = new Date(System.currentTimeMillis());


    Task2() {
        this.setBounds(10,10,1500,100);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(1,8));
        Container container = this.getContentPane();

        for(int i = 1; i <= 31; i++) {
            if(i<=12) {
                month.addItem(i);
            }
            day.addItem(i);
        }

        for(int i = 1970; i<= 2070; i++) {
            year.addItem(i);
        }

        container.add(dayLabel);
        container.add(day);
        container.add(monthLabel);
        container.add(month);
        container.add(yearLabel);
        container.add(year);

        text.setEditable(true);
        container.add(text);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GregorianCalendar c1 = new GregorianCalendar((Integer) year.getSelectedItem(),(Integer) month.getSelectedItem(), (Integer) day.getSelectedItem());
                if(currentDate.before(c1.getTime())) {
                    text.setText("Вы в будущем!");
                }
                if(currentDate.after(c1.getTime())) {
                    text.setText("Вы в прошлом!");
                }
                if(currentDate.equals(c1.getTime())) {
                    text.setText("Вы в настоящем!");
                }
            }
        });
        container.add(button);
    }

    public static void main(String[] args) {
        new Task2().setVisible(true);
    }
}