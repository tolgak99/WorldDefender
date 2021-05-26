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

        while (true)
        {
            /*
            if(StdDraw.isMousePressed())
                System.out.println("\n Mouse_X :"+StdDraw.mouseX()+" Mouse_Y :"+StdDraw.mouseY());//DEBUG Purpose
            */


            StdDraw.enableDoubleBuffering();
            if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT) ){
                StdDraw.enableDoubleBuffering();
                x = x - 0.01;
                StdDraw.clear(Color.black);
                map.printMap();
                /*StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.text(x, y, "<");*/
                StdDraw.picture(x,y,"spaceShip.png",0.03,0.05,-90);
                StdDraw.show();
                StdDraw.pause(20);
            }
            else if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)){
                StdDraw.enableDoubleBuffering();
                x = x + 0.01;
                StdDraw.clear(Color.black);
                map.printMap();
                /*StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.text(x, y, ">");*/
                StdDraw.picture(x,y,"spaceShip.png",0.03,0.05,90);
                StdDraw.show();
                StdDraw.pause(20);
            }
            else if (StdDraw.isKeyPressed(KeyEvent.VK_UP)){
                StdDraw.enableDoubleBuffering();
                y = y + 0.01;
                StdDraw.clear(Color.black);
                map.printMap();
                /*StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.text(x, y, "^");*/
                StdDraw.picture(x,y,"spaceShip.png",0.03,0.05);
                StdDraw.show();
                StdDraw.pause(20);
            }
            else if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN)){
                StdDraw.enableDoubleBuffering();
                y = y - 0.01;
                StdDraw.clear(Color.black);
                map.printMap();
                /*StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.text(x, y, "v");*/
                StdDraw.picture(x,y,"spaceShip.png",0.03,0.05,180);
                StdDraw.show();
                StdDraw.pause(20);
            }
        }

    }
}
