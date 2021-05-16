package asteroitGame;
import java.awt.Color;

public class Window {

    private int width;
    private int heigth;
    private int backgroundColor;
    Color[] colors = new Color[10];

    Window()
    {
        width = 1920;
        heigth = 1080;
        backgroundColor = 0;

        colors[0]=Color.black;
        colors[1]=Color.green;
        colors[2]=Color.red;
        colors[3]=Color.cyan;
        colors[4]=Color.yellow;
        colors[5]=Color.white;
        colors[6]=Color.magenta;
        colors[7]=Color.darkGray;
        colors[8]=Color.pink;
        colors[9]=Color.orange;
    }

    public void drawWindow ()
    {
        StdDraw.setCanvasSize(width, heigth);
        StdDraw.setPenColor(colors[backgroundColor]);
        StdDraw.filledSquare(1.0, 1.0, 1.0);
    }

    public void clearWindow()
    {
        StdDraw.clear(StdDraw.BLACK);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
}
