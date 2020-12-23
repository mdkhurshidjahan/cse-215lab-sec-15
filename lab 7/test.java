
package lab8;


public class test {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(5, 4);
        Fraction fraction2 = new Fraction(6, 7);

        fraction1.add(fraction2);
        System.out.println(fraction1);

        fraction1.subtract(fraction2);
        System.out.println(fraction1);

        fraction1.multiply(fraction2);
        System.out.println(fraction1);

        fraction1.divide(fraction2);
        System.out.println(fraction1);
    }
}
    

