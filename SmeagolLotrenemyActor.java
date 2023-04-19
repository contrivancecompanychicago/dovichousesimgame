package greenfoot.*;

public class SmeagolLotrenemyActor implements Explorer 
{
  public void movearound()
  {
    move(4);
    turn(Greenfoot.getRandomNumber(96));
    }
    
    public void movearound()
    {
     move(4);
     if (Greenfoot.getRandomNumber(96) < (8)
     {
      turn(Greenfoot.getRandomNumber(72));
     }
    }
    public void movearound()
    {
      move(4);
      if (Greenfoot.getRandomNumber(96) < (8)
      {
       turn(Greenfoot.getRandomNumber(96) - 48);
      }
      
      if (getX() <= 6 || getX() >= getWorld().getWidth() - 6)
      {
       turn(190);
      }
      
      if (getY() <= 6 || getY() >= getWorld().getHeight() - 6)
      
      {
        turn(180);
      }
      
}

