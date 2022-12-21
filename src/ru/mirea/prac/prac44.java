package ru.mirea.prac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class prac44 extends JFrame {
    JPanel[] pnl = new JPanel[3];
    public static  int madridScore = 0;
    public static int milanScore = 0;
    public String lastScorer = "N/A";
    public String winner = "DRAW";
    public String name1 = "AC Milan";
    public String name2 = "Real Madrid";


    public prac44(){
        // установка названия, размера и разметки приложения
        super("Milan X Madrid");
        setSize(500,100);
        setLayout(new GridLayout(1,3));

        // делем область на 3 панели
        pnl[0] = new JPanel();
        pnl[1] = new JPanel();
        pnl[2] = new JPanel();

        // создаем 2 кнопки
        JButton bt1 = new JButton("AC Milan");
        JButton bt2 = new JButton("Real Madrid");

        // создаем 3 надписи
        // (о победителе, о последнем забивающем, о настоящем результате)
        JLabel nameWinner = new JLabel("Winner: "+ winner);
        JLabel lastScore = new JLabel("Last Scorer: "+ lastScorer);
        JLabel result = new JLabel("Result: "+ milanScore+" X "+madridScore);

        // размещаем все надписи по центру
        nameWinner.setHorizontalAlignment(SwingConstants.CENTER);
        lastScore.setHorizontalAlignment(SwingConstants.CENTER);
        result.setHorizontalAlignment(SwingConstants.CENTER);

        // добавляем кнопки в левый и правый панели
        pnl[0].add(bt1,SwingConstants.CENTER);
        pnl[2].add(bt2,SwingConstants.CENTER);

        // делаем вертикальную разметку середней панели и добавляем в нее надписи
        pnl[1].setLayout(new GridLayout(3,1));
        pnl[1].add(nameWinner,SwingConstants.CENTER);
        pnl[1].add(lastScore,SwingConstants.CENTER);
        pnl[1].add(result,SwingConstants.CENTER);

        // добавляем созданые панели в приложение/в фрейм
        add(pnl[0]);
        add(pnl[1]);
        add(pnl[2]);

        // кодим нажатие на кнопки
        bt1.addActionListener((ActionEvent e) -> {
            milanScore+=1;
            result.setText("Result: "+ milanScore+" X "+madridScore);
            lastScorer = name1;
            lastScore. setText("Last Scorer: "+ lastScorer);
            if (milanScore==madridScore)
                nameWinner.setText("Winner: DRAW");
            else if (milanScore<madridScore)
                nameWinner.setText("Winner: "+ name2);
            else if (milanScore>madridScore)
                nameWinner.setText("Winner: "+ name1);

        });

        bt2.addActionListener((ActionEvent e) -> {
            madridScore+=1;
            result.setText("Result: "+ milanScore+" X "+madridScore);
            lastScorer = name2;
            lastScore. setText("Last Scorer: "+ lastScorer);
            if (milanScore==madridScore)
                nameWinner.setText("Winner: DRAW");
            else if (milanScore<madridScore)
                nameWinner.setText("Winner: "+ name2);
            else if (milanScore>madridScore)
                nameWinner.setText("Winner: "+ name1);


        });


    }

    public static void main(String[]args)
    {
        new prac44().setVisible(true);
    }
}
