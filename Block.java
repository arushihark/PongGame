// A+ Computer Science  -  www.apluscompsci.com
//Name - Anaya Mehta
//Date - February 1, 2018
//Class - AP Comp Sci, Period 2
//Lab  - Pong

import java.awt.Color;
import java.awt.Graphics;

public class Block {
    private int xPos;
    private int yPos;
    private int width;
    private int height;

    private Color color;

    public Block() {
        xPos = 100;
        yPos = 150;
        width = 10;
        height = 10;
        color = Color.black;

    }

    public Block(int x, int y, int w, int h) {
        xPos = x;
        yPos = y;
        width = w;
        height = h;
        color = Color.black;
    }

    public Block(int x, int y, int w, int h, Color col) {
        xPos = x;
        yPos = y;
        width = w;
        height = h;
        color = col;
    }

    public Block(int x, int y) {
        xPos = x;
        yPos = y;
        width = 10;
        height = 10;
        color = Color.black;
    }

    public Block (int x, int y, int w){
        xPos = x;
        yPos = y;
        width = w;
        height = 10;
        color = Color.black;

    }

    // add other Block constructors - x , y , width, height, color
    // you can find what constructors you need by looking at BlockTestOne and BlockTestTwo


    public void setColor(Color col) {
        this.color = col;
    }

    public void setPos(int x, int y) {
        this.xPos = x;
        this.yPos = y;

    }

    public void setX(int x) {
        this.xPos = x;
    }

    public void setY(int y) {
        this.yPos = y;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // add the other set methods - DONE
    // you can see what modifier methods to add by looking at the instance variables

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getX() {
        return xPos;
    }

    public int getY() {
        return yPos;
    }

    public Color getColor() {
        return color;
    }

    //add the other get methods
    // you can see what accessor methods to add by looking at the instance variables


    public void draw(Graphics window) {
        //uncomment after you write the set and get methods
        window.setColor(color);
        window.fillRect(getX(), getY(), getWidth(), getHeight());
    }

    // use the draw method provided about to figure out how to complete this method
    public void draw(Graphics window, Color col) {
        window.setColor(col);
        window.fillRect(getX(), getY(), getWidth(), getHeight());

    }

    // review the equals method from book and library
    // show me your completed equals method please
    public boolean equals(Object obj) {
        Block other = (Block) obj;
        return getX() == other.getX() && getY() == other.getY() &&
                getWidth() == other.getWidth() && getHeight() == other.getHeight() &&
                getColor().equals(other.getColor());
    }


    //add a toString() method  - x , y , width, height, color

    public String toString() {
        return "" + xPos + " " + yPos + " " + width + " " + height + " " + color + "";

    }
}
