/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author Admin
 */
public class fraction {
    private int numerator;
    private int denominator;

    public fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void add(Fraction otherFraction) {
        int resultNumerator = this.getNumerator() * otherFraction.getDenominator() + this.denominator * otherFraction.getNumerator();
        int resultDenominator = this.getDenominator() * otherFraction.getDenominator();

        this.setNumerator(resultNumerator);
        this.setDenominator(resultDenominator);
    }

    public void subtract(Fraction otherFraction) {
        int resultNumerator = this.getNumerator() * otherFraction.getDenominator() - this.denominator * otherFraction.getNumerator();
        int resultDenominator = this.getDenominator() * otherFraction.getDenominator();

        this.setNumerator(resultNumerator);
        this.setDenominator(resultDenominator);
    }

    public void multiply(Fraction otherFraction) {
        int resultNumerator = this.getNumerator() * otherFraction.getNumerator();
        int resultDenominator = this.getDenominator() * otherFraction.getDenominator();

        this.setNumerator(resultNumerator);
        this.setDenominator(resultDenominator);
    }

    public void divide(Fraction otherFraction) {
        int resultNumerator = this.getNumerator() * otherFraction.getDenominator();
        int resultDenominator = this.getDenominator() * otherFraction.getNumerator();

        this.setNumerator(resultNumerator);
        this.setDenominator(resultDenominator);
    }

    @Override
    public String toString() {
        return this.getNumerator() + "/" + this.getDenominator();
    }
}
   
