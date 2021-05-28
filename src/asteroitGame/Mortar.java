package asteroitGame;

import java.util.ArrayList;

public class Mortar extends Gun{

    private int existMortar;
    private int maxMortart;

    Mortar() {existMortar=2; maxMortart=2;}

    @Override
    public void fire(int a, double b, double c, Map map) {
        int selection, collision;;
        double[] positionArr;
        boolean test=false;
        ArrayList<Asteroit> Asteroits = map.getAsteroitsArray();
        System.out.println("Mortar num: "+ existMortar);
        while (existMortar > 0)
        {
            if(StdDraw.isMousePressed() && mouseLocation()[0] != b && mouseLocation()[1] != c)
            {
                positionArr = mouseLocation();

                for (int j = 0; j < Asteroits.size(); j++) {
                    collision = Game.hitAsteroid(Asteroits.get(j), positionArr[0], positionArr[1]);
                    if (collision != 0) {
                        Asteroits.get(j).destroyAsteroid();
                        test = true;
                        break;
                    }
                }
                StdDraw.picture(mouseLocation()[0], mouseLocation()[1], "laserBullet.png", 0.1, 0.1, 0);
                if (test) {
                    existMortar--;
                    StdDraw.show();
                    map.printMap();
                    break;
                }
                else {
                    existMortar--;
                    StdDraw.show();
                    map.printMap();
                    break;
                }

            }
        }
    }

    @Override
    public int hitWall(int a, int b) {
        return 0;
    }

    private double[] mouseLocation() {
        double[] arr = new double[2];
        arr[0]=StdDraw.mouseX();
        arr[1]=StdDraw.mouseY();
        return arr;
    }

    public int getExistMortar() {return existMortar;};

    public int getMaxMortart() {return maxMortart;};
}
