package client;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Tank {
	private int x;
	private int y;
	private static final int WIDTH=20;
    private static final int HEIGHT=20;
    private static final int xSPEED=4;
    private static final int ySPEED=4;
    private boolean d_L,d_U,d_R,d_D;
    public enum Direction{
    	L ,LU,U,RU,R,RD,D,LD,STOP;
    }
private Direction dir=Direction.STOP;
public Tank(int x, int y) {
	
	this.x = x;
	this.y = y;
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public void  draw(Graphics g){
	Color c=g.getColor();
	g.setColor(Color.RED);
	g.fillOval(x, y, 30, 30);
   g.setColor(c);
   move();
}
public void keyMonitor(KeyEvent e){
	int key=e.getKeyCode();
	switch(key){
	
	}
}

}
