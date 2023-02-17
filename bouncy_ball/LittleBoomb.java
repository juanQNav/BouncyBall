import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class LittleBoomb extends Actor
{
     private int offsetX = 5;
    private int offsetY = 5;
    private static int nextOffset = 5;
    
    public LittleBoomb(){
        offsetX = nextOffset;
        offsetY = nextOffset;
        
        nextOffset+=2;
    }
    
    public void act()
    {
        int x = getX();
        int y = getY();
        
        setLocation(x + offsetX, y + offsetY);
        
        if(getY() >= 370 || getY() <= 0){
            offsetY *= -1;
        }
        if(getX() >= 570 || getX() <= 0){
            offsetX *= -1;
        }

    }
}
