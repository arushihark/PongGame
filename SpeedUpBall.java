// A+ Computer Science  -  www.apluscompsci.com
//Name - Anaya Mehta
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball {

    //instance variables - not used


    public SpeedUpBall() {
        super();
    }

    public SpeedUpBall(int x, int y) {
        super(x, y);

    }


    public SpeedUpBall(int x, int y, int xSpd, int ySpd) {
        super(x, y, xSpd, ySpd);
    }

    public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd) {
        super(x, y, wid, ht, xSpd, ySpd);
    }


    public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {

        super(x, y, wid, ht, col, xSpd, ySpd);
    }

    public void setXSpeed(int xSpd) {
        xSpd = -xSpd;
        if (xSpd >= 0) {
            int newSpeed = xSpd + 1;
            super.setXSpeed(-newSpeed);
        } else {
            int pos = Math.abs(xSpd);
            int newSpeed = pos + 1;
            super.setXSpeed(newSpeed);
        }

    }

    public void setYSpeed(int ySpd) {
        ySpd = -ySpd;
        if (ySpd >= 0) {
            int newSpeed = ySpd + 2;
            super.setYSpeed(-newSpeed);
        } else {
            int pos = Math.abs(ySpd);
            int newSpeed = pos + 1;
            super.setYSpeed(newSpeed);
        }


    }
}

