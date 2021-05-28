package asteroitGame;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Map {
    private int row, col,shipRot;
    private double rectangleStart_X,rectangleStart_Y, rectangleHalfWidth, rectangleHalfHeight, rectanglePenRadius;
    private double mapLeftX,mapRightX,mapUpY,mapDownY;

    static boolean InitializeMap_Test=true;

    //static int debug_count=0;//DEBUG Purpose..

    private ArrayList<Asteroit> AsteroitsArray = new ArrayList<Asteroit>();


    spaceShip ship;
    Mortar mortar;
    private Font newFont;

    public Map(){  //Set map's row and column

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

        shipRot = 0;
        ship = new spaceShip();
        mortar = new Mortar();
        newFont= new Font("Arial", Font.BOLD, 120);

    }



    public void printMap()
    {
        /*
        debug_count++;
        System.out.println("debug_count : "+debug_count);
        */

        setWalls();          // Must be on the top, it clears the map!!
        printAsteroits();

        newFont =new Font("Arial", Font.BOLD, 20);
        StdDraw.setFont(newFont);
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.picture(0.78,0.055,"gascan.png",0.06,0.06);
        StdDraw.text(0.8,0.05, Integer.toString(ship.getFuel()) );

        StdDraw.picture(0.84,0.055,"spaceShip.png",0.02,0.03);
        StdDraw.text(0.87,0.05, Integer.toString(ship.getArmor()) );

        StdDraw.picture(0.90,0.050,"Mortar.png",0.02,0.03);
        StdDraw.text(0.93,0.05, Integer.toString(mortar.getExistMortar()) + "/" + Integer.toString(mortar.getMaxMortart()) );

        setSpaceShip();
        if(InitializeMap_Test) {
            setAsteroits();
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
        StdDraw.picture(ship.getXcoord(),ship.getYcoord(),"spaceShip.png",0.03,0.05, ship.getRotation());
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
        for(;i<num0+num1;i++){
            Medium_ast newbie_small_ast = new Medium_ast();
            AsteroitsArray.add(newbie_small_ast);
            AsteroitsArray.get(i).calculater();
            AsteroitsArray.get(i).print();
        }
        for(;i<num0+num1+num2;i++){
            Large_ast newbie_small_ast = new Large_ast();
            AsteroitsArray.add(newbie_small_ast);
            AsteroitsArray.get(i).calculater();
            AsteroitsArray.get(i).print();
        }

        System.out.println(num0+" num1 : "+num1+" num2 : "+num2+" Total array size : "+AsteroitsArray.size());//DEBUG Purpose..
    }


    //Print asteroid function for each frame.
    private void printAsteroits(){
        for(int i=0;i<AsteroitsArray.size();i++){
            if(AsteroitsArray.get(i).isActive)
                AsteroitsArray.get(i).print();
        }
    }

    public spaceShip getShip() {return ship;}

    public Mortar getMortar() {return mortar;}

    public ArrayList<Asteroit> getAsteroitsArray() {
        return AsteroitsArray;
    }

    /*
    public int hitWall(int, int);
    public void MortarFire(Asteroit&, int, int);
     */
}
