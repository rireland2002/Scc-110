public class GoodCharacter
{
    private double X;
    private double Y;
    public int i=0;
    private Rectangle[] recArray;
    
    public GoodCharacter()
    {   
        recArray = new Rectangle[4];
        recArray[0] = new Rectangle(125,110,15,15,"RED");
        recArray[1] = new Rectangle(110,110,15,15,"RED");
        recArray[2] = new Rectangle(140,110,15,15,"RED");
        recArray[3] = new Rectangle(125,95,15,15,"RED");

    }

    public void addTo(GameArena gameArena)
    {
        for (int i=0; i<recArray.length; i++)
        gameArena.addRectangle(recArray[i]);
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
       recArray[i].setYPosition(recArray[i].getYPosition()-1);
        }
    }
    public void moveYdown()
    {
        for (int i = 0; i<recArray.length; i++){ 
       recArray[i].setYPosition(recArray[i].getYPosition()+1);
        }
    }
    public void moveXleft()
    {
        for (int i = 0; i<recArray.length; i++){ 
       recArray[i].setXPosition(recArray[i].getXPosition()-1);
        }
    }
}
