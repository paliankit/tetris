package com.main;

import javax.swing.*;

public class Main {

    public static void main(String[] main){

        JFrame window =new JFrame("Tetris");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        //add game panel to window
        GamePanel gamePanel=new GamePanel();
        window.add(gamePanel);
        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gamePanel.launchGame();

    }
}
