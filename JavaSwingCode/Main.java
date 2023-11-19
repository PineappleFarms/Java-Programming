package JavaSwingCode;

import java.awt.*;

public class Main {
  public static void main(String[] args) {  
    World world = new World(400,400);
    Turtle yertle = new Turtle(world);
    // Add your own code in here 
    yertle.setColor(Color.blue);
    
    yertle.forward();
    yertle.turn(60);
    yertle.turnRight();
    yertle.forward();
    yertle.turn(-120);
    yertle.forward();
    yertle.turn(150);
    yertle.forward();
    
    
    world.setVisible(true);
  }
}
