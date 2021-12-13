import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Student extends JFrame {
    JLabel dayLabel = new JLabel("День:");
    JLabel monthLabel = new JLabel("Месяц:");
    JLabel yearLabel = new JLabel("Год:");
    JLabel formatLabel = new JLabel("Формат:");

    JButton button = new JButton("Вывести!");
    JTextField text = new JTextField();

    JComboBox<Integer> day = new JComboBox<>();
    JComboBox<Integer> month = new JComboBox<>();
    JComboBox<Integer> year = new JComboBox<>();
    JComboBox<String> format = new JComboBox<>();

    Student(){
        this.setBounds(10,10, 1500, 90);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(1, 9));
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
        format.addItem("Короткий формат");
        format.addItem("Средний формат");
        format.addItem("Полный формат");

        container.add(dayLabel);
        container.add(day);
        container.add(monthLabel);
        container.add(month);
        container.add(yearLabel);
        container.add(year);
        text.setEditable(false);
        container.add(text);
        container.add(formatLabel);
        container.add(format);

        button.addActionListener(new ActionListener() {
            String str = "";
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (format.getSelectedIndex()) {
                    case 0:
                        str = day.getSelectedItem() + "." + month.getSelectedItem() + "." + year.getSelectedItem();
                        text.setText(str);
                        break;
                    case 1:
                        str = day.getSelectedItem() + " ";
                        switch (month.getSelectedIndex()) {
                            case 0:
                                str += "Января ";
                                break;
                            case 1:
                                str += "Февраля ";
                                break;
                            case 2:
                                str += "Марта ";
                                break;
                            case 3:
                                str += "Апреля ";
                                break;
                            case 4:
                                str += "Мая ";
                                break;
                            case 5:
                                str += "Июня ";
                                break;
                            case 6:
                                str += "Июля ";
                                break;
                            case 7:
                                str += "Августа ";
                                break;
                            case 8:
                                str += "Сентрября ";
                                break;
                            case 9:
                                str += "Окрября ";
                                break;
                            case 10:
                                str += "Ноября ";
                                break;
                            case 11:
                                str += "Декабря ";
                                break;
                        }
                        str += year.getSelectedItem();
                        text.setText(str);
                        break;
                    case 2:
                        Calendar calendar = new GregorianCalendar((Integer) year.getSelectedItem(), (Integer) month.getSelectedItem(), (Integer) day.getSelectedItem());

                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                        Date myDate = calendar.getTime();
                        sdf.applyPattern("EEE, d MMMMM yyyy");
                        str = sdf.format(myDate);

                        text.setText(str);
                }
            }
        });
        container.add(button);
    }

    public static void main(String[] args) {
        new Student().setVisible(true);
    }
}