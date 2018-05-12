package TypeHero;

public class OrcSwordsman extends Hero{
    public OrcSwordsman(int x , int y){
        super( "Ork", "Swordsman" , 100 , 10 , 2 , x , y);
        super.setMove(new MoveWalk());
    }

    public String x;



}
