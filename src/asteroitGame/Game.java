package asteroitGame;
import com.sun.source.doctree.AttributeTree;

import java.awt.Color;
import java.awt.event.KeyEvent;

public class Game {

    public static void main(String[] args)
    {
       double x=0.5;
       double y=0.5;

        Window window = new Window();
        window.drawWindow();

        Menu m = new Menu();
        m.menu();

        Map map = new Map();
        spaceShip ship = new spaceShip();

        StdDraw.enableDoubleBuffering();
        while (true)
        {
            /*
            if(StdDraw.isMousePressed())
                System.out.println("\n Mouse_X :"+StdDraw.mouseX()+" Mouse_Y :"+StdDraw.mouseY());//DEBUG Purpose
            */
            if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT) || StdDraw.isKeyPressed(KeyEvent.VK_A) ){
                //StdDraw.enableDoubleBuffering();
                x = x - 0.01;
                if (x == 0.495)
                    System.out.println("Bum Be");
                StdDraw.clear(Color.black);
                map.printMap();
                /*StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.text(x, y, "<");*/
                StdDraw.picture(x,y,"spaceShip.png",0.03,0.05,-90);
                StdDraw.show();
                StdDraw.pause(20);
                ship.consumeFuel(1);
            }
            else if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT) || StdDraw.isKeyPressed(KeyEvent.VK_D) ){
                //StdDraw.enableDoubleBuffering();
                x = x + 0.01;
                StdDraw.clear(Color.black);
                map.printMap();
                /*StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.text(x, y, ">");*/
                StdDraw.picture(x,y,"spaceShip.png",0.03,0.05,90);
                StdDraw.show();
                StdDraw.pause(20);
                ship.consumeFuel(1);
            }
            else if (StdDraw.isKeyPressed(KeyEvent.VK_UP) || StdDraw.isKeyPressed(KeyEvent.VK_W) ){
                //StdDraw.enableDoubleBuffering();
                y = y + 0.01;
                StdDraw.clear(Color.black);
                map.printMap();
                /*StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.text(x, y, "^");*/
                StdDraw.picture(x,y,"spaceShip.png",0.03,0.05);
                StdDraw.show();
                StdDraw.pause(20);
                ship.consumeFuel(1);
            }
            else if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN) || StdDraw.isKeyPressed(KeyEvent.VK_S) ){
                //StdDraw.enableDoubleBuffering();
                y = y - 0.01;
                StdDraw.clear(Color.black);
                map.printMap();
                /*StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.text(x, y, "v");*/
                StdDraw.picture(x,y,"spaceShip.png",0.03,0.05,180);
                StdDraw.show();
                StdDraw.pause(20);
                ship.consumeFuel(1);
            }
        }

    }


}
