//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing {

    private int speed;
    private Color c;
    public Ammo() {
        this(0, 0, 0);
        c = Color.YELLOW;
    }

    public Ammo(int x, int y) {
        //add code
        super(x, y);
        c = Color.YELLOW;
    }

    public Ammo(int x, int y, int s) {
        //add code
        super(x, y); speed = s; c = Color.YELLOW;
    }

    public void setSpeed(int s) {
        //add code
        speed = s;
    }

    public int getSpeed() {
        return speed;
    }

    public void draw(Graphics window) {
        //add code to draw the ammo
        window.fillRect(getX(), getY(), getWidth(), getHeight());
    }

    public void move(String direction) {
        //add code to draw the ammo
        setY(getY() + speed);
    }

    public void moveDraw(Graphics window){
        window.setColor(Color.BLACK);
        window.fillRect(getX(), getY(), getWidth(), getHeight());
        move("t");
        window.setColor(c);
        window.fillRect(getX(), getY(), getWidth(), getHeight());
    }
    public String toString() {
        return "";
    }
}
