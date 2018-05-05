import javax.swing.*;

public class MainWindow extends JFrame {
    static GameField gameField;

    MainWindow(){
        setTitle("Var");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(340 , 360);
        setLocation(400 , 200);
        gameField = new GameField();
        add(gameField);
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
        gameField.repaint();
    }
}
