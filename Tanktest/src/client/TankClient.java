package client;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TankClient extends Frame {

	/**
	 * @author lxh
	 * @version 1.1
	 * @category
	 */
	
	public static void main(String[] args) {
		new TankClient().lauchFrame();
	}
	private int x=50;
	private int y=50;
	@Override
    public void paint(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.RED);
        g.fillOval(x, y, 30, 30);
        g.setColor(c);
 
    }
public void lauchFrame(){
	this.setTitle("lxhÌ¹¿Ë´óÕ½");
	this.setLocation(300, 400);
	this.setSize(300, 300);
   this.setBackground(Color.blue);
   this.addWindowListener(new WindowListener() {
	
	
	
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
});
   this.setResizable(false);
   this.setVisible(true);
   new Thread(new MyRepaint()).start();
   this.addKeyListener(new KeyMonitor());
}
private class MyRepaint implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			repaint();
			try{
				Thread.sleep(50);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
	}
	
}


private class KeyMonitor extends KeyAdapter{
	 
    @Override
    public void keyPressed(KeyEvent e) {
        int key=e.getKeyCode();
        switch(key){
        case KeyEvent.VK_LEFT:
            x -= 5;
            break;
        case KeyEvent.VK_UP:
            y -= 5;
            break;
        case KeyEvent.VK_RIGHT:
            x += 5;
            break;
        case KeyEvent.VK_DOWN:
            y += 5;
            break;
        }
    }


}

}

