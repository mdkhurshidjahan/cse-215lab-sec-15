/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labassignment02;
//class rectangle
public class Rectangle {
 //instance variable
    private double length;
    private double weidth;
//constructor
    public Rectangle(double length, double weidth) {
        this.length = length;
        this.weidth = weidth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeidth() {
        return weidth;
    }

    public void setWeidth(double weidth) {
        this.weidth = weidth;
    }

    public double recArea(Rectangle ob) {
        return ob.weidth * ob.length;
    }

    public double recPerimeter(Rectangle ob) {
        return (ob.length + ob.weidth) * 2;
    }

    public void drawRectangle() {
        int a = (int) weidth;
        int b = (int) length;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (i == 0 || i == (a - 1) || j == 0 || j == (b - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Length :" + length + "\nwidth" + weidth;
    }

}
