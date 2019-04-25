//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde()
	{
            aliens = new ArrayList<Alien>();
	}

	public void add(Alien al)
	{
            aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
            for(int i = 0; i < aliens.size(); i++){
                aliens.get(i).draw(window);
            }
	}

	public void moveEmAll()
	{
            for(int i = 0; i < aliens.size(); i++){
                aliens.get(i).move("any");
            }
	}

	public void removeDeadOnes(List<Ammo> shots, Graphics window)
	{
            for(int i = 0; i < shots.size(); i++){
                for(int j = 0; j < aliens.size(); j++){
                    if(aliens.get(j).isCol(shots.get(i))){
                        aliens.get(j).dead(window);
                        aliens.remove(j);
                        j--;
                        shots.remove(i);
                        i--;
                    }
                }
            }
	}

	public String toString()
	{
		return "";
	}
}
