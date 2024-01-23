package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;
    private double scale=2.0;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void ctverec() {

        zofka.move(50*scale);
        zofka.turnRight(90);
        zofka.move(50*scale);
        zofka.turnRight(90);
        zofka.move(50*scale);
        zofka.turnRight(90);
        zofka.move(50*scale);
        zofka.turnRight(90);
    }

    public void ramenaStrisky() {
        double ramenoStrisky = Math.sqrt(50 * 50 + 50 * 50) / 2.0;

        zofka.penDown();
        zofka.turnRight(45);
        zofka.move(ramenoStrisky * scale);
        zofka.turnRight(90);
        zofka.move(ramenoStrisky * scale);
        zofka.penUp();
            //todo střecha začíná na vrcholu ne na straně

    }
    public void navraceniPoStrisce(){
        // tady změnit na getx a gety
        zofka.turnRight(45);
        zofka.move(50*scale);
        zofka.turnRight(90);
        zofka.move(50*scale);
        zofka.turnRight(90);
            //todo opravit na začátek?? jestli použiji teleport tak zvážit
    }

    public void nozicky(){
        // tady změnit na getx a gety
        double ramenoStrisky = Math.sqrt(50 * 50 + 50 * 50) / 2.0;

        zofka.penDown();
        zofka.turnRight(45);
        zofka.move(ramenoStrisky * (scale/2));
        zofka.turnRight(90);
        zofka.move(ramenoStrisky * (scale/2));
        zofka.penUp();
            //TODO dodělej!!!
    }

    public void start() {
        zofka = new Turtle();

            //TODO tady bude kód

        // domeček

        ctverec();

        zofka.move(50*scale);

        ramenaStrisky();

        navraceniPoStrisce();

        //zofka.turnRight(45);
        nozicky();

        // nohy zadat jako zmenšenou stříšku
        // rohy nohou si ulozit pomoci getx a gety, poté přesouvat želvičku na dané souřadnice

        // prasátko




        /*


        zofka.penUp();
        zofka.move(75);
        zofka.turnRight(180);
        zofka.penDown();
        zofka.move(35);
        zofka.turnRight(90);
        zofka.move(35);
        zofka.turnRight(45);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(50);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(50);
        zofka.penDown();
        zofka.turnRight(45);
        zofka.move(15);



    zofka.turnRight(45);
    zofka.move(90);
    zofka.turnLeft(90);
    zofka.move(90);

    zofka.penDown();
    zofka.turnLeft(45);
    zofka.move(35);
    zofka.turnRight(90);
    zofka.move(35);
*/

    }


}
