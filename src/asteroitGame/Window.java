package asteroitGame;

public class Window {

    private int width;
    private int heigth;
    private String backgroundColor;

    Window()
    {
        width = 1920;
        heigth = 1080;
        backgroundColor = "BLACK";
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

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
}
