package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    private double sideLen;

    public Square(double sideLen) {
        setSideLen(sideLen);
    }

    public double getArea() {
        return sideLen * sideLen;
    }

    public void draw() {
        System.out.println("Kvadratiin urt " + sideLen);
    }

    public double getSideLen() {
        return sideLen;
    }

    public void setSideLen(double sideLen) {
        if (sideLen > 0) {
            this.sideLen = sideLen;
        } else {
            System.out.println("Kvadratiin urt eyreg baih ystoi");
        }
    }
}
