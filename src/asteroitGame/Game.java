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
            System.out.println("sa");
            StdDraw.enableDoubleBuffering();
            if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT) ){
                StdDraw.enableDoubleBuffering();
                x = x - 0.01;
                StdDraw.clear(Color.black);
                map.printMap();
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.text(x, y, "<");
                StdDraw.show();
                StdDraw.pause(20);
            }
            else if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)){
                StdDraw.enableDoubleBuffering();
                x = x + 0.01;
                StdDraw.clear(Color.black);
                map.printMap();
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.text(x, y, ">");
                StdDraw.show();
                StdDraw.pause(20);
            }
            else if (StdDraw.isKeyPressed(KeyEvent.VK_UP)){
                StdDraw.enableDoubleBuffering();
                y = y + 0.01;
                StdDraw.clear(Color.black);
                map.printMap();
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.text(x, y, "^");
                StdDraw.show();
                StdDraw.pause(20);
            }
            else if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN)){
                StdDraw.enableDoubleBuffering();
                y = y - 0.01;
                StdDraw.clear(Color.black);
                map.printMap();
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.text(x, y, "v");
                StdDraw.show();
                StdDraw.pause(20);
            }
        }

    }
}
