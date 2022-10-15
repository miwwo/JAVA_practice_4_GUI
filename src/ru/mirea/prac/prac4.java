package ru.mirea.prac;

import javax.swing.*;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;

public class prac4 extends JFrame {

    JPanel[] pnl = new JPanel[3];
    int madridScore = 0;
    int milanScore = 0;

    public String lastScorer = "N/A";
    public String winner = "DRAW";

    public String name1 = "AC Milan";
    public String name2 = "Real Madrid";


    public prac4(){
        super("Milan X Madrid");
        setSize(500,100);

        setLayout(new GridLayout(1,3));

        pnl[0]=new JPanel();
        JButton bt1 = new JButton("AC Milan");
        pnl[0].add(bt1,SwingConstants.CENTER);
        add(pnl[0]);

        pnl[1] = new JPanel();
        pnl[1].setLayout(new GridLayout(3,1));
        JLabel nameWinner = new JLabel("Winner: "+ winner);
        pnl[1].add(nameWinner,SwingConstants.CENTER);
        nameWinner.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel lastScore = new JLabel("Last Scorer: "+ lastScorer);
        pnl[1].add(lastScore,SwingConstants.CENTER);
        lastScore.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel result = new JLabel("Result: "+ milanScore+" X "+madridScore);

        pnl[1].add(result,SwingConstants.CENTER);
        result.setHorizontalAlignment(SwingConstants.CENTER);
        add(pnl[1]);

        pnl[2] = new JPanel();
        JButton bt2 = new JButton("Real Madrid");
        pnl[2].add(bt2,SwingConstants.CENTER);
        add(pnl[2]);

       bt1.addActionListener((ActionEvent e) -> {
            milanScore+=1;
            result.setText("Result: "+ milanScore+" X "+madridScore);
            lastScorer = name1;
            lastScore. setText("Last Scorer: "+ lastScorer);
            if (milanScore>madridScore)
                nameWinner.setText("Winner: "+ name1);
            else
                nameWinner.setText("Winner: "+ name2);
        });
        bt2.addActionListener((ActionEvent e) -> {
            madridScore+=1;
            result.setText("Result: "+ milanScore+" X "+madridScore);
            lastScorer = name2;
            lastScore. setText("Last Scorer: "+ lastScorer);
            if (milanScore>madridScore)
                nameWinner.setText("Winner: "+ name1);
            else
                nameWinner.setText("Winner: "+ name2);
        });

    }

    public static void main(String[]args)
    {
        new prac4().setVisible(true);
    }
}
