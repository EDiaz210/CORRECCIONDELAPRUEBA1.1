public class Triangulo {
    private double h, b,c;

    public Triangulo() {}

    public Triangulo(double c, double b, double h) {
        this.c = c;
        this.b = b;
        this.h = h;
    }


    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getArea() {
        return h*b/2;
    }
    public double getPerimetro() {
        return h+b+c;
    }
}
