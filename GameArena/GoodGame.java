public class GoodGame
{
    public static void main(String[] args) 
    {
        GoodCharacter good1 = new GoodCharacter();
        GameArena game2 = new GameArena(250,250);
        good1.addTo(game2);

        while(true)
        {
            if(game2.upPressed())
            {
                good1.moveYup();
            }
            game2.pause();

            if(game2.downPressed())
            {
                good1.moveYdown();
            }
            
            game2.pause();
            if(game2.rightPressed())
            {
                good1.moveXright();
            }
            game2.pause();

            if(game2.leftPressed())
            {
                good1.moveXleft();
            }
            game2.pause();
        }
    }
}
