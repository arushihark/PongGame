// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Pong extends AbstractPong {
    private BlinkyBall ball;
    private Paddle leftPaddle;
    private Paddle rightPaddle;
    private int score1;
    private int score2;
    private Block blank;

    public Pong() {
        //set up all variables related to the game
        ball = new BlinkyBall(150,150);
        leftPaddle = new Paddle(80, 250, 10, 80, 4);
        rightPaddle = new Paddle(720, 250, 10, 80, 4);
    }

    public void render(Graphics window) {
        ball.moveAndDraw(window);
        leftPaddle.draw(window);
        rightPaddle.draw(window);
        blank = new Block(300, 500, 200, 100);
        blank.draw(window, Color.white);
        window.setColor(Color.black);
        window.drawString("SCORE", 300, 530);
        window.drawString("Player 1: " + score1, 300, 550);
        window.drawString("Player 2: " + score2, 300, 570);

        //see if ball hits left wall or right wall
        if (!(ball.getX() >= 10 && ball.getX() <= 780)) {

            //ball.setYSpeed(0);
            if (ball.getX() <= 10) {
                score2++;
            }
            if (ball.getX() >= 780) {
                score1++;
            }
            ball.setXSpeed(-(ball.getXSpeed()));
        }


        //see if the ball hits the top or bottom wall
        if (ball.didCollideTop(window) || ball.didCollideBottom(window)) {
            ball.setYSpeed(-ball.getYSpeed());
            //ball.setYSpeed(0);
        }

        //see if the ball hits the left paddle
        if (ball.didCollideLeft(leftPaddle)) {
            if (ball.getX() <= leftPaddle.getX() - Math.abs(ball.getXSpeed())) {
                ball.setYSpeed(-ball.getYSpeed());
            } else
                ball.setXSpeed(-ball.getXSpeed());
        }

        //see if the ball hits the right paddle
        if (ball.didCollideRight(rightPaddle)) {
            if (ball.getX() >= rightPaddle.getX() + rightPaddle.getWidth() - Math.abs(ball.getXSpeed())) {
                ball.setYSpeed(-ball.getYSpeed());
            } else
                ball.setXSpeed(-ball.getXSpeed());
        }

        //see if the paddles need to be moved
        {
            if (keyIsPressed('W')) {
                leftPaddle.moveUpAndDraw(window);
            }

            if (keyIsPressed('Z')) {
                leftPaddle.moveDownAndDraw(window);
            }

            if (keyIsPressed('I')) {
                rightPaddle.moveUpAndDraw(window);
            }

            if (keyIsPressed('M')) {
                rightPaddle.moveDownAndDraw(window);
            }

        }
    }
}
