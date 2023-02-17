import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class SmallBall extends Actor
{
    private int offsetX = 5;
    private int offsetY = 5;
    private static int nextOffset = 5;
    private int counterAddObject = 30;
    
    public SmallBall(){
        offsetX = nextOffset;
        offsetY = nextOffset;
        
        nextOffset += 3;
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
        
        Linu linu = (Linu)getOneIntersectingObject(Linu.class);
       
        if(linu != null && counterAddObject == 0){
            World world = getWorld();
            counterAddObject = 100;
            LittleBoomb lilBoomb = new LittleBoomb();
            world.addObject(lilBoomb, getX() * -1, getY() * -1);
        }
        if(counterAddObject > 0 ){
            counterAddObject--;
        }
    }
}
