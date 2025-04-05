package com.main.mino;

import com.main.PlayManager;

import java.awt.*;

public class Mino {

    public Block[] b= new Block[4];
    public Block[] tempB=new Block[4];
    int autoDropCounter =0;

    public void create(Color c){
        for(int i=0;i<b.length;i++){
            b[i]=new Block(c);
        }
        for(int i=0;i<tempB.length;i++){
            tempB[i]=new Block(c);
        }
    }

    public void setXY(int x,int y){}
    public void updateXY(int direction){}
    public void update(){
        autoDropCounter++; // the counter increases every frame
        if(autoDropCounter == PlayManager.dropInterval){
            // the mino goes down
            for(int i=0;i<b.length;i++){
                b[i].y += Block.SIZE;
            }
            autoDropCounter=0;
        }
    }
    public void draw(Graphics2D g2){

        int margin=2;
        g2.setColor(b[0].c);
        for(int i=0;i<b.length;i++){
            g2.fillRect(b[i].x + margin, b[i].y + margin,
                    Block.SIZE-(margin*2), Block.SIZE-(margin*2) );
        }
//        g2.fillRect(b[0].x, b[0].y, Block.SIZE, Block.SIZE );
//        g2.fillRect(b[1].x, b[1].y, Block.SIZE, Block.SIZE );
//        g2.fillRect(b[2].x, b[2].y, Block.SIZE, Block.SIZE );
//        g2.fillRect(b[3].x, b[3].y, Block.SIZE, Block.SIZE );
    }
}
