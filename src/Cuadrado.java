public class Cuadrado {
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;

    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }


    public double calcularAreaCua() {
        return 4 * lado;
    }

    public double calcularPerimetroCua() {
        return lado * lado;
    }
}
