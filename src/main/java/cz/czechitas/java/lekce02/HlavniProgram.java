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

        for (int i = 0; i < 6; i++) {
            zofka.setLocation(150 + i * 150, 225);
            drawHouse();
        }

        zofka.setLocation(1100, 75);
        drawSun();

        zofka.setLocation(150, 450);
        drawHouse();

        zofka.setLocation(900, 450);
        drawHouse();

        zofka.setLocation(600, 450);
        drawPig();

        drawLetters();
    }

    public void drawHouse() {
        drawSquare(100);

        zofka.move(50 * scale);

        drawArmsRoof();

        zofka.turnLeft(135);
        zofka.setLocation(zofka.getX() - 100, zofka.getY() - 100);
    }

    public void drawPig() {
        zofka.turnLeft(90);

        drawSquare(100);

        drawLegs();

        zofka.turnLeft(45);
        zofka.move(100);

        drawLegs();

        zofka.turnLeft(45);

        drawArmsRoof();

        zofka.turnRight(45);
        zofka.move(100);

        drawTail();

        zofka.turnUp();
    }

    public void drawTail() {
        int rotation = 20;
        int step = 6;
        int[] x = {5, 5, 5, 4, 4, 3, 2, 2, 1, 0, 0, 0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 2, 2, 2};

        zofka.penDown();
        for (int i = 0; i < 25; i++) {
            zofka.move(step + x[i] * 2);
            zofka.turnLeft(rotation + i / 10);
        }
        zofka.penUp();
        zofka.turnRight(80);
    }

    public void drawSquare(int sideLenght) {
        zofka.penDown();
        for (int i = 0; i < 4; i++) {
            zofka.move(sideLenght);
            zofka.turnRight(90);
        }
        zofka.penUp();
    }

    public void drawArmsRoof() {
        double armRoof = Math.sqrt(50 * 50 + 50 * 50) / 2.0;

        zofka.penDown();
        zofka.turnRight(45);
        zofka.move(armRoof * scale);
        zofka.turnRight(90);
        zofka.move(armRoof * scale);
        zofka.penUp();
    }

    public void drawLegs() {
        double armRoof = Math.sqrt(50 * 50 + 50 * 50) / 2.0;

        zofka.penDown();
        zofka.turnLeft(45);
        zofka.move(armRoof * (scale / 2));
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(armRoof * (scale / 2));
        zofka.turnRight(90);
        zofka.penDown();
        zofka.move(armRoof * (scale / 2));
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(armRoof * (scale / 2));
    }

    public void drawSun() {
        zofka.penDown();

        //step circle
        int rotation = 4;
        int step = 3;
        int repeat = 360 / rotation;

        for (int i = 0; i < repeat; i++) {
            zofka.move(step);
            zofka.turnRight(rotation);
        }

        zofka.penUp();

        //beam
        int numberBeam = 6;
        int lengthBeam = step * 10;
        int repetitionForSpokes = 360 / rotation;
        int frequencyBeam = repetitionForSpokes / numberBeam;
        int j = 0;
        for (int i = 0; i < repetitionForSpokes; i++) {
            zofka.move(step);
            zofka.turnRight(rotation);

            if (i % frequencyBeam == 0) {
                double currentLength = lengthBeam*(j++%2==0?1:1.5);
                zofka.penDown();
                zofka.turnLeft(90);
                zofka.move(currentLength);
                zofka.turnLeft(180);
                zofka.move(currentLength);
                zofka.turnLeft(90);
                zofka.penUp();
            }
        }
    }

    public void drawLetters() {
        zofka.setLocation(150, 675);
        zofka.turnUp();
        LetterK();

        zofka.setLocation(300, 675);
        zofka.turnUp();
        LetterA();

        zofka.setLocation(500, 675);
        zofka.turnUp();
        LetterK();

        zofka.setLocation(650, 675);
        zofka.turnUp();
        LetterI();

        zofka.setLocation(750, 675);
        zofka.turnUp();
        LetterK();

        zofka.setLocation(900, 675);
        zofka.turnUp();
        LetterA();
    }

    public void LetterI() {
        zofka.penDown();
        zofka.move(150);
        zofka.penUp();
    }

    public void LetterK() {
        LetterI();
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

    public void LetterA() {
        zofka.turnRight(22.5);
        LetterI();
        zofka.turnRight(135);
        LetterI();
        zofka.turnRight(180);
        zofka.move(50);
        zofka.turnLeft(67.5);
        zofka.penDown();
        zofka.move(70);
    }
}


