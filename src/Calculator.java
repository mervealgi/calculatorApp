import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    JFrame pencere;                                                 //Uygulama dış çerçevesi
    JTextField textAlani;                                           //Input girilecek alanlar
    JButton[] numButon = new JButton[10];                         //Tutulan buton sayıları
    JButton[] fonksButon = new JButton[8];
    JButton ekleButon, cikButon, bolButon, carpButon;
    JButton desimButon, silButon, temizButon, esitButon;
    JPanel panel;
    Font pencereFontu = new Font("Calibri",Font.BOLD,12);

    double num1, num2, sonuc = 0;
    char operatorler;

    Calculator(){

        pencere = new JFrame("Calculator");                     //Uygulama dış çerçevesi yaratıldı
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pencere.setSize(420,550);
        pencere.setLayout(null);

        textAlani = new JTextField();                               //Input alanı yaratıldı
        textAlani.setBounds(50,25,300,50);      //Input alanı ayarlandı
        textAlani.setFont(pencereFontu);

        ekleButon = new JButton("+");
        cikButon = new JButton("-");
        carpButon = new JButton("*");
        bolButon = new JButton("/");
        esitButon = new JButton("=");
        desimButon = new JButton(".");
        silButon = new JButton("Sil");
        temizButon = new JButton("Temizle");

        fonksButon[0] = ekleButon;
        fonksButon[1] = cikButon;
        fonksButon[2] = carpButon;
        fonksButon[3] = bolButon;
        fonksButon[4] = esitButon;
        fonksButon[5] = desimButon;
        fonksButon[6] = silButon;
        fonksButon[7] = temizButon;



        pencere.add(textAlani);                                     //Yaratılan her modül ekleniyor
        pencere.setVisible(true);                                   //Pencereyi görünür kıl

    }

    public static void main(String[] args){

        Calculator baslat = new Calculator();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
