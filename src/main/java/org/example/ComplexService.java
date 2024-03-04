package org.example;

public class ComplexService
{
    public Complex add(Complex c1, Complex c2) {
        return new Complex(c1.getX() + c2.getX(), c1.getY() + c2.getY());
    }

    public Complex sub(Complex c1, Complex c2) {
        return new Complex(c1.getX() - c2.getX(), c1.getY() - c2.getY());
    }

    public Complex mul(Complex c1, Complex c2) {
        return new Complex(c1.getX() * c2.getX() - c1.getY() * c2.getY(), c1.getX() * c2.getY() + c2.getX() * c1.getY());
    }

    public Complex div(Complex c1, Complex c2) {
        double x = c1.getX();
        double x1 = c2.getX();
        double y = c1.getY();
        double y1 = c2.getY();
        double denom = Math.pow(x1, 2) + Math.pow(y1, 2);
        double real = (x * x1 + y * y1) / denom;
        double imaginary = (x1 * y - x * y1) / denom;
        return new Complex(real, imaginary);
    }

    public boolean equal(Complex c1, Complex c2)
    {
        if (c1.getX() == c2.getX() && c1.getY() == c2.getY())
            return true;
        return false;
    }

    public double mod(Complex c1) {
        return Math.sqrt(Math.pow(c1.getX(), 2) + Math.pow(c1.getY(), 2));
    }
}
