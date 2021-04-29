import javax.swing.*;
import javax.xml.bind.SchemaOutputResolver;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    JFrame pencere;                                                 //Uygulama dış çerçevesi
    JTextField textAlani;                                           //Input girilecek alanlar
    JButton[] numButon = new JButton[10];                           //Tutulan buton sayıları
    JButton[] fonksButon = new JButton[9];
    JButton ekleButon, cikButon, bolButon, carpButon;
    JButton desimButon, silButon, temizButon, esitButon, negButon;
    JPanel panel;
    Font pencereFontu = new Font("Calibri", Font.PLAIN, 20);

    double num1 = 0, num2 = 0, sonuc = 0;
    char operatorler;

    Calculator() {

        pencere = new JFrame("Calculator");                     //Uygulama dış çerçevesi yaratıldı
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pencere.setSize(420, 550);
        pencere.setLayout(null);

        textAlani = new JTextField();                                //Input alanı yaratıldı
        textAlani.setBounds(50, 25, 300, 50);    //Input alanı ayarlandı
        textAlani.setFont(pencereFontu);

        ekleButon = new JButton("+");
        cikButon = new JButton("-");
        carpButon = new JButton("*");
        bolButon = new JButton("/");
        esitButon = new JButton("=");
        desimButon = new JButton(".");
        silButon = new JButton("Sil");
        temizButon = new JButton("Temizle");
        negButon = new JButton("(-)");

        fonksButon[0] = ekleButon;
        fonksButon[1] = cikButon;
        fonksButon[2] = carpButon;
        fonksButon[3] = bolButon;
        fonksButon[4] = esitButon;
        fonksButon[5] = desimButon;
        fonksButon[6] = silButon;
        fonksButon[7] = temizButon;
        fonksButon[8] = negButon;

        for (int i = 0; i < 9; i++) {
            fonksButon[i].addActionListener(this);
            fonksButon[i].setFont(pencereFontu);
            fonksButon[i].setFocusable(false);
        }


        for (int i = 0; i < 10; i++) {
            numButon[i] = new JButton(String.valueOf(i));
            numButon[i].addActionListener(this);
            numButon[i].setFont(pencereFontu);
            numButon[i].setFocusable(false);
        }

        negButon.setBounds(50, 430, 100, 50);
        silButon.setBounds(150, 430, 100, 50);
        temizButon.setBounds(250, 430, 100, 50);

        panel = new JPanel();                                       //Numaralar için panel üzerine yeni panel yaratıldı
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 5, 5));
        //panel.setBackground(Color.DARK_GRAY);                     //Üst panelin varlığını görebilmek için yorum satırını kaldırın

        panel.add(numButon[1]);
        panel.add(numButon[2]);
        panel.add(numButon[3]);
        panel.add(ekleButon);
        panel.add(numButon[4]);
        panel.add(numButon[5]);
        panel.add(numButon[6]);
        panel.add(cikButon);
        panel.add(numButon[7]);
        panel.add(numButon[8]);
        panel.add(numButon[9]);
        panel.add(carpButon);
        panel.add(desimButon);
        panel.add(numButon[0]);
        panel.add(esitButon);
        panel.add(bolButon);

        pencere.add(panel);                                         //Üst panel
        pencere.add(negButon);
        pencere.add(silButon);
        pencere.add(temizButon);
        pencere.add(textAlani);                                     //Yaratılan her modül ekleniyor
        pencere.setVisible(true);                                   //Pencereyi görünür kıl

    }

    public static void main(String[] args) {

        Calculator baslat = new Calculator();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numButon[i])
                textAlani.setText(textAlani.getText().concat(String.valueOf(i)));
        }
        if (e.getSource() == desimButon) {
            textAlani.setText(textAlani.getText().concat("."));
        }
        if (e.getSource() == ekleButon) {
            num1 = Double.parseDouble(textAlani.getText());
            operatorler = '+';
            textAlani.setText("");
        }
        if (e.getSource() == cikButon) {
            num1 = Double.parseDouble(textAlani.getText());
            operatorler = '-';
            textAlani.setText("");
        }
        if (e.getSource() == carpButon) {
            num1 = Double.parseDouble(textAlani.getText());
            operatorler = '*';
            textAlani.setText("");
        }
        if (e.getSource() == bolButon) {
            num1 = Double.parseDouble(textAlani.getText());
            operatorler = '/';
            textAlani.setText("");
        }
        if (e.getSource() == esitButon) {
            num2 = Double.parseDouble(textAlani.getText());

            switch (operatorler) {
                case '+':
                    sonuc = num1 + num2;
                    break;
                case '-':
                    sonuc = num1 - num2;
                    break;
                case '*':
                    sonuc = num1 * num2;
                    break;
                case '/':
                    sonuc = num1 / num2;
                    break;
            }
            textAlani.setText(String.valueOf(sonuc));
            num1 = sonuc;
        }
        if (e.getSource() == temizButon) {
            textAlani.setText("");
        }
        if (e.getSource() == silButon) {
            String string = textAlani.getText();
            textAlani.setText("");
            for (int i = 0; i < string.length() - 1; i++) {
                textAlani.setText(textAlani.getText() + string.charAt(i));
            }
        }
        if (e.getSource() == negButon) {
            double temp = Double.parseDouble(textAlani.getText());
            temp *= -1;
            textAlani.setText(String.valueOf(temp));
        }
    }
}
