public class Hero {
    public int live;
    public int domage;
    public int move;
    public String race;
    public int x;

    public int getX() {
        return x;
    }

    public int y;
    public int getY(){
        return  y;
    }
    Hero(String race , int live , int domage , int move , int x , int y){
        this.race = race;
        this.live = live;
        this.domage = domage;
        this.move = move;
        this.x = x;
        this.y = y;
    }
}
