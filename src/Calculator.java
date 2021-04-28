import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    JFrame frame;
    JTextField textFile;
    JButton[] numButtons = new JButton[10];
    JButton[] fonsButon = new JButton[8];
    JButton ekleButon, cikButon, bolButon, carpButon;
    JButton desimButon, silButon, temButon, esitButon;
    JPanel panel;
    Font panelFontu = new Font("Calibri",Font.BOLD,12);

    Calculator(){

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    public static void main(String[] args){

        Calculator baslat = new Calculator();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
