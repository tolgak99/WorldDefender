package asteroitGame;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.lang.ref.Cleaner;

public class Menu {
    private Font newFont;
    private double[] positionArr;
    private int menuId;
    Map map;

    public Menu(){
        menuId = 0;
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
            if(!click_test){
                break;
            }

            if(StdDraw.isMousePressed() && click_test) {
                //System.out.println("\n Mouse_X :"+StdDraw.mouseX()+" Mouse_Y :"+StdDraw.mouseY());//DEBUG Purpose
                positionArr = mouseLocation();
                selection = whichSelection(positionArr);

                switch (selection) {
                    case -1:
                        System.out.println("\n There is an error about pointing.\n\n");
                        break;
                    case 1:
                        //System.out.println("\n PLAYY");//DEBUG Purpose..
                        click_test=false;
                        menuId = 1;
                        map.printMap();
                        break;
                    case 2:
                        System.out.println("\n ABOUTTT");
                        click_test=false;
                        menuId = 2;
                        aboutPage();
                        break;
                    case 3:
                        System.out.println("\n SETTINGSS");
                        click_test=false;
                        menuId = 3;
                        break;
                    case 4:
                        //System.out.println("\n EXITTT \n\n ---- \n\n");//DEBUG Purpose
                        click_test=false;
                        System.exit(0);
                        break;
                }
                StdDraw.pause(200);
            }
        }

    }

    private void entrance(){
        int timeInterval=140;
        double firstWord_Y =0.7;
        double secondWord_Y =0.54;

        StdDraw.setPenColor(StdDraw.WHITE);
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
        StdDraw.pause(timeInterval);
        StdDraw.picture(0.6,0.36,"remastered_logo.png",0.3,0.3);//



        StdDraw.pause(700);
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

        StdDraw.picture(0.022,0.95,"UI_back.png",0.034,0.06);//Back button on the up-left corner.

        newFont =new Font("Arial", Font.BOLD, 32);
        StdDraw.setFont(newFont);
        StdDraw.setPenColor(StdDraw.RED);

        StdDraw.text(0.48,0.96,"GAME PURPOSE");
        StdDraw.text(0.48,0.82,"GAME CONTROLS");
        StdDraw.text(0.48,0.4,"MAP BORDER");
        StdDraw.text(0.48,0.32,"ASTEROITS");

        newFont =new Font("Arial", Font.ITALIC, 24);
        StdDraw.setFont(newFont);
        StdDraw.setPenColor(StdDraw.WHITE);

        StdDraw.text(0.48,0.9,"You are the last hope for the aliens and asteroids attacks to the World. Get in to your spaceship and defend your HOME !!");

        StdDraw.text(0.28,0.66,"Left arrow key for go left.");
        StdDraw.text(0.48,0.68,"Up arrow key for go up.");
        StdDraw.text(0.48,0.64,"Down arrow key for go down.");
        StdDraw.text(0.68,0.66,"Right arrow key for go right.");

        StdDraw.text(0.48,0.56,"When you press enter you need to give coordinates where you want to fire.");

        StdDraw.text(0.48,0.475,"Mortar will shoot these coordinates.");

        StdDraw.text(0.48,0.456,"You can shoot 1 bullet when you press space. If you press and hold you can shoot continuously");

        StdDraw.text(0.48,0.364,"You need to stay away from radiation area or you may die from radiation.");

        StdDraw.text(0.1,0.18,"Health :");
        StdDraw.text(0.1,0.14,"Fuel Can :");
        StdDraw.text(0.1,0.1,"Damage :");

        StdDraw.text(0.24,0.18,"10 (1 hit)");
        StdDraw.text(0.48,0.18,"20 (2 hit)");
        StdDraw.text(0.72,0.18,"30 (3 hit)");

        StdDraw.text(0.24,0.14,"NOT Drop");
        StdDraw.text(0.48,0.14,"Drop");
        StdDraw.text(0.72,0.14,"Drop");

        StdDraw.text(0.24,0.1,"10 Hp");
        StdDraw.text(0.48,0.1,"20 Hp");
        StdDraw.text(0.72,0.1,"30 Hp");


        newFont =new Font("Arial", Font.BOLD, 26);
        StdDraw.setFont(newFont);
        StdDraw.setPenColor(StdDraw.GREEN);

        StdDraw.text(0.48,0.74,"Keyboard Controls");
        StdDraw.text(0.48,0.6,"Enter Key");
        StdDraw.text(0.48,0.52,"Space Key");

        newFont =new Font("Arial", Font.ITALIC, 26);
        StdDraw.setFont(newFont);
        StdDraw.setPenColor(StdDraw.GREEN);

        StdDraw.text(0.48,0.24,"Green Asteroit");

        newFont =new Font("Arial", Font.ITALIC, 26);
        StdDraw.setFont(newFont);
        StdDraw.setPenColor(StdDraw.RED);

        StdDraw.text(0.24,0.24,"Red Asteroit");

        newFont =new Font("Arial", Font.ITALIC, 26);
        StdDraw.setFont(newFont);
        StdDraw.setPenColor(StdDraw.YELLOW);

        StdDraw.text(0.72,0.24,"Yellow Asteroit");

        while (menuId == 2)
        {
            if (StdDraw.isKeyPressed(KeyEvent.VK_ESCAPE) ) {
                menuId = 0;
                menu();
            }
        }

    }

    public Map getMap() {return map;}

    public int getMenuId () {return menuId;}

    public void setMenuId(int menuId) {this.menuId = menuId;}
}
