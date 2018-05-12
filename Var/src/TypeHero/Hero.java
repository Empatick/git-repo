package TypeHero;

public abstract class Hero  {
    Move move;

    public void setMove(Move move) {
        this.move = move;
    }


    private int live;
    private int domage;
    private int speed;

    public String getRace() {
        return race;
    }

    private String race;
    private String name;
    private int x;

    public int getX() {
        return x;
    }

    private int y;
    public int getY(){
        return y;
    }


    protected Hero(String race , String name, int live, int domage, int speed, int x, int y){
        this.race = race;
        this.name = name;
        this.live = live;
        this.domage = domage;
        this.speed = speed;
        this.x = x;
        this.y = y;

        System.out.println(this);
    }

    public void atack(){

    }

    public void move(){
        move.move();
    }


}
