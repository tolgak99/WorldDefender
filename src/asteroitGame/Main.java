package asteroitGame;
import java.awt.Color;

public class Main {

    public static void main(String[] args)
    {
        // Menu m = new Menu();
        // m.menu();

        createWindow();


    }

    public static void createWindow()
    {
        StdDraw.setCanvasSize(1920, 1080);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(1.0, 1.0, 1.0);
        StdDraw.clear(StdDraw.BLACK);
    }
}
