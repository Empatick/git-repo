import javax.swing.*;
import java.awt.*;
import java.awt.image.VolatileImage;

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
        paintMob(g);

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


    public void paintHero(Graphics g ,Hero hero){
        System.out.println("paint");
        if(hero.race.equals("Ork")) {
            g.setColor(Color.RED);
        }else if(hero.race.equals("Humen")){
            g.setColor(Color.green);
        }
        g.fillOval(     hero.x * SCALE + 1 , hero.y * SCALE + 1 , SCALE -2 , SCALE -2);
    }


    public void paintMob(Graphics g){
        DataObject dataObject = new DataObject();
        for(int i = 0; i < dataObject.heroList.size(); i++){
            switch (dataObject.heroList.get(i).race){
                case "Humen":
                    System.out.println("Humen");
                case "Ork":
                    System.out.println("Ork");
            }
        }

    }
}
