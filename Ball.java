// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable {
    private int xSpeed;
    private int ySpeed;

    public Ball() {
        super(200, 200, 10,10,Color.black);
        xSpeed = 3;
        ySpeed = 1;
    }

    public Ball(int x, int y) {
        super(x, y);
        xSpeed = 3;
        ySpeed = 1;
    }

    public Ball(int x, int y, int w, int h) {
        super(x, y, w, h);
        xSpeed = 3;
        ySpeed = 1;
    }

    public Ball(int x, int y, int w, int h, Color col) {
        super(x, y, w, h, col);
        xSpeed = 3;
        ySpeed = 1;
    }

    public Ball(int x, int y, int w, int h, int xS, int yS){
        super(x, y, w, h);
        xSpeed = xS;
        ySpeed = yS;
    }

    public Ball(int x, int y, int w, int h, Color col, int xS, int yS) {
        super(x, y, w, h, col);
        xSpeed = xS;
        ySpeed = yS;
    }

    // add the other Ball constructors
    // like block look at BallTestOne and BallTestTwo to determine what constructors you need


    // add the set methods


    public void setXSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void moveAndDraw(Graphics window) {
        //draw a white ball at old ball location
        draw(window, Color.white);

        setX(getX() + xSpeed);
        //setY
        setY(getY() + ySpeed);

        //draw the ball at its new location
        draw(window);
    }

    public boolean equals(Object obj) {
        Ball other = (Ball) obj;
        return (super.equals(other) && getXSpeed() == other.getXSpeed() && getYSpeed() == other.getYSpeed());
    }

    //add the get methods

    public int getXSpeed() {
        return xSpeed;
    }

    public int getYSpeed() {
        return ySpeed;
    }

    //add a toString() method

    public String toString() {
        return "" + super.toString() + " " + xSpeed + " " + ySpeed;
    }

    public boolean didCollideLeft(Object obj)
    {
        Block leftPaddle = (Block) obj;
        return ((getX() <= (leftPaddle.getX() + leftPaddle.getWidth() + Math.abs(getXSpeed())))
            && (((getY() >= leftPaddle.getY()) && (getY() <= (leftPaddle.getY() + leftPaddle.getHeight()))) ||
            (((getY() + getHeight()) >= leftPaddle.getY()) && ((getY() + getHeight()) < (leftPaddle.getY() + leftPaddle.getHeight()))))
            );
    }

    public boolean didCollideRight(Object obj){
        Block rightPaddle = (Block)obj;
        return ((getX() + getWidth() >= (rightPaddle.getX() + Math.abs(getXSpeed())))
                && (((getY() >= rightPaddle.getY()) && (getY() <= (rightPaddle.getY() + rightPaddle.getHeight()))) ||
                (((getY() + getHeight()) >= rightPaddle.getY()) && ((getY() + getHeight()) < (rightPaddle.getY() + rightPaddle.getHeight()))))
        );
    }

    public boolean didCollideTop(Object obj){
        return(getY() <= 10);
    }

    public boolean didCollideBottom(Object obj){
        return (getY() + getHeight() <= 500);
    }
}
