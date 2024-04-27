package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame implements ActionListener {

    private final char PLAYER_X = 'X';
    private final char PLAYER_O = 'O';
    private char currentPlayer;
    private JButton[] buttons;
    private boolean gameOver;

    public TicTacToe() {
        super("Tic Tac Toe");
        setLayout(new GridLayout(3, 3));
        currentPlayer = PLAYER_X;
        gameOver = false;

        buttons = new JButton[9];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            buttons[i].setFont(new Font("Arial", Font.BOLD, 40));
            buttons[i].addActionListener(this);
            add(buttons[i]);
        }

        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        int clickedIndex = 0;
        for (int i = 0; i < buttons.length; i++) {
            if (buttons[i] == clickedButton) {
                clickedIndex = i;
                break;
            }
        }

        if (gameOver) {
            return;
        }

        if (buttons[clickedIndex].getText().isEmpty()) {
            buttons[clickedIndex].setText(String.valueOf(currentPlayer));
            checkWinner();
            togglePlayer();
        }
    }

    private void checkWinner() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (isMatch(buttons[3 * i].getText(), buttons[3 * i + 1].getText(), buttons[3 * i + 2].getText())) {
                declareWinner(buttons[3 * i].getText().charAt(0));
                return;
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (isMatch(buttons[i].getText(), buttons[i + 3].getText(), buttons[i + 6].getText())) {
                declareWinner(buttons[i].getText().charAt(0));
                return;
            }
        }

        // Check diagonals
        if (isMatch(buttons[0].getText(), buttons[4].getText(), buttons[8].getText())) {
            declareWinner(buttons[0].getText().charAt(0));
            return;
        }
        if (isMatch(buttons[2].getText(), buttons[4].getText(), buttons[6].getText())) {
            declareWinner(buttons[2].getText().charAt(0));
            return;
        }

        // Check for draw
        boolean isDraw = true;
        for (JButton button : buttons) {
            if (button.getText().isEmpty()) {
                isDraw = false;
                break;
            }
        }
        if (isDraw) {
            gameOver = true;
            JOptionPane.showMessageDialog(this, "It's a Draw!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private boolean isMatch(String text1, String text2, String text3) {
        return !text1.isEmpty() && text1.equals(text2) && text2.equals(text3);
    }

    private void declareWinner(char winner) {
        gameOver = true;
        String message = "Player " + winner + " Wins!";
        JOptionPane.showMessageDialog(this, message, "Game Over", JOptionPane.INFORMATION_MESSAGE);
    }

    private void togglePlayer() {
        currentPlayer = currentPlayer == PLAYER_X ? PLAYER_O : PLAYER_X;
    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}
