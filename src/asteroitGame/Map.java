package asteroitGame;

import java.awt.*;

public class Map {
    private int row, col, score;
    private float mapLeftX,mapRightX,mapUpY,mapDownY;

    public Map(){  //Set map's row and column
        score = 0;
        mapLeftX = 0;
        mapRightX = 0;
        mapDownY = 0;
        mapUpY = 0;
    }



    public void printMap()
    {
        setWalls();
        setSpaceShip();
        setAsteroits();
    }

    private void setWalls()
    {
        StdDraw.clear(Color.BLACK);
        StdDraw.setPenColor(Color.red);
        StdDraw.setPenRadius(0.04);
        StdDraw.rectangle(0.498, 0.505, 0.495, 0.47);
    }

    private void setSpaceShip()
    {
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "^");
    }

    private void setAsteroits()
    {
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.2, 0.8, "*");
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.8, 0.2, "*");
    }

    /*
    public int hitWall(int, int);
    public int hitAsteroid(Asteroit&, int, int);
    public void MortarFire(Asteroit&, int, int);
     */
}
