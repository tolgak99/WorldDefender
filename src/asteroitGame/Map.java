package asteroitGame;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Map {
    private int row, col, score;
    private double rectangleStart_X,rectangleStart_Y, rectangleHalfWidth, rectangleHalfHeight, rectanglePenRadius;
    private double mapLeftX,mapRightX,mapUpY,mapDownY;

    static boolean InitializeMap_Test=true;

    //static int debug_count=0;//DEBUG Purpose..

    private ArrayList<Asteroit> AsteroitsArray = new ArrayList<Asteroit>();
    spaceShip ship;

    public Map(){  //Set map's row and column
        score = 0;

        //Initialize parameters of rectangle.
        rectangleStart_X=0.498;
        rectangleStart_Y= 0.536;
        rectangleHalfWidth=0.495;
        rectangleHalfHeight=0.45;
        rectanglePenRadius=0.04;

        //Calculation of borders.
        mapLeftX = rectangleStart_X-rectangleHalfWidth;
        mapRightX =rectangleStart_X+rectangleHalfWidth;
        mapDownY = rectangleStart_Y-rectangleHalfHeight;
        mapUpY = rectangleStart_Y+rectangleHalfHeight;

        ship = new spaceShip();
    }



    public void printMap()
    {
        /*
        debug_count++;
        System.out.println("debug_count : "+debug_count);
        */

        setWalls();
        printAsteroits();
        if(InitializeMap_Test) {
            setAsteroits();
            setSpaceShip();
            InitializeMap_Test=false;
        }


    }


    private void setWalls()
    {
        StdDraw.clear(Color.BLACK);//Clears screen and prints blank black screen.
        StdDraw.setPenColor(Color.red);
        StdDraw.setPenRadius(rectanglePenRadius);
        StdDraw.rectangle(rectangleStart_X, rectangleStart_Y, rectangleHalfWidth, rectangleHalfHeight);
    }


    private void setSpaceShip()
    {
        StdDraw.picture(ship.getXcoord(),ship.getYcoord(),"spaceShip.png",0.03,0.05);
    }


    //Creation part of asteroids.
    private void setAsteroits()
    {
        int num0, num1, num2,i;
        Random rand = new Random();

        num0 = (int)rand.nextInt(20)+1;
        num1 = (int)rand.nextInt(30)+1;
        num2 = (int)rand.nextInt(40)+1;


        for(i=0;i<num0;i++){
            Small_ast newbie_small_ast = new Small_ast();
            AsteroitsArray.add(newbie_small_ast);
            AsteroitsArray.get(i).calculater();
            AsteroitsArray.get(i).print();
        }

        //System.out.println(num0+" num1:"+num1+" num2:"+num2);//DEBUG Purpose..

    }


    //Print asteroid function for each frame.
    private void printAsteroits(){
        for(int i=0;i<AsteroitsArray.size();i++){
            AsteroitsArray.get(i).print();
        }
    }


    //double array first element represents x axis, and second element represents y axis. (example: double[0] = x, double[1] = y;)
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


    public spaceShip getShip() {return ship;}



    /*
    public int hitWall(int, int);
    public int hitAsteroid(Asteroit&, int, int);
    public void MortarFire(Asteroit&, int, int);
     */
}
