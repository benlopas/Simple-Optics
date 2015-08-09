package SimpleOptics;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import java.awt.color.*;


public class Menu extends BasicGameState {

	public String mouse = "No Input Yet";
	private boolean SomethingIsSelected1 = false;
	private boolean SomethingIsSelected2 = false;
	private boolean SomethingIsSelected3 = false;
	private boolean SomethingIsSelected4 = false;
	private boolean SomethingIsSelected5 = false;
	private boolean SomethingIsSelected6 = false;
	private boolean SomethingIsSelected7 = false;
	private boolean SomethingIsSelected8 = false;
	private boolean SomethingIsSelected9 = false;
	
	
	Image fibre_link;
	int flX = 1300;
	int flY = 0;
	
	Image modulator;
	int mlX = 1300;
	int mlY = 100;
	
	Image link;
	int lkX = 1300;
	int lkY = 200;
	
	Image mirror;
	int mrX = 1300;
	int mrY = 300;
	
	Image laser;
	int laX = 1300;
	int laY = 400;
	
	Image AOM;
	int aoX = 1400;
	int aoY = 0;
	
	Image PD;
	int pdX = 1400;
	int pdY = 100;
	
	Image fs;
	int fsX = 1400;
	int fsY = 200;
	
	Image Mix;
	int miX = 1400;
	int miY = 300;
	
	public Menu(int state){
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg)throws SlickException{
		fibre_link = new Image("res/fibre_link.png");
		modulator = new Image("res/modulator.png");
		link = new Image("res/link.png");
		mirror = new Image("res/mirror.png");
		laser = new Image("res/laser.png");
		AOM = new Image("res/AOM.png");
		PD = new Image("res/PD.png");
		fs = new Image("res/fs.png");
		Mix = new Image("res/Mix.png");
		
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)throws SlickException{
		
		g.setColor(Color.green);
		
		for(int i = 25; i<= 1300; i+=25)
			g.drawLine(i, 0, i,800);
		
		for(int i = 25; i<= 800; i+=25)
		g.drawLine(0, i, 1300,i);
		
		
		g.drawImage(fibre_link, flX, flY);
		g.drawImage(modulator, mlX, mlY);
        g.drawImage(link, lkX, lkY);
        g.drawImage(mirror, mrX, mrY);
		g.drawImage(laser,laX,laY);
		g.drawImage(AOM,aoX,aoY );
		g.drawImage(PD,pdX,pdY );
		g.drawImage(fs,fsX,fsY );
		g.drawImage(Mix,miX,miY );
		
		g.setColor(Color.white);
		g.drawLine(1300, 800, 1300, 0);
		g.drawLine(1400, 800, 1400, 0);
		g.drawLine(1500, 800, 1500, 0);
		g.drawLine(1300, 700, 1600, 700);
		g.drawLine(1300, 600, 1600, 600);
		g.drawLine(1300, 500, 1600, 500);
		g.drawLine(1300, 400, 1600, 400);
		g.drawLine(1300, 300, 1600, 300);
		g.drawLine(1300, 200, 1600, 200);
		g.drawLine(1300, 100, 1600, 100);
		g.drawString(mouse, 90, 10);
		
		}

	
	public void update(GameContainer gc, StateBasedGame sbg, int delta)throws SlickException{
		/*Input input = gc.getInput();
		if(input.isKeyDown(Input.KEY_UP)){flY -= 1;}
		if(input.isKeyDown(Input.KEY_DOWN)){flY += 1;}
		if(input.isKeyDown(Input.KEY_LEFT)){flX -= 1;}
		if(input.isKeyDown(Input.KEY_RIGHT)){flX += 1;}*/
		
		/*Input input1 = gc.getInput();
		int xpos = Mouse.getX();
		int ypos = Mouse.getY();
		if((xpos>400 && xpos<470) && (ypos>350 && ypos<400)){
			if(input1.isMouseButtonDown(0)){
				sbg.enterState(1);
			}
		}*/
		
		Input input2 = gc.getInput();
		int XXpos = Mouse.getX();
		int YYpos = Mouse.getY();
		
		if(Mouse.getEventButton() != -1)
			if((XXpos > laX && XXpos <laX+100) && (YYpos >laY-100 && YYpos<laY))
		     {SomethingIsSelected5 = true;
		     System.out.println("You Clicked on the Laser!");}
			else
				SomethingIsSelected5 = false;
				
		if(Mouse.isButtonDown(0) && SomethingIsSelected5 )
			{				
				laX += Mouse.getDX();
				laY -= Mouse.getDY();
			}
		
		if(Mouse.getEventButton() != -1)
			if((XXpos > aoX && XXpos <aoX+100) && (YYpos >aoY+700 && YYpos<aoY+800))
		     {SomethingIsSelected6 = true;
		     System.out.println("You Clicked on the AOM!");}
			else
				SomethingIsSelected6 = false;
				
		if(Mouse.isButtonDown(0) && SomethingIsSelected6 )
			{				
				aoX += Mouse.getDX();
				aoY -= Mouse.getDY();
			}
		
		
		if(Mouse.getEventButton() != -1)
			if((XXpos > flX && XXpos <flX+100) && (YYpos >flY+700 && YYpos<flY+800))
		     {SomethingIsSelected1 = true;
		     System.out.println("You Clicked on the Fibre_Link!");}
			else
				SomethingIsSelected1 = false;
				
		if(Mouse.isButtonDown(0) && SomethingIsSelected1 )
			{				
				flX += Mouse.getDX();
				flY -= Mouse.getDY();
			}
		
		if(Mouse.getEventButton() != -1)
			if((XXpos > mlX && XXpos <mlX+100) && (YYpos >mlY+500 && YYpos<mlY+600))
		     {SomethingIsSelected2 = true;
		     System.out.println("You Clicked on the Modulator!");}
			else
				SomethingIsSelected2 = false;
				
		if(Mouse.isButtonDown(0) && SomethingIsSelected2 )
			{				
				mlX += Mouse.getDX();
				mlY -= Mouse.getDY();
			}
		
		if(Mouse.getEventButton() != -1)
			if((XXpos > pdX && XXpos <pdX+100) && (YYpos >pdY+500 && YYpos<pdY+600))
		     {SomethingIsSelected7 = true;
		     System.out.println("You Clicked on the Modulator!");}
			else
				SomethingIsSelected7 = false;
				
		if(Mouse.isButtonDown(0) && SomethingIsSelected7 )
			{				
				pdX += Mouse.getDX();
				pdY -= Mouse.getDY();
			}
		
		
		if(Mouse.getEventButton() != -1)
			if((XXpos > lkX && XXpos <lkX+100) && (YYpos >lkY+300 && YYpos<lkY+400))
		     {SomethingIsSelected3 = true;
		     System.out.println("You Clicked on the link!");}
			else
				SomethingIsSelected3 = false;
				
		if(Mouse.isButtonDown(0) && SomethingIsSelected3 )
			{				
				lkX += Mouse.getDX();
				lkY -= Mouse.getDY();
			}
		
		if(Mouse.getEventButton() != -1)
			if((XXpos > fsX && XXpos <fsX+100) && (YYpos >fsY+300 && YYpos<fsY+400))
		     {SomethingIsSelected8 = true;
		     System.out.println("You Clicked on the FS!");}
			else
				SomethingIsSelected8 = false;
				
		if(Mouse.isButtonDown(0) && SomethingIsSelected8 )
			{				
				fsX += Mouse.getDX();
				fsY -= Mouse.getDY();
			}
		
		if(Mouse.getEventButton() != -1)
			if((XXpos > mrX && XXpos <mrX+100) && (YYpos >mrY+100 && YYpos<mrY+200))
		     {SomethingIsSelected4 = true;
		     System.out.println("You Clicked on the mirror!");}
			else
				SomethingIsSelected4 = false;
				
		if(Mouse.isButtonDown(0) && SomethingIsSelected4 )
			{				
				mrX += Mouse.getDX();
				mrY -= Mouse.getDY();
			}
		
		if(Mouse.getEventButton() != -1)
			if((XXpos > miX && XXpos <miX+100) && (YYpos >miY+100 && YYpos<miY+200))
		     {SomethingIsSelected9 = true;
		     System.out.println("You Clicked on the MIX!");}
			else
				SomethingIsSelected9 = false;
				
		if(Mouse.isButtonDown(0) && SomethingIsSelected9 )
			{				
				miX += Mouse.getDX();
				miY -= Mouse.getDY();
			}
	
		
		int Xpos = Mouse.getX();
		int Ypos = Mouse.getY();
		mouse = "Mouse position x: " + Xpos + " y: " +Ypos;
	}
	
	public int getID(){
		return 0;
	}
	
}
