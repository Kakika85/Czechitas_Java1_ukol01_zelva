package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;
    private double scale = 2.0;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        zofka = new Turtle();
        zofka.setSpeed(200);

        /* před automatickou teleportací
        zofka.setLocation(250, 250);

        //posunMeziDomecky();

        domecek();
        //posunMeziDomecky();
        zofka.setLocation(400, 250);

        domecek();
        //posunMeziDomecky();
        zofka.setLocation(550, 250);

        domecek();
//        posunMeziDomecky();
        zofka.setLocation(700, 250);

        domecek();
//        posunMeziDomecky();
        zofka.setLocation(850, 250);

        domecek();
        */

        for (int i = 0; i < 6; i++) {
            zofka.setLocation(150 + i * 150, 225);
            domecek();
        }

        zofka.setLocation(1100, 75);
        slunicko();

        zofka.setLocation(150, 450);
        domecek();

        zofka.setLocation(900, 450);
        domecek();

        zofka.setLocation(600, 450);
        prasatko();

        pismenka();
    }

    public void domecek() {
        ctverec(100);

        zofka.move(50 * scale);

        ramenaStrisky();

        zofka.turnLeft(135);
        zofka.setLocation(zofka.getX() - 100, zofka.getY() - 100);
    }

    public void prasatko() {
        zofka.turnLeft(90);

        ctverec(100);

        nozicky();

        zofka.turnLeft(45);
        zofka.move(100);

        nozicky();

        zofka.turnLeft(45);

        ramenaStrisky();

        zofka.turnRight(45);
        zofka.move(100);

        ocasek();

        zofka.turnUp();   //todo přidala jsem si funkci na vyresetování rotace Žofky :-)
    }

    public void ocasek() {
        int otoceni = 20;
        int krok = 6;
        int[] x = {5, 5, 5, 4, 4, 3, 2, 2, 1, 0, 0, 0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 2, 2, 2};

        zofka.penDown();
        for (int i = 0; i < 25; i++) {
            zofka.move(krok + x[i] * 2);
            zofka.turnLeft(otoceni + i / 10);
        }
        zofka.penUp();
        zofka.turnRight(80);
    }

    public void ctverec(int delkaStrany) {
        zofka.penDown();
        for (int i = 0; i < 4; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(90);
        }
        zofka.penUp();
    }

    public void ramenaStrisky() {
        double ramenoStrisky = Math.sqrt(50 * 50 + 50 * 50) / 2.0;

        zofka.penDown();
        zofka.turnRight(45);
        zofka.move(ramenoStrisky * scale);
        zofka.turnRight(90);
        zofka.move(ramenoStrisky * scale);
        zofka.penUp();
    }

    public void nozicky() {
        double ramenoStrisky = Math.sqrt(50 * 50 + 50 * 50) / 2.0;

        zofka.penDown();
        zofka.turnLeft(45);
        zofka.move(ramenoStrisky * (scale / 2));
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(ramenoStrisky * (scale / 2));
        zofka.turnRight(90);
        zofka.penDown();
        zofka.move(ramenoStrisky * (scale / 2));
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(ramenoStrisky * (scale / 2));
    }

    /* Nahrazeno teleportací
    public void posunMeziDomecky() {
        zofka.penUp();
        zofka.turnRight(45);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.penDown();
    }*/

    public void slunicko() {
        zofka.penDown();

        //krok kruhu
        int otoceni = 4;
        int krok = 3;
        int opakovani = 360 / otoceni;

        for (int i = 0; i < opakovani; i++) {
            zofka.move(krok);
            zofka.turnRight(otoceni);
        }

        zofka.penUp();

        //paprsek
        int pocetPaprsku = 6;
        int delkaPaprsku = krok * 10;
        int opakovaniProPaprsky = 360 / otoceni;
        int cetnostPaprsku = opakovaniProPaprsky / pocetPaprsku;
        int j = 0;
        for (int i = 0; i < opakovaniProPaprsky; i++) {
            zofka.move(krok);
            zofka.turnRight(otoceni);

            if (i % cetnostPaprsku == 0) {
                double aktualniDelkaPaprsku = delkaPaprsku*(j++%2==0?1:1.5);
                zofka.penDown();
                zofka.turnLeft(90);
                zofka.move(aktualniDelkaPaprsku);
                zofka.turnLeft(180);
                zofka.move(aktualniDelkaPaprsku);
                zofka.turnLeft(90);
                zofka.penUp();
            }
        }
    }

    public void pismenka() {
        zofka.setLocation(150, 675);
        zofka.turnUp();
        pismenoK();

        zofka.setLocation(300, 675);
        zofka.turnUp();
        pismenoA();

        zofka.setLocation(500, 675);
        zofka.turnUp();
        pismenoK();

        zofka.setLocation(650, 675);
        zofka.turnUp();
        pismenoI();

        zofka.setLocation(750, 675);
        zofka.turnUp();
        pismenoK();

        zofka.setLocation(900, 675);
        zofka.turnUp();
        pismenoA();
    }

    public void pismenoI() {
        zofka.penDown();
        zofka.move(150);
        zofka.penUp();
    }

    public void pismenoK() {
        pismenoI();
        zofka.turnRight(180);
        zofka.move(70);
        zofka.turnLeft(135);
        zofka.penDown();
        zofka.move(95);
        zofka.penUp();
        zofka.turnRight(135);
        zofka.move(145);
        zofka.turnRight(140);
        zofka.penDown();
        zofka.move(100);
    }

    public void pismenoA() {
        zofka.turnRight(22.5);
        pismenoI();
        zofka.turnRight(135);
        pismenoI();
        zofka.turnRight(180);
        zofka.move(50);
        zofka.turnLeft(67.5);
        zofka.penDown();
        zofka.move(70);
    }
}


