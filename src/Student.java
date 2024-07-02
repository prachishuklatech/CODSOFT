import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {
    private JTextField txtStname;
    private JTextField txtMarks1;
    private JTextField txtMarks2;
    private JTextField txtMarks3;
    private JTextField txtTotal;
    private JTextField txtAvg;
    private JButton Cal;
    private JTextField txtGrade;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Student() {
        Cal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int m1,m2,m3,tot;
                double avg;

                m1=Integer.parseInt(txtMarks1.getText());
                m2=Integer.parseInt(txtMarks2.getText());
                m3=Integer.parseInt(txtMarks3.getText());

                tot=m1+m2+m3;

                txtTotal.setText(String.valueOf(tot));

                avg=tot/3;

                txtAvg.setText(String.valueOf(avg));
                if (avg>=100){
                    txtGrade.setText("Not in range");
                }

                else if (avg<=100 && avg> 90){
                    txtGrade.setText("A+");
                }
                else if (avg<=90 && avg>80) {
                    txtGrade.setText("A");
                }
                else if (avg<=80 && avg>70) {
                    txtGrade.setText("B+");
                }
                else if (avg<=70 && avg>60) {
                    txtGrade.setText("B");
                }
                else if (avg<=60 && avg>37) {
                    txtGrade.setText("Pass");
                }
                else {
                    txtGrade.setText("Fail");
                }

            }
        });
    }
}
