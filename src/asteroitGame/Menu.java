package asteroitGame;

import java.awt.*;

public class Menu {
    private Font newFont;
    private double[] positionArr;
    Map map;

    public Menu(){
        newFont= new Font("Arial", Font.BOLD, 120);
        entrance();
        map = new Map();
    }

    public void menu() {
        int selection;
        boolean click_test=true;

        StdDraw.clear(StdDraw.BLACK);
        newFont =new Font("Arial", Font.BOLD, 80);
        StdDraw.setFont(newFont);
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.text(0.52,0.7,"PLAY");
        StdDraw.setPenColor(StdDraw.YELLOW);
        StdDraw.text(0.52,0.57,"ABOUT");
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.text(0.52,0.44,"SETTINGS");
        StdDraw.setPenColor(StdDraw.MAGENTA);
        StdDraw.text(0.52,0.31,"EXIT");

        newFont =new Font("Arial", Font.BOLD, 20);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.setFont(newFont);
        StdDraw.text(0.54,0.12,"You can use your mouse to choice from menu or you can use arrow keys, and press enter to choice.");

        while(true){
            if(StdDraw.isMousePressed() && click_test) {
                //System.out.println("\n Mouse_X :"+StdDraw.mouseX()+" Mouse_Y :"+StdDraw.mouseY());//DEBUG Purpose
                positionArr = mouseLocation();
                selection = whichSelection(positionArr);

                switch (selection) {
                    case -1:
                        System.out.println("\n There is an error about pointing.\n\n");
                        break;
                    case 1:
                        System.out.println("\n PLAYY");
                        click_test=false;
                        map.printMap();
                        break;
                    case 2:
                        System.out.println("\n ABOUTTT");
                        click_test=false;
                        aboutPage();
                        break;
                    case 3:
                        System.out.println("\n SETTINGSS");
                        click_test=false;
                        break;
                    case 4:
                        //System.out.println("\n EXITTT \n\n ---- \n\n");//DEBUG Purpose
                        click_test=false;
                        System.exit(0);
                        break;
                }
                StdDraw.pause(200);
            }
/*
            if(key == rlutil::KEY_DOWN){ // Move in main menu
                choose +=1;
            }
            else if(key==rlutil::KEY_UP){ // Move in main menu
                choose -=1;
            }
            if(key==rlutil::KEY_ENTER){ // Choose the selection
                choice==choose;
                rlutil::cls();
                break;

            }

*/
        }


    }

    private void entrance(){
        int timeInterval=140;
        double firstWord_Y =0.7;
        double secondWord_Y =0.54;

        StdDraw.setPenColor(StdDraw.CYAN);
        StdDraw.setFont(newFont);
        StdDraw.text(0.2,firstWord_Y,"W");
        StdDraw.pause(timeInterval);
        StdDraw.text(0.26,firstWord_Y,"O");
        StdDraw.pause(timeInterval);
        StdDraw.text(0.31,firstWord_Y,"R");
        StdDraw.pause(timeInterval);
        StdDraw.text(0.36,firstWord_Y,"L");
        StdDraw.pause(timeInterval);
        StdDraw.text(0.41,firstWord_Y,"D");
        StdDraw.pause(timeInterval);

        StdDraw.text(0.30,secondWord_Y,"D");
        StdDraw.pause(timeInterval);
        StdDraw.text(0.35,secondWord_Y,"E");
        StdDraw.pause(timeInterval);
        StdDraw.text(0.40,secondWord_Y,"F");
        StdDraw.pause(timeInterval);
        StdDraw.text(0.45,secondWord_Y,"E");
        StdDraw.pause(timeInterval);
        StdDraw.text(0.50,secondWord_Y,"N");
        StdDraw.pause(timeInterval);
        StdDraw.text(0.55,secondWord_Y,"D");
        StdDraw.pause(timeInterval);
        StdDraw.text(0.60,secondWord_Y,"E");
        StdDraw.pause(timeInterval);
        StdDraw.text(0.65,secondWord_Y,"R");

        StdDraw.pause(400);
    }

    // Returns a double array which contains x and y coordinates of the mouse location
    private double[] mouseLocation() {
        double[] arr = new double[2];
        arr[0]=StdDraw.mouseX();
        arr[1]=StdDraw.mouseY();
        return arr;
    }


    // Finds and returns the square which the mouse location resides in
    private int whichSelection(double[] mouseLoc) {


        if (mouseLoc[0] > 0.44 && mouseLoc[0] < 0.59 && mouseLoc[1] > 0.66 && mouseLoc[1] < 0.75)
        {
            return 1;
        }
        else if (mouseLoc[0] > 0.42 && mouseLoc[0] < 0.6 && mouseLoc[1] > 0.53 && mouseLoc[1] < 0.63)
        {
            return 2;
        }
        else if (mouseLoc[0] > 0.4 && mouseLoc[0] < 0.63 && mouseLoc[1] > 0.4 && mouseLoc[1] < 0.49)
        {
            return 3;
        }
        else if (mouseLoc[0] > 0.44 && mouseLoc[0] < 0.58 && mouseLoc[1] > 0.27 && mouseLoc[1] < 0.37)
        {
            return 4;
        }
        return -1;
    }

    private void aboutPage() {
        StdDraw.clear(StdDraw.BLACK);
        newFont =new Font("Arial", Font.BOLD, 20);
        StdDraw.setFont(newFont);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.text(0.52,0.01,"Game Purpose");
    }


}
