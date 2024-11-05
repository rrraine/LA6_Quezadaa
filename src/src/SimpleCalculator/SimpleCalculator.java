package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame{

    private JTextField tfNumber1;
    private JPanel jpMain;
    private JComboBox cbOperations;
    private JTextField tfNumber2;
    private JLabel lblResult;
    private JLabel lbNumber2;
    private JButton submitButton;

    public SimpleCalculator(){
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(tfNumber1.getText().trim());
                int b = Integer.parseInt(tfNumber2.getText().trim());
                int result;
                String op = (String) cbOperations.getSelectedItem();

                switch(op){
                    case "+":
                        result = a + b;
                        lblResult.setText(String.valueOf(result));
                        break;
                    case "-":
                        result = a - b;
                        lblResult.setText(String.valueOf(result));
                        break;
                    case "*":
                        result = a * b;
                        lblResult.setText(String.valueOf(result));
                        break;
                    case "/":
                        if (b != 0){
                            result = a / b;
                            lblResult.setText(String.valueOf(result));
                        } else {
                            JOptionPane.showMessageDialog(null, "Cannot divide by 0");
                        }

                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid Operation");
                }

            }
        });
    }
    public static void main(String[] args) {
        SimpleCalculator app = new SimpleCalculator();
        app.setTitle("Simple Calculator");
        app.setContentPane(app.jpMain);
        app.setSize(650, 200);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
