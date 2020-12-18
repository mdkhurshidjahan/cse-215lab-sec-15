
package Labassignment02;


public class Triangle {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double triPerimeter(Triangle ob) {
        return ob.height + ob.base;

    }

    public double triArea(Triangle ob) {
        return ob.height * ob.base * (.5);
    }
        public void drawTriangle() {
        
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < base; j++) {
                if (j == 0 || i == (base - 1) || i == j) {
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
        return "Base :" + base + "\nHeight" + height;
    }

}
