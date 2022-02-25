public class GoodCharacter
{
    private double X;
    private double Y;
    public int i=0;
    private Rectangle[] recArray;
    
    public GoodCharacter()
    {   
        recArray = new Rectangle[3];
        recArray[0] = new Rectangle(125,125,15,15,"CYAN");
        recArray[1] = new Rectangle(110,110,15,15,"BLUE");
        recArray[2] = new Rectangle(140,140,15,15,"RED");
        
    }

    public void addTo(GameArena gameArena)
    {
        gameArena.addRectangle(recArray[0]);
        gameArena.addRectangle(recArray[1]);
        gameArena.addRectangle(recArray[2]);
    }
    public void moveXright()
    {
        for (int i=0; i<recArray.length; i++)
        { 
            recArray[i].setXPosition(recArray[i].getXPosition() + 1);
        }
    }
    public void moveYup()
    {
        for (int i = 0; i<recArray.length; i++){ 
       recArray[i].setYPosition(recArray[i].getYPosition()+1);
        }
    }
    public void moveYdown()
    {
        for (int i = 0; i<recArray.length; i++){ 
       recArray[i].setYPosition(recArray[i].getYPosition()-1);
        }
    }
    public void moveXleft()
    {
        for (int i = 0; i<recArray.length; i++){ 
       recArray[i].setYPosition(recArray[i].getXPosition()-1);
        }
    }
}
