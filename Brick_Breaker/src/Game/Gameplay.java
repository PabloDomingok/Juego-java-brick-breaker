package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


import javax.swing.JPanel;
import javax.swing.Timer;

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
	
	private MapGenerator map;
	
	public Gameplay() {
		map = new MapGenerator(3, 7);
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		timer = new Timer(delay, this);
		timer.start();
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(1, 1, 692, 592);
		
		map.draw((Graphics2D) g);
		
		g.setColor(Color.yellow);
		g.fillRect( 0, 0, 4, 592);
		g.fillRect(0, 0, 692, 3);
		g.fillRect(691, 0, 3, 592);
		
		g.setColor(Color.blue);
		g.fillRect(playerX, 550, 100, 8);
		
		g.setColor(Color.green);
		g.fillOval(ballposX, ballposY, 20, 20);
		
		g.dispose();
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		timer.start();
		
		if(play) {
			
			//la interacción entre la bola y el pedal
			
			if(new Rectangle(ballposX,ballposY, 20, 30).intersects(new Rectangle(playerX, 550, 100, 8))) {
			     
				
			ballYdir = -ballYdir;
					}
			for(int i =0; i<map.map.length;i++) {
				for(int j=0;j<map.map[0].length; j++) {
					if(map.map[i][j]>0) {
						int brickX =j*map.brickWidth+80;
						int brickY =i*map.brickHeight+50;
						int brickwidth =map.brickWidth;
						int brickHeight=map.brickHeight;
						
						Rectangle rect =new Rectangle(brickX, brickY, brickwidth, brickHeight) ;
						Rectangle ballRect =new Rectangle(ballposX, ballposY, 20,20);
						Rectangle brickRect=  rect;
						
						if(ballRect.intersects(brickRect)) {
							map.setBrickValue(0, i, j);
							totalBricks--;
							score+=5;
							if(ballposX+19<=brickRect.x || ballposY+1>=brickRect.x+brickRect.width) {
								ballXdir = -ballYdir;
							}
							else {
								ballYdir = -ballYdir;
							}
						}
							
						
					}
				}
			}
			   
			
			ballposX += ballXdir;
			ballposY += ballYdir;
			if(ballposX<0) {
				ballXdir = -ballXdir;
				
			   }
			if(ballposY<0) {
				ballYdir = -ballYdir;
		
			}
			if(ballposX >670) {
				ballXdir = -ballXdir; 
			}
		}
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		
		if(arg0.getKeyCode()==KeyEvent.VK_RIGHT){
			if(playerX>=600) {
				playerX=600;
			}
			else {
				moveRight();
			}
			
		}
		if(arg0.getKeyCode()==KeyEvent.VK_LEFT){
			if(playerX<=10) {
				playerX=10;
			}
			else {
				moveLeft();
			}
		}
	}	
		public void moveRight() {
			play = true;
			playerX +=20;
		}
		public void moveLeft() {
			play = true;
			playerX -=20;
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
