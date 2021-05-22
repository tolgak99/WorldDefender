package asteroitGame;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Map {
    private int row, col, score;
    private double rectangleStart_X,rectangleStart_Y, rectangleHalfWidth, rectangleHalfHeight, rectanglePenRadius;
    private double mapLeftX,mapRightX,mapUpY,mapDownY;

    //private ArrayList<Asteroit> AsteroitsArray = new ArrayList<Asteroit>();

    public Map(){  //Set map's row and column
        score = 0;

        //Initialize parameters of rectangle.
        rectangleStart_X=0.498;
        rectangleStart_Y= 0.505;
        rectangleHalfWidth=0.495;
        rectangleHalfHeight=0.47;
        rectanglePenRadius=0.04;

        //Calculation of borders.
        mapLeftX = rectangleStart_X-rectangleHalfWidth;
        mapRightX =rectangleStart_X+rectangleHalfWidth;
        mapDownY = rectangleStart_Y-rectangleHalfHeight;
        mapUpY = rectangleStart_Y+rectangleHalfHeight;


    }



    public void printMap()
    {
        int num0, num1, num2;
        Random rand = new Random();

        num0 = (int)rand.nextInt(20-10)+10;
        num1 = (int)rand.nextInt(30-10)+10;
        num2 = (int)rand.nextInt(40-10)+10;

        //System.out.println(num0+" num1:"+num1+" num2:"+num2);//Debug Purpose


        setWalls();
        setSpaceShip();
        setAsteroits();


    }

    private void setWalls()
    {
        StdDraw.clear(Color.BLACK);
        StdDraw.setPenColor(Color.red);
        StdDraw.setPenRadius(rectanglePenRadius);
        StdDraw.rectangle(rectangleStart_X, rectangleStart_Y, rectangleHalfWidth, rectangleHalfHeight);
    }

    private void setSpaceShip()
    {
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "^");
    }

    private void setAsteroits()
    {
        double x= 0.003; double y= 0.5;
        
        
/*
        if (coordinates[0] > mapRightX && coordinates[0] < mapLeftX && coordinates[1] > 0.66 && coordinates[1] < 0.75) {


        }
*/
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.2, 0.8, "*");
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.8, 0.2, "*");
    }


    //dobule array first element represents x axis, and second element represents y axis. (example: double[0] = x, double[1] = y;)
    private boolean hitWalls(double[] coordinates) {


        if (coordinates[0] > mapRightX)
        {

        }
        else if(coordinates[0] < mapLeftX){

        }
        else if(coordinates[1] > 0.66){

        }
        else if(coordinates[1] < 0.75){

        }
        return false;
    }

    /*
    public int hitWall(int, int);
    public int hitAsteroid(Asteroit&, int, int);
    public void MortarFire(Asteroit&, int, int);
     */
}
