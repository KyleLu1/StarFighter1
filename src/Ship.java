//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing {

    private int speed;
    private Image image;

    public Ship() {
        this(10, 10, 10, 10, 10);
        try {
            URL url = getClass().getResource("ship.jpg");
            image = ImageIO.read(url);
        } catch (Exception e) {
            //feel free to do something here
        }
    }

    public Ship(int x, int y) {
        //add code here
        super(x, y);
        try {
            URL url = getClass().getResource("ship.jpg");
            image = ImageIO.read(url);
        } catch (Exception e) {
            //feel free to do something here
        }
    }

    public Ship(int x, int y, int s) {
        //add code here
        super(x,y); speed = s;
        try {
            URL url = getClass().getResource("ship.jpg");
            image = ImageIO.read(url);
        } catch (Exception e) {
            //feel free to do something here
        }
    }

    public Ship(int x, int y, int w, int h, int s) {
        super(x, y, w, h);
        speed = s;
        try {
            URL url = getClass().getResource("ship.jpg");
            image = ImageIO.read(url);
        } catch (Exception e) {
            //feel free to do something here
        }
    }

    public void setSpeed(int s) {
        //add more code
        speed = s;
    }

    public int getSpeed() {
        return speed;
    }

    public void move(String direction) {
        //add code here
        if(direction.equals("RIGHT")){
            setX(getX() + speed);
        }
        else if(direction.equals("LEFT")){
            setX(getX() - speed);
        }
        else if(direction.equals("UP")){
            setY(getY() - speed);
        }
        else if(direction.equals("DOWN")){
            setY(getY() + speed);
        }
    }

    public void draw(Graphics window) {
        window.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);
    }

    public String toString() {
        return super.toString() + getSpeed();
    }
}
