package asteroitGame;
import com.sun.source.doctree.AttributeTree; // will be check if it is necessary.


import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Game {

    private static int score;

    private Menu m;
    private Map map;
    private spaceShip ship;
    private Turret turret;
    private Mortar mortar;

    public Menu getMenu() {
        return m;
    }

    public Map getMap() {
        return map;
    }

    public Mortar getMortar() {
        return mortar;
    }

    public Turret getTurret() {
        return turret;
    }

    public spaceShip getShip() {
        return ship;
    }


    public Game() {
        score = 0;

        m = new Menu();
        map = m.getMap();
        ship = map.getShip();
        turret = new Turret();
        mortar = map.getMortar();
    }


    public static int hitAsteroid(Asteroit obj, double x, double y){
        double[] arr= obj.getCoordinates();

        if(!obj.isActive && obj.fuelActive ){
            obj.removeFuel();
            return -1;
        }

        if ((Math.abs(arr[0]-x)< 0.022)&& (Math.abs(arr[1]-y)<0.022) && obj.isActive){
            return obj.getDamage();
        }
        else
            return 0;
    }

    public static void increaseScore (int point) {score += point;}

    private void resetGame(){
        Game game = new Game();

    }

    public static int getScore()
    {
        return score;
    }

    public static void main(String[] args)
    {
        int i, collision,button=KeyEvent.VK_UP;
        double x=0.5;
        double y=0.5;

        Window window = new Window();
        window.drawWindow();

        while(true) {
            Game game = new Game();

            Menu m = game.getMenu();
            m.menu();

            Map map = game.getMap();
            spaceShip ship = game.getShip();
            Turret turret = game.getTurret();
            Mortar mortar = game.getMortar();


            ArrayList<Asteroit> Asteroits = map.getAsteroitsArray();

            StdDraw.enableDoubleBuffering();

            while(m.getMenuId() !=1){

            }

            x=ship.getXcoord();
            y=ship.getYcoord();

            while (m.getMenuId() == 1) {
            /*
            if(StdDraw.isMousePressed())
                System.out.println("\n Mouse_X :"+StdDraw.mouseX()+" Mouse_Y :"+StdDraw.mouseY());//DEBUG Purpose
            */

                if (ship.getFuel() > 0 && ship.getArmor() > 0) {

                    if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT) || StdDraw.isKeyPressed(KeyEvent.VK_A)) {
                        button = KeyEvent.VK_LEFT;
                        x = x - 0.01;
                        ship.setXcoord(x);
                        if (ship.getXcoord() <= 0.007) {
                            x = 0.03;
                            ship.setXcoord(x);
                            ship.getDamage(10);
                        } else {
                            StdDraw.clear(Color.black);
                            map.printMap();
                            ship.setRotation(-90);
                            StdDraw.show();
                            StdDraw.pause(20);
                            ship.consumeFuel(1);
                        }


                        for (i = 0; i < Asteroits.size(); i++) {
                            collision = hitAsteroid(Asteroits.get(i), x, y);
                            if (collision > 0) {
                                ship.getDamage(collision);
                                Asteroits.get(i).destroyAsteroid();
                            }
                            else if(collision<0){
                                ship.increaseFuel();
                            }


                        }


                    } else if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT) || StdDraw.isKeyPressed(KeyEvent.VK_D)) {
                        button = KeyEvent.VK_RIGHT;
                        x = x + 0.01;
                        ship.setXcoord(x);
                        if (ship.getXcoord() >= 0.985) {
                            x = 0.09;
                            ship.setXcoord(x);
                            ship.consumeFuel(1);
                        } else {
                            StdDraw.clear(Color.black);
                            map.printMap();
                            ship.setRotation(90);
                            StdDraw.show();
                            StdDraw.pause(20);
                            ship.consumeFuel(1);
                        }


                        for (i = 0; i < Asteroits.size(); i++) {
                            collision = hitAsteroid(Asteroits.get(i), x, y);
                            if (collision > 0) {
                                ship.getDamage(collision);
                                Asteroits.get(i).destroyAsteroid();
                            }
                            else if(collision<0){
                                ship.increaseFuel();
                            }


                        }


                    } else if (StdDraw.isKeyPressed(KeyEvent.VK_UP) || StdDraw.isKeyPressed(KeyEvent.VK_W)) {
                        button = KeyEvent.VK_UP;
                        y = y + 0.01;
                        ship.setYcoord(y);
                        if (ship.getYcoord() >= 0.9851) {
                            y = 0.9;
                            ship.setYcoord(y);
                            ship.consumeFuel(1);
                        } else {
                            StdDraw.clear(Color.black);
                            map.printMap();
                            ship.setRotation(0);
                            StdDraw.show();
                            StdDraw.pause(20);
                            ship.consumeFuel(1);
                        }


                        for (i = 0; i < Asteroits.size(); i++) {
                            collision = hitAsteroid(Asteroits.get(i), x, y);
                            if (collision > 0) {
                                ship.getDamage(collision);
                                Asteroits.get(i).destroyAsteroid();
                            }
                            else if(collision<0){
                                ship.increaseFuel();
                            }


                        }


                    } else if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN) || StdDraw.isKeyPressed(KeyEvent.VK_S)) {
                        button = KeyEvent.VK_DOWN;
                        y = y - 0.01;
                        ship.setYcoord(y);
                        if (ship.getYcoord() <= 0.064) {
                            y = 0.06;
                            ship.setYcoord(y);
                            ship.consumeFuel(1);
                        } else {
                            StdDraw.clear(Color.black);
                            map.printMap();
                            ship.setRotation(180);
                            StdDraw.show();
                            StdDraw.pause(20);
                            ship.consumeFuel(1);
                        }


                        for (i = 0; i < Asteroits.size(); i++) {
                            collision = hitAsteroid(Asteroits.get(i), x, y);
                            if (collision > 0) {
                                ship.getDamage(collision);
                                Asteroits.get(i).destroyAsteroid();
                            }
                            else if(collision<0){
                                ship.increaseFuel();
                            }


                        }


                    }  else if (StdDraw.isKeyPressed(KeyEvent.VK_ENTER)) {
                        mortar.fire(button, ship.getXcoord(), ship.getYcoord(), map);
                    } else if (StdDraw.isKeyPressed(KeyEvent.VK_ESCAPE)) {
                        m.setClick_test(true);
                        m.setMenuId(0);
                        game.resetGame();
                        break;
                    }
                    if (StdDraw.isKeyPressed(KeyEvent.VK_SPACE)) {
                        StdAudio.play("sounds/lasergun.wav");
                        turret.fire(button, ship.getXcoord(), ship.getYcoord(), map);
                    }
                } else {
                    m.setClick_test(true);
                    m.setMenuId(0);
                    game.resetGame();
                    break;
                }
            }
            map.InitializeMap_Test = true;
        }

    }

}
