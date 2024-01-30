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

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(500);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.penDown();

        domecek();
        posunMeziDomecky();

        domecek();
        posunMeziDomecky();

        domecek();
        posunMeziDomecky();

        domecek();
        posunMeziDomecky();

        domecek();
        posunMeziDomecky();

        domecek();

        zofka.penUp();
        zofka.turnLeft(45);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnRight(90);

        slunicko();

        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(150);


        zofka.turnLeft(90);
        zofka.move(400);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.penDown();

        domecek();

        zofka.penUp();
        zofka.turnRight(45);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(340);
        zofka.turnRight(90);
        zofka.move(35);
        zofka.penDown();

        prasatko();

        zofka.penUp();
        zofka.turnLeft(135);
        zofka.move(410);
        zofka.turnLeft(90);
        zofka.move(135);
        zofka.turnRight(180);
        zofka.penDown();

        domecek();

//TODO dodělat jmeno

    }

    public void domecek() {
        ctverec(100);

        zofka.penUp();
        zofka.move(50 * scale);
        zofka.penDown();

        ramenaStrisky();
    }

    public void prasatko() {
        zofka.penDown();
        zofka.turnLeft(90);
        ctverec(100);
        nozicky();
        zofka.turnLeft(45);
        zofka.move(100);
        nozicky();
        zofka.turnLeft(45);
        ramenaStrisky();
    }

    public void ctverec(int delkaStrany) {
        for (int i = 0; i < 4; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(90);
        }
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
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(ramenoStrisky * (scale / 2));
    }

    public void posunMeziDomecky() {
        zofka.penUp();
        zofka.turnRight(45);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.penDown();
    }

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
        int delkaPaprsku = krok * 8;
        int opakovaniProPaprsky = 360 / otoceni;
        int cetnostPaprsku = opakovaniProPaprsky / pocetPaprsku;
        for (int i = 0; i < opakovaniProPaprsky; i++) {
            zofka.move(krok);
            zofka.turnRight(otoceni);

            if (i % cetnostPaprsku == 0) {
                zofka.penDown();
                zofka.turnLeft(90);
                zofka.move(delkaPaprsku);
                zofka.turnLeft(180);
                zofka.move(delkaPaprsku);
                zofka.turnLeft(90);
                zofka.penUp();
            }
        }
    }
}

