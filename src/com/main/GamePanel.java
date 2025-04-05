package com.main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {

    public static final int WIDTH=1280;
    public static final int LENGTH=720;
    final int FPS=60;
    Thread gameThread;
    PlayManager playManager;


    // we need to create a game loop , which updates and draw the screen
    // @FPS i.e. we will update and draw the screen 60 times per second
    // here

    public GamePanel(){
        this.setPreferredSize(new Dimension(WIDTH,LENGTH));
        this.setBackground(Color.black);
        this.setLayout(null);

        playManager=new PlayManager();
    }

    public void launchGame(){
        gameThread=new Thread(this);
        gameThread.start();
    }

    @Override
    public void run(){
        // game loop
        double drawInterval=1000000000/FPS;
        double delta=0;
        long lastTime=System.nanoTime();
        long currentTime;

        while(gameThread!=null){
            currentTime=System.nanoTime();
            delta+=(currentTime - lastTime)/drawInterval;
            lastTime=currentTime;

            if(delta>=1){
                update();
                repaint();
                delta--;
            }
        }

    }

    public void update(){
        playManager.update();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D) g;
        playManager.draw(g2);
    }

}
