//package Tiktaktoe;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TikTakToe implements ActionListener {

    Random random = new Random();
    JFrame Frame = new JFrame();
    JPanel buttun_Panel = new JPanel();
    JPanel title_panel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean Player1_Turn;

    TikTakToe() {
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setSize(800, 800);
        Frame.getContentPane().setBackground(new Color(50, 50, 50));
        Frame.setLayout(new BorderLayout());
        Frame.setVisible(true);

        textfield.setBackground(new Color(25, 25, 0));
        textfield.setForeground(new Color(25, 255, 0));
        textfield.setFont(new Font("Ink Free", Font.BOLD, 75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Tic_Tac_Toe");
        textfield.setOpaque(true);

        buttun_Panel.setLayout(new GridLayout(3, 3));
        buttun_Panel.setBackground(new Color(150, 150, 150));

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttun_Panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boil", Font.BOLD, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0, 0, 800, 100);
        title_panel.add(textfield);
        Frame.add(title_panel, BorderLayout.NORTH);
        Frame.add(buttun_Panel);
        firstTurn();

    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i]) {
                if (Player1_Turn) {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(new Color(55, 230, 221));
                        buttons[i].setText("X");
                        Player1_Turn = false;
                        textfield.setText("O turn");
                        check();
                    }
                } else {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(new Color(0, 154, 25));
                        buttons[i].setText("O");
                        Player1_Turn = true;
                        textfield.setText("X turn");
                        check();
                    }
                }
            }
        }
    }

    public void firstTurn() {
        // Disable all buttons initially
        for (JButton button : buttons) {
            button.setEnabled(false);
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Randomly select the starting player
        if (random.nextInt(2) == 0) {
            Player1_Turn = true;
            textfield.setText("X turn!!!");
        } else {
            Player1_Turn = false;
            textfield.setText("O turn!!!");
        }

        // Enable buttons after determining the first turn
        for (JButton button : buttons) {
            button.setEnabled(true);
        }
    }

    public void check() {

        //X's turn
        if ((buttons[0].getText() == "X")
                && (buttons[1].getText() == "X")
                && (buttons[2].getText() == "X")) {
            xWins(0, 1, 2);
        }
        if ((buttons[3].getText() == "X")
                && (buttons[4].getText() == "X")
                && (buttons[5].getText() == "X")) {
            xWins(3, 4, 5);
        }
        if ((buttons[6].getText() == "X")
                && (buttons[7].getText() == "X")
                && (buttons[8].getText() == "X")) {
            xWins(6, 7, 8);
        }
        if ((buttons[0].getText() == "X")
                && (buttons[3].getText() == "X")
                && (buttons[6].getText() == "X")) {
            xWins(0, 3, 6);
        }
        if ((buttons[1].getText() == "X")
                && (buttons[4].getText() == "X")
                && (buttons[7].getText() == "X")) {
            xWins(1, 4, 7);
        }
        if ((buttons[2].getText() == "X")
                && (buttons[5].getText() == "X")
                && (buttons[8].getText() == "X")) {
            xWins(2, 5, 8);
        }
        if ((buttons[0].getText() == "X")
                && (buttons[4].getText() == "X")
                && (buttons[8].getText() == "X")) {
            xWins(0, 4, 8);
        }

        if ((buttons[2].getText() == "X")
                && (buttons[4].getText() == "X")
                && (buttons[6].getText() == "X")) {
            xWins(2, 4, 6);
        }

        //O's Turn1
        if ((buttons[0].getText() == "O")
                && (buttons[1].getText() == "O")
                && (buttons[2].getText() == "O")) {
            oWins(0, 1, 2);
        }
        if ((buttons[3].getText() == "O")
                && (buttons[4].getText() == "O")
                && (buttons[5].getText() == "O")) {
            oWins(3, 4, 5);
        }
        if ((buttons[6].getText() == "O")
                && (buttons[7].getText() == "O")
                && (buttons[8].getText() == "O")) {
            oWins(6, 7, 8);
        }
        if ((buttons[0].getText() == "O")
                && (buttons[3].getText() == "O")
                && (buttons[6].getText() == "O")) {
            oWins(0, 3, 6);
        }
        //de_bes
        if ((buttons[1].getText() == "O")
                && (buttons[4].getText() == "O")
                && (buttons[7].getText() == "O")) {
            oWins(1, 4, 7);
        }
        if ((buttons[2].getText() == "O")
                && (buttons[5].getText() == "O")
                && (buttons[8].getText() == "O")) {
            oWins(2, 5, 8);
        }
        if ((buttons[0].getText() == "O")
                && (buttons[4].getText() == "O")
                && (buttons[8].getText() == "O")) {
            oWins(0, 4, 8);
        }
        if ((buttons[2].getText() == "O")
                && (buttons[4].getText() == "O")
                && (buttons[6].getText() == "O")) {
            oWins(2, 4, 6);
        }
        boolean isDraw = true;
        for (int i = 0; i < 9; i++) {
            if (buttons[i].getText().equals("")) {
                isDraw = false;
                break;
            }
        }
        if (isDraw) {
            for (int i = 0; i < 9; i++) {
                buttons[i].setBackground(Color.RED);
                textfield.setText("Draw!!!");
            }
        }

        isDraw();
    }

    // x Won
    public void xWins(int a, int b, int c) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        textfield.setText("X Won!!!!");

    }

    //o won
    public void oWins(int a, int b, int c) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        textfield.setText("O Won!!!!");
    }

    //Draw
    public boolean isDraw() {
        return Player1_Turn;

    }
}
