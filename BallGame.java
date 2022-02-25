public class BallGame{
    public static void main(String[] args) {
        Ball ball1 = new Ball(125, 125, 25,"BLUE");
        GameArena game1 = new GameArena(250,250);
        game1.addBall(ball1);
        ball1.setXPosition(125);
        ball1.setYPosition(125);
        double i = ball1.getXPosition();
        double q = ball1.getYPosition();
        while (i<250)
        {
            
            ball1.setXPosition(i+1);
            i= i+1;
            game1.pause();
            
        }
        while (q>=0)
        {
            ball1.setXPosition(ball1.getXPosition()-1);
            ball1.setYPosition(q-1);
            q= q-1;
            game1.pause();
        }

        
    }
}
   

    

