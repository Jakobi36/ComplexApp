package org.example;

public class Complex {
    private double x;
    private double y;

    public Complex(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public void setX(double x)
    {
        this.x = x;
    }
    public void SetY(double y)
    {
        this.y = y;
    }
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    public String str()
    {
        return String.format("%d+%di",(int)x, (int)y);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Complex complex = (Complex) obj;
        if (Double.compare(x, complex.x) != 0)
            return false;
        return Double.compare(y, complex.y) == 0;
    }
}
