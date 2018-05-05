public class Cell {

    Hero hero;

    public void newOrk(int x, int y) {
        Ork ork = new Ork(x, y);
        hero = ork;
    }

    public void newHumen(int x, int y) {
        Human human = new Human(x, y);
        hero = human;
    }
}