package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;

import javax.swing.JPanel;

public class Gameplay extends JPanel implements KeyListener, ActionListener{
	
	private boolean play =false;
	
	private int score = 0;
	
	private int totalBricks = 21;
	
	private Timer timer;
	
	private int delay = 8;
	
	private int playerX = 310;
	
	private int ballposX= 120;
	
	private int ballposY = 350;
	
	private int ballXdir = -1;
	
	private int ballYdir = -2;
	
	public Gameplay() {
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		timer = new Timer(delay, this);
		timer.start();
	}
	
	public void print(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(1, 1, 692, 592);
		
		g.setColor(Color.yellow);
		g.fillRect( 0, 0, 4, 562);
		g.fillRect(0, 0, 692, 3);
		g.fillRect(691, 0, 3, 592);
		
		g.setColor(Color.blue);
		g.fillRect(playerX, 550, 100, 8);
		
		g.setColor(Color.green);
		g.fillOval(ballposX, ballposY, 20, 20);
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
