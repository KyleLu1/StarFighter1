//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.io.File;
import java.net.URL;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing {

    private int speed;
    private Image image;

    public Alien() {
        this(0, 0, 30, 30, 0);
        try {
            URL url = getClass().getResource("alien.jpg");
            image = ImageIO.read(url);
        } catch (Exception e) {
            //feel free to do something here
        }
    }

    public Alien(int x, int y) {
        //add code here
        super(x,y); speed = 0;
        try {
            URL url = getClass().getResource("alien.jpg");
            image = ImageIO.read(url);
        } catch (Exception e) {
            //feel free to do something here
        }
    }

    public Alien(int x, int y, int s) {
        //add code here
        super(x,y); speed = s;
        try {
            URL url = getClass().getResource("alien.jpg");
            image = ImageIO.read(url);
        } catch (Exception e) {
            //feel free to do something here
        }
    }

    public Alien(int x, int y, int w, int h, int s) {
        super(x, y, w, h);
        speed = s;
        try {
            URL url = getClass().getResource("alien.jpg");
            image = ImageIO.read(url);
        } catch (Exception e) {
            //feel free to do something here
        }
    }

    public void setSpeed(int s) {
        //add code
        speed = s;
    }

    public int getSpeed() {
        return speed;
    }

    public void move(String direction) {
        //add code here
        setX(getX() + speed);
    }

    public void draw(Graphics window) {
        window.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);
    }
    
    public void dead(Graphics window){
        window.setColor(Color.BLACK);
        window.fillRect(getX(), getY(), getWidth(), getHeight());
    }
    public boolean isBet(int x, int y, int z){
        return x >= y && x <= z;
    }
    
    public boolean isCol(Ammo a){
        int ay = a.getY() + a.getSpeed();
        int ax = a.getX() - this.getSpeed();
        if(isBet(ay, this.getY(), this.getY() + this.getHeight()) || isBet(ay + a.getHeight(), this.getY(), this.getY() + this.getHeight())){
            if(isBet(ax, this.getX(), this.getX() + this.getWidth()) || isBet(ax, this.getX(), this.getX() + this.getWidth())){
                return true;
            }
        }
        return false;
    }
    public String toString() {
        return "";
    }
}
