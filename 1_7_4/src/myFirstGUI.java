import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import javax.swing.plaf.basic.BasicOptionPaneUI;

public class myFirstGUI extends JFrame {
    private int milanScore = 0;
    private int madridScore = 0;
    private JButton milanButton = new JButton("AC Milan");
    private JButton madridButton = new JButton("Real Madrid");
    private JLabel result = new JLabel("Result: " + milanScore + " X " + madridScore);
    private JLabel lastScorer = new JLabel("Last Scorer: N/A");
    private Label winner = new Label("Winner: DRAW");

    public myFirstGUI() {
        this.setBounds(300, 300, 400, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,6, 2, 2));

        milanButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                result.setText("Result: " + milanScore + " X " + madridScore);
                lastScorer.setText("Last Scorer: AC Milan");
                if(milanScore > madridScore){
                    winner.setText("Winner: AC Milan");
                }else{
                    if(milanScore == madridScore){
                        winner.setText("Winner: Draw");
                    }
                }
            }
        });
        container.add(milanButton, BorderLayout.WEST);
        madridButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                result.setText("Result: " + milanScore + " X " + madridScore);
                lastScorer.setText("Last Scorer: Real Madrid");
                if(madridScore > milanScore){
                    winner.setText("Winner: Real Madrid");
                }else{
                    if(milanScore == madridScore){
                        winner.setText("Winner: Draw");
                    }
                }
            }
        });
        container.add(madridButton, BorderLayout.EAST);
        container.add(result, BorderLayout.CENTER);
        container.add(lastScorer, BorderLayout.CENTER);
        container.add(winner, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new myFirstGUI().setVisible(true);
    }
}