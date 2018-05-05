import javax.swing.*;
import java.awt.*;

public class GameField extends JPanel {
    final int  SCALE = 40;
    final int x = 8;
    final int y = 8;


    GameField(){
        setBackground(Color.BLACK);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        grid(g);

        //Human human = new Human(4, 4);
        //paintHuman(g , human);

        paintMap(g);
    }

    public void grid(Graphics g) {
        g.setColor(Color.WHITE);

        for (int i = 1; i < x; i++) {
            g.drawLine(i * SCALE, 0, i * SCALE, y * SCALE);
        }

        for (int i = 1; i < y; i++) {
            g.drawLine(0, i * SCALE, y * SCALE, i * SCALE);
        }
    }

    public void paintHuman(Graphics g , Human human){
        g.setColor(Color.green);
        //g.drawOval(human.x * SCALE , human.y *SCALE - 1, SCALE -2 , SCALE -2);
        g.fillOval(human.x * SCALE + 1 , human.y * SCALE + 1 , SCALE -2 , SCALE -2);
    }

    public void paintHero(Graphics g ,Hero hero){
        System.out.println("paint");
        if(hero.race.equals("Ork")) {
            g.setColor(Color.RED);
        }else if(hero.race.equals("Humen")){
            g.setColor(Color.green);
        }
        g.fillOval(     hero.x * SCALE + 1 , hero.y * SCALE + 1 , SCALE -2 , SCALE -2);
    }

    public void paintMap(Graphics g){
        Map map = new Map();
        for (int i = 0 ; i < x; i++){
            for(int j = 0 ; j < y ;j++) {
                System.out.println(i + " " + j);;
                if(map.maps[i][j] == null) {

                }else if(map.maps[i][j].hero.race.equals("Humen")){
                    System.out.println("Humen");;
                    paintHero(g , map.maps[i][j].hero);
                }else if(map.maps[i][j].hero.race == "Ork"){
                    System.out.println("Ork");
                    paintHero(g , map.maps[i][j].hero);
                }
            }
        }
    }

}
