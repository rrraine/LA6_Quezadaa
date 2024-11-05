package FoodOrderingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem extends JFrame{


    private JPanel jpMain;
    private JCheckBox cPizza;
    private JRadioButton none;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb10;
    private JRadioButton rb5;
    private JRadioButton rb15;
    private JButton btnOrder;
    private JLabel l100;
    private JLabel l80;
    private JLabel l65;
    private JLabel l55;
    private JLabel l50;
    private JLabel l40;

    private JCheckBox food[] = {cPizza, cBurger, cFries, cSoftDrinks, cTea, cSundae};
    private JLabel price[] = {l100, l80, l65, l55, l50, l40};
    private JRadioButton discount[] = {none, rb5, rb10, rb15};

    public int amount;
    public FoodOrderingSystem(){

        btnOrder.addActionListener(new ActionListener() {
            // todo, compute total amount
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "The total price is Php " + String.format("%.2f", amount));
            }
        });
    }
    public static void main(String[] args) {
        FoodOrderingSystem app = new FoodOrderingSystem();
        app.setTitle("Simple Calculator");
        app.setContentPane(app.jpMain);
        app.setSize(750, 500);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
