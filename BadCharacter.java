public class BadCharacter {
    
    public int i=0;
    private Rectangle[] recArray;
    
    public BadCharacter()
    {   
        recArray = new Rectangle[4];
        recArray[0] = new Rectangle(125,110,15,15,"BLUE");
        recArray[1] = new Rectangle(110,110,15,15,"BLUE");
        recArray[2] = new Rectangle(140,110,15,15,"BLUE");
        recArray[3] = new Rectangle(125,125,15,15,"BLUE");

    }
    public void BaddTo(GameArena gameArena)
    {
        for (int i=0; i<recArray.length; i++)
        gameArena.addRectangle(recArray[i]);
    }
    
}
