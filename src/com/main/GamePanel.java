package com.main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    public static final int WIDTH=1280;
    public static final int LENGTH=720;

    public GamePanel(){
        this.setPreferredSize(new Dimension(WIDTH,LENGTH));
        this.setBackground(Color.black);
        this.setLayout(null);
    }

}
