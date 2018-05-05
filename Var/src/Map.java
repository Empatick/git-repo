public class Map {
    public static Cell[][] maps = new Cell[8][8];
    Map(){
        Cell cell = new Cell();
        cell.newOrk(3 ,2);
        maps[3][2] = cell;

        Cell cell1 = new Cell();
        cell1.newHumen(3 , 3);
        maps[3][3] = cell1;
    }

}
